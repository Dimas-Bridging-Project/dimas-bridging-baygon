/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.hibernate.dao;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import org.config.spring.hibernate.dao.generic.GenericDaoInter;
import org.config.spring.hibernate.model.Stock;
import org.hibernate.HibernateException;

/**
 *
 * @author yhawin
 */
public interface StockDaoInter extends GenericDaoInter<Stock, Serializable>{
    public List<Stock> findAllByTanggalStock(Date tanggalStock) throws HibernateException;
    
}
