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
@Table(name="jtpru")
public class JTpru implements Serializable {
    @EmbeddedId
    protected JTpruPK jtpruPK;
    
    @Column(name="harga_no_ppn")
    private Integer HargaNoPpn;
    @Column(name="tipe")
    private String Tipe;

    @ManyToOne(optional = false)
    @JoinColumn(name = "pcode", referencedColumnName = "pcode", insertable = false, updatable = false)
    private Produk produk;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_order", referencedColumnName = "id_order", insertable = false, updatable = false)
    private JHeader jheader;

    public JHeader getJheader() {
        return jheader;
    }

    public void setJheader(JHeader jheader) {
        this.jheader = jheader;
    }

    
    public Produk getProduk() {
        return produk;
    }

    public void setProduk(Produk produk) {
        this.produk = produk;
    }
    
    
    public JTpruPK getJtpruPK() {
        return jtpruPK;
    }

    public void setJtpruPK(JTpruPK jtpruPK) {
        this.jtpruPK = jtpruPK;
    }

    public Integer getHargaNoPpn() {
        return HargaNoPpn;
    }

    public void setHargaNoPpn(Integer HargaNoPpn) {
        this.HargaNoPpn = HargaNoPpn;
    }

    public String getTipe() {
        return Tipe;
    }

    public void setTipe(String Tipe) {
        this.Tipe = Tipe;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.jtpruPK);
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
        final JTpru other = (JTpru) obj;
        if (!Objects.equals(this.jtpruPK, other.jtpruPK)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JTpru{" + "jtpruPK=" + jtpruPK + '}';
    }

 
  
    
}
