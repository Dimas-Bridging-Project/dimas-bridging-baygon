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
import org.config.spring.hibernate.model.Produk;

/**
 *
 * @author yhawin
 */
public class ParseMSPCODE {
    public List<Produk> parseMSPCODE(String strFilePath){
        System.out.println("Parsing MSPCODE/Produk >> Starting");
         Reader readerFile = null;
         List<Produk> lst = new ArrayList<>();
         
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
               if (data.length()==244) {
                    //System.out.println(data);
                    Produk item = new Produk();
                    item.setPcode(data.substring(0, 6).trim());
                    item.setNamaBrg(data.substring(6,36 ).trim());
                    
                    //Konversi barang
                    //Perhitungan Faktor Konversi
                    item.setLstSat(data.substring(95, 102).trim());
                    item.setConvFact1(0);
                    item.setConvFact2(0);
                    if (item.getLstSat().trim().length()==7) {
                        int lusin = Integer.parseInt(item.getLstSat().trim().substring(0, 3));
                        int pcs = Integer.parseInt(item.getLstSat().trim().substring(4, 7));
                        item.setConvFact1(lusin);
                        item.setConvFact2(pcs);
                        //System.out.println(item.getIsiPerLsn().trim().substring(4, 7));
                    }
                    
                    
                    item.setDv(data.substring(36, 38).trim());
                    item.setKt(data.substring(38, 42).trim());
                    item.setBr(data.substring(42, 46).trim());
                    item.setVariant(data.substring(46, 56).trim());
                    item.setUkuran(data.substring(56, 66).trim());
                    item.setJatah(data.substring(66, 67).trim());
                    item.setNmLap1(data.substring(67, 73).trim());

                    item.setNmLap2(data.substring(73, 79).trim());
                    item.setLns(data.substring(79, 82).trim());
                    item.setPk(data.substring(82, 84).trim());
                    item.setAktif(data.substring(84, 85).trim());
                    item.setMain(data.substring(85, 86).trim());
                    item.setBrtKrt(data.substring(86, 95).trim());
                    
                    //Saya pindah ke atas --> untuk faktor konversi
                    //item.setLstSat(data.substring(95, 102).trim());
                    
                    if (data.substring(102, 109).trim().equals("")) {
                        item.setBeliKrt(0);
                    }else {
                        item.setBeliKrt(Integer.parseInt(data.substring(102, 109).trim()));
                    }
                    if (data.substring(109, 116).trim().equals("")) {
                        item.setJualKrt(0);
                    } else {
                        item.setJualKrt(Integer.parseInt(data.substring(109, 116).trim()));
                    }
                    if (data.substring(116,123 ).trim().equals("")) {
                        item.setJualLsn(0);
                    } else {
                        item.setJualLsn(Integer.parseInt(data.substring(116,123 ).trim()));
                    }
                    if (data.substring(123, 130).trim().equals("")) {
                        item.setJualPcs(0);
                    } else  {
                        item.setJualPcs(Integer.parseInt(data.substring(123, 130).trim()));
                    }

                    
                    
                    if (item !=null) 
                            lst.add(item);
                    
                    //System.out.println(item.getPcode() + " : " + item.getNamaBrg() + " : " + item.getJualKrt());               
               }         

                    //if (pencacah>2) break;
                    //System.out.println();
                
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ParseMSPCODE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ParseMSPCODE.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                readerFile.close();
            } catch (IOException ex) {
                Logger.getLogger(ParseMSPCODE.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return lst;
        
    }
    
    public static void main(String [] args) throws FileNotFoundException, IOException {
        ParseMSPCODE f = new ParseMSPCODE();
        //f.parseMSPCODE("/home/yhawin/Dimas/Input-File/MSPCODE.TXT");//Oke --> "\\,"    
        f.parseMSPCODE("E:/Input-File/MSPCODE.TXT");//Oke --> "\\,"    
        
    }
    
}
