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
@Table(name="jtprb")
public class JTprb implements Serializable {
    @EmbeddedId
    protected JTprbPK jtprbPK;
    
    @Column(name="qty_in_fib", length = 17)
    private String QtyInFib;
    @Column(name="qty_in_sat")
    private Integer QtyInSat;
    @Column(name="hrg_jual_karton_no_ppn")
    private Integer HrgJualKartonNoPpn;
    @Column(name="hrg_jual_lsn_no_ppn")
    private Integer HrgJualLsnNoPpn;
    @Column(name="harga_no_ppn")
    private Integer HargaNoPpn;
    @Column(name="jenis")
    private String Jenis;
    @Column(name="tipe_faktur_retur")
    private String TipeFakturRetur;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "pcode", referencedColumnName = "pcode", insertable = false, updatable = false)
    private Produk produk;

//    @ManyToOne(optional = false)
//    @JoinColumn(name = "id_order", referencedColumnName = "id_order", insertable = false, updatable = false)
//    private JHeader jheader;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_order", referencedColumnName = "id_order", insertable = false, updatable = false)
    private JHeader jheader;
    
    public Produk getProduk() {
        return produk;
    }

    public void setProduk(Produk produk) {
        this.produk = produk;
    }

    public JHeader getJheader() {
        return jheader;
    }

    public void setJheader(JHeader jheader) {
        this.jheader = jheader;
    }
    
    public JTprbPK getJtprbPK() {
        return jtprbPK;
    }

    public void setJtprbPK(JTprbPK jtprbPK) {
        this.jtprbPK = jtprbPK;
    }

    public String getQtyInFib() {
        return QtyInFib;
    }

    public void setQtyInFib(String QtyInFib) {
        this.QtyInFib = QtyInFib;
    }


    public Integer getQtyInSat() {
        return QtyInSat;
    }

    public void setQtyInSat(Integer QtyInSat) {
        this.QtyInSat = QtyInSat;
    }

    public Integer getHrgJualKartonNoPpn() {
        return HrgJualKartonNoPpn;
    }

    public void setHrgJualKartonNoPpn(Integer HrgJualKartonNoPpn) {
        this.HrgJualKartonNoPpn = HrgJualKartonNoPpn;
    }

    public Integer getHrgJualLsnNoPpn() {
        return HrgJualLsnNoPpn;
    }

    public void setHrgJualLsnNoPpn(Integer HrgJualLsnNoPpn) {
        this.HrgJualLsnNoPpn = HrgJualLsnNoPpn;
    }

    public Integer getHargaNoPpn() {
        return HargaNoPpn;
    }

    public void setHargaNoPpn(Integer HargaNoPpn) {
        this.HargaNoPpn = HargaNoPpn;
    }

    public String getJenis() {
        return Jenis;
    }

    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }

    public String getTipeFakturRetur() {
        return TipeFakturRetur;
    }

    public void setTipeFakturRetur(String TipeFakturRetur) {
        this.TipeFakturRetur = TipeFakturRetur;
    }

    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.jtprbPK);
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
        final JTprb other = (JTprb) obj;
        if (!Objects.equals(this.jtprbPK, other.jtprbPK)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JTprb{" + "jtprbPK=" + jtprbPK + '}';
    }



  
    
}
