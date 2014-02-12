/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dimas.bridging.export;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.config.spring.hibernate.dao.JHeaderDaoInter;
import org.config.spring.hibernate.dao.JPcodeDaoInter;
import org.config.spring.hibernate.dao.JTprbDaoInter;
import org.config.spring.hibernate.dao.JTpruDaoInter;
import org.config.spring.hibernate.dao.ProdukDaoInter;
import org.config.spring.hibernate.dao.StockDaoInter;
import org.config.spring.hibernate.dao.SysvarDaoInter;
import org.config.spring.hibernate.dao.TblStockIdDaoInter;
import org.config.spring.hibernate.model.JPcode;
import org.config.spring.hibernate.model.JTprb;
import org.config.spring.hibernate.model.Stock;
import org.config.spring.hibernate.model.TblStockId;
import org.config.spring.provider.ApplicationContextProvider;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author yhawin
 */
public class ExportStock {
    ApplicationContext appContext;
    SysvarDaoInter sysvarDao;
    TblStockIdDaoInter tblStockIdDao;
    StockDaoInter stockDao;
    ProdukDaoInter productDao;
    
    JHeaderDaoInter jheaderDao;
    JPcodeDaoInter jpcodeDao;
    JTprbDaoInter jtprbDao;
    JTpruDaoInter jtpruDao;
    
    public ExportStock() {
        initialisasi();
    }
  
    void initialisasi(){
            appContext = ApplicationContextProvider.getInstance().getApplicationContext();
            sysvarDao = (SysvarDaoInter) appContext.getBean("SysvarDaoBean");
            
            productDao = (ProdukDaoInter) appContext.getBean("ProdukDaoBean");
            stockDao = (StockDaoInter) appContext.getBean("StockDaoBean");
            tblStockIdDao = (TblStockIdDaoInter) appContext.getBean("TblStockIdDaoBean");
            
            jheaderDao = (JHeaderDaoInter) appContext.getBean("JHeaderDaoBean");
            jpcodeDao = (JPcodeDaoInter) appContext.getBean("JPcodeDaoBean");
            jtprbDao = (JTprbDaoInter) appContext.getBean("JTprbDaoBean");
            jtpruDao = (JTpruDaoInter) appContext.getBean("JTpruDaoBean");
            
    }
    public List<TblStockId> ExportToCsvFromListToFile(String filePathDestination, List<Stock> lst) {
        List<TblStockId> list = new ArrayList<>();
        FileWriter fileWriter = null;
        try {
            File filePath = new File(filePathDestination);
            fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            //Header
            printWriter.println("RecordType;DistributorCode;Date;SCJProductCode;DistributorProductCode;Qty;WarehouseCode;Fraction;"
                    + "EANCode;SalesQTY;ExDO;BonusSample;Others;ReservedField");
            String recordType=sysvarDao.findById("_REC_STK").getNilaiString1();
            String distCode = sysvarDao.findById("_DIST_CODE").getNilaiString1();
            String whCode = sysvarDao.findById("_WH_CODE").getNilaiString1();
            //List<Outlet> lst = outletDao.findAll();

            for (Stock itm: lst) {
                if ( ! itm.getStockPK().getPcode().trim().substring(0,2).equalsIgnoreCase("BB")){                
                    TblStockId item = new TblStockId();   
                    
                    Date tglStock = itm.getStockPK().getTangalStock();

                    //1 --> RecordType;
                    printWriter.print(recordType + ";");
                    item.setRecordType(recordType);
                    //2. DistributorCode;
                    printWriter.print(distCode + ";");
                    item.setDistributorCode(distCode);
                    //3. Date;
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
                    String strTanggal =sdf.format(tglStock);
                    printWriter.print(strTanggal + ";");
                    item.setTanggal(itm.getStockPK().getTangalStock());                
                    //4. SCJProductCode;
                    printWriter.print(itm.getStockPK().getPcode() + ";");
                    item.setScjProductCode(itm.getStockPK().getPcode());
                    //5. DistributorProductCode
                    printWriter.print(itm.getStockPK().getPcode() + ";");
                    item.setDistributorProductCode(itm.getStockPK().getPcode());
                    //6. Qty;
                    String strQty = String.valueOf(itm.getTotalStockInPcs());
                    printWriter.print(strQty + ";");
                    item.setQty(itm.getTotalStockInPcs());
                    //7. WarehouseCode;
                    printWriter.print(whCode + ";");                
                    item.setWareHouseCode(whCode);                
                    //8. Fraction;
                    int isiPerKarton = (itm.getProduk().getConvFact1() * 12) + itm.getProduk().getConvFact2();
                    printWriter.print(isiPerKarton + ";");
                    item.setFraction(String.valueOf(isiPerKarton));

                    //9. EANCode;
                    String EANCode="";
                    printWriter.print(EANCode + ";" );
                    item.setEanCode("");

                    //10. Salesqty;
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(tglStock);
                    cal.add(Calendar.DATE, 1);
                    Date tanggalSetelah =  cal.getTime();
                    //GANTI DENGAN JPCODE TANGGALNYA 
                    List<JPcode> listJPcode = jpcodeDao.findAllByIdBrgAndDate(itm.getStockPK().getPcode(), tanggalSetelah);
                    int qtyJpcodeFaktur = 0;
                    int qtyJPcodeRetur = 0;
                    //Faktur dan Retur dihitung disini
                    for (JPcode itemJPcode : listJPcode) {
                        if (itemJPcode.getTipeFakturRetur().trim().equals("F")) {
                            qtyJpcodeFaktur += itemJPcode.getQtyInSat();
                        } else {
                            qtyJPcodeRetur += itemJPcode.getQtyInSat();                    
                        }
                    }             
                    printWriter.print(qtyJpcodeFaktur + ";");                
                    item.setSalesQty(qtyJpcodeFaktur);

                    //11. ExDO; --> Kita tidak bisa
                    printWriter.print("0" + ";");                
                    item.setExDo(0);
                    //12. BonusSample; 
                    List<JTprb> listJTprb = jtprbDao.findAllByIdBrgAndDate(itm.getStockPK().getPcode(), tanggalSetelah);
                    int qtyBonus = 0;
                    for (JTprb itemJTprb: listJTprb) {
                        if (itemJTprb.getTipeFakturRetur().trim().equals("F")) {
                            qtyBonus+=itemJTprb.getQtyInSat();
                        } else {
                            qtyBonus-=itemJTprb.getQtyInSat();
                        }
                    }
                    printWriter.print(qtyBonus + ";");                
                    item.setBonusSample(qtyBonus);

                    //13. Othes;
                    printWriter.print(qtyJPcodeRetur + ";" );
                    item.setOthers(qtyJPcodeRetur);
                    //14. ReservedField;
                    String reservedField = "";
                    //Revisi tanggal 4 juli 2013 tidak kelebihan (;)
                    printWriter.println(reservedField + "");

                    //Untuk Isi List
                    list.add(item);
                }
            }
            
            printWriter.close();
            
        } catch (IOException ex) {
            Logger.getLogger(ExportStock.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fileWriter.close();
            } catch (IOException ex) {
                Logger.getLogger(ExportStock.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return list;
        
    }
    public int ExportToCsvFromDBToFile(String filePathDestination) {
        try {
            List<Stock> lst = stockDao.findAllByTanggalStock(new Date());
            ExportToCsvFromListToFile(filePathDestination, lst);
        } catch (Exception ex) {
        }
        
        return 0;
        
    }
    public int ExportToCsvFromFileToDB(String filePathSource, String filePathDestination) throws FileNotFoundException{
        File filePath = new File(filePathSource);
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        
        return 0;
    }
    public static void main(String [] args) throws FileNotFoundException, IOException{
        ExportStock test = new ExportStock();
        //test.ExportToCsvFromDBToFile("E:/Client_ID.csv");
        test.ExportToCsvFromDBToFile("/home/yhawin/Dimas/Stock_ID.CSV" );
        
        
    }
    
}
