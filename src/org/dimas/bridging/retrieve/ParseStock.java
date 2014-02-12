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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.config.spring.hibernate.model.Stock;
import org.config.spring.hibernate.model.StockPK;

/**
 *
 * @author yhawin
 */
public class ParseStock {
    public List<Stock> parseStock(String strFilePath, Date tanggalStock){
        System.out.println("Parsing Stock >> Starting");
        Reader readerFile = null;
        Boolean formatPanjang=null; //Jebakan sekali panjang maka akan tetap panjang
        List<Stock> lst = new ArrayList<>();         
        try {
            File filePath = new File(strFilePath);
            readerFile = new FileReader(filePath);
            BufferedReader bufReadFile = new BufferedReader(readerFile);
            String readByte;
            int pencacah =0;
            //Tanggal transaksi diubah ubah secara periodik
            Date tanggal_transaksi = null;
            while ((readByte = bufReadFile.readLine()) !=null) {
                //System.out.print(pencacah++ + "-->> " );
                
                //readByte = readByte.replaceAll("\"", "");
                //String [] data = readByte.split("\\,");  
                String data = readByte;
                
                // INI BERBEDA DENGAN YANG LAIN
                Stock item = new Stock();
                StockPK itemPK = new StockPK();
                itemPK.setTangalStock(tanggal_transaksi); // inisialisasi pakai tanggal transaksi lama
                
                
                //Karena jumlah record benar adalah 5 (8 toleransi)
                if (tanggalStock != null) {
                    itemPK.setTangalStock(tanggalStock);
                } else if (data.length() > 25 || data.length()>13) {
                   
                    //System.out.println(data.trim());
                   
                    if (data.substring(0, 13).equals("Tgl.Gudang  :")) {
                        //System.out.println(data.substring(0, 13));
                        //System.out.println(data.substring(0, 13) + data.substring(14, 25));
                        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
                        try {
                            tanggal_transaksi = sdf.parse(data.substring(14, 25).trim());      
                            itemPK.setTangalStock(tanggal_transaksi);
                        } catch (ParseException ex) {
                            Logger.getLogger(ParseStock.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } 
                    
                }
                                
                //System.out.println(itemPK.getTangalStock());
               
                //Trim untuk memastikan data sampai ke ujung kanan INI FORMAT PANJANG
                if ( data.trim().length()==141  &&                     
                        ! data.substring(0, 6).trim().equals("PCODE") && 
                        ! data.substring(0, 6).trim().equals("======") &&
                        ! data.substring(0, 6).trim().equals("------") &&
                         (formatPanjang==null || formatPanjang==true))  {
                    
                    formatPanjang=true;
                    
                    //System.out.println(data);
                    
                    itemPK.setPcode(data.substring(0, 6).trim()); //Nglanjutin diatas mas bro
                    item.setStockPK(itemPK);
                    
                    item.setNamaBarang(data.substring(7, 38).trim());
                    item.setIsiPerLsn(data.substring(38, 45).trim());                  
                    item.setTotalStock(data.substring(45, 59).trim());
                   
                    //item.setOnCustOrder(data.substring(59, 91));
                    
                    if ( data.substring(76, 91).trim().equals("")) {
                        item.setHargaBeli(0);
                    } else {
                        item.setHargaBeli(Integer.valueOf(data.substring(76, 91).trim().replaceAll("\\.", "")));                    
                    }
                    if (data.substring(91, 106).trim().equals("")) {
                        item.setHargaJual(0);
                    } else {
                        item.setHargaJual(Integer.parseInt(data.substring(91, 106).trim().replaceAll("\\.", "")));
                    }
                     
                    //item.setPpnBmBeli(Integer.parseInt(data.substring(91, 106).trim()));
                    
                    if (data.substring(128, 132).trim().equals("")) {
                        item.setRpp13(0.0);
                    } else {
                        item.setRpp13(Double.parseDouble(data.substring(128, 132).trim().replaceAll("\\,", ".")));
                    }
                    
                   
                    if (data.substring(132, 141).trim().equals("")) {
                        item.setWkCover(0.0);
                    } else {
                        item.setWkCover(Double.parseDouble(data.substring(132, 141).trim().replaceAll("\\,", ".")));
                    }
                     
                     
                    //Perhitungan Faktor Konversi
                    item.setConvfact1(0);
                    item.setConvfact2(0);
                    if (item.getIsiPerLsn().trim().length()==7) {
                        int lusin = Integer.parseInt(item.getIsiPerLsn().trim().substring(0, 3));
                        int pcs = Integer.parseInt(item.getIsiPerLsn().trim().substring(4, 7));
                        item.setConvfact1(lusin);
                        item.setConvfact2(pcs);
                        //System.out.println(item.getIsiPerLsn().trim().substring(4, 7));
                    }
                    //Menghitung total stok in pcs
                    int pcs=0; int lusin=0; int karton=0;
                    if (item.getTotalStock().trim().length()<4) { //3 berarti 3x3 digit + 2 dot
                        pcs = Integer.parseInt(item.getTotalStock().trim());                      
                    } else  if (item.getTotalStock().trim().length()< 8){                    
                        int posisiDotPertama = item.getTotalStock().trim().indexOf(".");
                        lusin = Integer.parseInt(item.getTotalStock().trim().substring(0, posisiDotPertama));
                        pcs = Integer.parseInt(item.getTotalStock().trim().substring(posisiDotPertama+1, posisiDotPertama+1+3));
                    
                    } else {                    
                        int posisiDotPertama = item.getTotalStock().trim().indexOf(".");
                        karton = Integer.parseInt(item.getTotalStock().trim().substring(0, posisiDotPertama));
                        lusin = Integer.parseInt(item.getTotalStock().trim().substring(posisiDotPertama+1, posisiDotPertama+1+3));
                        pcs = Integer.parseInt(item.getTotalStock().trim().substring(posisiDotPertama+1+3+1, posisiDotPertama+1+3+1+3));
                        //pcs =123;
                    }
                    //istilahnya Fraction
                    int isiPerKarton = (item.getConvfact1() *12) + item.getConvfact2();                    
                    int totalStockPcs = (karton*isiPerKarton )+ (lusin*12)+ pcs;
                    item.setTotalStockInPcs(totalStockPcs);
                    
                    //item.setSalesman(data.substring(6, 9).trim());
                    if (item !=null) 
                            lst.add(item);
                    
                    //System.out.println(item.getOutlet() + " : " + item.getSalesman() + " : " + item.getKunjungan());               
               } else if( (data.trim().length()>=70 && data.trim().length()<=76 ) && 
                        ! data.substring(0, 6).trim().equals("PCODE") && 
                        ! data.substring(0, 6).trim().equals("======") &&
                        ! data.substring(0, 6).trim().equals("------")) {
               
                    //  System.out.println(data);
                    
                    itemPK.setPcode(data.substring(0, 6).trim()); //Nglanjutin diatas mas bro
                    item.setStockPK(itemPK);
                    
                    item.setNamaBarang(data.substring(7, 38).trim());
                    item.setIsiPerLsn(data.substring(38, 45).trim());                  
                    item.setTotalStock(data.substring(45, 59).trim());
                   
                    //Perhitungan Faktor Konversi
                    item.setConvfact1(0);
                    item.setConvfact2(0);
                    if (item.getIsiPerLsn().trim().length()==7) {
                        int lusin = Integer.parseInt(item.getIsiPerLsn().trim().substring(0, 3));
                        int pcs = Integer.parseInt(item.getIsiPerLsn().trim().substring(4, 7));
                        item.setConvfact1(lusin);
                        item.setConvfact2(pcs);
                        //System.out.println(item.getIsiPerLsn().trim().substring(4, 7));
                    }
                    
                    int pcs=0; int lusin=0; int karton=0;
                    if (item.getTotalStock().trim().length()<4) { //3 berarti 3x3 digit + 2 dot
                        pcs = Integer.parseInt(item.getTotalStock().trim());                      
                    } else  if (item.getTotalStock().trim().length()< 8){                    
                        int posisiDotPertama = item.getTotalStock().trim().indexOf(".");
                        lusin = Integer.parseInt(item.getTotalStock().trim().substring(0, posisiDotPertama));
                        pcs = Integer.parseInt(item.getTotalStock().trim().substring(posisiDotPertama+1, posisiDotPertama+1+3));
                    
                    } else {                    
                        System.out.println(item.getTotalStock());
                        int posisiDotPertama = item.getTotalStock().trim().indexOf(".");
                        karton = Integer.parseInt(item.getTotalStock().trim().substring(0, posisiDotPertama));
                        lusin = Integer.parseInt(item.getTotalStock().trim().substring(posisiDotPertama+1, posisiDotPertama+1+3));
                        pcs = Integer.parseInt(item.getTotalStock().trim().substring(posisiDotPertama+1+3+1, posisiDotPertama+1+3+1+3));
                    }
                    //System.out.println("masuk sini");
                    
                    int isiPerKarton = (item.getConvfact1() *12) + item.getConvfact2();                    
                    int totalStockPcs = (karton*isiPerKarton )+ (lusin*12)+ pcs;
                    item.setTotalStockInPcs(totalStockPcs);
                    
                    //item.setSalesman(data.substring(6, 9).trim());
                    if (item !=null) 
                            lst.add(item);
                    
                    //System.out.println(item.getStockPK().getPcode() + " : " + item.getStockPK().getTangalStock());               
                    
                    
               }  
                
                    //if (pencacah>2) break;
                    //System.out.println();
                
            }
         
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ParseStock.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ParseStock.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                readerFile.close();
            } catch (IOException ex) {
                Logger.getLogger(ParseStock.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return lst;
        
    }
    
    public static void main(String [] args) throws FileNotFoundException, IOException {
        ParseStock f = new ParseStock();
        //f.parseStock("/home/yhawin/Dimas/Input-File/STGDNG.TXT", null);//Oke --> "\\,"    
        //f.parseStock("E:/Input-File/STGDNG.TXT", null);//Oke --> "\\,"    
        f.parseStock("E:/Input-File/STOCK.TXT", null);//Oke --> "\\,"    
    }
    
}
