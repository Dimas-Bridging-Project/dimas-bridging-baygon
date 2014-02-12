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
import org.config.spring.hibernate.model.Salesman;

/**
 *
 * @author yhawin
 */
public class ParseSalesman {
    public List<Salesman> parseSalesman(String strFilePath){
        System.out.println("Parsing Salesman >> Starting");
         Reader readerFile = null;
         List<Salesman> lst = new ArrayList<>();
         
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
               if (data.length()==141) {
                    //System.out.println(data);
                    Salesman item = new Salesman();
                    item.setSalesman(data.substring(0, 3).trim());
                    item.setNamaSls(data.substring(3, 23).trim());
                    item.setAlamat1(data.substring(23, 48).trim());
                    item.setAlamat2(data.substring(48, 73).trim());
                    item.setKota(data.substring(73, 93).trim());
                    item.setTeam(data.substring(124, 128).trim());
                    item.setGudang(data.substring(129, 131).trim());
                    //item.setSalesman(data.substring(6, 9).trim());
                    if (item !=null) 
                            lst.add(item);
                    
                    //System.out.println(item.getSalesman() + " : " + 
                    //        item.getNamaSls()+ " : " + item.getAlamat1());               
               }         

                    //if (pencacah>2) break;
                    //System.out.println();
                
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ParseSalesman.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ParseSalesman.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                readerFile.close();
            } catch (IOException ex) {
                Logger.getLogger(ParseSalesman.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return lst;
        
    }
    
    public static void main(String [] args) throws FileNotFoundException, IOException {
        ParseSalesman f = new ParseSalesman();
        //f.parseSalesman("/home/yhawin/Dimas/Input-File/SALESMAN.TXT");//Oke --> "\\,"    
        f.parseSalesman("E:/Input-File/SALESMAN.TXT");
        
    }
    
}
