/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dimas.bridging;

import org.dimas.bridging.utils.KonfigurasiUtils;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileFilter;
import org.bagus.common.filefilter.ExtensionFileFilter;
import org.config.spring.hibernate.dao.CvOutletDaoInter;
import org.config.spring.hibernate.dao.JHeaderDaoInter;
import org.config.spring.hibernate.dao.JPcodeDaoInter;
import org.config.spring.hibernate.dao.JTprbDaoInter;
import org.config.spring.hibernate.dao.JTpruDaoInter;
import org.config.spring.hibernate.dao.MapTipeOutletDaoInter;
import org.config.spring.hibernate.dao.OutletDaoInter;
import org.config.spring.hibernate.dao.ProdukDaoInter;
import org.config.spring.hibernate.dao.SalesmanDaoInter;
import org.config.spring.hibernate.dao.StockDaoInter;
import org.config.spring.hibernate.dao.SysvarDaoInter;
import org.config.spring.hibernate.dao.TblClientIdDaoInter;
import org.config.spring.hibernate.dao.TblSalesIdDaoInter;
import org.config.spring.hibernate.dao.TblSoIdDaoInter;
import org.config.spring.hibernate.dao.TblStockIdDaoInter;
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
import org.config.spring.hibernate.model.Sysvar;
import org.config.spring.hibernate.model.TblClientId;
import org.config.spring.hibernate.model.TblSalesId;
import org.config.spring.hibernate.model.TblSoId;
import org.config.spring.hibernate.model.TblStockId;
import org.config.spring.hibernate.model.tablemodel.DynamicTableModel;
import org.config.spring.provider.ApplicationContextProvider;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author yhawin
 */
public class BridgingDefault  extends BridgingUI implements ActionListener {
    ApplicationContext appContext = ApplicationContextProvider.getInstance().getApplicationContext();
    ApplicationContext appContextMem = ApplicationContextProvider.getInstance().getApplicationContextMem();
    
    Boolean databaseMode = false;
    
    SysvarDaoInter sysvarDao = (SysvarDaoInter) appContext.getBean("SysvarDaoBean");
    
    ProdukDaoInter produkDao =  (ProdukDaoInter) appContext.getBean("ProdukDaoBean");
    StockDaoInter stockDao = (StockDaoInter) appContext.getBean("StockDaoBean");
    OutletDaoInter outletDao = (OutletDaoInter) appContext.getBean("OutletDaoBean");
    CvOutletDaoInter cvOutletDao = (CvOutletDaoInter) appContext.getBean("CvOutletDaoBean");
    SalesmanDaoInter salesmanDao = (SalesmanDaoInter) appContext.getBean("SalesmanDaoBean");
    JHeaderDaoInter  jheaderDao = (JHeaderDaoInter) appContext.getBean("JHeaderDaoBean");
    JPcodeDaoInter jpcodeDao = (JPcodeDaoInter) appContext.getBean("JPcodeDaoBean");
    JTprbDaoInter jtprbDao = (JTprbDaoInter) appContext.getBean("JTprbDaoBean");
    JTpruDaoInter jtpruDao = (JTpruDaoInter) appContext.getBean("JTpruDaoBean");
    MapTipeOutletDaoInter mapTipeOutletDao = (MapTipeOutletDaoInter) appContext.getBean("MapTipeOutletDaoBean");
    
    TblSalesIdDaoInter tblSalesIdDao = (TblSalesIdDaoInter) appContext.getBean("TblSalesIdDaoBean");
    TblStockIdDaoInter tblStockIdDao = (TblStockIdDaoInter) appContext.getBean("TblStockIdDaoBean");
    TblClientIdDaoInter tblClientIdDao = (TblClientIdDaoInter) appContext.getBean("TblClientIdDaoBean");
    TblSoIdDaoInter tblSoIdDao = (TblSoIdDaoInter) appContext.getBean("TblSoIdDaoBean");

    ProdukDaoInter produkDaoMem =  (ProdukDaoInter) appContextMem.getBean("ProdukDaoBean");
    StockDaoInter stockDaoMem = (StockDaoInter) appContextMem.getBean("StockDaoBean");
    OutletDaoInter outletDaoMem = (OutletDaoInter) appContextMem.getBean("OutletDaoBean");
    CvOutletDaoInter cvOutletDaoMem = (CvOutletDaoInter) appContextMem.getBean("CvOutletDaoBean");
    SalesmanDaoInter salesmanDaoMem = (SalesmanDaoInter) appContextMem.getBean("SalesmanDaoBean");
    
    JHeaderDaoInter  jheaderDaoMem = (JHeaderDaoInter) appContextMem.getBean("JHeaderDaoBean");
    JPcodeDaoInter jpcodeDaoMem = (JPcodeDaoInter) appContextMem.getBean("JPcodeDaoBean");
    JTprbDaoInter jtprbDaoMem = (JTprbDaoInter) appContextMem.getBean("JTprbDaoBean");
    JTpruDaoInter jtpruDaoMem = (JTpruDaoInter) appContextMem.getBean("JTpruDaoBean");
    MapTipeOutletDaoInter mapTipeOutletDaoMem = (MapTipeOutletDaoInter) appContextMem.getBean("MapTipeOutletDaoBean");
    
    TblSalesIdDaoInter tblSalesIdDaoMem = (TblSalesIdDaoInter) appContextMem.getBean("TblSalesIdDaoBean");
    TblStockIdDaoInter tblStockIdDaoMem = (TblStockIdDaoInter) appContextMem.getBean("TblStockIdDaoBean");
    TblClientIdDaoInter tblClientIdDaoMem = (TblClientIdDaoInter) appContextMem.getBean("TblClientIdDaoBean");
    TblSoIdDaoInter tblSoIdDaoMem = (TblSoIdDaoInter) appContextMem.getBean("TblSoIdDaoBean");
    
    DynamicTableModel<Produk> tmProduk = null;
    DynamicTableModel<Stock> tmStock = null;
    DynamicTableModel<Outlet> tmOutlet = null;
    DynamicTableModel<CvOutlet> tmCvOutlet = null;
    DynamicTableModel<Salesman> tmSalesman = null;
    DynamicTableModel<JHeader> tmJHeader = null;
    DynamicTableModel<JPcode> tmJPcode = null;
    DynamicTableModel<JTprb> tmJTprb = null;
    DynamicTableModel<JTpru> tmJTpru = null;
    DynamicTableModel<MapTipeOutlet> tmMaptipeOutlet = null;
    
    DynamicTableModel<TblSalesId> tmTblSalesId = null;
    DynamicTableModel<TblClientId> tmTblClientId = null;
    DynamicTableModel<TblStockId> tmTblStockId = null;
    DynamicTableModel<TblSoId> tmTblSoId = null;

    //Nanti diganti
    public String currentPath = "/home/yhawin/Dimas/Input-File/";
    
    public BridgingDefault() {
        this.setTitle("BridgingApp >> DIMAS MALANG >> BAYGON"); 
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        initFormDefa();
        initActionAdditionalDefa();
        initComponentAppearanceDefa();
        
        animationProsesHide();
    }
    
    public void animationProsesHide(){
        getLabelProcess1().setVisible(false);
    }
    public void animationProsesShow(){
        int frameHeight = this.getHeight();
        int frameWidth = this.getHeight();
        
        
        getLabelProcess1().setSize(frameWidth, frameHeight);
        getLabelProcess1().setLocation(200,0);
        //getLabelProcess1().setAlignmentX(CENTER_ALIGNMENT);
        //getLabelProcess1().setAlignmentY(CENTER_ALIGNMENT);
        getLabelProcess1().setVisible(true);
    }
    
    private void initFormDefa(){
        setScreenCenter();
        //1.Reset Teks
        resetTeksAll();
        //CheckBox untuk mode database atau memory
        getCheckModeDatabase().setSelected(true);
        databaseMode = true;
        
        //Form Konfigurasi
        KonfigurasiUtils defaultKonfigurasi = new KonfigurasiUtils();
        defaultKonfigurasi.setFirstKonfigurasiIfEmpty();        
        aksiBtnGeneralSettingReload();
        
        //Button JPcode, JTpru, dan JTprb di hidden karena Di handle oleh JHeader
        getBtnRetrieveInputJPcode().setVisible(false);
        getBtnRetrieveInputJTprb().setVisible(false);
        getBtnRetrieveInputJTpru().setVisible(false);
        
        //Jika Mapp masih kosong maka berbahaya --> harus dipaksa untuk input
        
        //MapTipeOutlet mto = new MapTipeOutlet();
        List<MapTipeOutlet> listMapTipeOutlet = mapTipeOutletDao.findAll();
        if (listMapTipeOutlet.size()==0) {
            JOptionPane.showMessageDialog(this, "Mapping Tipe Outlet Masih Kosong\n Setiap Tipe Scylla Harus di Mapping,"
                    + "\n\n Jika tidak maka......\n TIDAK ADA OUTLET YANG AKAN DI PROSES", "Warning..", JOptionPane.WARNING_MESSAGE);
            getjTabbedPane4().setSelectedIndex(1);
            getjTabbedPane1().setSelectedIndex(9);
            
        }
        //MODE UTAMA BUKAN DATABASE
        getCheckModeDatabase().setSelected(false);
        databaseMode=false;
        
    }
    
    private void initComponentAppearanceDefa(){
        //Isi semua JTable
        aksiBtnPathInputReloadAll();
        
        getTableInputCvOutlet().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableInputJheader().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableInputJpcode().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableInputJtprb().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableInputJtpru().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableInputMaster().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableInputOutlet().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableInputSalesman().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableInputStock().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        getTableOutputClient().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableOutputSales().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableOutputSalesOrder().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        getTableOutputStock().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
    }
     private void initActionAdditionalDefa(){
         getTableMappingTipeOutlet().getSelectionModel().addListSelectionListener(new ListSelectionListener() {

             @Override
             public void valueChanged(ListSelectionEvent e) {
                 aksiListMapTipeOutletSeleksi();
             }
         });
         
         getCheckModeDatabase().addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                if (getCheckModeDatabase().isSelected()) {
                    databaseMode=true;         
                } else {
                    databaseMode=false;
                } 
                aksiBtnPathInputReloadAll();
                
             }
         });
         getCheckTprbDiluarBarang().addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 Sysvar localSysvar = new Sysvar();
                localSysvar = sysvarDao.findById("_TPR_NOB");
                 
                if (localSysvar==null) {
                    localSysvar = new Sysvar();
                    localSysvar.setIdSysvar("_TPR_NOB");
                    localSysvar.setDeskripsi("TPR Barang yang tidak termasuk pada item nota akan di spread");
                    localSysvar.setTipeData("BOL1");
                    localSysvar.setNilaiBol1(false);
                    
                 }
                 if (getCheckTprbDiluarBarang().isSelected()) {
                    localSysvar.setNilaiBol1(true);
                 }else {
                     localSysvar.setNilaiBol1(false);
                 }
                  
                 sysvarDao.saveOrUpdate(localSysvar);
             }
         });
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
                new BridgingDefault().setVisible(true);
            }
        });
     
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
    
   @Override
   public void aksiBtnPathOutput() {
        JFileChooser fileChooser1 =  new JFileChooser(currentPath);
        fileChooser1.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileChooser1.setDialogTitle("Path Extract File");        
        
        if (fileChooser1.showOpenDialog(this) ==JFileChooser.APPROVE_OPTION){
            File filePath = fileChooser1.getSelectedFile();
            currentPath = filePath.toString();            
            if (filePath != null) {
                String strDirPath = filePath.getAbsolutePath() + File.separator;
                getTextPathOutput().setText(strDirPath);
            }
        }    
        
   }
   @Override
   public void aksiBtnExtractAll() {
   }          
    @Override
    public void aksiBtnExtractClient() {
     }
    @Override
    public void aksiBtnExtractSales() {
    }
    @Override
    public void aksiBtnExtractSo() {
    }
    @Override
     public void aksiBtnExtractStock() {
    }
    
    
    @Override
    public void aksiBtnGeneralSettingReload() {
        //Konfigurasi
        Sysvar sysvar;
        
        sysvar = sysvarDao.findById("_DIST_CODE");
        if (sysvar !=null) 
            getTextDistributorCode().setText(sysvar.getNilaiString1());
        
        sysvar = sysvarDao.findById("_REC_SLS");
        if (sysvar !=null) 
            getTextRecordTypeSales().setText(sysvar.getNilaiString1());
        sysvar = sysvarDao.findById("_REC_STK");
        if (sysvar !=null) 
            getTextRecordTypeStock().setText(sysvar.getNilaiString1());
        sysvar = sysvarDao.findById("_REC_CLN");
        if (sysvar !=null) 
            getTextRecordTypeClient().setText(sysvar.getNilaiString1());
        sysvar = sysvarDao.findById("_REC_SO");
        if (sysvar !=null) 
            getTextRecordTypeSo().setText(sysvar.getNilaiString1());
 
        sysvar = sysvarDao.findById("_WH_CODE");
        if (sysvar !=null) 
            getTextWarehouseWarehouseCode().setText(sysvar.getNilaiString1());
        sysvar = sysvarDao.findById("_WH_DESC");
        if (sysvar !=null) 
            getTextWarehouseWarehouseDescription().setText(sysvar.getNilaiString1());
        
        sysvar = sysvarDao.findById("_EM_FROM");
        if (sysvar !=null) 
            getTextEmailFrom().setText(sysvar.getNilaiString1());
        
        sysvar = sysvarDao.findById("_EM_PASS");
        if (sysvar !=null) 
            getTextEmailPassword().setText(sysvar.getNilaiString1());

        sysvar = sysvarDao.findById("_EM_TO");
        if (sysvar !=null) 
            getTextEmailTo().setText(sysvar.getNilaiString1());
        sysvar = sysvarDao.findById("_EM_SUB");
        if (sysvar !=null) 
            getTextEmailSubject().setText(sysvar.getNilaiString1());
        
        sysvar = sysvarDao.findById("_TPR_NoB");
        if (sysvar !=null) 
            getCheckTprbDiluarBarang().setSelected(sysvar.getNilaiBol1());
    }
    @Override
    public void aksiBtnGeneralSettingSimpan() {
        KonfigurasiUtils konfigUtils = new KonfigurasiUtils();
        String passEmail = new String(getTextEmailPassword().getPassword());
        
        konfigUtils.simpanKonfigurasi(getTextDistributorCode().getText(), getTextRecordTypeSales().getText(), 
                getTextRecordTypeStock().getText(), getTextRecordTypeClient().getText(), getTextRecordTypeSo().getText(), 
                getTextWarehouseWarehouseCode().getText(), getTextWarehouseWarehouseDescription().getText(), 
                getTextEmailFrom().getText(), getTextEmailTo().getText(), getTextEmailSubject().getText(), 
                passEmail);
    
    }

    @Override
    public void aksiBtnInputCvOutletReload() {
        //Reload Input hanya berlaku pada saat database mode
        List<CvOutlet> lst = new ArrayList<>();
        if (databaseMode==true) {
            lst = cvOutletDao.findAll();
        } else {
            lst = cvOutletDaoMem.findAll();        
        }
            tmCvOutlet = new DynamicTableModel<>(lst, CvOutlet.class);
            getTableInputCvOutlet().setModel(tmCvOutlet);
    }
    @Override
    public void aksiBtnInputJheaderReload() {
        //Reload Input hanya berlaku pada saat database mode
        List<JHeader> lst = new ArrayList<>();
        if (databaseMode ==true) {
            lst = jheaderDao.findAll();
        } else {
            lst = jheaderDaoMem.findAll();
        }
            tmJHeader = new DynamicTableModel<>(lst, JHeader.class);
            getTableInputJheader().setModel(tmJHeader);
    }
    @Override
    public void aksiBtnInputJpcodeReload() {
        //Reload Input hanya berlaku pada saat database mode
        List<JPcode> lst = new ArrayList<>();
        if (databaseMode==true) {
            lst = jpcodeDao.findAll();
        } else {
            lst = jpcodeDaoMem.findAll();
        }
            tmJPcode = new DynamicTableModel<>(lst, JPcode.class);
            getTableInputJpcode().setModel(tmJPcode);
    }
    @Override
    public void aksiBtnInputJtprbReload() {
        //Reload Input hanya berlaku pada saat database mode
        List<JTprb> lst = new ArrayList<>();
        if (databaseMode ==true) {
            lst = jtprbDao.findAll();
        } else {
            lst = jtprbDaoMem.findAll();
        }
            tmJTprb = new DynamicTableModel<>(lst, JTprb.class);
            getTableInputJtprb().setModel(tmJTprb);
    }
    @Override
    public void aksiBtnInputJtpruReload() {
        //Reload Input hanya berlaku pada saat database mode
        List<JTpru> lst = new ArrayList<>();
        if (databaseMode==true) {
            lst = jtpruDao.findAll();
        }else {
            lst = jtpruDaoMem.findAll();
        }
            tmJTpru = new DynamicTableModel<>(lst, JTpru.class);
            getTableInputJtpru().setModel(tmJTpru);
    }
    @Override
    public void aksiBtnInputMasterReload() {
        //Reload Input hanya berlaku pada saat database mode
        List<Produk> lst = new ArrayList<>();
        if (databaseMode == true) {
            lst=  produkDao.findAll();
        } else {
            lst = produkDaoMem.findAll();
        }
            tmProduk = new DynamicTableModel<>(lst, Produk.class);
            getTableInputMaster().setModel(tmProduk);
    }
    @Override
    public void aksiBtnInputOutletReload() {
        //Reload Input hanya berlaku pada saat database mode
        List<Outlet> lst = new ArrayList<>();
        if (databaseMode ==true) {
            lst = outletDao.findAll();
        }else {
            lst = outletDaoMem.findAll();
        }
            tmOutlet = new DynamicTableModel<>(lst, Outlet.class);
            getTableInputOutlet().setModel(tmOutlet); 
    }
    @Override
    public void aksiBtnInputSalesmanReload() {
         //Reload Input hanya berlaku pada saat database mode
       List<Salesman> lst = new ArrayList<>();
        if (databaseMode==true) {
            lst = salesmanDao.findAll();
        } else {
            lst = salesmanDaoMem.findAll();
        }
            tmSalesman = new DynamicTableModel<>(lst, Salesman.class);
            getTableInputSalesman().setModel(tmSalesman);
    }
 
    @Override
    public void aksiBtnInputStockReload() {
        //Reload Input hanya berlaku pada saat database mode
        List<Stock> lst = new ArrayList<>();
        if (databaseMode==true) {
            lst = stockDao.findAll();
        } else {
            lst = stockDaoMem.findAll();
        }
            tmStock = new DynamicTableModel<>(lst, Stock.class);
            getTableInputStock().setModel(tmStock);
    }
    
    @Override
    public void aksiBtnOutputClientReload() {
        //Reload Output hanya bisa jika MODE DATABASE
        List<TblClientId> lst = new ArrayList<>();
        if (databaseMode==true) {
            lst = tblClientIdDao.findAll();
        } else  {
            lst = tblClientIdDaoMem.findAll();
        }
            tmTblClientId = new DynamicTableModel<>(lst, TblClientId.class);
            getTableOutputClient().setModel(tmTblClientId);
    }
    @Override
    public void aksiBtnOutputSalesOrderReload() {
        //Reload Output hanya bisa jika MODE DATABASE
        List<TblSoId> lst = new ArrayList<>();
        if (databaseMode==true) {
            lst = tblSoIdDao.findAll();
        }else {
            lst = tblSoIdDaoMem.findAll();
        }
            tmTblSoId = new DynamicTableModel<>(lst, TblSoId.class);
            getTableOutputSalesOrder().setModel(tmTblSoId);
        
    }
    @Override
    public void aksiBtnOutputSalesReload() {
        //Reload Output hanya bisa jika MODE DATABASE
        List<TblSalesId> lst = new ArrayList<>();
        if (databaseMode==true) {
            lst = tblSalesIdDao.findAll();
        }else {
            lst = tblSalesIdDaoMem.findAll();
        }
            tmTblSalesId = new DynamicTableModel<>(lst, TblSalesId.class);
            getTableOutputSales().setModel(tmTblSalesId);
    }
    @Override
    public void aksiBtnOutputStockReload() {
        //Reload Output hanya bisa jika MODE DATABASE
        List<TblStockId> lst = new ArrayList<>();
        if (databaseMode==true) {
            lst = tblStockIdDao.findAll();
        }else {
            lst = tblStockIdDaoMem.findAll();
        }
            tmTblStockId = new DynamicTableModel<>(lst, TblStockId.class);
            getTableOutputStock().setModel(tmTblStockId);
    }
    
    @Override
    public void aksiBtnMapTipeOutletHapus() {
        MapTipeOutlet item = new MapTipeOutlet();
        item.setIdTipeOutlet(getTextMapTipeOutletIdTypeOutletScy().getText().trim().toUpperCase());
        item.setTipeOutlet(getTextMapTipeOutletIdTipeOutlet().getText().trim().toUpperCase());
        item.setDeskripsi(getTextMapTipeOutletDeskripsi().getText().trim().toUpperCase());
        if ((! item.getIdTipeOutlet().equals("")) || (! item.getTipeOutlet().equals(""))) {
            mapTipeOutletDao.delete(item);
            resetTeksMappingTipeOutlet();
            aksiBtnMapTipeOutletReload();
        } else {
            JOptionPane.showMessageDialog(this, "ID Outlet Kosong", "Pesan Error", JOptionPane.WARNING_MESSAGE);        
        }    
    }
    @Override
    public void aksiBtnMapTipeOutletSimpan() {
        MapTipeOutlet item = new MapTipeOutlet();
        item.setIdTipeOutlet(getTextMapTipeOutletIdTypeOutletScy().getText().trim().toUpperCase());
        item.setTipeOutlet(getTextMapTipeOutletIdTipeOutlet().getText().trim().toUpperCase());
        item.setDeskripsi(getTextMapTipeOutletDeskripsi().getText().trim().toUpperCase());
        if ((! item.getIdTipeOutlet().equals("")) || (! item.getTipeOutlet().equals(""))) {
            mapTipeOutletDao.saveOrUpdate(item);
            //tmMaptipeOutlet.add(item);
            aksiBtnMapTipeOutletReload();
        } else {
            JOptionPane.showMessageDialog(this, "ID Outlet Kosong", "Pesan Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    public void aksiListMapTipeOutletSeleksi() {
        
        int rowIndex = getTableMappingTipeOutlet().getSelectedRow();
        if (rowIndex >= 0) {
            MapTipeOutlet item = new MapTipeOutlet();
            item = tmMaptipeOutlet.get(rowIndex);

            getTextMapTipeOutletIdTypeOutletScy().setText(item.getIdTipeOutlet());
            getTextMapTipeOutletIdTipeOutlet().setText(item.getTipeOutlet());
            getTextMapTipeOutletDeskripsi().setText(item.getDeskripsi());
        }
       
    }
    
    
    @Override
    public void aksiBtnMapTipeOutletReload() {
        List<MapTipeOutlet> lst = mapTipeOutletDao.findAll();
        tmMaptipeOutlet = new DynamicTableModel<>(lst, MapTipeOutlet.class);
        getTableMappingTipeOutlet().setModel(tmMaptipeOutlet);
    }
    
 /**************************/   
   @Override
   public void aksiBtnPathInputStock() {
            FileFilter filter1 = new ExtensionFileFilter("TXT", new String[] { "TXT"});
            JFileChooser fileChooser1 = new JFileChooser(currentPath);
            fileChooser1.setFileFilter(filter1);
            fileChooser1.setDialogTitle("Pilih File STOCK.TXT");
            int status = fileChooser1.showOpenDialog(null);
            if (status==JFileChooser.APPROVE_OPTION){
                File selectedFile = fileChooser1.getSelectedFile() ;
                if (selectedFile != null){
                    String theFilePath = selectedFile.getAbsolutePath(); currentPath = theFilePath;
                    getTextPathInputStock().setText(theFilePath);
                }               
            }
            
    }
   @Override
    public void aksiBtnPathInputAuto() {
        boolean isFileComplete = true;
        JFileChooser fileChooser1 =  new JFileChooser(currentPath);
        fileChooser1.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        
        String daftarFile [][] = {{"CVOUTLET.TXT","0"}, {"JHEADER.TXT","0"}, {"JPCODE.TXT","0"}, {"JTPRB","0"},
            {"JTPRU","0"}, {"MSOUTLET","0"}, {"SALES","0"}, {"MSPCODE","0"} }; 
        
        if (fileChooser1.showOpenDialog(this) ==JFileChooser.APPROVE_OPTION){
            resetTeksInputBackground();
            
            File filePath = fileChooser1.getSelectedFile();
            currentPath = filePath.toString();
            if (filePath != null) {
                String strDirPath = filePath.getAbsolutePath() + File.separator;
                //Cek keberadaan setiap file
                File fileStock = new File(strDirPath + "STOCK.TXT");
                if (fileStock.exists())
                    getTextPathInputStock().setText(fileStock.getAbsolutePath());
                fileStock = new File(strDirPath + "stock.txt");
                if (fileStock.exists())
                    getTextPathInputStock().setText(fileStock.getAbsolutePath());
                fileStock = new File(strDirPath + "STGDNG.txt");
                if (fileStock.exists())
                    getTextPathInputStock().setText(fileStock.getAbsolutePath());
                
                File fileCvOutlet =  new File(strDirPath + "CVOUTLET.TXT");
                if (fileCvOutlet.exists())
                    getTextPathInputCvOutlet().setText(fileCvOutlet.getAbsolutePath());
                fileCvOutlet =  new File(strDirPath + "cvoutlet.txt");
                if (fileCvOutlet.exists())
                    getTextPathInputCvOutlet().setText(fileCvOutlet.getAbsolutePath());
                
                File fileJHeader = new File(strDirPath + "JHEADER.TXT");
                if (fileJHeader.exists())
                    getTextPathInputJHeader().setText(fileJHeader.getAbsolutePath());
                fileJHeader = new File(strDirPath + "jheader.txt");
                if (fileJHeader.exists())
                    getTextPathInputJHeader().setText(fileJHeader.getAbsolutePath());
                
                File fileJPcode = new File(strDirPath + "JPCODE.TXT");
                if (fileJPcode.exists())
                    getTextPathInputJPcode().setText(fileJPcode.getAbsolutePath());
                fileJPcode = new File(strDirPath + "jpcode.txt");
                if (fileJPcode.exists())
                    getTextPathInputJPcode().setText(fileJPcode.getAbsolutePath());
                
                File fileJTprb = new File(strDirPath + "JTPRB.TXT");
                if (fileJTprb.exists())
                    getTextPathInputJTprb().setText(fileJTprb.getAbsolutePath());
                fileJTprb = new File(strDirPath + "jtprb.txt");
                if (fileJTprb.exists())
                    getTextPathInputJTprb().setText(fileJTprb.getAbsolutePath());
                
                File fileJTpru = new File(strDirPath + "JTPRU.TXT");
                if (fileJTpru.exists())
                    getTextPathInputJTpru().setText(fileJTpru.getAbsolutePath());
                fileJTpru = new File(strDirPath + "jtpru.txt");
                if (fileJTpru.exists())
                    getTextPathInputJTpru().setText(fileJTpru.getAbsolutePath());
                
                File fileOutlet = new File(strDirPath + "MSOUTLET.TXT");
                if (fileOutlet.exists())
                    getTextPathInputOutlet().setText(fileOutlet.getAbsolutePath());
                fileOutlet = new File(strDirPath + "msoutlet.txt");
                if (fileOutlet.exists())
                    getTextPathInputOutlet().setText(fileOutlet.getAbsolutePath());
                
                File fileSales = new File(strDirPath + "SALESMAN.TXT");
                if (fileSales.exists())
                    getTextPathInputSalesman().setText(fileSales.getAbsolutePath());
                fileSales = new File(strDirPath + "salesman.txt");
                if (fileSales.exists())
                    getTextPathInputSalesman().setText(fileSales.getAbsolutePath());
                
                File fileMsPcode = new File(strDirPath + "MSPCODE.TXT");
                if (fileMsPcode.exists())
                    getTextPathInputMaster().setText(fileMsPcode.getAbsolutePath());                    
                fileMsPcode = new File(strDirPath + "mspcode.txt");
                if (fileMsPcode.exists())
                    getTextPathInputMaster().setText(fileMsPcode.getAbsolutePath());
                
            }            
            
        }        

        
        
    } 
   @Override
    public void aksiBtnPathInputCvOutlet() {
            FileFilter filter1 = new ExtensionFileFilter("TXT", new String[] { "TXT"});
            JFileChooser fileChooser1 = new JFileChooser(currentPath);
            fileChooser1.setFileFilter(filter1);
            fileChooser1.setDialogTitle("Pilih File CVOUTLET.TXT");
            int status = fileChooser1.showOpenDialog(null);
            if (status==JFileChooser.APPROVE_OPTION){
                File selectedFile = fileChooser1.getSelectedFile() ;
                if (selectedFile != null){
                    String theFilePath = selectedFile.getAbsolutePath(); currentPath = theFilePath;
                    getTextPathInputCvOutlet().setText(theFilePath);
                }               
            }              
    }
    @Override
    public void aksiBtnPathInputJHeader() {
            FileFilter filter1 = new ExtensionFileFilter("TXT", new String[] { "TXT"});
            JFileChooser fileChooser1 = new JFileChooser(currentPath);
            fileChooser1.setFileFilter(filter1);
            fileChooser1.setDialogTitle("Pilih File JHEADER.TXT");
            int status = fileChooser1.showOpenDialog(null);
            if (status==JFileChooser.APPROVE_OPTION){
                File selectedFile = fileChooser1.getSelectedFile() ;
                if (selectedFile != null){
                    String theFilePath = selectedFile.getAbsolutePath(); currentPath = theFilePath;
                    getTextPathInputJHeader().setText(theFilePath);
                }               
            }              
    }
   
   @Override
    public void aksiPathInputJPcode() {
            FileFilter filter1 = new ExtensionFileFilter("TXT", new String[] { "TXT"});
            JFileChooser fileChooser1 = new JFileChooser(currentPath);
            fileChooser1.setFileFilter(filter1);
            fileChooser1.setDialogTitle("Pilih File JPCODE.TXT");
            int status = fileChooser1.showOpenDialog(null);
            if (status==JFileChooser.APPROVE_OPTION){
                File selectedFile = fileChooser1.getSelectedFile() ;
                if (selectedFile != null){
                    String theFilePath = selectedFile.getAbsolutePath(); currentPath = theFilePath;
                    getTextPathInputJPcode().setText(theFilePath);
                }               
            }              
    }
   @Override
    public void aksiBtnPathInputJTprb() {
            FileFilter filter1 = new ExtensionFileFilter("TXT", new String[] { "TXT"});
            JFileChooser fileChooser1 = new JFileChooser(currentPath);
            fileChooser1.setFileFilter(filter1);
            fileChooser1.setDialogTitle("Pilih File JTPRB.TXT");
            int status = fileChooser1.showOpenDialog(null);
            if (status==JFileChooser.APPROVE_OPTION){
                File selectedFile = fileChooser1.getSelectedFile() ;
                if (selectedFile != null){
                    String theFilePath = selectedFile.getAbsolutePath(); currentPath = theFilePath;
                    getTextPathInputJTprb().setText(theFilePath);
                }               
            }              
    }
   @Override
     public void aksiBtnPathInputJTpru() {
            FileFilter filter1 = new ExtensionFileFilter("TXT", new String[] { "TXT"});
            JFileChooser fileChooser1 = new JFileChooser(currentPath);
            fileChooser1.setFileFilter(filter1);
            fileChooser1.setDialogTitle("Pilih File JTPRU.TXT");
            int status = fileChooser1.showOpenDialog(null);
            if (status==JFileChooser.APPROVE_OPTION){
                File selectedFile = fileChooser1.getSelectedFile() ;
                if (selectedFile != null){
                    String theFilePath = selectedFile.getAbsolutePath(); currentPath = theFilePath;
                    getTextPathInputJTpru().setText(theFilePath);
                }               
            }              
    }
   @Override
     public void aksiBtnPathInputMaster() {
            FileFilter filter1 = new ExtensionFileFilter("TXT", new String[] { "TXT"});
            JFileChooser fileChooser1 = new JFileChooser(currentPath);
            fileChooser1.setFileFilter(filter1);
            fileChooser1.setDialogTitle("Pilih File MASTER.TXT");
            int status = fileChooser1.showOpenDialog(null);
            if (status==JFileChooser.APPROVE_OPTION){
                File selectedFile = fileChooser1.getSelectedFile() ;
                if (selectedFile != null){
                    String theFilePath = selectedFile.getAbsolutePath(); currentPath = theFilePath;
                    getTextPathInputMaster().setText(theFilePath);
                }               
            }              
    }
   @Override
     public void aksiBtnPathInputOutlet() {
            FileFilter filter1 = new ExtensionFileFilter("TXT", new String[] { "TXT"});
            JFileChooser fileChooser1 = new JFileChooser(currentPath);
            fileChooser1.setFileFilter(filter1);
            fileChooser1.setDialogTitle("Pilih File OUTLET.TXT");
            int status = fileChooser1.showOpenDialog(null);
            if (status==JFileChooser.APPROVE_OPTION){
                File selectedFile = fileChooser1.getSelectedFile() ;
                if (selectedFile != null){
                    String theFilePath = selectedFile.getAbsolutePath(); currentPath = theFilePath;
                    getTextPathInputOutlet().setText(theFilePath);
                }               
            }              
    }
   @Override
    public void aksiBtnPathInputSalesman() {
            FileFilter filter1 = new ExtensionFileFilter("TXT", new String[] { "TXT"});
            JFileChooser fileChooser1 = new JFileChooser(currentPath);
            fileChooser1.setFileFilter(filter1);
            fileChooser1.setDialogTitle("Pilih File SALES.TXT");
            int status = fileChooser1.showOpenDialog(null);
            if (status==JFileChooser.APPROVE_OPTION){
                File selectedFile = fileChooser1.getSelectedFile() ;
                if (selectedFile != null){
                    String theFilePath = selectedFile.getAbsolutePath(); currentPath = theFilePath;
                    getTextPathInputSalesman().setText(theFilePath);
                }               
            }              
    }
    /* ------Retrieve------- */
   @Override
    public void aksiBtnRetrieveInputCvOutlet() {
    }
   @Override
    public void aksiBtnRetrieveInputJHeader() {
    }
   @Override
    public void aksiBtnRetrieveInputJPcode() {
    }
   @Override
     public void aksiBtnRetrieveInputJTprb() {
    }
   @Override
     public void aksiBtnRetrieveInputJTpru() {
    }
   @Override
    public void aksiBtnRetrieveInputMaster() {
    }
   @Override
     public void aksiBtnRetrieveInputOutlet() {
    }
   @Override
    public void aksiBtnRetrieveInputStock() {
    }
    @Override
    public void aksiBtnRetrieveInputSalesman() {
    }
   
    @Override
   public void aksiBtnRetrieveInputAll() {
        
   }
    @Override
   public void aksiBtnPathInputClearAll() {
        if (JOptionPane.showConfirmDialog(this,"Anda Yakin Akan Hapus Semua Data?"
                + "\n\nPERHATIAN!!.. \nDATA YANG PERNAH DI UPLOAD AKAN DI HAPUS SEMUA", 
                "Konfirmasi Hapus", JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION) {
            
            resetTeksInputBackground();
            
            //1. Hapus semua data input dan output
                //dimulai dari Child Dulu
                jtprbDao.deleteAll();
                jtpruDao.deleteAll();
                jpcodeDao.deleteAll();
                jheaderDao.deleteAll();

                cvOutletDao.deleteAll();
                outletDao.deleteAll();

                salesmanDao.deleteAll();
                
                stockDao.deleteAll();
                produkDao.deleteAll();
                //TIDAK PERLU -> TERMASUK FILE PARAMETER SYSTEM
                //mapTipeOutletDao.deleteAll();

                tblSalesIdDao.deleteAll();
                tblStockIdDao.deleteAll();
                tblClientIdDao.deleteAll();
                tblSoIdDao.deleteAll();
            
            //2. Reload Semua table
            aksiBtnPathInputReloadAll();
            
            JOptionPane.showMessageDialog(this, "Semua data berhasil dihapus!! \n Kecuali Data Parameter Sistem", 
                    "Info..", JOptionPane.INFORMATION_MESSAGE);
            
        }
   }
    @Override
   public void aksiBtnPathInputReloadAll() {
        aksiReloadAll();
   }
    public void aksiReloadAll(){
        aksiReloadInput();
        aksiReloadOutput();
        aksiReloadKonfig();
    }
    public void aksiReloadInput() {
        aksiBtnInputCvOutletReload();
        aksiBtnInputJheaderReload();
        aksiBtnInputJpcodeReload();
        aksiBtnInputJtprbReload();
        aksiBtnInputJtpruReload();
        aksiBtnInputMasterReload();
        aksiBtnInputOutletReload();
        aksiBtnInputSalesmanReload();
        aksiBtnInputStockReload();
    }
    public void aksiReloadOutput(){
        aksiBtnOutputClientReload();
        aksiBtnOutputSalesOrderReload();
        aksiBtnOutputSalesReload();
        aksiBtnOutputStockReload();
    }
    public void aksiReloadKonfig() {
        aksiBtnGeneralSettingReload();
        aksiBtnMapTipeOutletReload();
    }
 
    public void aksiBtnKirimByEmail() {
    }

   
}
