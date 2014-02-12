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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.config.spring.hibernate.dao.OutletDaoInter;
import org.config.spring.hibernate.dao.SysvarDaoInter;
import org.config.spring.hibernate.dao.TblClientIdDaoInter;
import org.config.spring.hibernate.model.CvOutlet;
import org.config.spring.hibernate.model.Outlet;
import org.config.spring.hibernate.model.Salesman;
import org.config.spring.hibernate.model.TblClientId;
import org.config.spring.provider.ApplicationContextProvider;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author yhawin
 */
public class ExportClient {
    ApplicationContext appContext;
    OutletDaoInter outletDao;
    TblClientIdDaoInter tblClientIdDao;
    SysvarDaoInter sysvarDao;
    
    public ExportClient() {
        initialisasi();
    }
  
    void initialisasi(){
            appContext = ApplicationContextProvider.getInstance().getApplicationContext();
            outletDao = (OutletDaoInter) appContext.getBean("OutletDaoBean");
            tblClientIdDao = (TblClientIdDaoInter) appContext.getBean("TblClientIdDaoBean");
            sysvarDao = (SysvarDaoInter) appContext.getBean("SysvarDaoBean");
    }
    public List<TblClientId> ExportToCsvFromListToFile(String filePathDestination, List<Outlet> lst) {
        List<TblClientId> list = new ArrayList<>();
        FileWriter fileWriter = null;
        try {
            File filePath = new File(filePathDestination);
            fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            //Header
            printWriter.println("RecordType;DistributorCode;ClientCode;ClientStatus;SalesmanCode;ReservedField2;ReservedField3");
            String recordType=sysvarDao.findById("_REC_CLN").getNilaiString1();
            String distCode = sysvarDao.findById("_DIST_CODE").getNilaiString1();
 
            System.out.print(lst.size());
            
            for (Outlet itm: lst) {
                System.out.print(itm.getOutlet());
                System.out.println(itm.getNama());
                
                printWriter.print(recordType + ";");
                printWriter.print(distCode + ";");
                printWriter.print(itm.getOutlet() + ";");
                
                String statusAktif = "Closed";
                if (itm.getM().equalsIgnoreCase("Y")) 
                     statusAktif = "Active";
                //Revisi tanggal 4 juli 2013 tidak kelebihan (;)
                printWriter.print(statusAktif + ";");
                
/* Penyebab error pada saat non database mode*/               
                //Salesman Covered 
                ArrayList<CvOutlet> lstCv = new ArrayList<>(itm.getCvOutletSet());                
                
                String salesman = "";
                for (CvOutlet itmCv: lstCv) {
                    salesman = itmCv.getSalesman();
                }
                printWriter.print(salesman + ";");
               
                String reserveField1 = "";
                printWriter.print(reserveField1 + ";");
                
                String reserveField2 = "";
                printWriter.println(reserveField2 + "");
                
                //Untuk Isi List
                TblClientId item = new TblClientId();
                item.setDistributorCode(distCode);
                item.setClientCode(itm.getOutlet());
                item.setClientStatus(statusAktif);
                item.setSalesmanCode(salesman);
               
                list.add(item);
            }
            printWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(ExportClient.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fileWriter.close();
            } catch (IOException ex) {
                Logger.getLogger(ExportClient.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }
    public int ExportToCsvFromDBToFile(String filePathDestination) {
        try {
            List<Outlet> lst = outletDao.findAll();
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
        ExportClient test = new ExportClient();
        test.ExportToCsvFromDBToFile("E:/Client_ID.csv");
        //test.ExportToCsvFromDBToFile("/home/yhawin/Dimas/Client_ID.CSV" );
        
        
    }
    
}
