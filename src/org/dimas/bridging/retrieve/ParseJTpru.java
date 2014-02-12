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
import org.config.spring.hibernate.model.JTpru;
import org.config.spring.hibernate.model.JTpruPK;

/**
 *
 * @author yhawin
 */
public class ParseJTpru {
    public List<JTpru> parseJTpru(String strFilePath){
        System.out.println("Parsing JTpru >> Starting");
         Reader readerFile = null;
         List<JTpru> lst = new ArrayList<>();
         
        try {
            File filePath = new File(strFilePath);
            readerFile = new FileReader(filePath);
            BufferedReader bufReadFile = new BufferedReader(readerFile);
            String readByte;
            int pencacah =0;
            
            while ((readByte = bufReadFile.readLine()) !=null) {
                //System.out.print(pencacah++ + "-->> " );
                
                readByte = readByte.replaceAll("\"", "");
                String [] data = readByte.split("\\,");  
                
                
                //Karena jumlah record benar adalah 5 (8 toleransi)
                if (data.length > 4) {
                    JTpru item = new JTpru();

                    item.setTipe(data[4]);
                    
                    JTpruPK jtpruPK = new JTpruPK();                    
                    //item.setSalesman(data[0]);
                    jtpruPK.setSalesman(data[0]);
                    jtpruPK.setIdOrder(data[1]);
                    jtpruPK.setPcode(data[2]);
                    item.setJtpruPK(jtpruPK);
                    
                    if (! data[3].equals("")){
                        if (item.getTipe().trim().equalsIgnoreCase("R")){
                            item.setHargaNoPpn(-Integer.parseInt(data[3]));                            
                        }else {
                            item.setHargaNoPpn(Integer.parseInt(data[3]));
                        }
                    }
                    item.setTipe(data[4]);

                    if (item !=null) 
                            lst.add(item);
                             

                    //if (pencacah>2) break;
                    //System.out.println();
                }
                
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ParseJTpru.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ParseJTpru.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                readerFile.close();
            } catch (IOException ex) {
                Logger.getLogger(ParseJTpru.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return lst;
        
    }
    
    public static void main(String [] args) throws FileNotFoundException, IOException {
        ParseJTpru f = new ParseJTpru();
        f.parseJTpru("/home/yhawin/Dimas/Input-File/JTPRU.TXT");//Oke --> "\\,"    
    }
    
}
