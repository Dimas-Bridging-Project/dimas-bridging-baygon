/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dimas.bridging.retrieve;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.config.spring.hibernate.model.Outlet;

/**
 *
 * @author yhawin
 */
public class ParseOutlet {
    public List<Outlet> parseOutlet(String strFilePath){
        System.out.println("Parsing Outlet >> Starting");
         Reader readerFile = null;
         List<Outlet> lst = new ArrayList<>();
         
        try {
            File filePath = new File(strFilePath);
            readerFile = new FileReader(filePath);
            BufferedReader bufReadFile = new BufferedReader(readerFile);
            String readByte;
            int pencacah =0;
            
            while ((readByte = bufReadFile.readLine()) !=null) {
                //System.out.print(pencacah++ + "-->> " );
                
                //readByte = readByte.replaceAll("\"", "");
                //String [] data = readByte.split("\\,");  
                String data = readByte;
                                     
                //Karena jumlah record benar adalah 5 (8 toleransi)
               if (data.length()==595) {
                    //System.out.println(data);
                    Outlet item = new Outlet();
                    item.setOutlet(data.substring(0, 6).trim());
                    item.setNama(data.substring(6,36).trim());
                    
                    item.setAlm1Toko(data.substring(36,61).trim());
                    item.setAlm2Toko(data.substring(61,86).trim());
                    item.setKotaToko(data.substring(86,106).trim());
                    
                    item.setContactPr(data.substring(106,131).trim());                    
                    item.setTlpToko(data.substring(131,151).trim());
                    item.setNoFax(data.substring(151,171).trim());                    
                    item.setAlm1Rmh(data.substring(171,196).trim());
                    item.setAlm2Rmh(data.substring(196,221).trim());                    
                    item.setKotaRmh(data.substring(221,241).trim());
                    
                    //GANTI DENGAN YANG ADA DI MAPPING
                    item.setTy(data.substring(279, 281).trim());
                    
                    item.setVd(data.substring(284, 286).trim());
                    item.setFlPjk(data.substring(448, 449).trim());
                    item.setUserDef1(data.substring(449, 479).trim());
                    item.setUserDef2(data.substring(479, 509).trim());
                    item.setM(data.substring(521, 522).trim());
                    item.setFlagKab(data.substring(594, 595).trim());
                    item.setPk(data.substring(286, 288).trim());
                    //item.(data.substring(,).trim());
                    
                    if (item !=null) 
                            lst.add(item);
                    
                    //System.out.println(item.getOutlet() + " : " + item.getNama() + " : " + 
                    //        item.getVd());               
               }         

                    //if (pencacah>2) break;
                    //System.out.println();
                
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ParseOutlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ParseOutlet.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                readerFile.close();
            } catch (IOException ex) {
                Logger.getLogger(ParseOutlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return lst;
        
    }
    
    public static void main(String [] args) throws FileNotFoundException, IOException {
        //ApplicationContext appContext = ApplicationContextProvider.getInstance().getApplicationContext();
        //OutletDaoInter outletDao = (OutletDaoInter) appContext.getBean("OutletDaoBean");
        ParseOutlet f = new ParseOutlet();
        //f.parseOutlet("/home/yhawin/Dimas/Input-File/MSOUTLET.TXT");//Oke --> "\\,"    
        f.parseOutlet("E:/Input-File/MSOUTLET.TXT");//Oke --> "\\,"    
        /*
        List<Outlet> lst = f.parseOutlet("E:/Input-File/MSOUTLET.TXT");
        for (Outlet itm: lst) {
            Outlet item = new Outlet();
            item.setOutlet(itm.getOutlet());
            item.setNama(itm.getNama());
            outletDao.saveOrUpdate(itm);
            System.out.println(item.getOutlet() + " tersimpan");
            break;
        }
        */ 
    }
    
}
