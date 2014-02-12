/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.hibernate.dao;

import java.io.Serializable;
import java.util.List;
import org.config.spring.hibernate.dao.generic.GenericDaoInter;
import org.config.spring.hibernate.model.JTprb;
import org.config.spring.hibernate.model.JTpru;
import org.hibernate.HibernateException;

/**
 *
 * @author Bagus Winarno
 */
public interface JTpruDaoInter extends GenericDaoInter<JTpru, Serializable> {
    public List<JTpru> findAllByIdOrderAndPcode(String idOrder, String idBarang) throws HibernateException;    
    
}
