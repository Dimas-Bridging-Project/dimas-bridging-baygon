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
@Table(name="produk")
public class Produk implements Serializable {
    @Id
    @Basic(optional=false)
    @Column(name="pcode", length=6, nullable=false)
    private String Pcode;

    @Basic(optional=false)
    @Column(name="nama_brg", length=30, nullable = false)
    private String NamaBrg;
    
    @Column(name="dv", length=2)
    private String dv ;
    @Column(name="kt", length=4)
    private String Kt;
    @Column(name="br", length=4)
    private String Br;
    @Column(name="variant", length=10)
    private String Variant;
    @Column(name="ukuran", length=10)
    private String Ukuran;
    @Column(name="jatah", length=1)
    private String Jatah;
    @Column(name="nm_lap1", length=6)
    private String NmLap1;
    @Column(name="nm_lap2", length=6)
    private String NmLap2;
    @Column(name="lns", length=3)
    private String Lns;
    @Column(name="pk", length=2)
    private String Pk;
    @Column(name="aktif", length=1)
    private String Aktif;
    @Column(name="main", length=1)
    private String Main;
    @Column(name="brt_krt", length=9)
    private String BrtKrt;
    
    @Column(name="lst_sat", length=7)
    private String LstSat;
    
    @Column(name="beli_krt")
    private Integer BeliKrt ;
    @Column(name="jual_krt")
    private Integer JualKrt;
    @Column(name="jual_lsn")
    private Integer JualLsn;
    @Column(name="jual_pcs")
    private Integer JualPcs;
    @Column(name="bm_beli")
    private Integer BmBeli;
    @Column(name="bm_jual")
    private String BmJual;
    @Column(name="user_def1", length=30)
    private String UserDef1;
    @Column(name="user_def2", length=30)
    private String UserDef2;
    @Column(name="t_def1", length=5)
    private String TDef1;
    @Column(name="t_def2", length=5)
    private String TDef2;
    @Column(name="t_def3", length=5)
    private String TDef3;
    @Column(name="t_def4", length=5)
    private String TDef4;
    @Column(name="t_def5", length=5)
    private String TDef5;
    @Column(name="panjang", length=5)
    private String Panjang;
    @Column(name="lebar", length=5)
    private String Lebar;
    @Column(name="tinggi", length=5)
    private String Tinggi;
    
    //Tambahan
    @Column(name="conv_fact1")
    private Integer ConvFact1;
    @Column(name="conv_fact2")
    private Integer ConvFact2;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "produk")
    @Fetch(FetchMode.JOIN)
    private Set<JPcode> jpcodeSet;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "produk")
    @Fetch(FetchMode.JOIN)
    private Set<JTprb> jtprbSet;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "produk")
    @Fetch(FetchMode.JOIN)
    private Set<JTpru> jtpruSet;
            
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "produk")
    @Fetch(FetchMode.JOIN)
    private Set<Stock> stock;

    public Set<Stock> getStock() {
        return stock;
    }

    public void setStock(Set<Stock> stock) {
        this.stock = stock;
    }
    
    
    public Set<JPcode> getJpcodeSet() {
        return jpcodeSet;
    }

    public void setJpcodeSet(Set<JPcode> jpcodeSet) {
        this.jpcodeSet = jpcodeSet;
    }

//    public Set<JTprb> getJtprbSet() {
//        return jtprbSet;
//    }
//
//    public void setJtprbSet(Set<JTprb> jtprbSet) {
//        this.jtprbSet = jtprbSet;
//    }

    public Set<JTpru> getJtpruSet() {
        return jtpruSet;
    }

    public void setJtpruSet(Set<JTpru> jtpruSet) {
        this.jtpruSet = jtpruSet;
    }
    
             
    public String getPcode() {
        return Pcode;
    }

    public void setPcode(String Pcode) {
        this.Pcode = Pcode;
    }

    public String getNamaBrg() {
        return NamaBrg;
    }

    public void setNamaBrg(String NamaBrg) {
        this.NamaBrg = NamaBrg;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public String getKt() {
        return Kt;
    }

    public void setKt(String Kt) {
        this.Kt = Kt;
    }

    public String getBr() {
        return Br;
    }

    public void setBr(String Br) {
        this.Br = Br;
    }

    public String getVariant() {
        return Variant;
    }

    public void setVariant(String Variant) {
        this.Variant = Variant;
    }

    public String getUkuran() {
        return Ukuran;
    }

    public void setUkuran(String Ukuran) {
        this.Ukuran = Ukuran;
    }

    public String getJatah() {
        return Jatah;
    }

    public void setJatah(String Jatah) {
        this.Jatah = Jatah;
    }

    public String getNmLap1() {
        return NmLap1;
    }

    public void setNmLap1(String NmLap1) {
        this.NmLap1 = NmLap1;
    }

    public String getNmLap2() {
        return NmLap2;
    }

    public void setNmLap2(String NmLap2) {
        this.NmLap2 = NmLap2;
    }

    public String getLns() {
        return Lns;
    }

    public void setLns(String Lns) {
        this.Lns = Lns;
    }

    public String getPk() {
        return Pk;
    }

    public void setPk(String Pk) {
        this.Pk = Pk;
    }

    public String getAktif() {
        return Aktif;
    }

    public void setAktif(String Aktif) {
        this.Aktif = Aktif;
    }

    public String getMain() {
        return Main;
    }

    public void setMain(String Main) {
        this.Main = Main;
    }

    public String getBrtKrt() {
        return BrtKrt;
    }

    public void setBrtKrt(String BrtKrt) {
        this.BrtKrt = BrtKrt;
    }

    public String getLstSat() {
        return LstSat;
    }

    public void setLstSat(String LstSat) {
        this.LstSat = LstSat;
    }

    public Integer getBeliKrt() {
        return BeliKrt;
    }

    public void setBeliKrt(Integer BeliKrt) {
        this.BeliKrt = BeliKrt;
    }

    public Integer getJualKrt() {
        return JualKrt;
    }

    public void setJualKrt(Integer JualKrt) {
        this.JualKrt = JualKrt;
    }

    public Integer getJualLsn() {
        return JualLsn;
    }

    public void setJualLsn(Integer JualLsn) {
        this.JualLsn = JualLsn;
    }

    public Integer getJualPcs() {
        return JualPcs;
    }

    public void setJualPcs(Integer JualPcs) {
        this.JualPcs = JualPcs;
    }

    public Integer getBmBeli() {
        return BmBeli;
    }

    public void setBmBeli(Integer BmBeli) {
        this.BmBeli = BmBeli;
    }

    public String getBmJual() {
        return BmJual;
    }

    public void setBmJual(String BmJual) {
        this.BmJual = BmJual;
    }

    public String getUserDef1() {
        return UserDef1;
    }

    public void setUserDef1(String UserDef1) {
        this.UserDef1 = UserDef1;
    }

    public String getUserDef2() {
        return UserDef2;
    }

    public void setUserDef2(String UserDef2) {
        this.UserDef2 = UserDef2;
    }

    public String getTDef1() {
        return TDef1;
    }

    public void setTDef1(String TDef1) {
        this.TDef1 = TDef1;
    }

    public String getTDef2() {
        return TDef2;
    }

    public void setTDef2(String TDef2) {
        this.TDef2 = TDef2;
    }

    public String getTDef3() {
        return TDef3;
    }

    public void setTDef3(String TDef3) {
        this.TDef3 = TDef3;
    }

    public String getTDef4() {
        return TDef4;
    }

    public void setTDef4(String TDef4) {
        this.TDef4 = TDef4;
    }

    public String getTDef5() {
        return TDef5;
    }

    public void setTDef5(String TDef5) {
        this.TDef5 = TDef5;
    }

    public String getPanjang() {
        return Panjang;
    }

    public void setPanjang(String Panjang) {
        this.Panjang = Panjang;
    }

    public String getLebar() {
        return Lebar;
    }

    public void setLebar(String Lebar) {
        this.Lebar = Lebar;
    }

    public String getTinggi() {
        return Tinggi;
    }

    public void setTinggi(String Tinggi) {
        this.Tinggi = Tinggi;
    }

    public Integer getConvFact1() {
        return ConvFact1;
    }

    public void setConvFact1(Integer ConvFact1) {
        this.ConvFact1 = ConvFact1;
    }

    public Integer getConvFact2() {
        return ConvFact2;
    }

    public void setConvFact2(Integer ConvFact2) {
        this.ConvFact2 = ConvFact2;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.Pcode);
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
        final Produk other = (Produk) obj;
        if (!Objects.equals(this.Pcode, other.Pcode)) {
            return false;
        }
        return true;
    }
  
  
    
}
