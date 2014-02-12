/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.hibernate.dao;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.config.spring.hibernate.dao.generic.GenericDaoImpl;
import org.config.spring.hibernate.model.JPcode;
import org.config.spring.provider.ApplicationContextProvider;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author Bagus Winarno
 */
public class JPcodeDaoImpl extends GenericDaoImpl<JPcode, Serializable> implements JPcodeDaoInter{

    @Override
    public List<JPcode> findAllByIdBrgAndDate(String idBarang, Date tanggalTransaksi) throws HibernateException {
        DetachedCriteria crit = DetachedCriteria.forClass(getDomainClass());
        //crit.createAlias("produk", "aliasProduk").add(Restrictions.like("aliasProduk.NamaBrg","%"));
        //crit.add(Restrictions.like("aliasProduk.NamaBrg","%"));
        crit.createAlias("jheader", "aliasJheader");
        //crit.add(Restrictions.eq("aliasJheader.Tanggal",tanggalTransaksi));
        crit.add(Restrictions.and(Restrictions.like("jpcodePK.Pcode", idBarang), 
                Restrictions.eq("aliasJheader.Tanggal",tanggalTransaksi)));
        crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        return getHibernateTemplate().findByCriteria(crit);   
    }
    
    public static void main(String [] args){
            ApplicationContext appContext = ApplicationContextProvider.getInstance().getApplicationContext();
            JPcodeDaoInter jpcodeDao = (JPcodeDaoInter) appContext.getBean("JPcodeDaoBean");
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date tgl = sdf.parse("29/06/2013");
            String idBarang = "500275";
            List<JPcode> lst = jpcodeDao.findAllByIdBrgAndDate(idBarang, tgl);
            
            for (JPcode itm: lst) {
                System.out.print(itm.getJpcodePK().getIdOrder() + "\t");
                System.out.print(itm.getJpcodePK().getPcode() + "\t");
                System.out.print(itm.getQtyInSat() + "\t");
                System.out.print(itm.getHargaNoPpn() + "\t");
                System.out.println();
            }
             
            
            
        } catch (ParseException ex) {
            Logger.getLogger(StockDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }
    
}
