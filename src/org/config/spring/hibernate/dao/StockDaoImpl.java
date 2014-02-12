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
import org.config.spring.hibernate.model.Stock;
import org.config.spring.provider.ApplicationContextProvider;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author yhawin
 */
public class StockDaoImpl extends GenericDaoImpl<Stock, Serializable> implements StockDaoInter{

    @Override
    public List<Stock> findAllByTanggalStock(Date tanggalStock) throws HibernateException {
        //Kalau pake get hibernate template berarti bisa multi tasking dao >> Sama dengan statement diatas
        DetachedCriteria crit = DetachedCriteria.forClass(getDomainClass());
        crit.add(Restrictions.eq("stockPK.TangalStock", tanggalStock));
        crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        return getHibernateTemplate().findByCriteria(crit);   
    
    }    
    
    public static void main(String [] args){
            ApplicationContext appContext = ApplicationContextProvider.getInstance().getApplicationContext();
            StockDaoInter stockDao = (StockDaoInter) appContext.getBean("StockDaoBean");
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date tgl = sdf.parse("17/06/2013");
            List<Stock> lst = stockDao.findAllByTanggalStock(tgl);
            for (Stock itm: lst) {
                System.out.print(itm.getStockPK().getPcode());
                System.out.print(itm.getStockPK().getTangalStock());
                System.out.print(itm.getTotalStock());
                System.out.print(itm.getTotalStockInPcs());
                System.out.println();
            }
            
            
        } catch (ParseException ex) {
            Logger.getLogger(StockDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
