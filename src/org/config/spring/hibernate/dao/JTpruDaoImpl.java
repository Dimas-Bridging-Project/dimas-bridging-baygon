/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.hibernate.dao;

import java.io.Serializable;
import java.util.List;
import org.config.spring.hibernate.dao.generic.GenericDaoImpl;
import org.config.spring.hibernate.model.JTpru;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Bagus Winarno
 */
public class JTpruDaoImpl extends GenericDaoImpl<JTpru, Serializable> implements JTpruDaoInter{

    @Override
    public List<JTpru> findAllByIdOrderAndPcode(String idOrder, String idBarang) throws HibernateException {
         DetachedCriteria crit = DetachedCriteria.forClass(getDomainClass());
        crit.add(Restrictions.and(Restrictions.like("jtpruPK.Pcode", idBarang), 
                Restrictions.eq("jtpruPK.IdOrder",idOrder)));
        crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        return getHibernateTemplate().findByCriteria(crit);   
   }
    
}
