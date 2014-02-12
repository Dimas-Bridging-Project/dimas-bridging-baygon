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
@Table(name="tbl_so_id")
public class TblSoId implements Serializable {
    @EmbeddedId 
    protected TblSoIdPK tblSoIdPK;
    
    @Column(name="record_type", length=12)
    private String RecordType;
    @Column(name="distributor_code", length=10)
    private String DistributorCode;
    
    @Column(name="tanggal")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tanggal;
    @Column(name="scj_product_code", length=20)
    private String ScjProductCode;
    @Column(name="product_description", length=100)
    private String ProductDescription;
    @Column(name="salesman_code", length=20)
    private String SalesmanCode;
    @Column(name="salesman_name", length=50)
    private String SalesmanName;
    @Column(name="warehouse_code", length=20)
    private String WarehouseCode;
    @Column(name="warehouse_name", length=50)
    private String WarehouseName;
    @Column(name="outlet_type_code", length=20)
    private String OutletTypeCode;
    @Column(name="outlet_type_desc", length=50)
    private String OutletTypeDesc;
    @Column(name="client_code", length=20)
    private String ClientCode;
    @Column(name="client_name", length=70)
    private String ClientName;
    @Column(name="city", length=50)
    private String City;
    @Column(name="delivery_address", length=70)
    private String DeliveryAddress;
    @Column(name="qty")
    private Integer Qty;
    @Column(name="net_value")
    private Double NetValue;
    @Column(name="gross_value")
    private Double GrossValue;
    @Column(name="fraction")
    private Integer Fraction;
    @Column(name="ean_code", length=20)
    private String EanCode;
    @Column(name="zip_code", length=10)
    private String ZipCode;
    @Column(name="order_number", length=50)
    private String OrderNumber;
    @Column(name="reserved_field1", length=100)
    private String ReserverdField1;

    public TblSoIdPK getTblSoIdPK() {
        return tblSoIdPK;
    }

    public void setTblSoIdPK(TblSoIdPK tblSoIdPK) {
        this.tblSoIdPK = tblSoIdPK;
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

    public String getProductDescription() {
        return ProductDescription;
    }

    public void setProductDescription(String ProductDescription) {
        this.ProductDescription = ProductDescription;
    }

    public String getSalesmanCode() {
        return SalesmanCode;
    }

    public void setSalesmanCode(String SalesmanCode) {
        this.SalesmanCode = SalesmanCode;
    }

    public String getSalesmanName() {
        return SalesmanName;
    }

    public void setSalesmanName(String SalesmanName) {
        this.SalesmanName = SalesmanName;
    }

    public String getWarehouseCode() {
        return WarehouseCode;
    }

    public void setWarehouseCode(String WarehouseCode) {
        this.WarehouseCode = WarehouseCode;
    }

    public String getWarehouseName() {
        return WarehouseName;
    }

    public void setWarehouseName(String WarehouseName) {
        this.WarehouseName = WarehouseName;
    }

    public String getOutletTypeCode() {
        return OutletTypeCode;
    }

    public void setOutletTypeCode(String OutletTypeCode) {
        this.OutletTypeCode = OutletTypeCode;
    }

    public String getOutletTypeDesc() {
        return OutletTypeDesc;
    }

    public void setOutletTypeDesc(String OutletTypeDesc) {
        this.OutletTypeDesc = OutletTypeDesc;
    }

    public String getClientCode() {
        return ClientCode;
    }

    public void setClientCode(String ClientCode) {
        this.ClientCode = ClientCode;
    }

    public String getClientName() {
        return ClientName;
    }

    public void setClientName(String ClientName) {
        this.ClientName = ClientName;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getDeliveryAddress() {
        return DeliveryAddress;
    }

    public void setDeliveryAddress(String DeliveryAddress) {
        this.DeliveryAddress = DeliveryAddress;
    }

    public Integer getQty() {
        return Qty;
    }

    public void setQty(Integer Qty) {
        this.Qty = Qty;
    }

    public Double getNetValue() {
        return NetValue;
    }

    public void setNetValue(Double NetValue) {
        this.NetValue = NetValue;
    }

    public Double getGrossValue() {
        return GrossValue;
    }

    public void setGrossValue(Double GrossValue) {
        this.GrossValue = GrossValue;
    }

    public Integer getFraction() {
        return Fraction;
    }

    public void setFraction(Integer Fraction) {
        this.Fraction = Fraction;
    }

    public String getEanCode() {
        return EanCode;
    }

    public void setEanCode(String EanCode) {
        this.EanCode = EanCode;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String ZipCode) {
        this.ZipCode = ZipCode;
    }

    public String getOrderNumber() {
        return OrderNumber;
    }

    public void setOrderNumber(String OrderNumber) {
        this.OrderNumber = OrderNumber;
    }

    public String getReserverdField1() {
        return ReserverdField1;
    }

    public void setReserverdField1(String ReserverdField1) {
        this.ReserverdField1 = ReserverdField1;
    }

  
    
}
