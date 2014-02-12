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
import java.util.logging.Level;
import java.util.logging.Logger;
import org.config.spring.hibernate.model.JHeader;
import org.dimas.bridging.Test;

/**
 *
 * @author yhawin
 */
public class ParseTest {
    public int parseTest(String strFilePath) throws FileNotFoundException, IOException{
            File theFile = new File(strFilePath);
            Reader readerFile = new FileReader(theFile);
            BufferedReader bufReadFile = new BufferedReader(readerFile);

            String readByte;
            int pencacah =0;
            while ((readByte = bufReadFile.readLine()) !=null) {
                System.out.print(pencacah++ + "-->> " );

                String [] data = readByte.split("\\t");  
                
                JHeader jheader = new JHeader();
                int i = 0;
                for (String itm: data) {
                    System.out.print(i++ + "." + itm +"::");
                    
                }
                if (jheader !=null) 
                if (pencacah>2) break;
                System.out.println();
            }
            
            System.out.print(theFile);
        
        
        return 0;

    }
    
   public static void main(String [] args){
        ParseTest f = new ParseTest();
        try {
            //f.parseTest("/home/yhawin/Dimas/FileBridging/Baygon/Input File/CVOUTLET.TXT"); //Ok --> "\\ "
            f.parseTest("/home/yhawin/Dimas/Input-File/JHEADER.TXT");//Oke --> "\\,"
            //f.parseTest("/home/yhawin/Dimas/FileBridging/Baygon/Input File/JPCODE.TXT");//Oke --> "\\,"
            //f.parseTest("/home/yhawin/Dimas/FileBridging/Baygon/Input File/JTPRB.TXT");//Oke --> "\\,"
            //f.parseTest("/home/yhawin/Dimas/FileBridging/Baygon/Input File/JTPRU.TXT");//Oke --> "\\,"

            //f.parseTest("/home/yhawin/Dimas/FileBridging/Baygon/Input File/OUTLET.TXT");//bad
            //f.parseTest("/home/yhawin/Dimas/FileBridging/Baygon/Input File/SALES.TXT");//bad
            //f.parseTest("/home/yhawin/Dimas/FileBridging/Baygon/Input File/STOCK.TXT");//bad
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
   
}
