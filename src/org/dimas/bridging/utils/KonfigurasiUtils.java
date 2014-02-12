/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dimas.bridging.utils;

import org.config.spring.hibernate.dao.SysvarDaoInter;
import org.config.spring.hibernate.model.Sysvar;
import org.config.spring.provider.ApplicationContextProvider;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author yhawin
 */
public class KonfigurasiUtils {
    ApplicationContext appContext = ApplicationContextProvider.getInstance().getApplicationContext();
    SysvarDaoInter sysvarDao = (SysvarDaoInter) appContext.getBean("SysvarDaoBean");
            
    public KonfigurasiUtils(){
    }
    //Dapat berubah-ubah
    public String simpanKonfigurasi(String distCode, String recSls, String recStk, String recCln,
            String recSo, String whCode, String whDesc, String emailFrom, String emailTo, String emailSubject, 
            String emailPass){
        String pesan = "OK";
         //1.1 Set Kode Distributor
            Sysvar sysvar11 = new Sysvar();
            sysvar11.setIdSysvar("_DIST_CODE");
            sysvar11.setDeskripsi("Kode Distributor dari Principal");
            sysvar11.setTipeData("STR1");
            sysvar11.setNilaiString1(distCode.toUpperCase().trim());
            sysvarDao.saveOrUpdate(sysvar11);
        //1.2 Record Type
            Sysvar sysvar121 = new Sysvar();
            sysvar121.setIdSysvar("_REC_SLS");
            sysvar121.setDeskripsi("Record Type Sales dari Principal");
            sysvar121.setTipeData("STR1");
            sysvar121.setNilaiString1(recSls.toUpperCase().trim());
            sysvarDao.saveOrUpdate(sysvar121);
            
            Sysvar sysvar122 = new Sysvar();
            sysvar122.setIdSysvar("_REC_STK");
            sysvar122.setDeskripsi("Record Type Stock dari Principal");
            sysvar122.setTipeData("STR1");
            sysvar122.setNilaiString1(recStk.toUpperCase().trim());
            sysvarDao.saveOrUpdate(sysvar122);

            Sysvar sysvar123 = new Sysvar();
            sysvar123.setIdSysvar("_REC_CLN");
            sysvar123.setDeskripsi("Record Type Client dari Principal");
            sysvar123.setTipeData("STR1");
            sysvar123.setNilaiString1(recCln.toUpperCase().trim());
            sysvarDao.saveOrUpdate(sysvar123);
            
            Sysvar sysvar124 = new Sysvar();
            sysvar124.setIdSysvar("_REC_SO");
            sysvar124.setDeskripsi("Record Type Sales Order dari Principal");
            sysvar124.setTipeData("STR1");
            sysvar124.setNilaiString1(recSo.toUpperCase().trim());
            sysvarDao.saveOrUpdate(sysvar124);
            
        //1.3 Warehouse
            Sysvar sysvar131 = new Sysvar();
            sysvar131.setIdSysvar("_WH_CODE");
            sysvar131.setDeskripsi("Kode Gudang");
            sysvar131.setTipeData("STR1");
            sysvar131.setNilaiString1(whCode.toUpperCase().trim());
            sysvarDao.saveOrUpdate(sysvar131);

            Sysvar sysvar132 = new Sysvar();
            sysvar132.setIdSysvar("_WH_DESC");
            sysvar132.setDeskripsi("Deskripsi Gudang");
            sysvar132.setTipeData("STR1");
            sysvar132.setNilaiString1(whDesc.toUpperCase().trim());
            sysvarDao.saveOrUpdate(sysvar132);

        //1.4 Email     
            Sysvar sysvar141 = new Sysvar();
            sysvar141.setIdSysvar("_EM_FROM");
            sysvar141.setDeskripsi("From Email");
            sysvar141.setTipeData("STR1");
            sysvar141.setNilaiString1(emailFrom.toLowerCase().trim());
            sysvarDao.saveOrUpdate(sysvar141);

            Sysvar sysvar1412 = new Sysvar();
            sysvar1412.setIdSysvar("_EM_PASS");
            sysvar1412.setDeskripsi("From Email");
            sysvar1412.setTipeData("STR1");
            sysvar1412.setNilaiString1(emailPass.trim());
            sysvarDao.saveOrUpdate(sysvar1412);

            Sysvar sysvar142 = new Sysvar();
            sysvar142.setIdSysvar("_EM_TO");
            sysvar142.setDeskripsi("Beberapa alamat Email yang dituju");
            sysvar142.setTipeData("STR1");
            sysvar142.setNilaiString1(emailTo.toLowerCase().trim());
            sysvarDao.saveOrUpdate(sysvar142);
            
            Sysvar sysvar143 = new Sysvar();
            sysvar143.setIdSysvar("_EM_SUB");
            sysvar143.setDeskripsi("Subject atau Judul Email");
            sysvar143.setTipeData("STR1");
            sysvar143.setNilaiString1(emailSubject.toLowerCase().trim());
            sysvarDao.saveOrUpdate(sysvar143);
        
        return pesan;       
    }
    public String setFirstKonfigurasiIfEmpty(){
        String pesan = "OK";
        //1.Jika sysvar kosong
        if (sysvarDao.countAll() == 0) {
        //1.1 Set Kode Distributor
            Sysvar sysvar11 = new Sysvar();
            sysvar11.setIdSysvar("_DIST_CODE");
            sysvar11.setDeskripsi("Kode Distributor dari Principal");
            sysvar11.setTipeData("STR1");
            sysvar11.setNilaiString1("DIMAS01");
            sysvarDao.saveOrUpdate(sysvar11);
        //1.2 Record Type
            Sysvar sysvar121 = new Sysvar();
            sysvar121.setIdSysvar("_REC_SLS");
            sysvar121.setDeskripsi("Record Type Sales dari Principal");
            sysvar121.setTipeData("STR1");
            sysvar121.setNilaiString1("DDCSALESLN02");
            sysvarDao.saveOrUpdate(sysvar121);
            
            Sysvar sysvar122 = new Sysvar();
            sysvar122.setIdSysvar("_REC_STK");
            sysvar122.setDeskripsi("Record Type Stock dari Principal");
            sysvar122.setTipeData("STR1");
            sysvar122.setNilaiString1("DDCSTOCKLN02");
            sysvarDao.saveOrUpdate(sysvar122);

            Sysvar sysvar123 = new Sysvar();
            sysvar123.setIdSysvar("_REC_CLN");
            sysvar123.setDeskripsi("Record Type Client dari Principal");
            sysvar123.setTipeData("STR1");
            sysvar123.setNilaiString1("DDCCLIENLN02");
            sysvarDao.saveOrUpdate(sysvar123);
            
            Sysvar sysvar124 = new Sysvar();
            sysvar124.setIdSysvar("_REC_SO");
            sysvar124.setDeskripsi("Record Type Sales Order dari Principal");
            sysvar124.setTipeData("STR1");
            sysvar124.setNilaiString1("DDCORDERLN02");
            sysvarDao.saveOrUpdate(sysvar124);
            
        //1.3 Warehouse
            Sysvar sysvar131 = new Sysvar();
            sysvar131.setIdSysvar("_WH_CODE");
            sysvar131.setDeskripsi("Kode Gudang");
            sysvar131.setTipeData("STR1");
            sysvar131.setNilaiString1("UTM");
            sysvarDao.saveOrUpdate(sysvar131);

            Sysvar sysvar132 = new Sysvar();
            sysvar132.setIdSysvar("_WH_DESC");
            sysvar132.setDeskripsi("Deskripsi Gudang");
            sysvar132.setTipeData("STR1");
            sysvar132.setNilaiString1("GUDANG UTAMA");
            sysvarDao.saveOrUpdate(sysvar132);
            
         //1.4 Email     
            Sysvar sysvar141 = new Sysvar();
            sysvar141.setIdSysvar("_EM_FROM");
            sysvar141.setDeskripsi("From Email");
            sysvar141.setTipeData("STR1");
            sysvar141.setNilaiString1("ferrys.dimas@gmail.com");
            sysvarDao.saveOrUpdate(sysvar141);

            Sysvar sysvar1412 = new Sysvar();
            sysvar1412.setIdSysvar("_EM_PASS");
            sysvar1412.setDeskripsi("From Email");
            sysvar1412.setTipeData("STR1");
            sysvar1412.setNilaiString1("123");
            sysvarDao.saveOrUpdate(sysvar1412);

            Sysvar sysvar142 = new Sysvar();
            sysvar142.setIdSysvar("_EM_TO");
            sysvar142.setDeskripsi("Beberapa alamat Email yang dituju");
            sysvar142.setTipeData("STR1");
            sysvar142.setNilaiString1("ferrys.dimas@gmail.com;dimasferry@yahoo.co.id;");
            sysvarDao.saveOrUpdate(sysvar142);
            
            Sysvar sysvar143 = new Sysvar();
            sysvar143.setIdSysvar("_EM_SUB");
            sysvar143.setDeskripsi("Subject atau Judul Email");
            sysvar143.setTipeData("STR1");
            sysvar143.setNilaiString1("Data Dimas Tanggal : ");
            sysvarDao.saveOrUpdate(sysvar143);
           
        } else {
            pesan = "Data sudah terisi";
        }
        return pesan;
    }

    public String setForceFirstKonfigurasi(){
        String pesan = "OK";
         //1.1 Set Kode Distributor
            Sysvar sysvar11 = new Sysvar();
            sysvar11.setIdSysvar("_DIST_CODE");
            sysvar11.setDeskripsi("Kode Distributor dari Principal");
            sysvar11.setTipeData("STR1");
            sysvar11.setNilaiString1("DIMAS01");
            sysvarDao.saveOrUpdate(sysvar11);
        //1.2 Record Type
            Sysvar sysvar121 = new Sysvar();
            sysvar121.setIdSysvar("_REC_SLS");
            sysvar121.setDeskripsi("Record Type Sales dari Principal");
            sysvar121.setTipeData("STR1");
            sysvar121.setNilaiString1("DDCSALESLN02");
            sysvarDao.saveOrUpdate(sysvar121);
            
            Sysvar sysvar122 = new Sysvar();
            sysvar122.setIdSysvar("_REC_STK");
            sysvar122.setDeskripsi("Record Type Stock dari Principal");
            sysvar122.setTipeData("STR1");
            sysvar122.setNilaiString1("DDCSTOCKLN02");
            sysvarDao.saveOrUpdate(sysvar122);

            Sysvar sysvar123 = new Sysvar();
            sysvar123.setIdSysvar("_REC_CLN");
            sysvar123.setDeskripsi("Record Type Client dari Principal");
            sysvar123.setTipeData("STR1");
            sysvar123.setNilaiString1("DDCCLIENLN02");
            sysvarDao.saveOrUpdate(sysvar123);
            
            Sysvar sysvar124 = new Sysvar();
            sysvar124.setIdSysvar("_REC_SO");
            sysvar124.setDeskripsi("Record Type Sales Order dari Principal");
            sysvar124.setTipeData("STR1");
            sysvar124.setNilaiString1("DDCORDERLN02");
            sysvarDao.saveOrUpdate(sysvar124);
            
        //1.3 Warehouse
            Sysvar sysvar131 = new Sysvar();
            sysvar131.setIdSysvar("_WH_CODE");
            sysvar131.setDeskripsi("Kode Gudang");
            sysvar131.setTipeData("STR1");
            sysvar131.setNilaiString1("UTM");
            sysvarDao.saveOrUpdate(sysvar131);

            Sysvar sysvar132 = new Sysvar();
            sysvar132.setIdSysvar("_WH_DESC");
            sysvar132.setDeskripsi("Deskripsi Gudang");
            sysvar132.setTipeData("STR1");
            sysvar132.setNilaiString1("GUDANG UTAMA");
            sysvarDao.saveOrUpdate(sysvar132);
       
        return pesan;
    }
    
}
