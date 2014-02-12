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
import org.config.spring.hibernate.model.JTprb;
import org.config.spring.hibernate.model.JTprbPK;

/**
 *
 * @author yhawin
 */
public class ParseJTprb {
    public List<JTprb> parseJTprb(String strFilePath){
        System.out.println("Parsing JTprb >> Starting");
        
         Reader readerFile = null;
         List<JTprb> lst = new ArrayList<>();
         
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
                
                //Karena jumlah record benar adalah 9 (8 toleransi)
                if (data.length > 7) {
                    JTprb item = new JTprb();
                    JTprbPK jtprbPK = new JTprbPK();
                    
                    item.setTipeFakturRetur(data[8]);
                    
                    //item.setSalesman(data[0]);
                    jtprbPK.setSalesman(data[0]);
                    jtprbPK.setIdOrder(data[1]);
                    jtprbPK.setPcode(data[2]);
                    item.setJtprbPK(jtprbPK);
                    
                    item.setQtyInFib(data[3]);
                    item.setQtyInSat(0);
                    if (! data[4].equals(""))
                        item.setQtyInSat(Integer.parseInt(data[4]));
                    item.setHrgJualKartonNoPpn(0);
                    
                    if(! data[5].equals("")) 
                        item.setHrgJualKartonNoPpn(Integer.parseInt(data[5]));
                    
                    item.setHargaNoPpn(0);
                    if (! data[6].equals(""))
                        item.setHrgJualLsnNoPpn(Integer.parseInt(data[6]));
                    
                    //Harga Jual PcsNoPPn
                    Integer intHargaJualPcsNoPpn = item.getHrgJualLsnNoPpn()/12;
                    Integer intHargaNoPpn = intHargaJualPcsNoPpn * item.getQtyInSat();
                    //Hati hati dengan output
                    if (item.getTipeFakturRetur().trim().equalsIgnoreCase("R")){
                        intHargaNoPpn = -intHargaNoPpn;
                    }
                    item.setHargaNoPpn(intHargaNoPpn);
                    
                    item.setJenis(data[7]);
                    item.setTipeFakturRetur(data[8]);

                    if (item !=null) 
                            lst.add(item);
                }
                
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ParseJTprb.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ParseJTprb.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                readerFile.close();
            } catch (IOException ex) {
                Logger.getLogger(ParseJTprb.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return lst;
        
    }
    
    public static void main(String [] args) throws FileNotFoundException, IOException {
        ParseJTprb f = new ParseJTprb();
        f.parseJTprb("/home/yhawin/Dimas/Input-File/JTPRB.TXT");//Oke --> "\\,"    
    }
    
}
