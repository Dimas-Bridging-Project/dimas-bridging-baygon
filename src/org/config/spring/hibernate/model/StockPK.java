/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.hibernate.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;

/**
 *
 * @author yhawin
 */
@Embeddable
public class StockPK implements Serializable {
    
    @Basic(optional=false)
    @Column(name="pcode", length=7, nullable=false)
    private String Pcode;

    @Basic(optional=false)
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="tanggal_stock", nullable = false)
    private Date TangalStock;

    public String getPcode() {
        return Pcode;
    }

    public void setPcode(String Pcode) {
        this.Pcode = Pcode;
    }

    public Date getTangalStock() {
        return TangalStock;
    }

    public void setTangalStock(Date TangalStock) {
        this.TangalStock = TangalStock;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.Pcode);
        hash = 89 * hash + Objects.hashCode(this.TangalStock);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final StockPK other = (StockPK) obj;
        if (!Objects.equals(this.Pcode, other.Pcode)) {
            return false;
        }
        if (!Objects.equals(this.TangalStock, other.TangalStock)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
