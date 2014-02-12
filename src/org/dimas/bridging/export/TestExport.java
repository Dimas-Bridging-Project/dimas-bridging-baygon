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
import java.util.List;
import org.config.spring.hibernate.dao.OutletDaoInter;
import org.config.spring.hibernate.dao.SysvarDaoInter;
import org.config.spring.hibernate.dao.TblClientIdDaoInter;
import org.config.spring.hibernate.model.Outlet;
import org.config.spring.hibernate.model.TblClientId;
import org.config.spring.provider.ApplicationContextProvider;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author yhawin
 */
public class TestExport {

    public TestExport() {
    }
    
    public int ExportToCsvFromDBToFile(String filePathDestination) throws FileNotFoundException, IOException{
        
        ApplicationContext appContext = ApplicationContextProvider.getInstance().getApplicationContext();
        OutletDaoInter outletDao = (OutletDaoInter) appContext.getBean("OutletDaoBean");
        TblClientIdDaoInter tblClientIdDao = (TblClientIdDaoInter) appContext.getBean("TblClientIdDaoBean");
        
        SysvarDaoInter sysvarDao = (SysvarDaoInter) appContext.getBean("SysvarDaoBean");
        
        List<Outlet> lst = outletDao.findAll();
        
        
        File filePath = new File(filePathDestination);
        FileWriter fileWriter = new FileWriter(filePath);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);        
        PrintWriter printWriter = new PrintWriter(bufferedWriter);
        
        for (Outlet itm: lst) {
            printWriter.println("001,ari untung,malang");
           
        }
         
        printWriter.close();
        
        return 0;
    }
    public int ExportToCsvFromFileToDB(String filePathSource, String filePathDestination) throws FileNotFoundException{
        File filePath = new File(filePathSource);
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        
        return 0;
    }
    public static void main(String [] args) throws FileNotFoundException, IOException{
        TestExport test = new TestExport();
        test.ExportToCsvFromDBToFile("E:/TBL_ID_CLIENT.csv");
        
    }
    
}
