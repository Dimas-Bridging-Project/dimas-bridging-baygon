/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.hibernate.dao;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.config.spring.hibernate.dao.generic.GenericDaoImpl;
import org.config.spring.hibernate.model.JHeader;
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
public class JHeaderDaoImpl extends GenericDaoImpl<JHeader, Serializable> implements JHeaderDaoInter{

    @Override
    public List<JHeader> findAllByDate(Date tanggalTransaksi) throws HibernateException {
        DetachedCriteria crit = DetachedCriteria.forClass(getDomainClass());
        crit.add(Restrictions.eq("Tanggal", tanggalTransaksi));
        crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        return getHibernateTemplate().findByCriteria(crit);   
    }
    
    public static void main(String [] args) throws ParseException{
        ApplicationContext appContext = ApplicationContextProvider.getInstance().getApplicationContext();
        JHeaderDaoInter jheaderDao = (JHeaderDaoInter) appContext.getBean("JHeaderDaoBean");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date tgl = sdf.parse("24/06/2013");
        Calendar cal = Calendar.getInstance();
        cal.setTime(tgl);
                
        List<JHeader> list = jheaderDao.findAllByDate(cal.getTime());
        for (JHeader item : list) {
            System.out.print(item.getIdOrder() + "\t");
            System.out.print(item.getTanggal() + "\t");
            System.out.println();
        }
        
        
    }

    @Override
    public List<JHeader> findAllByDate(Date tanggalTransaksiFrom, Date tanggalTransaksiTo) throws HibernateException {
        DetachedCriteria crit = DetachedCriteria.forClass(getDomainClass());
        crit.add(Restrictions.between("Tanggal", tanggalTransaksiFrom, tanggalTransaksiTo));
        crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        return getHibernateTemplate().findByCriteria(crit);   
        
    }
    
}
