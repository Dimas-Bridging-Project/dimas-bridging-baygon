/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dimas.bridging;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author yhawin
 */
public class BridgingUI extends javax.swing.JFrame {

    /**
     * Creates new form BridgingUI
     */
    public BridgingUI() {
        initComponents();
        initUserActions();
    }
    public void resetTeksInputBackground(){
       textPathInputCvOutlet.setBackground(Color.WHITE);
       textPathInputJHeader.setBackground(Color.WHITE);
       textPathInputJPcode.setBackground(Color.WHITE);
       textPathInputJTprb.setBackground(Color.WHITE);
       textPathInputJTpru.setBackground(Color.WHITE);
       textPathInputMaster.setBackground(Color.WHITE);
       textPathInputOutlet.setBackground(Color.WHITE);
       textPathInputSalesman.setBackground(Color.WHITE);
       textPathInputStock.setBackground(Color.WHITE);   
    }
    
     public void setScreenCenter(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        int frameHeight = this.getHeight();
        int frameWidth = this.getWidth();
        //setSize(screenWidth / 2, screenHeight / 2);
        setLocation((screenWidth/2)-(frameWidth/2), (screenHeight/2)-(frameHeight/2));
     }   
     
    public void resetTeksAll(){
        resetTeksGeneralSetting();
        resetTeksMappingTipeOutlet();
        resetTeksRetrieveAndExtract();
    }
    
    public void resetTeksRetrieveAndExtract(){
       textPathInputCvOutlet.setText("");
       textPathInputJHeader.setText("");
       textPathInputJPcode.setText("");
       textPathInputJTprb.setText("");
       textPathInputJTpru.setText("");
       textPathInputMaster.setText("");
       textPathInputOutlet.setText("");
       textPathInputSalesman.setText("");
       textPathInputStock.setText("");
       
       textPathOutput.setText("");
    }
    
    public void resetTeksGeneralSetting(){
        textDistributorCode.setText("");
        
        textRecordTypeClient.setText("");
        textRecordTypeSales.setText("");
        textRecordTypeSo.setText("");
        textRecordTypeStock.setText("");
        
        textWarehouseWarehouseCode.setText("");
        textWarehouseWarehouseDescription.setText("");
        
        textEmailFrom.setText("");
        textEmailPassword.setText("");
        textEmailTo.setText("");
        textEmailSubject.setText("");
       
    }
    
    public void resetTeksMappingTipeOutlet(){
        textMapTipeOutletDeskripsi.setText("");
        textMapTipeOutletIdTipeOutlet.setText("");
        textMapTipeOutletIdTypeOutletScy.setText("");
    }
    
             public void aksiBtnPathOutput() {
             }
             public void aksiBtnExtractAll() {
             }    
             
             public void aksiBtnExtractClient() {
             }
             public void aksiBtnExtractSales() {
             }
             public void aksiBtnExtractSo() {
             }
             public void aksiBtnExtractStock() {
             }
             public void aksiBtnGeneralSettingReload() {
             }
             public void aksiBtnGeneralSettingSimpan() {
             }
             public void aksiBtnInputCvOutletReload() {
             }
             public void aksiBtnInputJheaderReload() {
             }
             public void aksiBtnInputJpcodeReload() {
             }
             public void aksiBtnInputJtprbReload() {
             }
             public void aksiBtnInputJtpruReload() {
             }
             public void aksiBtnInputMasterReload() {
             }
             public void aksiBtnInputOutletReload() {
             }
             public void aksiBtnInputSalesmanReload() {
             }
             public void aksiBtnInputStockReload() {
             }
             
             public void aksiBtnMapTipeOutletHapus() {
             }
             public void aksiBtnMapTipeOutletSimpan() {
             }
             public void aksiBtnMapTipeOutletReload() {
             }

             public void aksiBtnOutputClientReload() {
             }
             public void aksiBtnOutputSalesOrderReload() {
             }
             public void aksiBtnOutputSalesReload() {
             }
             public void aksiBtnOutputStockReload() {
             }
             
              public void aksiBtnPathInputStock() {
              }
              public void aksiBtnPathInputAuto() {
              } 
              public void aksiBtnPathInputCvOutlet() {
              }
              public void aksiBtnPathInputJHeader() {
              }
              public void aksiPathInputJPcode() {
              }
              public void aksiBtnPathInputJTprb() {
              }
               public void aksiBtnPathInputJTpru() {
              }
              public void aksiBtnPathInputMaster() {
              }
              public void aksiBtnPathInputOutlet() {
              }
              public void aksiBtnPathInputSalesman() {
              }
   
              public void aksiBtnRetrieveInputCvOutlet() {
              }
              public void aksiBtnRetrieveInputJHeader() {
              }
              public void aksiBtnRetrieveInputJPcode() {
              }
               public void aksiBtnRetrieveInputJTprb() {
              }
               public void aksiBtnRetrieveInputJTpru() {
              }
              public void aksiBtnRetrieveInputMaster() {
              }
               public void aksiBtnRetrieveInputOutlet() {
              }
              public void aksiBtnRetrieveInputStock() {
              }
             public void aksiBtnRetrieveInputSalesman() {
             }
           
              
              public void aksiBtnRetrieveInputAll() {
              }
              public void aksiBtnPathInputClearAll() {
              }
              public void aksiBtnPathInputReloadAll() {
              }
              
            public void aksiBtnKirimByEmail() {
           }

     public void initUserActions(){
  
         this.getBtnPathOutput().addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnPathOutput();
             }

         });
         this.getBtnExtractAll().addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnExtractAll();
             }

         });
          this.getBtnExtractClient().addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnExtractClient();
             }
         });
         this.getBtnExtractSales().addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnExtractSales();
             }
         });
         this.getBtnExtractSo().addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnExtractSo();
             }
         });
         this.getBtnExtractStock().addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnExtractStock();
             }
         });
         
         this.getBtnGeneralSettingReload().addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnGeneralSettingReload();
             }

         });
         this.getBtnGeneralSettingSimpan().addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnGeneralSettingSimpan();
             }

         });
         
         this.getBtnInputCvOutletReload().addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnInputCvOutletReload();
             }

         });
         this.getBtnInputJheaderReload().addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnInputJheaderReload();
             }

         });
         this.getBtnInputJpcodeReload().addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnInputJpcodeReload();
             }

         });
         this.getBtnInputJtprbReload().addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnInputJtprbReload();
             }

         });
         this.getBtnInputJtpruReload().addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnInputJtpruReload();
             }

         });
         this.getBtnInputMasterReload().addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnInputMasterReload();
             }

         });
         this.getBtnInputOutletReload().addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnInputOutletReload();
             }

         });
         this.getBtnInputSalesmanReload().addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnInputSalesmanReload();
             }

         });
         this.getBtnInputStockReload().addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnInputStockReload();
             }

         });
         
         this.getBtnMapTipeOutletHapus().addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnMapTipeOutletHapus();
             }

         });
         this.getBtnMapTipeOutletSimpan().addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnMapTipeOutletSimpan();
             }

         });
         this.getBtnMapTipeOutletReload().addActionListener(new ActionListener() {

              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnMapTipeOutletReload();
              }

          });
         this.getBtnOutputClientReload().addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnOutputClientReload();
             }

         });
         this.getBtnOutputSalesOrderReload().addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnOutputSalesOrderReload();
             }

         } );
         this.getBtnOutputSalesReload().addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnOutputSalesReload();
             }

         });
         this.getBtnOutputStockReload().addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnOutputStockReload();
             }

         });
         
         this.getBtnPathInputAuto().addActionListener(new ActionListener() {

              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnPathInputAuto();
              }

          });
         this.getBtnPathInputCvOutlet().addActionListener(new ActionListener() {

              @Override
              public void actionPerformed(ActionEvent e) {
                    aksiBtnPathInputCvOutlet();                  
              }
          });
         this.getBtnPathInputJHeader().addActionListener(new ActionListener() {

              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnPathInputJHeader();
              }

          });
         this.getBtnPathInputJPcode().addActionListener(new ActionListener() {

              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiPathInputJPcode();
              }

          });
         this.getBtnPathInputJTprb().addActionListener(new ActionListener() {

              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnPathInputJTprb();
              }

          });
         this.getBtnPathInputJTpru().addActionListener(new ActionListener() {

              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnPathInputJTpru();
              }

          });
         this.getBtnPathInputMaster().addActionListener(new ActionListener() {

              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnPathInputMaster();
              }

          });
         this.getBtnPathInputOutlet().addActionListener(new ActionListener() {

              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnPathInputOutlet();
              }

          });
         this.getBtnPathInputSalesman().addActionListener(new ActionListener() {

              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnPathInputSalesman();
              }

          });
         this.getBtnPathInputStock().addActionListener(new ActionListener() {

              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnPathInputStock();
              }

          });
    
                  
         this.getBtnRetrieveInputCvOutlet().addActionListener(new ActionListener() {

              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnRetrieveInputCvOutlet();
              }

          });
         this.getBtnRetrieveInputSalesman().addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnRetrieveInputSalesman();
             }

         });
         
         this.getBtnRetrieveInputJHeader().addActionListener(new ActionListener() {

              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnRetrieveInputJHeader();
              }

          });
         this.getBtnRetrieveInputJPcode().addActionListener(new ActionListener() {

              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnRetrieveInputJPcode();
              }

          });
         this.getBtnRetrieveInputJTprb().addActionListener(new ActionListener() {

              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnRetrieveInputJTprb();
              }

          });
         this.getBtnRetrieveInputJTpru().addActionListener(new ActionListener() {

              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnRetrieveInputJTpru();
              }

          });
         this.getBtnRetrieveInputMaster().addActionListener(new ActionListener() {

              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnRetrieveInputMaster();
              }

          });
         this.getBtnRetrieveInputOutlet().addActionListener(new ActionListener() {

              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnRetrieveInputOutlet();
              }

          });
         this.getBtnRetrieveInputStock().addActionListener(new ActionListener() {

              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnRetrieveInputStock();
              }

          });
    
         this.getBtnRetrieveInputAll().addActionListener(new ActionListener() {

              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnRetrieveInputAll();
              }

          });
         
         
         this.getBtnPathInputClearAll().addActionListener(new ActionListener() {

              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnPathInputClearAll();
              }

          });
         this.getBtnPathInputReloadAll().addActionListener(new ActionListener() {

              @Override
              public void actionPerformed(ActionEvent e) {
                  aksiBtnPathInputReloadAll();
              }

          });
         this.getBtnKirimByEmail().addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 aksiBtnKirimByEmail();
             }

         });
        
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        labelProcess1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        btnInputMasterReload = new javax.swing.JButton();
        jLabelInputScyllaMasterProduk = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableInputMaster = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        btnInputStockReload = new javax.swing.JButton();
        jLabelInputScyllaStock = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableInputStock = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        btnInputOutletReload = new javax.swing.JButton();
        jLabelInputScyllaOutlet = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableInputOutlet = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        btnInputCvOutletReload = new javax.swing.JButton();
        jLabelInputScyllaCvOutlet = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableInputCvOutlet = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        btnInputSalesmanReload = new javax.swing.JButton();
        jLabelInputScyllaSalesman = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableInputSalesman = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        btnInputJheaderReload = new javax.swing.JButton();
        jLabelInputScyllaJHeader = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableInputJheader = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        btnInputJpcodeReload = new javax.swing.JButton();
        jLabelInputScyllaJPCode = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tableInputJpcode = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        btnInputJtprbReload = new javax.swing.JButton();
        jLabelInputScyllaJTprb = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tableInputJtprb = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        btnInputJtpruReload = new javax.swing.JButton();
        jLabelInputScyllaJTpru = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tableInputJtpru = new javax.swing.JTable();
        jPanel17 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel21 = new javax.swing.JPanel();
        textDistributorCode = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel52 = new javax.swing.JPanel();
        textRecordTypeSales = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        textRecordTypeStock = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        textRecordTypeClient = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        textRecordTypeSo = new javax.swing.JTextField();
        jPanel53 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        textWarehouseWarehouseCode = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        textWarehouseWarehouseDescription = new javax.swing.JTextField();
        btnGeneralSettingSimpan = new javax.swing.JButton();
        btnGeneralSettingReload = new javax.swing.JButton();
        jPanel54 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        textEmailFrom = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        textEmailTo = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        textEmailSubject = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        textEmailPassword = new javax.swing.JPasswordField();
        jPanel56 = new javax.swing.JPanel();
        checkTprbDiluarBarang = new javax.swing.JCheckBox();
        jPanel22 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tableMappingTipeOutlet = new javax.swing.JTable();
        jPanel42 = new javax.swing.JPanel();
        btnMapTipeOutletSimpan = new javax.swing.JButton();
        btnMapTipeOutletHapus = new javax.swing.JButton();
        btnMapTipeOutletReload = new javax.swing.JButton();
        jPanel43 = new javax.swing.JPanel();
        textMapTipeOutletIdTypeOutletScy = new javax.swing.JTextField();
        textMapTipeOutletIdTipeOutlet = new javax.swing.JTextField();
        textMapTipeOutletDeskripsi = new javax.swing.JTextField();
        jPanel57 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        textPathInputMaster = new javax.swing.JTextField();
        textPathInputStock = new javax.swing.JTextField();
        textPathInputOutlet = new javax.swing.JTextField();
        textPathInputCvOutlet = new javax.swing.JTextField();
        textPathInputSalesman = new javax.swing.JTextField();
        textPathInputJHeader = new javax.swing.JTextField();
        textPathInputJPcode = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textPathInputJTprb = new javax.swing.JTextField();
        textPathInputJTpru = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnPathInputMaster = new javax.swing.JButton();
        btnPathInputStock = new javax.swing.JButton();
        btnPathInputOutlet = new javax.swing.JButton();
        btnPathInputCvOutlet = new javax.swing.JButton();
        btnPathInputSalesman = new javax.swing.JButton();
        btnPathInputJHeader = new javax.swing.JButton();
        btnPathInputJPcode = new javax.swing.JButton();
        btnPathInputJTprb = new javax.swing.JButton();
        btnPathInputJTpru = new javax.swing.JButton();
        btnRetrieveInputMaster = new javax.swing.JButton();
        btnRetrieveInputStock = new javax.swing.JButton();
        btnRetrieveInputOutlet = new javax.swing.JButton();
        btnRetrieveInputSalesman = new javax.swing.JButton();
        btnRetrieveInputCvOutlet = new javax.swing.JButton();
        btnRetrieveInputJHeader = new javax.swing.JButton();
        btnRetrieveInputJPcode = new javax.swing.JButton();
        btnRetrieveInputJTprb = new javax.swing.JButton();
        btnRetrieveInputJTpru = new javax.swing.JButton();
        jDateChooseTanggalStock = new com.toedter.calendar.JDateChooser("dd/MM/yyyy", "##/##/####",'_');
        jLabel27 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        textPathOutput = new javax.swing.JTextField();
        btnPathOutput = new javax.swing.JButton();
        btnExtractSales = new javax.swing.JButton();
        btnExtractStock = new javax.swing.JButton();
        btnExtractClient = new javax.swing.JButton();
        btnExtractSo = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnExtractAll = new javax.swing.JButton();
        jDateChooserExtract1 = new com.toedter.calendar.JDateChooser("dd/MM/yyyy", "##/##/####",'_');
        btnKirimByEmail = new javax.swing.JButton();
        jDateChooserExtract2 = new com.toedter.calendar.JDateChooser("dd/MM/yyyy", "##/##/####",'_');
        jPanel55 = new javax.swing.JPanel();
        checkModeDatabase = new javax.swing.JCheckBox();
        jPanel58 = new javax.swing.JPanel();
        btnPathInputReloadAll = new javax.swing.JButton();
        btnPathInputAuto = new javax.swing.JButton();
        btnPathInputClearAll = new javax.swing.JButton();
        btnRetrieveInputAll = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        btnOutputSalesReload = new javax.swing.JButton();
        jLabelOutputSales = new javax.swing.JLabel();
        jPanel45 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tableOutputSales = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        btnOutputStockReload = new javax.swing.JButton();
        jLabelOutputStock = new javax.swing.JLabel();
        jPanel47 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tableOutputStock = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jPanel48 = new javax.swing.JPanel();
        btnOutputClientReload = new javax.swing.JButton();
        jLabelOutputClient = new javax.swing.JLabel();
        jPanel49 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        tableOutputClient = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jPanel50 = new javax.swing.JPanel();
        btnOutputSalesOrderReload = new javax.swing.JButton();
        jLabelOutputSalesOrder = new javax.swing.JLabel();
        jPanel51 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        tableOutputSalesOrder = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelProcess1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelProcess1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/ajax-loader.gif"))); // NOI18N
        jLayeredPane1.add(labelProcess1);
        labelProcess1.setBounds(0, 0, 30, 70);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.RIGHT);

        jPanel23.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnInputMasterReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnInputMasterReload.setText("Reload");

        jLabelInputScyllaMasterProduk.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelInputScyllaMasterProduk.setText("jLabelInputScyllaMasterProduk");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInputMasterReload, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelInputScyllaMasterProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInputMasterReload)
                    .addComponent(jLabelInputScyllaMasterProduk))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel24.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableInputMaster.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableInputMaster.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tableInputMaster);

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Master/Product", jPanel2);

        jPanel25.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnInputStockReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnInputStockReload.setText("Reload");

        jLabelInputScyllaStock.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelInputScyllaStock.setText("jLabelInputScyllaStock");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInputStockReload, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelInputScyllaStock, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInputStockReload)
                    .addComponent(jLabelInputScyllaStock))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel26.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableInputStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tableInputStock);

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Stock", jPanel3);

        jPanel27.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnInputOutletReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnInputOutletReload.setText("Reload");

        jLabelInputScyllaOutlet.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelInputScyllaOutlet.setText("jLabelInputScyllaOutlet");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInputOutletReload, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelInputScyllaOutlet, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInputOutletReload)
                    .addComponent(jLabelInputScyllaOutlet))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel28.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableInputOutlet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tableInputOutlet);

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Outlet", jPanel4);

        jPanel29.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnInputCvOutletReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnInputCvOutletReload.setText("Reload");

        jLabelInputScyllaCvOutlet.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelInputScyllaCvOutlet.setText("jLabelInputScyllaCvOutlet");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInputCvOutletReload, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelInputScyllaCvOutlet, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInputCvOutletReload)
                    .addComponent(jLabelInputScyllaCvOutlet))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel30.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableInputCvOutlet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tableInputCvOutlet);

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("CvOutlet", jPanel5);

        jPanel31.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnInputSalesmanReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnInputSalesmanReload.setText("Reload");

        jLabelInputScyllaSalesman.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelInputScyllaSalesman.setText("jLabelInputScyllaSalesman");
        jLabelInputScyllaSalesman.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInputSalesmanReload, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelInputScyllaSalesman, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInputSalesmanReload)
                    .addComponent(jLabelInputScyllaSalesman))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel32.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableInputSalesman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(tableInputSalesman);

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Salesman", jPanel6);

        jPanel33.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnInputJheaderReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnInputJheaderReload.setText("Reload");

        jLabelInputScyllaJHeader.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelInputScyllaJHeader.setText("jLabelInputScyllaJHeader");
        jLabelInputScyllaJHeader.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInputJheaderReload, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabelInputScyllaJHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInputJheaderReload)
                    .addComponent(jLabelInputScyllaJHeader))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel34.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableInputJheader.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(tableInputJheader);

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("JHeader", jPanel7);

        jPanel35.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnInputJpcodeReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnInputJpcodeReload.setText("Reload");

        jLabelInputScyllaJPCode.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelInputScyllaJPCode.setText("jLabelInputScyllaJPCode");

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInputJpcodeReload, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelInputScyllaJPCode, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInputJpcodeReload)
                    .addComponent(jLabelInputScyllaJPCode))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel36.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableInputJpcode.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(tableInputJpcode);

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("JPcode", jPanel14);

        jPanel37.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnInputJtprbReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnInputJtprbReload.setText("Reload");

        jLabelInputScyllaJTprb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelInputScyllaJTprb.setText("jLabelInputScyllaJTprb");

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInputJtprbReload, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelInputScyllaJTprb, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInputJtprbReload)
                    .addComponent(jLabelInputScyllaJTprb))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel38.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableInputJtprb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane8.setViewportView(tableInputJtprb);

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("JTprb", jPanel15);

        jPanel39.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnInputJtpruReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnInputJtpruReload.setText("Reload");

        jLabelInputScyllaJTpru.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelInputScyllaJTpru.setText("jLabelInputScyllaJTpru");

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInputJtpruReload, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelInputScyllaJTpru, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelInputScyllaJTpru)
                    .addComponent(btnInputJtpruReload))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel40.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableInputJtpru.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane9.setViewportView(tableInputJtpru);

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("JTpru", jPanel16);

        jTabbedPane4.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        jPanel21.setFont(new java.awt.Font("Lucida Grande", 3, 12)); // NOI18N

        textDistributorCode.setText("jTextField11");

        jLabel11.setText("Distributor Code");

        jPanel52.setBorder(javax.swing.BorderFactory.createTitledBorder("Record Type"));

        textRecordTypeSales.setText("jTextField15");

        jLabel12.setText("Sales");

        jLabel13.setText("Stock");

        textRecordTypeStock.setText("jTextField15");

        jLabel14.setText("Client");

        textRecordTypeClient.setText("jTextField15");

        jLabel15.setText("SO");

        textRecordTypeSo.setText("jTextField15");

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel52Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(textRecordTypeSales, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel52Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(textRecordTypeStock, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel52Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(textRecordTypeClient, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel52Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(textRecordTypeSo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textRecordTypeSales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textRecordTypeStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textRecordTypeClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textRecordTypeSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(0, 41, Short.MAX_VALUE))
        );

        jPanel53.setBorder(javax.swing.BorderFactory.createTitledBorder("Warehouse"));

        jLabel16.setText("Warehouse Code");

        textWarehouseWarehouseCode.setText("jTextField15");

        jLabel17.setText("Warehouse Description");

        textWarehouseWarehouseDescription.setText("jTextField15");

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel53Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(textWarehouseWarehouseCode, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel53Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(textWarehouseWarehouseDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textWarehouseWarehouseCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textWarehouseWarehouseDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        btnGeneralSettingSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/save_16x16.png"))); // NOI18N
        btnGeneralSettingSimpan.setText("Simpan");

        btnGeneralSettingReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnGeneralSettingReload.setText("Reload");

        jPanel54.setBorder(javax.swing.BorderFactory.createTitledBorder("Email untuk Kirim"));

        jLabel18.setText("From");

        textEmailFrom.setText("jTextField1");

        jLabel19.setText("To");

        textEmailTo.setText("jTextField2");

        jLabel20.setForeground(new java.awt.Color(212, 30, 30));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("EMAIL TO lebih dari 1 addresss gunakan tanda ( ; )");

        jLabel21.setForeground(new java.awt.Color(212, 30, 30));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("contoh: bari@gmail.com; alif@yahoo.com");

        textEmailSubject.setText("jTextField1");

        jLabel22.setText("Subject");

        jLabel28.setText("Password");

        textEmailPassword.setText("jPasswordField1");

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel54Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addComponent(textEmailSubject))
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                    .addGroup(jPanel54Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textEmailTo))
                    .addGroup(jPanel54Layout.createSequentialGroup()
                        .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textEmailFrom)
                            .addComponent(textEmailPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(textEmailFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(textEmailPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textEmailTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textEmailSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addContainerGap())
        );

        jPanel56.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        checkTprbDiluarBarang.setText("Diskon TPRB diluar barang spread satu nota");

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(checkTprbDiluarBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkTprbDiluarBarang)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel21Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addGap(29, 29, 29)
                            .addComponent(textDistributorCode, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(btnGeneralSettingSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGeneralSettingReload, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(textDistributorCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jPanel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGeneralSettingSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGeneralSettingReload, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("General Setting", jPanel21);

        jPanel41.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableMappingTipeOutlet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane10.setViewportView(tableMappingTipeOutlet);

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel42.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnMapTipeOutletSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/save_16x16.png"))); // NOI18N
        btnMapTipeOutletSimpan.setText("Simpan");

        btnMapTipeOutletHapus.setText("Hapus");

        btnMapTipeOutletReload.setText("Reload");

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMapTipeOutletSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnMapTipeOutletHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMapTipeOutletReload, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMapTipeOutletSimpan)
                    .addComponent(btnMapTipeOutletHapus)
                    .addComponent(btnMapTipeOutletReload))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel43.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        textMapTipeOutletIdTypeOutletScy.setText("jTextField12");

        textMapTipeOutletIdTipeOutlet.setText("jTextField13");

        textMapTipeOutletDeskripsi.setText("jTextField14");

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textMapTipeOutletIdTypeOutletScy, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textMapTipeOutletIdTipeOutlet, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textMapTipeOutletDeskripsi)
                .addContainerGap())
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textMapTipeOutletIdTypeOutletScy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMapTipeOutletIdTipeOutlet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMapTipeOutletDeskripsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel57.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel23.setForeground(java.awt.Color.red);
        jLabel23.setText("Outlet yang TIPE nya tidak terdaftar disini");

        jLabel24.setForeground(java.awt.Color.red);
        jLabel24.setText("TIDAK AKAN DIPROSES");

        jLabel25.setForeground(java.awt.Color.red);
        jLabel25.setText("JADI:");

        jLabel26.setForeground(java.awt.Color.red);
        jLabel26.setText("PASTIKAN SEMUA TIPE SUDAH CATAT DISINI");

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addContainerGap(223, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        jTabbedPane4.addTab("Mapping Tipe Outlet Baygon", jPanel22);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane4)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Konfigurasi Sistem", jPanel17);

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder("Input dari Scylla"));

        textPathInputMaster.setText("jTextField1");

        textPathInputStock.setText("jTextField2");

        textPathInputOutlet.setText("jTextField3");

        textPathInputCvOutlet.setText("jTextField4");

        textPathInputSalesman.setText("Salesman");

        textPathInputJHeader.setText("jTextField6");

        textPathInputJPcode.setText("jTextField7");

        jLabel1.setText("1. Master/Prod");

        jLabel2.setText("9. Stock");

        jLabel3.setText("2. Salesman");

        jLabel4.setText("3. Outlet");

        jLabel5.setText("4. CvOutlet");

        jLabel6.setText("5. JHeader");

        jLabel7.setText("6. JPcode");

        textPathInputJTprb.setText("jTextField8");

        textPathInputJTpru.setText("jTextField9");

        jLabel8.setText("7. JTprb");

        jLabel9.setText("8. JTpru");

        btnPathInputMaster.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_add_16x16.png"))); // NOI18N
        btnPathInputMaster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPathInputMasterActionPerformed(evt);
            }
        });

        btnPathInputStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_add_16x16.png"))); // NOI18N

        btnPathInputOutlet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_add_16x16.png"))); // NOI18N

        btnPathInputCvOutlet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_add_16x16.png"))); // NOI18N

        btnPathInputSalesman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_add_16x16.png"))); // NOI18N

        btnPathInputJHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_add_16x16.png"))); // NOI18N

        btnPathInputJPcode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_add_16x16.png"))); // NOI18N

        btnPathInputJTprb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_add_16x16.png"))); // NOI18N

        btnPathInputJTpru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_add_16x16.png"))); // NOI18N

        btnRetrieveInputMaster.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync2_16x16.png"))); // NOI18N
        btnRetrieveInputMaster.setText("1. Retrieve");
        btnRetrieveInputMaster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrieveInputMasterActionPerformed(evt);
            }
        });

        btnRetrieveInputStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync2_16x16.png"))); // NOI18N
        btnRetrieveInputStock.setText("9. Retrieve");

        btnRetrieveInputOutlet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync2_16x16.png"))); // NOI18N
        btnRetrieveInputOutlet.setText("3. Retrieve");

        btnRetrieveInputSalesman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync2_16x16.png"))); // NOI18N
        btnRetrieveInputSalesman.setText("2. Retrieve");

        btnRetrieveInputCvOutlet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync2_16x16.png"))); // NOI18N
        btnRetrieveInputCvOutlet.setText("4. Retrieve");

        btnRetrieveInputJHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync2_16x16.png"))); // NOI18N
        btnRetrieveInputJHeader.setText("5. Retrieve");

        btnRetrieveInputJPcode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync2_16x16.png"))); // NOI18N
        btnRetrieveInputJPcode.setText("6. Retrieve");

        btnRetrieveInputJTprb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync2_16x16.png"))); // NOI18N
        btnRetrieveInputJTprb.setText("7. Retrieve");

        btnRetrieveInputJTpru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync2_16x16.png"))); // NOI18N
        btnRetrieveInputJTpru.setText("8. Retrieve");
        btnRetrieveInputJTpru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrieveInputJTpruActionPerformed(evt);
            }
        });

        jDateChooseTanggalStock.setDateFormatString("dd/MM/yyyy");

        jLabel27.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 0, 0));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Tanggal Stock adalah stok awal transaksi atau stok akhir tanggal kemarin");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textPathInputJTpru, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                            .addComponent(textPathInputJTprb)
                            .addComponent(textPathInputMaster)
                            .addComponent(textPathInputJHeader)
                            .addComponent(textPathInputJPcode)
                            .addComponent(textPathInputCvOutlet)
                            .addComponent(textPathInputOutlet)
                            .addComponent(textPathInputSalesman))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPathInputMaster)
                            .addComponent(btnPathInputOutlet)
                            .addComponent(btnPathInputCvOutlet)
                            .addComponent(btnPathInputSalesman)
                            .addComponent(btnPathInputJHeader)
                            .addComponent(btnPathInputJPcode)
                            .addComponent(btnPathInputJTprb)
                            .addComponent(btnPathInputJTpru))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRetrieveInputMaster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRetrieveInputJHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRetrieveInputJPcode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRetrieveInputJTprb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRetrieveInputJTpru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRetrieveInputSalesman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRetrieveInputOutlet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRetrieveInputCvOutlet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(textPathInputStock, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooseTanggalStock, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPathInputStock)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRetrieveInputStock)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textPathInputMaster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(btnPathInputMaster))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnRetrieveInputMaster)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textPathInputSalesman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPathInputOutlet)
                    .addComponent(btnRetrieveInputSalesman))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPathInputCvOutlet)
                            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textPathInputOutlet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRetrieveInputCvOutlet)
                            .addComponent(btnPathInputSalesman)
                            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textPathInputCvOutlet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(textPathInputJHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnPathInputJHeader))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRetrieveInputJHeader))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textPathInputJPcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnPathInputJPcode))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textPathInputJTprb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnPathInputJTprb))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textPathInputJTpru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnPathInputJTpru))
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(btnRetrieveInputJPcode)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRetrieveInputJTprb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRetrieveInputJTpru)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textPathInputStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel27)
                                .addGap(7, 7, 7))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDateChooseTanggalStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPathInputStock)
                                    .addComponent(btnRetrieveInputStock))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(btnRetrieveInputOutlet)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder("Extract Baygon"));

        textPathOutput.setText("jTextField10");

        btnPathOutput.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_download_16x16.png"))); // NOI18N

        btnExtractSales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_download2_16x16.png"))); // NOI18N
        btnExtractSales.setText("Sales");

        btnExtractStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_download2_16x16.png"))); // NOI18N
        btnExtractStock.setText("Stock");

        btnExtractClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_download2_16x16.png"))); // NOI18N
        btnExtractClient.setText("Client");

        btnExtractSo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_download2_16x16.png"))); // NOI18N
        btnExtractSo.setText("SO");

        jLabel10.setText("Path");

        btnExtractAll.setText("Extract All");

        jDateChooserExtract1.setDateFormatString("dd/MM/yyyy");

        btnKirimByEmail.setText("Kirim By Email");
        btnKirimByEmail.setEnabled(false);

        jDateChooserExtract2.setDateFormatString("dd/MM/yyyy");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(6, 6, 6)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jDateChooserExtract1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooserExtract2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(textPathOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPathOutput)
                .addGap(49, 49, 49)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(btnExtractSales)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExtractStock))
                    .addComponent(btnExtractAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(btnExtractClient)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExtractSo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnKirimByEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(textPathOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnPathOutput))
                            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnExtractSales)
                                .addComponent(btnExtractStock)
                                .addComponent(btnExtractClient)
                                .addComponent(btnExtractSo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jDateChooserExtract1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnExtractAll)
                                .addComponent(btnKirimByEmail))
                            .addComponent(jDateChooserExtract2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
        );

        jPanel55.setBorder(javax.swing.BorderFactory.createTitledBorder("Others Setting"));

        checkModeDatabase.setText("MODE DB");

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(checkModeDatabase)
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkModeDatabase)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel58.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnPathInputReloadAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnPathInputReloadAll.setText("Reload All");

        btnPathInputAuto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/folder_add_16x16.png"))); // NOI18N
        btnPathInputAuto.setText("Auto Path");

        btnPathInputClearAll.setFont(new java.awt.Font("Lucida Grande", 3, 10)); // NOI18N
        btnPathInputClearAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/erase_16x16.png"))); // NOI18N
        btnPathInputClearAll.setText("Clear All");

        btnRetrieveInputAll.setFont(new java.awt.Font("Lucida Grande", 3, 10)); // NOI18N
        btnRetrieveInputAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync2_16x16.png"))); // NOI18N
        btnRetrieveInputAll.setText("Retrieve All");
        btnRetrieveInputAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrieveInputAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnPathInputReloadAll, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPathInputAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPathInputClearAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRetrieveInputAll, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPathInputReloadAll)
                    .addComponent(btnPathInputAuto)
                    .addComponent(btnPathInputClearAll)
                    .addComponent(btnRetrieveInputAll))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel58, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 99, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Retrieve And Extract BAYGON", jPanel18);

        jTabbedPane1.setSelectedIndex(10);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Input Scylla", jPanel8);

        jPanel44.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnOutputSalesReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnOutputSalesReload.setText("Reload");

        jLabelOutputSales.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelOutputSales.setText("jLabelOutputSales");

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnOutputSalesReload, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelOutputSales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOutputSalesReload)
                    .addComponent(jLabelOutputSales))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel45.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableOutputSales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane11.setViewportView(tableOutputSales);

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Sales", jPanel10);

        jPanel46.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnOutputStockReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnOutputStockReload.setText("Reload");

        jLabelOutputStock.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelOutputStock.setText("jLabelOutputStock");

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnOutputStockReload, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelOutputStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOutputStockReload)
                    .addComponent(jLabelOutputStock))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel47.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableOutputStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane12.setViewportView(tableOutputStock);

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Stock", jPanel11);

        jPanel48.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnOutputClientReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnOutputClientReload.setText("Reload");

        jLabelOutputClient.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelOutputClient.setText("jLabelOutputClient");

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnOutputClientReload, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelOutputClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelOutputClient)
                    .addComponent(btnOutputClientReload))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel49.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableOutputClient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane13.setViewportView(tableOutputClient);

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel49Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Client", jPanel12);

        jPanel50.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnOutputSalesOrderReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dimas/bridging/images/sync_16x16.png"))); // NOI18N
        btnOutputSalesOrderReload.setText("Reload");

        jLabelOutputSalesOrder.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelOutputSalesOrder.setText("jLabelOutputSalesOrder");

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnOutputSalesOrderReload, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelOutputSalesOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOutputSalesOrderReload)
                    .addComponent(jLabelOutputSalesOrder))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel51.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableOutputSalesOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane14.setViewportView(tableOutputSalesOrder);

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel51Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Sales Order", jPanel13);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Output BAYGON", jPanel9);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1007, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        jLayeredPane1.add(jPanel1);
        jPanel1.setBounds(10, 10, 1020, 620);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1036, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPathInputMasterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPathInputMasterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPathInputMasterActionPerformed

    private void btnRetrieveInputJTpruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrieveInputJTpruActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRetrieveInputJTpruActionPerformed

    private void btnRetrieveInputMasterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrieveInputMasterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRetrieveInputMasterActionPerformed

    private void btnRetrieveInputAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrieveInputAllActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRetrieveInputAllActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
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
            public void run() {
                new BridgingUI().setVisible(true);
            }
        });
    }

    
    
    public JButton getBtnPathInputAuto() {
        return btnPathInputAuto;
    }

    public void setBtnPathInputAuto(JButton btnPathInputAuto) {
        this.btnPathInputAuto = btnPathInputAuto;
    }

    public JButton getBtnExtractClient() {
        return btnExtractClient;
    }

    public void setBtnExtractClient(JButton btnExtractClient) {
        this.btnExtractClient = btnExtractClient;
    }

    public JButton getBtnExtractSales() {
        return btnExtractSales;
    }

    public void setBtnExtractSales(JButton btnExtractSales) {
        this.btnExtractSales = btnExtractSales;
    }

    public JButton getBtnExtractSo() {
        return btnExtractSo;
    }

    public void setBtnExtractSo(JButton btnExtractSo) {
        this.btnExtractSo = btnExtractSo;
    }

    public JButton getBtnExtractStock() {
        return btnExtractStock;
    }

    public void setBtnExtractStock(JButton btnExtractStock) {
        this.btnExtractStock = btnExtractStock;
    }

    public JButton getBtnGeneralSettingReload() {
        return btnGeneralSettingReload;
    }

    public void setBtnGeneralSettingReload(JButton btnGeneralSettingReload) {
        this.btnGeneralSettingReload = btnGeneralSettingReload;
    }

    public JButton getBtnGeneralSettingSimpan() {
        return btnGeneralSettingSimpan;
    }

    public void setBtnGeneralSettingSimpan(JButton btnGeneralSettingSimpan) {
        this.btnGeneralSettingSimpan = btnGeneralSettingSimpan;
    }

    public JButton getBtnInputCvOutletReload() {
        return btnInputCvOutletReload;
    }

    public void setBtnInputCvOutletReload(JButton btnInputCvOutletReload) {
        this.btnInputCvOutletReload = btnInputCvOutletReload;
    }

    public JButton getBtnInputJheaderReload() {
        return btnInputJheaderReload;
    }

    public void setBtnInputJheaderReload(JButton btnInputJheaderReload) {
        this.btnInputJheaderReload = btnInputJheaderReload;
    }

    public JButton getBtnInputJpcodeReload() {
        return btnInputJpcodeReload;
    }

    public void setBtnInputJpcodeReload(JButton btnInputJpcodeReload) {
        this.btnInputJpcodeReload = btnInputJpcodeReload;
    }

    public JButton getBtnInputJtprbReload() {
        return btnInputJtprbReload;
    }

    public void setBtnInputJtprbReload(JButton btnInputJtprbReload) {
        this.btnInputJtprbReload = btnInputJtprbReload;
    }

    public JButton getBtnInputJtpruReload() {
        return btnInputJtpruReload;
    }

    public void setBtnInputJtpruReload(JButton btnInputJtpruReload) {
        this.btnInputJtpruReload = btnInputJtpruReload;
    }

    public JButton getBtnInputMasterReload() {
        return btnInputMasterReload;
    }

    public void setBtnInputMasterReload(JButton btnInputMasterReload) {
        this.btnInputMasterReload = btnInputMasterReload;
    }

    public JButton getBtnInputOutletReload() {
        return btnInputOutletReload;
    }

    public void setBtnInputOutletReload(JButton btnInputOutletReload) {
        this.btnInputOutletReload = btnInputOutletReload;
    }

    public JButton getBtnInputSalesmanReload() {
        return btnInputSalesmanReload;
    }

    public void setBtnInputSalesmanReload(JButton btnInputSalesmanReload) {
        this.btnInputSalesmanReload = btnInputSalesmanReload;
    }

    public JButton getBtnInputStockReload() {
        return btnInputStockReload;
    }

    public void setBtnInputStockReload(JButton btnInputStockReload) {
        this.btnInputStockReload = btnInputStockReload;
    }

    public JButton getBtnMapTipeOutletHapus() {
        return btnMapTipeOutletHapus;
    }

    public void setBtnMapTipeOutletHapus(JButton btnMapTipeOutletHapus) {
        this.btnMapTipeOutletHapus = btnMapTipeOutletHapus;
    }

    public JButton getBtnMapTipeOutletSimpan() {
        return btnMapTipeOutletSimpan;
    }

    public void setBtnMapTipeOutletSimpan(JButton btnMapTipeOutletSimpan) {
        this.btnMapTipeOutletSimpan = btnMapTipeOutletSimpan;
    }

    public JButton getBtnMapTipeOutletReload() {
        return btnMapTipeOutletReload;
    }

    public void setBtnMapTipeOutletReload(JButton btnMapTipeOutletReload) {
        this.btnMapTipeOutletReload = btnMapTipeOutletReload;
    }

    
    public JButton getBtnOutputClientReload() {
        return btnOutputClientReload;
    }

    public void setBtnOutputClientReload(JButton btnOutputClientReload) {
        this.btnOutputClientReload = btnOutputClientReload;
    }

    public JButton getBtnOutputSalesOrderReload() {
        return btnOutputSalesOrderReload;
    }

    public void setBtnOutputSalesOrderReload(JButton btnOutputSalesOrderReload) {
        this.btnOutputSalesOrderReload = btnOutputSalesOrderReload;
    }

    public JButton getBtnOutputSalesReload() {
        return btnOutputSalesReload;
    }

    public void setBtnOutputSalesReload(JButton btnOutputSalesReload) {
        this.btnOutputSalesReload = btnOutputSalesReload;
    }

    public JButton getBtnOutputStockReload() {
        return btnOutputStockReload;
    }

    public void setBtnOutputStockReload(JButton btnOutputStockReload) {
        this.btnOutputStockReload = btnOutputStockReload;
    }

    public JButton getBtnPathInputCvOutlet() {
        return btnPathInputCvOutlet;
    }

    public void setBtnPathInputCvOutlet(JButton btnPathInputCvOutlet) {
        this.btnPathInputCvOutlet = btnPathInputCvOutlet;
    }

    public JButton getBtnPathInputJHeader() {
        return btnPathInputJHeader;
    }

    public void setBtnPathInputJHeader(JButton btnPathInputJHeader) {
        this.btnPathInputJHeader = btnPathInputJHeader;
    }

    public JButton getBtnPathInputJPcode() {
        return btnPathInputJPcode;
    }

    public void setBtnPathInputJPcode(JButton btnPathInputJPcode) {
        this.btnPathInputJPcode = btnPathInputJPcode;
    }

    public JButton getBtnPathInputJTprb() {
        return btnPathInputJTprb;
    }

    public void setBtnPathInputJTprb(JButton btnPathInputJTprb) {
        this.btnPathInputJTprb = btnPathInputJTprb;
    }

    public JButton getBtnPathInputJTpru() {
        return btnPathInputJTpru;
    }

    public void setBtnPathInputJTpru(JButton btnPathInputJTpru) {
        this.btnPathInputJTpru = btnPathInputJTpru;
    }

    public JButton getBtnPathInputMaster() {
        return btnPathInputMaster;
    }

    public void setBtnPathInputMaster(JButton btnPathInputMaster) {
        this.btnPathInputMaster = btnPathInputMaster;
    }

    public JButton getBtnPathInputOutlet() {
        return btnPathInputOutlet;
    }

    public void setBtnPathInputOutlet(JButton btnPathInputOutlet) {
        this.btnPathInputOutlet = btnPathInputOutlet;
    }

    public JButton getBtnPathInputSalesman() {
        return btnPathInputSalesman;
    }

    public void setBtnPathInputSalesman(JButton btnPathInputSalesman) {
        this.btnPathInputSalesman = btnPathInputSalesman;
    }

    public JButton getBtnPathInputStock() {
        return btnPathInputStock;
    }

    public void setBtnPathInputStock(JButton btnPathInputStock) {
        this.btnPathInputStock = btnPathInputStock;
    }

    public JButton getBtnPathOutput() {
        return btnPathOutput;
    }

    public void setBtnPathOutput(JButton btnPathOutput) {
        this.btnPathOutput = btnPathOutput;
    }

    public JButton getBtnRetrieveInputCvOutlet() {
        return btnRetrieveInputCvOutlet;
    }

    public void setBtnRetrieveInputCvOutlet(JButton btnRetrieveInputCvOutlet) {
        this.btnRetrieveInputCvOutlet = btnRetrieveInputCvOutlet;
    }

    public JButton getBtnRetrieveInputJHeader() {
        return btnRetrieveInputJHeader;
    }

    public void setBtnRetrieveInputJHeader(JButton btnRetrieveInputJHeader) {
        this.btnRetrieveInputJHeader = btnRetrieveInputJHeader;
    }

    public JButton getBtnRetrieveInputJPcode() {
        return btnRetrieveInputJPcode;
    }

    public void setBtnRetrieveInputJPcode(JButton btnRetrieveInputJPcode) {
        this.btnRetrieveInputJPcode = btnRetrieveInputJPcode;
    }

    public JButton getBtnRetrieveInputJTprb() {
        return btnRetrieveInputJTprb;
    }

    public void setBtnRetrieveInputJTprb(JButton btnRetrieveInputJTprb) {
        this.btnRetrieveInputJTprb = btnRetrieveInputJTprb;
    }

    public JButton getBtnRetrieveInputJTpru() {
        return btnRetrieveInputJTpru;
    }

    public void setBtnRetrieveInputJTpru(JButton btnRetrieveInputJTpru) {
        this.btnRetrieveInputJTpru = btnRetrieveInputJTpru;
    }

    public JButton getBtnRetrieveInputMaster() {
        return btnRetrieveInputMaster;
    }

    public void setBtnRetrieveInputMaster(JButton btnRetrieveInputMaster) {
        this.btnRetrieveInputMaster = btnRetrieveInputMaster;
    }

    public JButton getBtnRetrieveInputSalesman() {
        return btnRetrieveInputSalesman;
    }

    public void setBtnRetrieveInputSalesman(JButton btnRetrieveInputSalesman) {
        this.btnRetrieveInputSalesman = btnRetrieveInputSalesman;
    }

    public JButton getBtnRetrieveInputStock() {
        return btnRetrieveInputStock;
    }

    public void setBtnRetrieveInputStock(JButton btnRetrieveInputStock) {
        this.btnRetrieveInputStock = btnRetrieveInputStock;
    }

    public JButton getBtnRetrieveInputOutlet() {
        return btnRetrieveInputOutlet;
    }

    public void setBtnRetrieveInputOutlet(JButton btnRetrieveInputOutlet) {
        this.btnRetrieveInputOutlet = btnRetrieveInputOutlet;
    }

    public JButton getBtnPathInputClearAll() {
        return btnPathInputClearAll;
    }

    public void setBtnPathInputClearAll(JButton btnPathInputClearAll) {
        this.btnPathInputClearAll = btnPathInputClearAll;
    }

    public JButton getBtnPathInputReloadAll() {
        return btnPathInputReloadAll;
    }

    public void setBtnPathInputReloadAll(JButton btnPathInputReloadAll) {
        this.btnPathInputReloadAll = btnPathInputReloadAll;
    }

    public JButton getBtnRetrieveInputAll() {
        return btnRetrieveInputAll;
    }

    public void setBtnRetrieveInputAll(JButton btnRetrieveInputAll) {
        this.btnRetrieveInputAll = btnRetrieveInputAll;
    }

    
    
    public JTable getTableInputCvOutlet() {
        return tableInputCvOutlet;
    }

    public void setTableInputCvOutlet(JTable tableInputCvOutlet) {
        this.tableInputCvOutlet = tableInputCvOutlet;
    }

    public JTable getTableInputJheader() {
        return tableInputJheader;
    }

    public void setTableInputJheader(JTable tableInputJheader) {
        this.tableInputJheader = tableInputJheader;
    }

    public JTable getTableInputJpcode() {
        return tableInputJpcode;
    }

    public void setTableInputJpcode(JTable tableInputJpcode) {
        this.tableInputJpcode = tableInputJpcode;
    }

    public JTable getTableInputJtprb() {
        return tableInputJtprb;
    }

    public void setTableInputJtprb(JTable tableInputJtprb) {
        this.tableInputJtprb = tableInputJtprb;
    }

    public JTable getTableInputJtpru() {
        return tableInputJtpru;
    }

    public void setTableInputJtpru(JTable tableInputJtpru) {
        this.tableInputJtpru = tableInputJtpru;
    }

    public JTable getTableInputMaster() {
        return tableInputMaster;
    }

    public void setTableInputMaster(JTable tableInputMaster) {
        this.tableInputMaster = tableInputMaster;
    }

    public JTable getTableInputOutlet() {
        return tableInputOutlet;
    }

    public void setTableInputOutlet(JTable tableInputOutlet) {
        this.tableInputOutlet = tableInputOutlet;
    }

    public JTable getTableInputSalesman() {
        return tableInputSalesman;
    }

    public void setTableInputSalesman(JTable tableInputSalesman) {
        this.tableInputSalesman = tableInputSalesman;
    }

    public JTable getTableInputStock() {
        return tableInputStock;
    }

    public void setTableInputStock(JTable tableInputStock) {
        this.tableInputStock = tableInputStock;
    }

    public JTable getTableMappingTipeOutlet() {
        return tableMappingTipeOutlet;
    }

    public void setTableMappingTipeOutlet(JTable tableMappingTipeOutlet) {
        this.tableMappingTipeOutlet = tableMappingTipeOutlet;
    }

    public JTable getTableOutputClient() {
        return tableOutputClient;
    }

    public void setTableOutputClient(JTable tableOutputClient) {
        this.tableOutputClient = tableOutputClient;
    }

    public JTable getTableOutputSales() {
        return tableOutputSales;
    }

    public void setTableOutputSales(JTable tableOutputSales) {
        this.tableOutputSales = tableOutputSales;
    }

    public JTable getTableOutputSalesOrder() {
        return tableOutputSalesOrder;
    }

    public void setTableOutputSalesOrder(JTable tableOutputSalesOrder) {
        this.tableOutputSalesOrder = tableOutputSalesOrder;
    }

    public JTable getTableOutputStock() {
        return tableOutputStock;
    }

    public void setTableOutputStock(JTable tableOutputStock) {
        this.tableOutputStock = tableOutputStock;
    }

    public JTextField getTextDistributorCode() {
        return textDistributorCode;
    }

    public void setTextDistributorCode(JTextField textDistributorCode) {
        this.textDistributorCode = textDistributorCode;
    }

    public JTextField getTextMapTipeOutletDeskripsi() {
        return textMapTipeOutletDeskripsi;
    }

    public void setTextMapTipeOutletDeskripsi(JTextField textMapTipeOutletDeskripsi) {
        this.textMapTipeOutletDeskripsi = textMapTipeOutletDeskripsi;
    }

    public JTextField getTextMapTipeOutletIdTipeOutlet() {
        return textMapTipeOutletIdTipeOutlet;
    }

    public void setTextMapTipeOutletIdTipeOutlet(JTextField textMapTipeOutletIdTipeOutlet) {
        this.textMapTipeOutletIdTipeOutlet = textMapTipeOutletIdTipeOutlet;
    }

    public JTextField getTextMapTipeOutletIdTypeOutletScy() {
        return textMapTipeOutletIdTypeOutletScy;
    }

    public void setTextMapTipeOutletIdTypeOutletScy(JTextField textMapTipeOutletIdTypeOutletScy) {
        this.textMapTipeOutletIdTypeOutletScy = textMapTipeOutletIdTypeOutletScy;
    }

    public JTextField getTextPathInputCvOutlet() {
        return textPathInputCvOutlet;
    }

    public void setTextPathInputCvOutlet(JTextField textPathInputCvOutlet) {
        this.textPathInputCvOutlet = textPathInputCvOutlet;
    }

    public JTextField getTextPathInputJHeader() {
        return textPathInputJHeader;
    }

    public void setTextPathInputJHeader(JTextField textPathInputJHeader) {
        this.textPathInputJHeader = textPathInputJHeader;
    }

    public JTextField getTextPathInputJPcode() {
        return textPathInputJPcode;
    }

    public void setTextPathInputJPcode(JTextField textPathInputJPcode) {
        this.textPathInputJPcode = textPathInputJPcode;
    }

    public JTextField getTextPathInputJTprb() {
        return textPathInputJTprb;
    }

    public void setTextPathInputJTprb(JTextField textPathInputJTprb) {
        this.textPathInputJTprb = textPathInputJTprb;
    }

    public JTextField getTextPathInputJTpru() {
        return textPathInputJTpru;
    }

    public void setTextPathInputJTpru(JTextField textPathInputJTpru) {
        this.textPathInputJTpru = textPathInputJTpru;
    }

    public JTextField getTextPathInputMaster() {
        return textPathInputMaster;
    }

    public void setTextPathInputMaster(JTextField textPathInputMaster) {
        this.textPathInputMaster = textPathInputMaster;
    }

    public JTextField getTextPathInputOutlet() {
        return textPathInputOutlet;
    }

    public void setTextPathInputOutlet(JTextField textPathInputOutlet) {
        this.textPathInputOutlet = textPathInputOutlet;
    }

    public JTextField getTextPathInputSalesman() {
        return textPathInputSalesman;
    }

    public void setTextPathInputSalesman(JTextField textPathInputSalesman) {
        this.textPathInputSalesman = textPathInputSalesman;
    }

    public JTextField getTextPathInputStock() {
        return textPathInputStock;
    }

    public void setTextPathInputStock(JTextField textPathInputStock) {
        this.textPathInputStock = textPathInputStock;
    }

    public JTextField getTextPathOutput() {
        return textPathOutput;
    }

    public void setTextPathOutput(JTextField textPathOutput) {
        this.textPathOutput = textPathOutput;
    }

    public JTextField getTextRecordTypeClient() {
        return textRecordTypeClient;
    }

    public void setTextRecordTypeClient(JTextField textRecordTypeClient) {
        this.textRecordTypeClient = textRecordTypeClient;
    }

    public JTextField getTextRecordTypeSales() {
        return textRecordTypeSales;
    }

    public void setTextRecordTypeSales(JTextField textRecordTypeSales) {
        this.textRecordTypeSales = textRecordTypeSales;
    }

    public JTextField getTextRecordTypeSo() {
        return textRecordTypeSo;
    }

    public void setTextRecordTypeSo(JTextField textRecordTypeSo) {
        this.textRecordTypeSo = textRecordTypeSo;
    }

    public JTextField getTextRecordTypeStock() {
        return textRecordTypeStock;
    }

    public void setTextRecordTypeStock(JTextField textRecordTypeStock) {
        this.textRecordTypeStock = textRecordTypeStock;
    }

    public JTextField getTextWarehouseWarehouseCode() {
        return textWarehouseWarehouseCode;
    }

    public void setTextWarehouseWarehouseCode(JTextField textWarehouseWarehouseCode) {
        this.textWarehouseWarehouseCode = textWarehouseWarehouseCode;
    }

    public JTextField getTextWarehouseWarehouseDescription() {
        return textWarehouseWarehouseDescription;
    }

    public void setTextWarehouseWarehouseDescription(JTextField textWarehouseWarehouseDescription) {
        this.textWarehouseWarehouseDescription = textWarehouseWarehouseDescription;
    }

    public JButton getBtnExtractAll() {
        return btnExtractAll;
    }

    public void setBtnExtractAll(JButton btnExtractAll) {
        this.btnExtractAll = btnExtractAll;
    }

    public JDateChooser getjDateChooserExtract1() {
        return jDateChooserExtract1;
    }

    public JDateChooser getjDateChooserExtract2() {
        return jDateChooserExtract2;
    }

    public void setjDateChooserExtract(JDateChooser jDateChooserExtract) {
        this.jDateChooserExtract1 = jDateChooserExtract;
    }

    public JTextField getTextEmailFrom() {
        return textEmailFrom;
    }

    public void setTextEmailFrom(JTextField textEmailFrom) {
        this.textEmailFrom = textEmailFrom;
    }

    public JTextField getTextEmailSubject() {
        return textEmailSubject;
    }

    public void setTextEmailSubject(JTextField textEmailSubject) {
        this.textEmailSubject = textEmailSubject;
    }

    public JTextField getTextEmailTo() {
        return textEmailTo;
    }

    public void setTextEmailTo(JTextField textEmailTo) {
        this.textEmailTo = textEmailTo;
    }

    public JCheckBox getCheckModeDatabase() {
        return checkModeDatabase;
    }

    public void setCheckModeDatabase(JCheckBox checkModeDatabase) {
        this.checkModeDatabase = checkModeDatabase;
    }

    public JCheckBox getCheckTprbDiluarBarang() {
        return checkTprbDiluarBarang;
    }

    public void setCheckTprbDiluarBarang(JCheckBox checkTprbDiluarBarang) {
        this.checkTprbDiluarBarang = checkTprbDiluarBarang;
    }

    public JDateChooser getjDateChooseTanggalStock() {
        return jDateChooseTanggalStock;
    }

    public void setjDateChooseTanggalStock(JDateChooser jDateChooseTanggalStock) {
        this.jDateChooseTanggalStock = jDateChooseTanggalStock;
    }

    public JTabbedPane getjTabbedPane1() {
        return jTabbedPane1;
    }

    public void setjTabbedPane1(JTabbedPane jTabbedPane1) {
        this.jTabbedPane1 = jTabbedPane1;
    }

    public JTabbedPane getjTabbedPane2() {
        return jTabbedPane2;
    }

    public void setjTabbedPane2(JTabbedPane jTabbedPane2) {
        this.jTabbedPane2 = jTabbedPane2;
    }

    public JTabbedPane getjTabbedPane3() {
        return jTabbedPane3;
    }

    public void setjTabbedPane3(JTabbedPane jTabbedPane3) {
        this.jTabbedPane3 = jTabbedPane3;
    }

    public JTabbedPane getjTabbedPane4() {
        return jTabbedPane4;
    }

    public void setjTabbedPane4(JTabbedPane jTabbedPane4) {
        this.jTabbedPane4 = jTabbedPane4;
    }

    public JLabel getLabelProcess1() {
        return labelProcess1;
    }

    public void setLabelProcess1(JLabel labelProcess1) {
        this.labelProcess1 = labelProcess1;
    }

    public JPasswordField getTextEmailPassword() {
        return textEmailPassword;
    }

    public void setTextEmailPassword(JPasswordField textEmailPassword) {
        this.textEmailPassword = textEmailPassword;
    }

    public JButton getBtnKirimByEmail() {
        return btnKirimByEmail;
    }

    public void setBtnKirimByEmail(JButton btnKirimByEmail) {
        this.btnKirimByEmail = btnKirimByEmail;
    }

    public JLabel getjLabelOutputClient() {
        return jLabelOutputClient;
    }

    public JLabel getjLabelOutputSales() {
        return jLabelOutputSales;
    }

    public JLabel getjLabelOutputSalesOrder() {
        return jLabelOutputSalesOrder;
    }

    public JLabel getjLabelOutputStock() {
        return jLabelOutputStock;
    }

    public JLabel getjLabelInputScyllaCvOutlet() {
        return jLabelInputScyllaCvOutlet;
    }

    public JLabel getjLabelInputScyllaJHeader() {
        return jLabelInputScyllaJHeader;
    }

    public JLabel getjLabelInputScyllaJPCode() {
        return jLabelInputScyllaJPCode;
    }

    public JLabel getjLabelInputScyllaJTprb() {
        return jLabelInputScyllaJTprb;
    }

    public JLabel getjLabelInputScyllaJTpru() {
        return jLabelInputScyllaJTpru;
    }

    public JLabel getjLabelInputScyllaMasterProduk() {
        return jLabelInputScyllaMasterProduk;
    }

    public JLabel getjLabelInputScyllaOutlet() {
        return jLabelInputScyllaOutlet;
    }

    public JLabel getjLabelInputScyllaSalesman() {
        return jLabelInputScyllaSalesman;
    }

    public JLabel getjLabelInputScyllaStock() {
        return jLabelInputScyllaStock;
    }

 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExtractAll;
    private javax.swing.JButton btnExtractClient;
    private javax.swing.JButton btnExtractSales;
    private javax.swing.JButton btnExtractSo;
    private javax.swing.JButton btnExtractStock;
    private javax.swing.JButton btnGeneralSettingReload;
    private javax.swing.JButton btnGeneralSettingSimpan;
    private javax.swing.JButton btnInputCvOutletReload;
    private javax.swing.JButton btnInputJheaderReload;
    private javax.swing.JButton btnInputJpcodeReload;
    private javax.swing.JButton btnInputJtprbReload;
    private javax.swing.JButton btnInputJtpruReload;
    private javax.swing.JButton btnInputMasterReload;
    private javax.swing.JButton btnInputOutletReload;
    private javax.swing.JButton btnInputSalesmanReload;
    private javax.swing.JButton btnInputStockReload;
    private javax.swing.JButton btnKirimByEmail;
    private javax.swing.JButton btnMapTipeOutletHapus;
    private javax.swing.JButton btnMapTipeOutletReload;
    private javax.swing.JButton btnMapTipeOutletSimpan;
    private javax.swing.JButton btnOutputClientReload;
    private javax.swing.JButton btnOutputSalesOrderReload;
    private javax.swing.JButton btnOutputSalesReload;
    private javax.swing.JButton btnOutputStockReload;
    private javax.swing.JButton btnPathInputAuto;
    private javax.swing.JButton btnPathInputClearAll;
    private javax.swing.JButton btnPathInputCvOutlet;
    private javax.swing.JButton btnPathInputJHeader;
    private javax.swing.JButton btnPathInputJPcode;
    private javax.swing.JButton btnPathInputJTprb;
    private javax.swing.JButton btnPathInputJTpru;
    private javax.swing.JButton btnPathInputMaster;
    private javax.swing.JButton btnPathInputOutlet;
    private javax.swing.JButton btnPathInputReloadAll;
    private javax.swing.JButton btnPathInputSalesman;
    private javax.swing.JButton btnPathInputStock;
    private javax.swing.JButton btnPathOutput;
    private javax.swing.JButton btnRetrieveInputAll;
    private javax.swing.JButton btnRetrieveInputCvOutlet;
    private javax.swing.JButton btnRetrieveInputJHeader;
    private javax.swing.JButton btnRetrieveInputJPcode;
    private javax.swing.JButton btnRetrieveInputJTprb;
    private javax.swing.JButton btnRetrieveInputJTpru;
    public javax.swing.JButton btnRetrieveInputMaster;
    private javax.swing.JButton btnRetrieveInputOutlet;
    private javax.swing.JButton btnRetrieveInputSalesman;
    private javax.swing.JButton btnRetrieveInputStock;
    private javax.swing.JCheckBox checkModeDatabase;
    private javax.swing.JCheckBox checkTprbDiluarBarang;
    private com.toedter.calendar.JDateChooser jDateChooseTanggalStock;
    private com.toedter.calendar.JDateChooser jDateChooserExtract1;
    private com.toedter.calendar.JDateChooser jDateChooserExtract2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelInputScyllaCvOutlet;
    private javax.swing.JLabel jLabelInputScyllaJHeader;
    private javax.swing.JLabel jLabelInputScyllaJPCode;
    private javax.swing.JLabel jLabelInputScyllaJTprb;
    private javax.swing.JLabel jLabelInputScyllaJTpru;
    private javax.swing.JLabel jLabelInputScyllaMasterProduk;
    private javax.swing.JLabel jLabelInputScyllaOutlet;
    private javax.swing.JLabel jLabelInputScyllaSalesman;
    private javax.swing.JLabel jLabelInputScyllaStock;
    private javax.swing.JLabel jLabelOutputClient;
    private javax.swing.JLabel jLabelOutputSales;
    private javax.swing.JLabel jLabelOutputSalesOrder;
    private javax.swing.JLabel jLabelOutputStock;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JLabel labelProcess1;
    private javax.swing.JTable tableInputCvOutlet;
    private javax.swing.JTable tableInputJheader;
    private javax.swing.JTable tableInputJpcode;
    private javax.swing.JTable tableInputJtprb;
    private javax.swing.JTable tableInputJtpru;
    private javax.swing.JTable tableInputMaster;
    private javax.swing.JTable tableInputOutlet;
    private javax.swing.JTable tableInputSalesman;
    private javax.swing.JTable tableInputStock;
    private javax.swing.JTable tableMappingTipeOutlet;
    private javax.swing.JTable tableOutputClient;
    private javax.swing.JTable tableOutputSales;
    private javax.swing.JTable tableOutputSalesOrder;
    private javax.swing.JTable tableOutputStock;
    private javax.swing.JTextField textDistributorCode;
    private javax.swing.JTextField textEmailFrom;
    private javax.swing.JPasswordField textEmailPassword;
    private javax.swing.JTextField textEmailSubject;
    private javax.swing.JTextField textEmailTo;
    private javax.swing.JTextField textMapTipeOutletDeskripsi;
    private javax.swing.JTextField textMapTipeOutletIdTipeOutlet;
    private javax.swing.JTextField textMapTipeOutletIdTypeOutletScy;
    private javax.swing.JTextField textPathInputCvOutlet;
    private javax.swing.JTextField textPathInputJHeader;
    private javax.swing.JTextField textPathInputJPcode;
    private javax.swing.JTextField textPathInputJTprb;
    private javax.swing.JTextField textPathInputJTpru;
    private javax.swing.JTextField textPathInputMaster;
    private javax.swing.JTextField textPathInputOutlet;
    private javax.swing.JTextField textPathInputSalesman;
    private javax.swing.JTextField textPathInputStock;
    private javax.swing.JTextField textPathOutput;
    private javax.swing.JTextField textRecordTypeClient;
    private javax.swing.JTextField textRecordTypeSales;
    private javax.swing.JTextField textRecordTypeSo;
    private javax.swing.JTextField textRecordTypeStock;
    private javax.swing.JTextField textWarehouseWarehouseCode;
    private javax.swing.JTextField textWarehouseWarehouseDescription;
    // End of variables declaration//GEN-END:variables




}
