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
@Table(name="tbl_stock_id")
public class TblStockId implements Serializable {
    @Id
    @Basic(optional=false)
    @Column(name="distributor_product_code", length=20, nullable=false)
    private String DistributorProductCode;
    @Column(name="record_type", length=12)
    private String RecordType;
    @Column(name="distributor_code", length=10)
    private String DistributorCode;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="tanggal")
    private Date tanggal ;
    @Column(name="scj_product_code", length=20)
    private String ScjProductCode;
    @Column(name="qty")
    private Integer Qty;
    @Column(name="warehouse_code", length=20)
    private String WareHouseCode;
    @Column(name="fraction", length=12)
    private String Fraction;
    @Column(name="ean_code", length=20)
    private String EanCode;
    @Column(name="sales_qty")
    private Integer SalesQty;
    @Column(name="ex_do")
    private Integer ExDo;
    @Column(name="bonus_sample")
    private Integer BonusSample;
    @Column(name="others")
    private Integer Others;
    @Column(name="reserved_field", length=20)
    private String ReserverdField;

    public String getDistributorProductCode() {
        return DistributorProductCode;
    }

    public void setDistributorProductCode(String DistributorProductCode) {
        this.DistributorProductCode = DistributorProductCode;
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

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public String getScjProductCode() {
        return ScjProductCode;
    }

    public void setScjProductCode(String ScjProductCode) {
        this.ScjProductCode = ScjProductCode;
    }

    public Integer getQty() {
        return Qty;
    }

    public void setQty(Integer Qty) {
        this.Qty = Qty;
    }

    public String getWareHouseCode() {
        return WareHouseCode;
    }

    public void setWareHouseCode(String WareHouseCode) {
        this.WareHouseCode = WareHouseCode;
    }

    public String getFraction() {
        return Fraction;
    }

    public void setFraction(String Fraction) {
        this.Fraction = Fraction;
    }

    public String getEanCode() {
        return EanCode;
    }

    public void setEanCode(String EanCode) {
        this.EanCode = EanCode;
    }

    public Integer getSalesQty() {
        return SalesQty;
    }

    public void setSalesQty(Integer SalesQty) {
        this.SalesQty = SalesQty;
    }

    public Integer getExDo() {
        return ExDo;
    }

    public void setExDo(Integer ExDo) {
        this.ExDo = ExDo;
    }

    public Integer getBonusSample() {
        return BonusSample;
    }

    public void setBonusSample(Integer BonusSample) {
        this.BonusSample = BonusSample;
    }

    public Integer getOthers() {
        return Others;
    }

    public void setOthers(Integer Others) {
        this.Others = Others;
    }

    public String getReserverdField() {
        return ReserverdField;
    }

    public void setReserverdField(String ReserverdField) {
        this.ReserverdField = ReserverdField;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.DistributorProductCode);
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
        final TblStockId other = (TblStockId) obj;
        if (!Objects.equals(this.DistributorProductCode, other.DistributorProductCode)) {
            return false;
        }
        return true;
    }
    
    
    
}
