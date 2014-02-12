package org.dimas.bridging.retrieve;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.config.spring.hibernate.model.JHeader;

/**
 *
 * @author yhawin
 */

public class ParseJHeader {
    public List<JHeader> parseJHeader(String strFilePath){
        System.out.println("Parsing JHeader >> Starting");
        
        Reader readerFile = null;
        List<JHeader> lst = new ArrayList<>();
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
                //Karena jumlah record benar adalah 28 (25 toleransi)
                if (data.length > 25) {
                    /*
                    int i = 0;                
                    for (String itm: data) {
                        System.out.print(i++ + "." + itm +"::");
                    }
                    */
                    
                    //Format tanggal
                    SimpleDateFormat format = new SimpleDateFormat("ddMMyyyy");

                    JHeader item = new JHeader();
                    item.setSalesman(data[0]); 
                    item.setIdOrder(data[1]);

                    if (! data[2].equals("")) {
                        Date tanggal = null;
                        try {
                            tanggal = format.parse(data[2].toString());
                        } catch (ParseException ex) {
                            Logger.getLogger(ParseJHeader.class.getName()).log(Level.SEVERE, null, ex);
                        }                 
                        item.setTanggal(tanggal);
                        //System.out.println(item.getTanggal());
                    }
                    item.setOutlet(data[3]);
                    
                    if (! data[4].equals(""))
                        item.setGross(Integer.parseInt(data[4]));
                    if (! data[5].equals(""))
                        item.setPromoBrg(Integer.parseInt(data[5]));
                    if (! data[6].equals(""))
                        item.setPromoUang(Integer.parseInt(data[6]));
                    if (! data[7].equals(""))
                        item.setPpn(Integer.parseInt(data[7]));
                    if (! data[8].equals(""))
                        item.setNetPpn(Integer.parseInt(data[8]));
                    if (! data[9].equals(""))
                        item.setKredit(Integer.parseInt(data[9]));
                    if (! data[10].equals(""))
                        item.setTerbayar(Integer.parseInt(data[10]));
                    if (! data[11].equals(""))
                        item.setSaldo(Integer.parseInt(data[11]));

                    item.setNoFakturRetur(data[13]);
                    if (! data[15].equals(""))
                        item.setDisAtasFaktur(Integer.parseInt(data[15]));
                    item.setTipeBayar(data[18]);

                    if ( ! data[19].equals("")) {
                        Date tanggal2 = null;
                        try {
                            tanggal2 = format.parse(data[19].toString());
                        } catch (ParseException ex) {
                            Logger.getLogger(ParseJHeader.class.getName()).log(Level.SEVERE, null, ex);
                        }                 
                        item.setTrans_date2(tanggal2);
                    }

                    item.setSalesId2(data[20]);

                    item.setNpwp(data[23]);
                    if (! data[27].equals(""))
                        item.setTerRetur(Integer.parseInt(data[27]));
                    item.setTypeOutlet(data[28]);

                    if (item !=null) 
                            lst.add(item);  

                    //if (pencacah>2) break;
                    //System.out.println();
                }
            }    
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ParseJHeader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ParseJHeader.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                readerFile.close();
            } catch (IOException ex) {
                Logger.getLogger(ParseJHeader.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return lst;
        
    }
    
    public static void main(String [] args) throws FileNotFoundException, IOException {
        ParseJHeader f = new ParseJHeader();
        //f.parseJHeader("/home/yhawin/Dimas/Input-File/JHEADER.TXT");//Oke --> "\\,"    
        f.parseJHeader("E:/Input-File/JHEADER.TXT");//Oke --> "\\,"    
    }
    
}
