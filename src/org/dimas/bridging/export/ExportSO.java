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
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.config.spring.hibernate.dao.JTprbDaoInter;
import org.config.spring.hibernate.dao.JTpruDaoInter;
import org.config.spring.hibernate.dao.SysvarDaoInter;
import org.config.spring.hibernate.dao.TblSoIdDaoInter;
import org.config.spring.hibernate.model.JHeader;
import org.config.spring.hibernate.model.JPcode;
import org.config.spring.hibernate.model.JTprb;
import org.config.spring.hibernate.model.JTpru;
import org.config.spring.hibernate.model.TblSoId;
import org.config.spring.hibernate.model.TblSoIdPK;
import org.config.spring.provider.ApplicationContextProvider;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author yhawin
 */
public class ExportSO {
    ApplicationContext appContext=ApplicationContextProvider.getInstance().getApplicationContext();
    ApplicationContext appContextMem=ApplicationContextProvider.getInstance().getApplicationContextMem();
    SysvarDaoInter sysvarDao=(SysvarDaoInter) appContext.getBean("SysvarDaoBean");
    
    JTprbDaoInter jtprbDao= (JTprbDaoInter) appContext.getBean("JTprbDaoBean");
    JTpruDaoInter jtpruDao=(JTpruDaoInter) appContext.getBean("JTpruDaoBean");
    JTprbDaoInter jtprbDaoMem= (JTprbDaoInter) appContextMem.getBean("JTprbDaoBean");
    JTpruDaoInter jtpruDaoMem= (JTpruDaoInter) appContextMem.getBean("JTpruDaoBean");
    
    TblSoIdDaoInter tblSoIdDax= (TblSoIdDaoInter) appContext.getBean("TblSoIdDaoBean");
    
    public ExportSO() {
        initialisasi();
    }  
    void initialisasi(){
    }
    
    public List<TblSoId> ExportToCsvFromListToFile(String filePathDestination, Date tglTransaksiFrom, Date tglTransaksiTo, 
            List<JHeader> lst, Boolean databaseMode) {
        List<TblSoId> list = new ArrayList<>();
        FileWriter fileWriter = null;
        try {
            File filePath = new File(filePathDestination);
            fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            //Header
            printWriter.println("RecordType;DistributorCode;InvoiceNumber;Date;SCJProductCode;DistributorProductCode;"
                    + "ProductDescription;SalesmanCode;SalesmanName;WarehouseCode;WarehouseName;OutletTypeCode;"
                    + "OutletTypeDesc;Clientcode;Clientname;City;DeliveryAddress;Qty;NetValue;"
                    + "GrossValue;Fraction;EANCode;ZipCode;OderNumber;ReservedField1");
            String recordType=sysvarDao.findById("_REC_SO").getNilaiString1();
            String distCode = sysvarDao.findById("_DIST_CODE").getNilaiString1();
            String whCode = sysvarDao.findById("_WH_CODE").getNilaiString1();
            String whDesc = sysvarDao.findById("_WH_DESC").getNilaiString1();
            
            //List<Outlet> lst = outletDao.findAll();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            for (JHeader itm: lst) {
//                if (sdf.format(tglTransaksiFrom).equalsIgnoreCase(sdf.format(itm.getTanggal()))) {
                
                    Double doubleDiskonAtasFakturPersen = (double)itm.getDisAtasFaktur()/(double)itm.getGross() * 100;
//                    System.out.println(itm.getIdOrder() + "\t" + doubleDiskonAtasFakturPersen + "\t" + itm.getDisAtasFaktur() + "\t" + itm.getGross());
                    
                    List<JPcode> listJPcode = new ArrayList<>(itm.getJpcodeSet());
                    for (JPcode itmJPcode:listJPcode) {
                        if ( ! itmJPcode.getJpcodePK().getPcode().trim().substring(0,2).equalsIgnoreCase("BB")){
                            TblSoId item = new TblSoId();
                            TblSoIdPK itemPK = new TblSoIdPK();
                            //1. RecordType;
                            printWriter.print(recordType + ";");
                            item.setRecordType(recordType);
                            //2. DistributorCode;
                            printWriter.print(distCode + ";");
                            item.setDistributorCode(distCode);                    
                            //3.InvoiceNumber; //COMPOSITE KEY
                            printWriter.print(itmJPcode.getJheader().getIdOrder() + ";");
                            itemPK.setInvoiceNumber(itmJPcode.getJheader().getIdOrder());
                            //4. Date;
                            String strTanggal =sdf.format(itmJPcode.getJheader().getTanggal());
                            printWriter.print(strTanggal + ";");
                            item.setTanggal(itmJPcode.getJheader().getTanggal());
                            //5. SCJProductCode; //COMPOSITE KEY
                            printWriter.print(itmJPcode.getJpcodePK().getPcode() + ";");
                            item.setScjProductCode(itmJPcode.getJpcodePK().getPcode());
                            //6. DistributorProductCode;
                            printWriter.print(itmJPcode.getJpcodePK().getPcode() + ";");
                            itemPK.setDistributorProductCode(itmJPcode.getJpcodePK().getPcode());                    
                            //7. ProductDescription;
                            printWriter.print(itmJPcode.getProduk().getNamaBrg() + ";");
                            item.setProductDescription(itmJPcode.getProduk().getNamaBrg());
                            //8. SalesmanCode;
                            printWriter.print(itmJPcode.getJheader().getSalesman2().getSalesman() + ";");
                            item.setSalesmanCode(itmJPcode.getJheader().getSalesman2().getSalesman());
                            //9. SalesmanName;
                            printWriter.print(itmJPcode.getJheader().getSalesman2().getNamaSls() + ";");
                            item.setSalesmanName(itmJPcode.getJheader().getSalesman2().getNamaSls());
                            //10. WarehouseCode;
                            printWriter.print(whCode + ";");
                            item.setWarehouseCode(whCode);
                            //11. WarehouseName;
                            printWriter.print(whDesc + ";");
                            item.setWarehouseName(whDesc);

                            //12. OutletTypeCode;
                            printWriter.print(itmJPcode.getJheader().getMapTipeOutlet().getTipeOutlet() + ";");
                            item.setOutletTypeCode(itmJPcode.getJheader().getMapTipeOutlet().getTipeOutlet());
                            //13. OutletTypeDesc;
                            printWriter.print(itmJPcode.getJheader().getMapTipeOutlet().getDeskripsi() + ";");
                            item.setOutletTypeDesc(itmJPcode.getJheader().getMapTipeOutlet().getDeskripsi());

                            //14. Clientcode;
                            printWriter.print(itmJPcode.getJheader().getOutlet2().getOutlet() + ";");
                            item.setClientCode(itmJPcode.getJheader().getOutlet2().getOutlet());
                            //15. Clientname;
                            printWriter.print(itmJPcode.getJheader().getOutlet2().getNama() + ";");
                            item.setClientName(itmJPcode.getJheader().getOutlet2().getNama().replaceAll(";", " "));
                            //16. City;
                            printWriter.print(itmJPcode.getJheader().getOutlet2().getKotaToko() + ";");
                            item.setCity(itmJPcode.getJheader().getOutlet2().getKotaToko());
                            //17. DeliveryAddress;
                            printWriter.print(itmJPcode.getJheader().getOutlet2().getAlm1Toko() + ";");
                            item.setDeliveryAddress(itmJPcode.getJheader().getOutlet2().getAlm1Toko().replace(";", " "));
                            //18. Qty;
                            //Revisi tanggal 4 juli 2013 tidak kelebihan (;)
                            printWriter.print(itmJPcode.getQtyInSat() + ";");
                            item.setQty(itmJPcode.getQtyInSat());
                            
                            //#######PERHITUNGAN HARGA GROSS DAN NET##########
                            //REVISI NET DAN GROSS: 12-Feb-2014
                            //Harga Gross = Harga Jual (Sebelum dikurangi diskon, Sebelum ditambah Ppn)
                            //Harga Net = Gross - Diskon + Ppn

                            Double doubleHargaNoPpn = Double.valueOf(String.valueOf(itmJPcode.getHargaNoPpn()));
                            Double grossValueFromNoPpn =  doubleHargaNoPpn ;
                            Double grossValueFromWithPpn = doubleHargaNoPpn + (doubleHargaNoPpn*0.1);
                            //Jika Retur maka akan di negatifkan
//                            if (itmJPcode.getTipeFakturRetur().trim().equalsIgnoreCase("R")){
//                                grossValueFromNoPpn = 0-grossValueFromNoPpn;
//                                grossValueFromWithPpn = 0-grossValueFromWithPpn;
//                            }

                            //19. NetValue; 
                            //Harga Net = HargaNoPpn -DiskonUang -DiskonBarang-diskon atas faktur
                            //Actual : HargaNoPpn -DiskonUang -DiskonBarang-diskon atas faktur
                            Double doubleDiskonAtasFakturPecahan = (double)doubleDiskonAtasFakturPersen/100;
                            Double doubleDiskonAtasFakturBarangTertentuRupiah = doubleDiskonAtasFakturPecahan * itmJPcode.getHargaNoPpn();
                            Integer intDiskonAtasFakturBarangTertentuRupiah = doubleDiskonAtasFakturBarangTertentuRupiah.intValue();

                            int intDiskonBarangRupiah =0;
                            List<JTprb> listJTprb = new ArrayList<>();
                            if (databaseMode==true){
                                listJTprb = jtprbDao.findAllByIdOrderAndPcode(itmJPcode.getJpcodePK().getIdOrder(), itmJPcode.getJpcodePK().getPcode());;
                            } else {
                                listJTprb = jtprbDaoMem.findAllByIdOrderAndPcode(itmJPcode.getJpcodePK().getIdOrder(), itmJPcode.getJpcodePK().getPcode());;
                            }
                            for (JTprb itemJTprb: listJTprb) {
                                intDiskonBarangRupiah += itemJTprb.getHargaNoPpn();
                            }                  

                            int intDiskonUangRupiah = 0;
                            List<JTpru> listJTpru = new ArrayList<>();
                            if (databaseMode==true){
                                listJTpru = jtpruDao.findAllByIdOrderAndPcode(itmJPcode.getJpcodePK().getIdOrder(), itmJPcode.getJpcodePK().getPcode());
                            } else {
                                listJTpru = jtpruDaoMem.findAllByIdOrderAndPcode(itmJPcode.getJpcodePK().getIdOrder(), itmJPcode.getJpcodePK().getPcode());
                            }                    
                            for (JTpru itemJTpru: listJTpru) {
                                intDiskonUangRupiah += itemJTpru.getHargaNoPpn();
                            }
                            Integer intTotalDisc = intDiskonAtasFakturBarangTertentuRupiah + intDiskonBarangRupiah + intDiskonUangRupiah;
//                            Integer intTotalDisc = intDiskonBarangRupiah + intDiskonUangRupiah;                            
                            Double doubleTotalDisc = (double) intTotalDisc;
                            Double doubleNetSalesNoPpn = grossValueFromNoPpn - doubleTotalDisc;
                            Double doubleNetSalesWithPpn = doubleNetSalesNoPpn + (doubleNetSalesNoPpn * 0.1);

                            printWriter.print(doubleNetSalesNoPpn + ";");
                            item.setNetValue(doubleNetSalesNoPpn);

                            //20. GrossValue; = -PPN + diskonUang + diskonBarang + diskon atas faktur = HargaNoPpnScylla                   
                            //Qty * Harga = Gross -PPN ?
                            //Actual = Harga + PPn
                            
                             //REVISI NET DAN GROSS: 12-Feb-2014
                            //Harga Gross = Harga Jual (Sebelum dikurangi diskon, Sebelum ditambah Ppn)
                            //Harga Net = Gross - Diskon + Ppn
                            
                            String strGrossValueFromNoPpn = String.valueOf(grossValueFromNoPpn);
                            String strGrossValueFromWithPpn = String.valueOf(grossValueFromWithPpn);

                            printWriter.print(strGrossValueFromNoPpn + ";");
                            item.setGrossValue(grossValueFromNoPpn);                

                            //21. Fraction;
                            printWriter.print(itmJPcode.getQtyInSat() + ";");
                            item.setFraction(itmJPcode.getQtyInSat());
                            //22. EANCode;
                            printWriter.print(";");
                            item.setEanCode("");
                            //23. ZipCode;
                            printWriter.print(";");
                            item.setZipCode("");
                            //24. OrderNumber;
                            printWriter.print(itmJPcode.getJpcodePK().getIdOrder() + ";");
                            item.setOrderNumber(itmJPcode.getJpcodePK().getIdOrder());
                            //25. ReservedField1
                            //Revisi tanggal 4 Juli 2013 menghilangkan tanda (;)
                            printWriter.print("");
                            item.setReserverdField1("");

                            item.setTblSoIdPK(itemPK);
                            printWriter.println();
                            list.add(item);
                        }    
                    }
//                }
                
            }
            printWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(ExportSO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fileWriter.close();
            } catch (IOException ex) {
                Logger.getLogger(ExportSO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }
    public int ExportToCsvFromFileToDB(String filePathSource, String filePathDestination) throws FileNotFoundException{
        File filePath = new File(filePathSource);
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        
        return 0;
    }
    public static void main(String [] args) throws FileNotFoundException, IOException{
        ExportSO test = new ExportSO();
        //test.ExportToCsvFromDBToFile("E:/Client_ID.csv");
        
    }
    
}
