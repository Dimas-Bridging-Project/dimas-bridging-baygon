/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dimas.bridging;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dialog;
import java.io.File;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import org.config.spring.hibernate.model.CvOutlet;
import org.config.spring.hibernate.model.JHeader;
import org.config.spring.hibernate.model.JPcode;
import org.config.spring.hibernate.model.JTprb;
import org.config.spring.hibernate.model.JTpru;
import org.config.spring.hibernate.model.MapTipeOutlet;
import org.config.spring.hibernate.model.Outlet;
import org.config.spring.hibernate.model.Produk;
import org.config.spring.hibernate.model.Salesman;
import org.config.spring.hibernate.model.Stock;
import org.config.spring.hibernate.model.TblClientId;
import org.config.spring.hibernate.model.TblSalesId;
import org.config.spring.hibernate.model.TblSoId;
import org.config.spring.hibernate.model.TblStockId;
import org.dimas.bridging.email.SendEmailAttachment;
import org.dimas.bridging.export.ExportClient;
import org.dimas.bridging.export.ExportSO;
import org.dimas.bridging.export.ExportSales;
import org.dimas.bridging.export.ExportStock;
import org.dimas.bridging.retrieve.ParseCvOutlet;
import org.dimas.bridging.retrieve.ParseJHeader;
import org.dimas.bridging.retrieve.ParseJPcode;
import org.dimas.bridging.retrieve.ParseJTprb;
import org.dimas.bridging.retrieve.ParseJTpru;
import org.dimas.bridging.retrieve.ParseMSPCODE;
import org.dimas.bridging.retrieve.ParseOutlet;
import org.dimas.bridging.retrieve.ParseSalesman;
import org.dimas.bridging.retrieve.ParseStock;
import org.dimas.bridging.utils.DialogProses;

/**
 *
 * @author yhawin
 */
public class BridgingApp extends BridgingDefault implements Runnable{
    
    public void BridgingApp(){
        initFormDefa();
        initActionAdditionalDefa();
        initComponentAppearanceDefa();     
        
    }
    
    private void initFormDefa() {      
    }

    private void initActionAdditionalDefa() {
    }

    private void initComponentAppearanceDefa() {
    }

    public static void main(String [] args){
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BridgingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BridgingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BridgingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BridgingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */       
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                //new BridgingUI().setVisible(true);
                BridgingApp f = new BridgingApp();                
                f.setVisible(true);
                //new BridgingApp().setVisible(true);
            }
        });
     
    }
    
    //JDialog dialog = new JDialog(this, Dialog.ModalityType.MODELESS);
    DialogProses dialog = new DialogProses(this, true);
    public void progressDialogShow(){
        //dialog.setSize(200, 200);
        dialog.setModalityType(Dialog.ModalityType.MODELESS);
        
        int frameHeight = this.getHeight();
        int frameWidth = this.getWidth();
        int height = dialog.getHeight();
        int width = dialog.getWidth();
        dialog.setLocation(frameWidth/2 - width/2, frameHeight/2 - height/2);
        
        //Menghilangkan title bar dan border
        //dialog.setUndecorated(true);
        //dialog.setModal(true); Tidak Akan dijalankan untuk berikutnya
        
        //dialog.setVisible(true);
    }
    
    public void progressDialogClose() {
        //dialog.setVisible(false);
    }
    
/* Extract*/
   GenericRunnable theRunnable9 = new GenericRunnable();    
   @Override
   public void aksiBtnExtractAll() {
       try {
            this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            
            aksiBtnExtractClient();
            aksiBtnExtractStock();
            aksiBtnExtractSales();
            aksiBtnExtractSo();
            if (tmProduk.getRowCount()>0 || tmJHeader.getRowCount() >0 || tmOutlet.getRowCount() >0) {
                JOptionPane.showMessageDialog(this, "Extract Data Suksess..", "Info..", JOptionPane.INFORMATION_MESSAGE);

                getBtnKirimByEmail().setEnabled(true);
                if (JOptionPane.showConfirmDialog(this, "Buka File Explorer Hasil Extract?", "Konfimasi", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {
                    //Buka File Exploref
                    File localFilePath = new File(getTextPathOutput().getText());
                    java.awt.Desktop.getDesktop().open(localFilePath);
                }
            }
            
       }catch(Exception ex) {
       }finally {
            this.setCursor(Cursor.getDefaultCursor());          
       } 
       
       
   }  
   
    @Override
    public void aksiBtnKirimByEmail() {
           String emailBody = "Data Dimas Tanggal: ";

           String emailFrom = getTextEmailFrom().getText().trim();
          
           String emailPass = new String(getTextEmailPassword().getPassword());
           //String emailPass = "Welcome1#";
           
           String emailTo = getTextEmailTo().getText().trim();
           String emailSubject = getTextEmailSubject().getText().trim();
           String sourceFilePath = getTextPathOutput().getText().trim();
           Date tanggalTransaksi = getjDateChooserExtract1().getDate();
           
           //JOptionPane.showMessageDialog(this, emailPass);
           
           if (! (emailFrom.equals("") || emailTo.equals("") || emailPass.equals(""))) {
                SendEmailAttachment f = new SendEmailAttachment();
                try {
                    this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                    
                    f.sendGmailMessageWithAttachment(emailFrom, emailPass, emailTo, emailSubject, emailBody, sourceFilePath, tanggalTransaksi);
                    JOptionPane.showMessageDialog(this, "Email sukses dikirim....", "Info..", JOptionPane.INFORMATION_MESSAGE);
                } catch(Exception ex){
                    JOptionPane.showMessageDialog(this, "Gagal kirim email..\n"
                            + "PERIKSA KONEKSI INTERNET ATAU KONFIGURASI EMAIL ANDA", "Pesan Kesalahan..", JOptionPane.ERROR_MESSAGE);                    
                } finally {
                    this.setCursor(Cursor.getDefaultCursor());                          
                }
                
           } else {
               JOptionPane.showMessageDialog(this, "Data tidak dapat terkirim by email..\n"
                       + "PERIKSA KONFIGURASI EMAIL ANDA", "Pesan Kesalahan..", JOptionPane.ERROR_MESSAGE);
           }
    }
   
    @Override
    public void aksiBtnExtractClient() {
        if (! getTextPathOutput().getText().trim().equals("")) {

            String message = "Client: ";
            int jmlRecordSuccess = 0;
            int jmlRecordFail = 0;
            int jmlTotal1Success = 0;
            int jmlTotal1Fail = 0;
            int jmlTotal2Success = 0;
            int jmlTotal2Fail = 0;
            
            ExportClient f = new ExportClient();
            List<Outlet> lst = new ArrayList<>();
            
            if (databaseMode==true) {
                lst = outletDao.findAll();
            } else {
                lst = outletDaoMem.findAll();
            }
            
            List<TblClientId> listClient = f.ExportToCsvFromListToFile(getTextPathOutput().getText() + "Client_ID.CSV", lst);
            
            for (TblClientId itm: listClient ) {
                try {
                   if (databaseMode==true) {
                       tblClientIdDao.saveOrUpdate(itm);
                   } else {
                       tblClientIdDaoMem.saveOrUpdate(itm);
                   }
                    jmlRecordSuccess+=1;
                    //jmlTotal1Success += itm.getNetPpn();
                } catch(Exception ex) {
                    jmlRecordFail+=1;
                    //jmlTotal1Fail += itm.getNetPpn();                        
                
                }
                
            }
            aksiBtnOutputClientReload();
            
                NumberFormat nf = NumberFormat.getNumberInstance();
                nf.setMinimumFractionDigits(0); //jumlah pecahan dibelakang koma
                nf.setMaximumFractionDigits(0); //jumlah pecahan dibelakang koma
                message = message + "Jml Rec Success: " + Integer.toString(jmlRecordSuccess) + ", Fail: " + Integer.toString(jmlRecordFail) 
//                        + ",  Net+Ppn Success: " + String.valueOf(nf.format(jmlTotal1Success)) 
//                        + " and Fail: " + String.valueOf(nf.format(jmlTotal1Fail)) 
                        ;          
                getjLabelOutputClient().setText(message);
                 
            
        } 
     }
    @Override
    public void aksiBtnExtractSales() {
         if ((! getTextPathOutput().getText().trim().equals("")) && (getjDateChooserExtract1().getDate()!=null) 
                 && (getjDateChooserExtract2().getDate()!=null)) {
             
            String message = "Sales: ";
            int jmlRecordSuccess = 0;
            int jmlRecordFail = 0;
            int jmlTotal1Success = 0;
            int jmlTotal1Fail = 0;
            int jmlTotal2Success = 0;
            int jmlTotal2Fail = 0;
             
            //Tanggal Stock adalah sehari sebelum Tanggal transaksi
            Calendar cal1 = Calendar.getInstance();
            cal1.setTime(getjDateChooserExtract1().getDate());
            Calendar cal2 = Calendar.getInstance();
            cal2.setTime(getjDateChooserExtract2().getDate());
            //cal.add(Calendar.DATE, -1);
            //Date tanggalSebelum =  cal.getTime();
            
            List<JHeader> lst = new ArrayList<>();
            ExportSales f = new ExportSales();
//            if (databaseMode==true) {
//                lst = jheaderDao.findAllByDate(cal1.getTime()); //diganti dengan yang punya tanggal
//            } else {
//                lst = jheaderDaoMem.findAllByDate(cal1.getTime()); //diganti dengan yang punya tanggal                
//            }
            
            if (databaseMode==true) {
                lst = jheaderDao.findAllByDate(cal1.getTime(), cal2.getTime()); 
            } else {
                lst = jheaderDaoMem.findAllByDate(cal1.getTime(), cal2.getTime());                 
            }
            
            List<TblSalesId> listSalesId = f.ExportToCsvFromListToFile(getTextPathOutput().getText() + "Sales_ID.CSV",
                    getjDateChooserExtract1().getDate(),  getjDateChooserExtract2().getDate(), lst, databaseMode);
            
            for (TblSalesId itm: listSalesId ) {
                try {
                    if (databaseMode==true) {
                        tblSalesIdDao.saveOrUpdate(itm);
                    } else {
                        tblSalesIdDaoMem.saveOrUpdate(itm);                        
                    }
                    jmlRecordSuccess+=1;
                    jmlTotal1Success += itm.getNetValue();
                    jmlTotal2Success += itm.getGrossValue();
                } catch(Exception ex) {
                    jmlRecordFail+=1;
                    jmlTotal1Fail += itm.getNetValue();
                    jmlTotal2Fail += itm.getGrossValue();

                }
                
            }

            aksiBtnOutputSalesReload();
                NumberFormat nf = NumberFormat.getNumberInstance();
                nf.setMinimumFractionDigits(0); //jumlah pecahan dibelakang koma
                nf.setMaximumFractionDigits(0); //jumlah pecahan dibelakang koma
                message = message + "Jml Rec Success: " + Integer.toString(jmlRecordSuccess) + ", Fail: " + Integer.toString(jmlRecordFail) 
                        + ",  NET Success: " + String.valueOf(nf.format(jmlTotal1Success)) 
                        + " and Fail: " + String.valueOf(nf.format(jmlTotal1Fail)) 
                        + ",  GROSS Success: " + String.valueOf(nf.format(jmlTotal2Success)) 
                        + " and Fail: " + String.valueOf(nf.format(jmlTotal2Fail)) 
                        ;          
                getjLabelOutputSales().setText(message);
            
                             
        } else {
            JOptionPane.showMessageDialog(this, "PATH OUTPUT atau TANGGAL MUNGKIN KOSONG");
        }        
    }
    
    @Override
    public void aksiBtnExtractSo() {
         if ((! getTextPathOutput().getText().trim().equals("")) && (getjDateChooserExtract1().getDate()!=null)) {

             String message = "SO: ";
            int jmlRecordSuccess = 0;
            int jmlRecordFail = 0;
            int jmlTotal1Success = 0;
            int jmlTotal1Fail = 0;
            int jmlTotal2Success = 0;
            int jmlTotal2Fail = 0;
             
            //Tanggal Stock adalah sehari sebelum Tanggal transaksi
            Calendar cal1 = Calendar.getInstance();
            cal1.setTime(getjDateChooserExtract1().getDate());
            Calendar cal2 = Calendar.getInstance();
            cal2.setTime(getjDateChooserExtract2().getDate());
            //cal.add(Calendar.DATE, -1);
            //Date tanggalSebelum =  cal.getTime();
            
            List<JHeader> lst = new ArrayList<>();
             ExportSO f = new ExportSO();
            if (databaseMode==true) {
                lst = jheaderDao.findAllByDate(cal1.getTime(), cal2.getTime()); //diganti dengan yang punya tanggal
            } else {
                lst = jheaderDaoMem.findAllByDate(cal1.getTime(), cal2.getTime()); //diganti dengan yang punya tanggal
            }
            List<TblSoId> listSoId = f.ExportToCsvFromListToFile(getTextPathOutput().getText() + "SO_ID.CSV", 
                    getjDateChooserExtract1().getDate(), getjDateChooserExtract2().getDate(), lst, databaseMode);
            for (TblSoId itm: listSoId) {
                try {
                    if (databaseMode==true) {
                        tblSoIdDao.saveOrUpdate(itm);
                    } else {
                        tblSoIdDaoMem.saveOrUpdate(itm);
                    }
                    jmlRecordSuccess+=1;
                    jmlTotal1Success += itm.getNetValue();
                    jmlTotal2Success += itm.getGrossValue();
                } catch(Exception ex) {
                    jmlRecordFail+=1;
                    jmlTotal1Fail += itm.getNetValue();
                    jmlTotal2Fail += itm.getGrossValue();

                }
            }

            aksiBtnOutputSalesOrderReload();
                NumberFormat nf = NumberFormat.getNumberInstance();
                nf.setMinimumFractionDigits(0); //jumlah pecahan dibelakang koma
                nf.setMaximumFractionDigits(0); //jumlah pecahan dibelakang koma
                message = message + "Jml Rec Success: " + Integer.toString(jmlRecordSuccess) + ", Fail: " + Integer.toString(jmlRecordFail) 
                        + ",  NET Success: " + String.valueOf(nf.format(jmlTotal1Success)) 
                        + " and Fail: " + String.valueOf(nf.format(jmlTotal1Fail)) 
                        + ",  GROSS Success: " + String.valueOf(nf.format(jmlTotal2Success)) 
                        + " and Fail: " + String.valueOf(nf.format(jmlTotal2Fail)) 
                        ;          
                getjLabelOutputSalesOrder().setText(message);
            
        } else {
            JOptionPane.showMessageDialog(this, "PATH OUTPUT atau TANGGAL MUNGKIN KOSONG");
        }
        
    }
    @Override
    public void aksiBtnExtractStock() {        
         if ((! getTextPathOutput().getText().trim().equals("")) && (getjDateChooserExtract1().getDate()!=null)) {
             
            String message = "Stock: ";
            int jmlRecordSuccess = 0;
            int jmlRecordFail = 0;
            int jmlTotal1Success = 0;
            int jmlTotal1Fail = 0;
            int jmlTotal2Success = 0;
            int jmlTotal2Fail = 0;
             
            //Tanggal Stock adalah sehari sebelum Tanggal transaksi
            Calendar cal = Calendar.getInstance();
            cal.setTime(getjDateChooserExtract1().getDate());
            cal.add(Calendar.DATE, -1);
            Date tanggalSebelum =  cal.getTime();
            
            List<Stock> lst = new ArrayList<>();
            ExportStock f = new ExportStock();
            if (databaseMode==true) {
                lst = stockDao.findAllByTanggalStock(tanggalSebelum); //diganti dengan yang punya tanggal
            } else {
                lst = stockDaoMem.findAllByTanggalStock(tanggalSebelum); //diganti dengan yang punya tanggal
            }
            
            List<TblStockId> listStockId = f.ExportToCsvFromListToFile(getTextPathOutput().getText() + "Stock_ID.CSV", lst);     
            for (TblStockId itm: listStockId ) {
                try {
                    if (databaseMode==true) {
                        tblStockIdDao.saveOrUpdate(itm);
                    } else {
                        tblStockIdDaoMem.saveOrUpdate(itm);
                    }
                    jmlRecordSuccess+=1;
//                    jmlTotal1Success += itm.getNetValue();
//                    jmlTotal2Success += itm.getGrossValue();
                } catch(Exception ex) {
                    jmlRecordFail+=1;
//                    jmlTotal1Fail += itm.getNetValue();
//                    jmlTotal2Fail += itm.getGrossValue();
                    
                    
                }
                
            }
            
            aksiBtnOutputStockReload();     
            
                NumberFormat nf = NumberFormat.getNumberInstance();
                nf.setMinimumFractionDigits(0); //jumlah pecahan dibelakang koma
                nf.setMaximumFractionDigits(0); //jumlah pecahan dibelakang koma
                message = message + "Jml Rec Success: " + Integer.toString(jmlRecordSuccess) + ", Fail: " + Integer.toString(jmlRecordFail) 
//                        + ",  NET Success: " + String.valueOf(nf.format(jmlTotal1Success)) 
//                        + " and Fail: " + String.valueOf(nf.format(jmlTotal1Fail)) 
                        ;          
                getjLabelOutputStock().setText(message);
            
        } else {
            JOptionPane.showMessageDialog(this, "PATH OUTPUT atau TANGGAL MUNGKIN KOSONG");
        }
        
    }
/* Input Retrieve*/    
   @Override
    public void aksiBtnRetrieveInputCvOutlet() {
       if (! getTextPathInputCvOutlet().getText().trim().equals("")) {
           /*
           if (tmCvOutlet.getRowCount()==0) {
               JOptionPane.showMessageDialog(this, "CvOutlet.CSV Tidak akan diproses karena Outlet.CSV belum di-Upload\n"
                       + "Upload Outlet.CSV dahulu!!..");
           }
           */
           
            String message = "CvOutlet: ";
            int jmlRecordSuccess = 0;
            int jmlRecordFail = 0;
            int jmlTotal1 = 0;
            int jmlTotal2 = 0;
            
            getTextPathInputCvOutlet().setBackground(Color.YELLOW);
            ParseCvOutlet parse = new ParseCvOutlet();
            List<CvOutlet> lst = new ArrayList<>();
            lst = parse.parseCvOutlet(getTextPathInputCvOutlet().getText());
            
            for (CvOutlet itm: lst) {
                try {
                    if (databaseMode==true){
                        cvOutletDao.saveOrUpdate(itm);
                    } else {
                        cvOutletDaoMem.saveOrUpdate(itm);
                    }
                    jmlRecordSuccess+=1;
                } catch (Exception ex){
                    jmlRecordFail+=1;
                }
            }
            aksiBtnInputCvOutletReload();
            message = message + "Jml Rec Success: " + Integer.toString(jmlRecordSuccess) + ", Fail: " + Integer.toString(jmlRecordFail);
            getjLabelInputScyllaCvOutlet().setText(message);
            
            //Indikator jika berhasil atau gagal     
            if (tmCvOutlet.getRowCount() > 0) {
                getTextPathInputCvOutlet().setBackground(Color.GREEN);
            } else {
                getTextPathInputCvOutlet().setText("Error atau Data Kosong >> " + 
                        getTextPathInputCvOutlet().getText());
                getTextPathInputCvOutlet().setBackground(Color.RED);
            }
       }
    }
   @Override
    public void aksiBtnRetrieveInputJHeader() {
       boolean lanjut =true; //lanjut untuk cek file JHEADER, JTPRB, JTPRU lengkap apa tidak
       if (getTextPathInputJPcode().getText().trim().equals("") || getTextPathInputJTprb().getText().trim().equals("") ||
               getTextPathInputJTpru().getText().trim().equals("")) { 
           if (JOptionPane.showConfirmDialog(this, "Kotak Isian JPCODE atau JTPRB atau JTPRU kosong \n Yakin Lanjut Proses?",
                   "Konfirmasi", JOptionPane.OK_CANCEL_OPTION)==JOptionPane.CANCEL_OPTION) {
               lanjut = false;
           }          
       }
       
       if (lanjut==true) {       
            if (! getTextPathInputJHeader().getText().trim().equals("")) {
                 getTextPathInputJHeader().setBackground(Color.YELLOW);    

                String message = "JHeader: ";
                int jmlRecordSuccess = 0;
                int jmlRecordFail = 0;
                int jmlTotal1Success = 0;
                int jmlTotal1Fail = 0;
                int jmlTotal2Success = 0;
                int jmlTotal2Fail = 0;

                //Untuk mode Database Memory
                List<MapTipeOutlet> lstMap = mapTipeOutletDao.findAll();    
                for (MapTipeOutlet itmMap: lstMap) {
                    //System.out.println("Tipe Outlet : " + itmMap.getTipeOutlet());
                    try {
                        mapTipeOutletDaoMem.saveOrUpdate(itmMap);
                    } catch(Exception ex){}
                }

                ParseJHeader parse = new ParseJHeader();
                List<JHeader> lst = new ArrayList<>();
                lst = parse.parseJHeader(getTextPathInputJHeader().getText());

                int hitungJumlah = 0;
                for (JHeader itm: lst) {
                    try {
                        if (databaseMode==true) {
                            jheaderDao.saveOrUpdate(itm);
                        } else {
                            //System.out.println(itm.getIdOrder() + "\t" +  itm.getTypeOutlet() + 
                            //        "\t"+  itm.getTypeOutlet());
                            //File MapOutletTidakBisa Masuk secara otomatis jadi harus di masukkan
                            jheaderDaoMem.saveOrUpdate(itm);
                            
                            hitungJumlah++;
                        }
                        jmlRecordSuccess+=1;
                        jmlTotal1Success += itm.getNetPpn();
                    } catch(Exception ex) {
                        jmlRecordFail+=1;
                        jmlTotal1Fail += itm.getNetPpn();                        
                        //System.out.println("Test JHeader Gagal: " + itm);
                    }
                }
                aksiBtnInputJheaderReload();
                
                NumberFormat nf = NumberFormat.getNumberInstance();
                nf.setMinimumFractionDigits(0); //jumlah pecahan dibelakang koma
                nf.setMaximumFractionDigits(0); //jumlah pecahan dibelakang koma
                message = message + "Jml Rec Success: " + Integer.toString(jmlRecordSuccess) + ", Fail: " + Integer.toString(jmlRecordFail) + 
                        ",  Net+Ppn Success: " + String.valueOf(nf.format(jmlTotal1Success)) + 
                        " and Fail: " + String.valueOf(nf.format(jmlTotal1Fail) );          
                getjLabelInputScyllaJHeader().setText(message);
                
                //System.out.println(" Jumlah Jheader yang berhasil masuk : " + jheaderDaoMem.findAll().size() + " dari " + hitungJumlah);
                
                //Indikator jika berhasil atau gagal     
                 if (tmJHeader.getRowCount() > 0) {
                     getTextPathInputJHeader().setBackground(Color.GREEN);
                 } else {
                     getTextPathInputJHeader().setText("Error atau Data Kosong >> " + 
                             getTextPathInputJHeader().getText());
                     getTextPathInputJHeader().setBackground(Color.RED);
                 }
                 
                 //TRANSAKSI DETAILNYA
                 try {
                    aksiBtnRetrieveInputJPcode();
                 } catch(Exception ex){}
                 try {
                    aksiBtnRetrieveInputJTprb();
                 } catch(Exception ex) {}
                 try {
                    aksiBtnRetrieveInputJTpru();
                 } catch(Exception ex){}
            }
       }
    }
   
    @Override
    public void aksiBtnRetrieveInputJPcode() {
        if (! getTextPathInputJPcode().getText().trim().equals("")) {
             getTextPathInputJPcode().setBackground(Color.YELLOW);
             
            String message = "JPCode: ";
            int jmlRecordSuccess = 0;
            int jmlRecordFail = 0;
            int jmlTotal1Success = 0;
            int jmlTotal1Fail = 0;
            int jmlTotal2Success = 0;
            int jmlTotal2Fail = 0;

             ParseJPcode parse = new ParseJPcode();
             List<JPcode> lst = new ArrayList<>();
             lst = parse.parseJPcode(getTextPathInputJPcode().getText());

             int hitungMasuk=0;
             for (JPcode itm: lst) {
                try {
                    if (databaseMode==true){
                        jpcodeDao.saveOrUpdate(itm);
                    } else {
                        jpcodeDaoMem.saveOrUpdate(itm);
                        hitungMasuk++;
                    }
                    jmlRecordSuccess+=1;
                    jmlTotal1Success += itm.getHargaNoPpn();
                    
                } catch (Exception ex){
                    jmlRecordFail+=1;
                    jmlTotal1Fail += itm.getHargaNoPpn();                        
                }
            }
                aksiBtnInputJpcodeReload();
            
                NumberFormat nf = NumberFormat.getNumberInstance();
                nf.setMinimumFractionDigits(0); //jumlah pecahan dibelakang koma
                nf.setMaximumFractionDigits(0); //jumlah pecahan dibelakang koma
                message = message + "Jml Rec Success: " + Integer.toString(jmlRecordSuccess) + ", Fail: " + Integer.toString(jmlRecordFail) + 
                        ",  HargaNoPPn Success: " + String.valueOf(nf.format(jmlTotal1Success)) + 
                        " and Fail: " + String.valueOf(nf.format(jmlTotal1Fail) );          
                getjLabelInputScyllaJPCode().setText(message);
//            System.out.println("Jumlah ambil dari Dao : " + jpcodeDaoMem.findAll().size() + " dari : " + hitungMasuk);
            
             //Indikator jika berhasil atau gagal     
             if (tmJPcode.getRowCount() > 0) {
                 getTextPathInputJPcode().setBackground(Color.GREEN);
             } else {
                 getTextPathInputJPcode().setText("Error atau Data Kosong >> " + 
                         getTextPathInputJPcode().getText());
                 getTextPathInputJPcode().setBackground(Color.RED);
             }
        }       
       
    }
    @Override
     public void aksiBtnRetrieveInputJTprb() {
       if (! getTextPathInputJTprb().getText().trim().equals("")) {
            getTextPathInputJTprb().setBackground(Color.YELLOW);    
  
            String message = "JTprb: ";
            int jmlRecordSuccess = 0;
            int jmlRecordFail = 0;
            int jmlTotal1Success = 0;
            int jmlTotal1Fail = 0;
            int jmlTotal2Success = 0;
            int jmlTotal2Fail = 0;

            ParseJTprb parse = new ParseJTprb();
            List<JTprb> lst = new ArrayList<>();
            lst = parse.parseJTprb(getTextPathInputJTprb().getText());

            //System.out.println("Test JTPRB: " + lst.size());
                    
            Integer jmlMasuk = 0;
            for (JTprb itm: lst) {
                
                //System.out.println("Test JTPRB: " + itm.getJtprbPK());                
                try {
                    if (databaseMode==true){
                        jtprbDao.saveOrUpdate(itm);
                    } else {
                        jtprbDaoMem.saveOrUpdate(itm);
                    }
                    jmlMasuk++;
                    
                    jmlRecordSuccess+=1;
                    jmlTotal1Success += itm.getHargaNoPpn();
                    
                } catch (Exception ex){
                    jmlRecordFail+=1;
                    jmlTotal1Fail += itm.getHargaNoPpn(); 
                }    
            }
//            System.out.println("Test JTPRB: " + jmlMasuk);
            
                aksiBtnInputJtprbReload();
            
                NumberFormat nf = NumberFormat.getNumberInstance();
                nf.setMinimumFractionDigits(0); //jumlah pecahan dibelakang koma
                nf.setMaximumFractionDigits(0); //jumlah pecahan dibelakang koma
                message = message + "Jml Rec Success: " + Integer.toString(jmlRecordSuccess) + ", Fail: " + Integer.toString(jmlRecordFail) + 
                        ",  HargaNoPPn Success: " + String.valueOf(nf.format(jmlTotal1Success)) + 
                        " and Fail: " + String.valueOf(nf.format(jmlTotal1Fail) );          
                getjLabelInputScyllaJTprb().setText(message);
            
            //Indikator jika berhasil atau gagal     
            if (tmJTprb.getRowCount() > 0) {
                getTextPathInputJTprb().setBackground(Color.GREEN);
            } else {
                getTextPathInputJTprb().setText("Error atau Data Kosong >> " + 
                        getTextPathInputJTprb().getText());
                getTextPathInputJTprb().setBackground(Color.RED);
            }
       }
       
    }
   @Override
     public void aksiBtnRetrieveInputJTpru() {
        if (! getTextPathInputJTpru().getText().trim().equals("")) {
            getTextPathInputJTpru().setBackground(Color.YELLOW);    

            String message = "JTpru: ";
            int jmlRecordSuccess = 0;
            int jmlRecordFail = 0;
            int jmlTotal1Success = 0;
            int jmlTotal1Fail = 0;
            int jmlTotal2Success = 0;
            int jmlTotal2Fail = 0;

            ParseJTpru parse = new ParseJTpru();
            List<JTpru> lst = new ArrayList<>();
            lst = parse.parseJTpru(getTextPathInputJTpru().getText());
            for (JTpru itm: lst) {
                try {
                    if (databaseMode==true){
                        jtpruDao.saveOrUpdate(itm);
                    } else {
                        jtpruDaoMem.saveOrUpdate(itm);
                    }
                    jmlRecordSuccess+=1;
                    jmlTotal1Success += itm.getHargaNoPpn();
                    
                } catch (Exception ex){
                    jmlRecordFail+=1;
                    jmlTotal1Fail += itm.getHargaNoPpn();                        

                }
            }
            aksiBtnInputJtpruReload();
            
                NumberFormat nf = NumberFormat.getNumberInstance();
                nf.setMinimumFractionDigits(0); //jumlah pecahan dibelakang koma
                nf.setMaximumFractionDigits(0); //jumlah pecahan dibelakang koma
                message = message + "Jml Rec Success: " + Integer.toString(jmlRecordSuccess) + ", Fail: " + Integer.toString(jmlRecordFail) + 
                        ",  HargaNoPPn Success: " + String.valueOf(nf.format(jmlTotal1Success)) + 
                        " and Fail: " + String.valueOf(nf.format(jmlTotal1Fail) );          
                getjLabelInputScyllaJTpru().setText(message);
             
            //Indikator jika berhasil atau gagal     
            if (tmJTpru.getRowCount() > 0) {
                getTextPathInputJTpru().setBackground(Color.GREEN);
            } else {
                getTextPathInputJTpru().setText("Error atau Data Kosong >> " + 
                        getTextPathInputJTpru().getText());
                getTextPathInputJTpru().setBackground(Color.RED);
            }
       }
   }
   @Override
    public void aksiBtnRetrieveInputMaster() {
       if (! getTextPathInputMaster().getText().trim().equals("")) {
            getTextPathInputMaster().setBackground(Color.YELLOW);    

            String message = "Produk: ";
            int jmlRecordSuccess = 0;
            int jmlRecordFail = 0;
            int jmlTotal1Success = 0;
            int jmlTotal1Fail = 0;
            int jmlTotal2Success = 0;
            int jmlTotal2Fail = 0;

            ParseMSPCODE parse = new ParseMSPCODE();
            List<Produk> lst = new ArrayList<>();
            lst = parse.parseMSPCODE(getTextPathInputMaster().getText());
                 for (Produk itm: lst) {
                     try {
                         if (databaseMode==true){
                            produkDao.saveOrUpdate(itm);
                         }else {
                             produkDaoMem.saveOrUpdate(itm);
                         }
                        jmlRecordSuccess+=1;
//                      jmlTotal1Success += itm.getHargaNoPpn();
                    
                      } catch (Exception ex){
                        jmlRecordFail+=1;
  //                    jmlTotal1Fail += itm.getHargaNoPpn();                                             
                     }
                             
                 }
                 aksiBtnInputMasterReload();
                NumberFormat nf = NumberFormat.getNumberInstance();
                nf.setMinimumFractionDigits(0); //jumlah pecahan dibelakang koma
                nf.setMaximumFractionDigits(0); //jumlah pecahan dibelakang koma
                message = message + "Jml Rec Success: " + Integer.toString(jmlRecordSuccess) + ", Fail: " + Integer.toString(jmlRecordFail);          
                getjLabelInputScyllaMasterProduk().setText(message);
            
            //Indikator jika berhasil atau gagal     
            if (tmProduk.getRowCount() > 0) {
                getTextPathInputMaster().setBackground(Color.GREEN);
            } else {
                getTextPathInputMaster().setText("Error atau Data Kosong >> " + 
                        getTextPathInputMaster().getText());
                getTextPathInputMaster().setBackground(Color.RED);
            }
       }
    }
   
   GenericRunnable runnableRetrieveOutlet = new GenericRunnable();
   @Override
     public void aksiBtnRetrieveInputOutlet() {
       if (! getTextPathInputOutlet().getText().trim().equals("")) {
            getTextPathInputOutlet().setBackground(Color.YELLOW);    

            String message = "Produk: ";
            int jmlRecordSuccess = 0;
            int jmlRecordFail = 0;
            int jmlTotal1Success = 0;
            int jmlTotal1Fail = 0;
            int jmlTotal2Success = 0;
            int jmlTotal2Fail = 0;
            
            ParseOutlet parse = new ParseOutlet();
            List<Outlet> lst = new ArrayList<>();
            lst = parse.parseOutlet(getTextPathInputOutlet().getText());
            
            for (Outlet itm: lst) {
                try {
                    if (databaseMode==true){
                        outletDao.saveOrUpdate(itm);
                    } else {
                        outletDaoMem.saveOrUpdate(itm);
                    }
                    jmlRecordSuccess+=1;
//                      jmlTotal1Success += itm.getHargaNoPpn();

                 } catch (Exception ex){
                    jmlRecordFail+=1;
//                    jmlTotal1Fail += itm.getHargaNoPpn();                                                              
                }
            }
            aksiBtnInputOutletReload();
            //Indikator jika berhasil atau gagal     
                NumberFormat nf = NumberFormat.getNumberInstance();
                nf.setMinimumFractionDigits(0); //jumlah pecahan dibelakang koma
                nf.setMaximumFractionDigits(0); //jumlah pecahan dibelakang koma
                message = message + "Jml Rec Success: " + Integer.toString(jmlRecordSuccess) + ", Fail: " + Integer.toString(jmlRecordFail);          
                getjLabelInputScyllaOutlet().setText(message);
            
            if (tmOutlet.getRowCount() > 0) {
                getTextPathInputOutlet().setBackground(Color.GREEN);
            } else {
                getTextPathInputOutlet().setText("Error atau Data Kosong >> " + 
                        getTextPathInputOutlet().getText());
                getTextPathInputOutlet().setBackground(Color.RED);
            }
            
            //animationProsesHide();
       }
    }
   @Override
    public void aksiBtnRetrieveInputStock() {
       if (! getTextPathInputStock().getText().trim().equals("")) {
            getTextPathInputStock().setBackground(Color.YELLOW);    

            String message = "Produk: ";
            int jmlRecordSuccess = 0;
            int jmlRecordFail = 0;
            int jmlTotal1Success = 0;
            int jmlTotal1Fail = 0;
            int jmlTotal2Success = 0;
            int jmlTotal2Fail = 0;
            
            ParseStock parse = new ParseStock();
            List<Stock> lst = new ArrayList<>();
            lst = parse.parseStock(getTextPathInputStock().getText(), getjDateChooseTanggalStock().getDate());
            for (Stock itm: lst) {
                try {
                    if (databaseMode==true){
                        stockDao.saveOrUpdate(itm);
                    } else {
                        stockDaoMem.saveOrUpdate(itm);
                    }
                    jmlRecordSuccess+=1;
                    jmlTotal1Success += itm.getHargaBeli();
                 } catch (Exception ex){
                    jmlRecordFail+=1;
                    jmlTotal1Fail += itm.getHargaBeli();                                                              
                
                }
            }
            aksiBtnInputStockReload();
            
            //Indikator jika berhasil atau gagal     
                NumberFormat nf = NumberFormat.getNumberInstance();
                nf.setMinimumFractionDigits(0); //jumlah pecahan dibelakang koma
                nf.setMaximumFractionDigits(0); //jumlah pecahan dibelakang koma
                message = message + "Jml Rec Success: " + Integer.toString(jmlRecordSuccess) + ", Fail: " + Integer.toString(jmlRecordFail) + 
                        ",  HargaBeli Success: " + String.valueOf(nf.format(jmlTotal1Success)) + 
                        " and Fail: " + String.valueOf(nf.format(jmlTotal1Fail) );          
                getjLabelInputScyllaStock().setText(message);
            
            
            if (tmStock.getRowCount() > 0) {
                getTextPathInputStock().setBackground(Color.GREEN);
            } else {
                getTextPathInputStock().setText("Error atau Data Kosong >> " + 
                        getTextPathInputStock().getText());
                getTextPathInputStock().setBackground(Color.RED);
            }
       }
    }
    public void aksiBtnRetrieveInputSalesman() {
       if (! getTextPathInputSalesman() .getText().trim().equals("")) {
            getTextPathInputSalesman().setBackground(Color.YELLOW);    

            String message = "Salesman: ";
            int jmlRecordSuccess = 0;
            int jmlRecordFail = 0;
            int jmlTotal1Success = 0;
            int jmlTotal1Fail = 0;
            int jmlTotal2Success = 0;
            int jmlTotal2Fail = 0;
            
            ParseSalesman parse = new ParseSalesman();
            List<Salesman> lst = new ArrayList<>();
            lst = parse.parseSalesman(getTextPathInputSalesman().getText());
            for (Salesman itm: lst) {
                try {
                    if (databaseMode==true){
                        salesmanDao.saveOrUpdate(itm);
                    } else {
                        salesmanDaoMem.saveOrUpdate(itm);
                    }
                    jmlRecordSuccess+=1;
//                      jmlTotal1Success += itm.getHargaNoPpn();

                 } catch (Exception ex){
                    jmlRecordFail+=1;
//                    jmlTotal1Fail += itm.getHargaNoPpn();                                                              
                
                }
            }
            aksiBtnInputSalesmanReload();
            
            //Indikator jika berhasil atau gagal     
               NumberFormat nf = NumberFormat.getNumberInstance();
                nf.setMinimumFractionDigits(0); //jumlah pecahan dibelakang koma
                nf.setMaximumFractionDigits(0); //jumlah pecahan dibelakang koma
                message = message + "Jml Rec Success: " + Integer.toString(jmlRecordSuccess) + ", Fail: " + Integer.toString(jmlRecordFail);          
                getjLabelInputScyllaSalesman().setText(message);
             
            if (tmSalesman.getRowCount() > 0) {
                getTextPathInputSalesman().setBackground(Color.GREEN);
            } else {
                getTextPathInputSalesman().setText("Error atau Data Kosong >> " + 
                        getTextPathInputSalesman().getText());
                getTextPathInputSalesman().setBackground(Color.RED);
            }
       }
        
    }
   
   @Override
   public void aksiBtnRetrieveInputAll() {
        
        if (JOptionPane.showConfirmDialog(this, "Retrieve All akan memerlukan waktu agak lama \n\n "
                + "Yakin akan melanjutkan?", "Konfirmasi", JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION) {
                //Master Duluan
               this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));            
                try {
                    aksiBtnRetrieveInputMaster(); //Induk semua
                } catch(Exception ex){}
                try {
                    aksiBtnRetrieveInputSalesman();//Induk Semua
                } catch (Exception ex){}

                try {
                    aksiBtnRetrieveInputOutlet(); //Induk Semua
                }catch (Exception ex){}
                try {
                    aksiBtnRetrieveInputCvOutlet();
                }catch(Exception ex) {}

                try {
                    aksiBtnRetrieveInputJHeader(); //Induk            
                } catch(Exception ex){}
                /* Kan sudah tidak perlu kalau udah di jHeader
                try {
                    aksiBtnRetrieveInputJPcode();
                } catch(Exception ex){}
                try {
                    aksiBtnRetrieveInputJTprb();
                }catch(Exception ex){}
                try {
                    aksiBtnRetrieveInputJTpru();
                } catch(Exception ex){}
                */ 

                //Stock belakangan karena harus ada transaksi dulu
                try {
                    aksiBtnRetrieveInputStock();
                } catch (Exception ex){
                } finally {
                    this.setCursor(Cursor.getDefaultCursor());
                }  
        }  
        
        
   }
    
    GenericRunnable theRunnable10 = new GenericRunnable();
    void AksiUpload10(){
            //GenericRunnable theRunnable = new GenericRunnable();
            //theRunnable10.setFilePath("");
        Thread thread = new Thread(theRunnable10);
        thread.start();
            
    }          

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    
    
    
}

class GenericRunnable implements Runnable{
    int valueProgress = 0;
    String namaProses="";
    //String inputPath;
    //Boolean databaseMode=false;
    void GenericRunnable(){
    }
    @Override
    public void run() {
        if (getNamaProses().equalsIgnoreCase("RETRIEVE_OUTLET")) {
            setValueProgress(0);

            
            setValueProgress(100);
            
        }
    }  

    public int getValueProgress() {
        return valueProgress;
    }

    public void setValueProgress(int valueProgress) {
        this.valueProgress = valueProgress;
    }

    public String getNamaProses() {
        return namaProses;
    }

    public void setNamaProses(String namaProses) {
        this.namaProses = namaProses;
    }
    
}
