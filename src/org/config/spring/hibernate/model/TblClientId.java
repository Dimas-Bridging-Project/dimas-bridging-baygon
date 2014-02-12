/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.hibernate.model;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import java.util.Objects;
import javax.persistence.*;

/**
 *
 * @author yhawin
 */
@Entity
@Table(name="tbl_client_id")
public class TblClientId implements Serializable {
    @Id
    @Basic(optional=false)
    @Column(name="client_code", length=20, nullable=false)
    private String ClientCode;
    @Column(name="record_type", length=12)
    private String RecordType;
    @Column(name="distributor_code", length=10)
    private String DistributorCode;
    @Column(name="client_status", length=10)
    private String ClientStatus;
    @Column(name="salesman_code", length=10)
    private String SalesmanCode;
    @Column(name="reserved_field2", length=20)
    private String ReserverdField2;
    @Column(name="reserved_field3", length=20)
    private String ReserverdField3;

    public String getClientCode() {
        return ClientCode;
    }

    public void setClientCode(String ClientCode) {
        this.ClientCode = ClientCode;
    }

    public String getRecordType() {
        return RecordType;
    }

    public void setRecordType(String RecordType) {
        this.RecordType = RecordType;
    }

    public String getDistributorCode() {
        return DistributorCode;
    }

    public void setDistributorCode(String DistributorCode) {
        this.DistributorCode = DistributorCode;
    }

    public String getClientStatus() {
        return ClientStatus;
    }

    public void setClientStatus(String ClientStatus) {
        this.ClientStatus = ClientStatus;
    }

    public String getSalesmanCode() {
        return SalesmanCode;
    }

    public void setSalesmanCode(String SalesmanCode) {
        this.SalesmanCode = SalesmanCode;
    }

    public String getReserverdField2() {
        return ReserverdField2;
    }

    public void setReserverdField2(String ReserverdField2) {
        this.ReserverdField2 = ReserverdField2;
    }

    public String getReserverdField3() {
        return ReserverdField3;
    }

    public void setReserverdField3(String ReserverdField3) {
        this.ReserverdField3 = ReserverdField3;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.ClientCode);
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
        final TblClientId other = (TblClientId) obj;
        if (!Objects.equals(this.ClientCode, other.ClientCode)) {
            return false;
        }
        return true;
    }
 
    
    
}
