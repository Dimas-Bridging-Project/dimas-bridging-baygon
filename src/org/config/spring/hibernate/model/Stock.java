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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author yhawin
 */
@Entity
@Table(name = "stock")
public class Stock implements Serializable {
 private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected StockPK stockPK;

    @Column(name="nama_barang", length=31)
    private String NamaBarang;    
    
/*    
    @Column(name="isi_per_lsn", length=7)
    private String IsiPerLsn;
    @Column(name="total_stock", length=14)
    private String TotalStock;
    @Column(name="on_cust_order", length=14)
    private String OnCustOrder;
    @Column(name="harga_beli", length=18)
    private String HargaBeli;
    @Column(name="harga_jual", length=15)
    private String HargaJual;
    @Column(name="ppn_bm_beli", length=15)
    private String PpnBmBeli;
    @Column(name="rpp_13", length=11)
    private String Rpp13;
    @Column(name="wk_cover", length=9)
    private String WkCover;
*/    
    @Column(name="isi_per_lsn", length=7)
    private String IsiPerLsn;
    @Column(name="total_stock", length=14)
    private String TotalStock;
    @Column(name="on_cust_order", length=14)
    private String OnCustOrder;
    @Column(name="harga_beli")
    private Integer HargaBeli;
    @Column(name="harga_jual")
    private Integer HargaJual;
    @Column(name="ppn_bm_beli")
    private Integer PpnBmBeli;
    @Column(name="rpp_13")
    private Double Rpp13;
    @Column(name="wk_cover")
    private Double WkCover;

    @Column(name="convfact1")
    private Integer Convfact1;
    @Column(name="convfact2")
    private Integer Convfact2;
    @Column(name="total_stock_in_pcs")
    private Integer TotalStockInPcs;

    @Column(name = "week_stock")
    private int Week;

    
    @ManyToOne(optional = false)
    @JoinColumn(name = "pcode", referencedColumnName = "pcode", insertable = false, updatable = false)
    private Produk produk;

    public Produk getProduk() {
        return produk;
    }

    public void setProduk(Produk produk) {
        this.produk = produk;
    }
   
    
    
    public StockPK getStockPK() {
        return stockPK;
    }

    public void setStockPK(StockPK stockPK) {
        this.stockPK = stockPK;
    }

    public int getWeek() {
        return Week;
    }

    public void setWeek(int Week) {
        this.Week = Week;
    }


    public String getNamaBarang() {
        return NamaBarang;
    }

    public void setNamaBarang(String NamaBarang) {
        this.NamaBarang = NamaBarang;
    }

    public String getIsiPerLsn() {
        return IsiPerLsn;
    }

    public void setIsiPerLsn(String IsiPerLsn) {
        this.IsiPerLsn = IsiPerLsn;
    }

    public String getTotalStock() {
        return TotalStock;
    }

    public void setTotalStock(String TotalStock) {
        this.TotalStock = TotalStock;
    }

    public String getOnCustOrder() {
        return OnCustOrder;
    }

    public void setOnCustOrder(String OnCustOrder) {
        this.OnCustOrder = OnCustOrder;
    }

    public Integer getHargaBeli() {
        return HargaBeli;
    }

    public void setHargaBeli(Integer HargaBeli) {
        this.HargaBeli = HargaBeli;
    }

    public Integer getHargaJual() {
        return HargaJual;
    }

    public void setHargaJual(Integer HargaJual) {
        this.HargaJual = HargaJual;
    }

    public Integer getPpnBmBeli() {
        return PpnBmBeli;
    }

    public void setPpnBmBeli(Integer PpnBmBeli) {
        this.PpnBmBeli = PpnBmBeli;
    }

    public Double getRpp13() {
        return Rpp13;
    }

    public void setRpp13(Double Rpp13) {
        this.Rpp13 = Rpp13;
    }

    public Double getWkCover() {
        return WkCover;
    }

    public void setWkCover(Double WkCover) {
        this.WkCover = WkCover;
    }

    public Integer getConvfact1() {
        return Convfact1;
    }

    public void setConvfact1(Integer Convfact1) {
        this.Convfact1 = Convfact1;
    }

    public Integer getConvfact2() {
        return Convfact2;
    }

    public void setConvfact2(Integer Convfact2) {
        this.Convfact2 = Convfact2;
    }

    public Integer getTotalStockInPcs() {
        return TotalStockInPcs;
    }

    public void setTotalStockInPcs(Integer TotalStockInPcs) {
        this.TotalStockInPcs = TotalStockInPcs;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.stockPK);
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
        final Stock other = (Stock) obj;
        if (!Objects.equals(this.stockPK, other.stockPK)) {
            return false;
        }
        return true;
    }

    
    
    
    
}
