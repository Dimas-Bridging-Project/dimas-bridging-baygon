/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.hibernate.dao;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import org.config.spring.hibernate.dao.generic.GenericDaoInter;
import org.config.spring.hibernate.model.JPcode;
import org.config.spring.hibernate.model.JTprb;
import org.hibernate.HibernateException;

/**
 *
 * @author Bagus Winarno
 */
public interface JTprbDaoInter extends GenericDaoInter<JTprb, Serializable>{
    public List<JTprb> findAllByIdBrgAndDate(String idBarang, Date tanggalTransaksi) throws HibernateException;    
    public List<JTprb> findAllByIdOrderAndPcode(String idOrder, String idBarang) throws HibernateException;    
}
