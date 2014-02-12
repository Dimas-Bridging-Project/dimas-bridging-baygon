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
public class TblSalesIdPK implements Serializable {
    @Basic(optional=false)
    @Column(name="invoice_number", length=20,  nullable=false)
    private String InvoiceNumber;
    @Column(name="distributor_product_code", length=20 , nullable=false)
    private String DistributorProductCode;

    public String getInvoiceNumber() {
        return InvoiceNumber;
    }

    public void setInvoiceNumber(String InvoiceNumber) {
        this.InvoiceNumber = InvoiceNumber;
    }

    public String getDistributorProductCode() {
        return DistributorProductCode;
    }

    public void setDistributorProductCode(String DistributorProductCode) {
        this.DistributorProductCode = DistributorProductCode;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.InvoiceNumber);
        hash = 37 * hash + Objects.hashCode(this.DistributorProductCode);
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
        final TblSalesIdPK other = (TblSalesIdPK) obj;
        if (!Objects.equals(this.InvoiceNumber, other.InvoiceNumber)) {
            return false;
        }
        if (!Objects.equals(this.DistributorProductCode, other.DistributorProductCode)) {
            return false;
        }
        return true;
    }
 
    
    
}
