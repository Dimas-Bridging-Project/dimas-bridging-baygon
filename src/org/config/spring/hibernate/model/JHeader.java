/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.hibernate.model;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import java.util.Objects;
import java.util.Set;
import javax.persistence.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 *
 * @author yhawin
 */
@Entity
@Table(name="jheader")
public class JHeader implements Serializable {
 private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional=false)
    @Column(name="id_order", nullable=false)
    private String IdOrder;

    @Column(name="salesman")
    private String Salesman;
    
    @Column(name="tanggal")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date Tanggal;
    
    @Column(name="outlet")
    private String Outlet;
    @Column(name="gross")
    private Integer Gross ;
    @Column(name="promo_brg")
    private Integer PromoBrg ;
    @Column(name="promo_uang")
    private Integer PromoUang;
    @Column(name="ppn")
    private Integer Ppn;
    @Column(name="net_ppn")
    private Integer NetPpn;
    @Column(name="kredit")
    private Integer Kredit;
    @Column(name="terbayar")
    private Integer Terbayar;
    @Column(name="saldo")
    private Integer Saldo;
    @Column(name="no_faktur_retur")
    private String NoFakturRetur;
    @Column(name="disc_atas_faktur")
    private Integer DisAtasFaktur;
    @Column(name="tipe_bayar")
    private String TipeBayar;
    
    @Column(name="transdate2")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date trans_date2;
    
    @Column(name="sales_id2")
    private String SalesId2;
    @Column(name="npwp")
    private String Npwp;
    @Column(name="ter_retur")
    private Integer TerRetur;
    @Column(name="type_outlet")
    private String TypeOutlet;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "jheader")
    @Fetch(FetchMode.JOIN)
    private Set<JPcode> jpcodeSet;
  
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "jheader")
    @Fetch(FetchMode.JOIN)
    private Set<JTprb> jtprbSet;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "jheader")
    @Fetch(FetchMode.JOIN)
    private Set<JTpru> jtpruSet;

    @ManyToOne(optional = false)
    @JoinColumn(name = "outlet", referencedColumnName = "outlet", updatable = false, insertable = false)
    private Outlet outlet2;

    @ManyToOne(optional = false)
    @JoinColumn(name = "salesman", referencedColumnName = "salesman", updatable = false, insertable = false)
    private Salesman salesman2;
    
    @ManyToOne(optional = true)
    @JoinColumn(name = "type_outlet", referencedColumnName = "id_tipe_outlet_scy", updatable = false, insertable = false)
    private MapTipeOutlet mapTipeOutlet;

    public MapTipeOutlet getMapTipeOutlet() {
        return mapTipeOutlet;
    }

    public void setMapTipeOutlet(MapTipeOutlet mapTipeOutlet) {
        this.mapTipeOutlet = mapTipeOutlet;
    }
    
    public Salesman getSalesman2() {
        return salesman2;
    }

    public void setSalesman2(Salesman salesman2) {
        this.salesman2 = salesman2;
    }

    public Set<JTprb> getJtprbSet() {
        return jtprbSet;
    }

    public void setJtprbSet(Set<JTprb> jtprbSet) {
        this.jtprbSet = jtprbSet;
    }
    
    public Outlet getOutlet2() {
        return outlet2;
    }

    public void setOutlet2(Outlet outlet2) {
        this.outlet2 = outlet2;
    }
    
    
    public Set<JPcode> getJpcodeSet() {
        return jpcodeSet;
    }

    public void setJpcodeSet(Set<JPcode> jpcodeSet) {
        this.jpcodeSet = jpcodeSet;
    }


    public Set<JTpru> getJtpruSet() {
        return jtpruSet;
    }

    public void setJtpruSet(Set<JTpru> jtpruSet) {
        this.jtpruSet = jtpruSet;
    }
    
    
    public String getIdOrder() {
        return IdOrder;
    }

    public void setIdOrder(String IdOrder) {
        this.IdOrder = IdOrder;
    }

    public String getSalesman() {
        return Salesman;
    }

    public void setSalesman(String Salesman) {
        this.Salesman = Salesman;
    }

    public Date getTanggal() {
        return Tanggal;
    }

    public void setTanggal(Date Tanggal) {
        this.Tanggal = Tanggal;
    }



    public String getOutlet() {
        return Outlet;
    }

    public void setOutlet(String Outlet) {
        this.Outlet = Outlet;
    }

    public Integer getGross() {
        return Gross;
    }

    public void setGross(Integer Gross) {
        this.Gross = Gross;
    }

    public Integer getPromoBrg() {
        return PromoBrg;
    }

    public void setPromoBrg(Integer PromoBrg) {
        this.PromoBrg = PromoBrg;
    }

    public Integer getPromoUang() {
        return PromoUang;
    }

    public void setPromoUang(Integer PromoUang) {
        this.PromoUang = PromoUang;
    }

    public Integer getPpn() {
        return Ppn;
    }

    public void setPpn(Integer Ppn) {
        this.Ppn = Ppn;
    }

    public Integer getNetPpn() {
        return NetPpn;
    }

    public void setNetPpn(Integer NetPpn) {
        this.NetPpn = NetPpn;
    }

    public Integer getKredit() {
        return Kredit;
    }

    public void setKredit(Integer Kredit) {
        this.Kredit = Kredit;
    }

    public Integer getTerbayar() {
        return Terbayar;
    }

    public void setTerbayar(Integer Terbayar) {
        this.Terbayar = Terbayar;
    }

    public Integer getSaldo() {
        return Saldo;
    }

    public void setSaldo(Integer Saldo) {
        this.Saldo = Saldo;
    }

    public String getNoFakturRetur() {
        return NoFakturRetur;
    }

    public void setNoFakturRetur(String NoFakturRetur) {
        this.NoFakturRetur = NoFakturRetur;
    }

    public Integer getDisAtasFaktur() {
        return DisAtasFaktur;
    }

    public void setDisAtasFaktur(Integer DisAtasFaktur) {
        this.DisAtasFaktur = DisAtasFaktur;
    }


    public String getTipeBayar() {
        return TipeBayar;
    }

    public void setTipeBayar(String TipeBayar) {
        this.TipeBayar = TipeBayar;
    }

    public Date getTrans_date2() {
        return trans_date2;
    }

    public void setTrans_date2(Date trans_date2) {
        this.trans_date2 = trans_date2;
    }

    public String getSalesId2() {
        return SalesId2;
    }

    public void setSalesId2(String SalesId2) {
        this.SalesId2 = SalesId2;
    }

    public String getNpwp() {
        return Npwp;
    }

    public void setNpwp(String Npwp) {
        this.Npwp = Npwp;
    }

    public Integer getTerRetur() {
        return TerRetur;
    }

    public void setTerRetur(Integer TerRetur) {
        this.TerRetur = TerRetur;
    }

    public String getTypeOutlet() {
        return TypeOutlet;
    }

    public void setTypeOutlet(String TypeOutlet) {
        this.TypeOutlet = TypeOutlet;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.IdOrder);
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
        final JHeader other = (JHeader) obj;
        if (!Objects.equals(this.IdOrder, other.IdOrder)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JHeader{" + "IdOrder=" + IdOrder + ", Salesman=" + Salesman + ", Outlet=" + Outlet + '}';
    }
  
    
}
