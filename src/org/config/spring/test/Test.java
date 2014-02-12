/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.test;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Column;
import javax.swing.JOptionPane;
import org.config.spring.hibernate.dao.CvOutletDaoInter;
import org.config.spring.hibernate.dao.JPcodeDaoInter;
import org.config.spring.hibernate.dao.OutletDaoInter;
import org.config.spring.hibernate.dao.ProdukDaoInter;
import org.config.spring.hibernate.model.CvOutlet;
import org.config.spring.hibernate.model.JPcode;
import org.config.spring.hibernate.model.JPcodePK;
import org.config.spring.hibernate.model.Outlet;
import org.config.spring.hibernate.model.Produk;
import org.config.spring.provider.ApplicationContextProvider;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author Bagus Winarno
 */
public class Test {

    public static void main(String[] args) {
        //ApplicationContext appContext = ApplicationContextProvider.getInstance().getApplicationContext();
        //OutletDaoInter outletDao = (OutletDaoInter) appContext.getBean("OutletDaoBean");
        //CvOutletDaoInter cvOutletDao = (CvOutletDaoInter) appContext.getBean("CvOutletDaoBean");
        //ProdukDaoInter produkDao = (ProdukDaoInter) appContext.getBean("ProdukDaoBean");
       
            for (Field field: JPcode.class.getDeclaredFields()){
                Column col;
                if ((col = field.getAnnotation(Column.class)) != null){
                    //System.out.println(col.name());
                }        

            }
            
            SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
            Date tangal = new Date();
            String strTanggal = sdf.format(tangal);
            System.out.println(strTanggal);
            
            Calendar cal = Calendar.getInstance();
            cal.setTime(tangal);
            String strCalTgl = sdf.format(cal.getTime());
            System.out.println(strCalTgl);
            
            cal.add(Calendar.DATE, 1);
            String strCalAfter = sdf.format(cal.getTime());
            System.out.println(strCalAfter);
    }
}