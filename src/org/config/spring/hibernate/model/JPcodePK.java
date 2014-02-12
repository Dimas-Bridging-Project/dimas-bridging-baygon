/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.hibernate.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Bagus Winarno
 */
@Embeddable
public class JPcodePK implements Serializable {
    @Basic(optional=false)
    @Column(name="id_order", nullable=false)
    private String IdOrder;
    @Column(name="pcode", nullable=false)
    private String Pcode;
    @Column(name="salesman")
    private String Salesman;

    public String getIdOrder() {
        return IdOrder;
    }

    public void setIdOrder(String IdOrder) {
        this.IdOrder = IdOrder;
    }

    public String getPcode() {
        return Pcode;
    }

    public void setPcode(String Pcode) {
        this.Pcode = Pcode;
    }

    public String getSalesman() {
        return Salesman;
    }

    public void setSalesman(String Salesman) {
        this.Salesman = Salesman;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.IdOrder);
        hash = 71 * hash + Objects.hashCode(this.Pcode);
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
        final JPcodePK other = (JPcodePK) obj;
        if (!Objects.equals(this.IdOrder, other.IdOrder)) {
            return false;
        }
        if (!Objects.equals(this.Pcode, other.Pcode)) {
            return false;
        }
        return true;
    }
 
    
    
}
