/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.config.spring.hibernate.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;
import javax.persistence.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 *
 * @author yhawin
 */
@Entity
@Table(name="outlet")
public class Outlet implements Serializable {
    @Id
    @Basic(optional=true)
    @Column(name="outlet", length=6, nullable=false)
    private String Outlet;
    @Column(name="nama", length=30)
    private String Nama;
    @Column(name="alm1_toko", length=25)
    private String Alm1Toko;
    @Column(name="alm2_toko", length=25)
    private String Alm2Toko;
    @Column(name="kota_toko", length=20)
    private String KotaToko;
    @Column(name="contact_pr", length=25)
    private String ContactPr;
    @Column(name="tlp_toko", length=20)
    private String TlpToko;
    @Column(name="no_fax", length=20)
    private String NoFax;
    @Column(name="alm1_rmh", length=25)
    private String Alm1Rmh;
    @Column(name="alm2_rmh", length=25)
    private String Alm2Rmh;
    @Column(name="kota_rmh", length=20)
    private String KotaRmh;
    @Column(name="trm", length=2)
    private String Trm;
    @Column(name="limit_k")
    private Integer LimitK;
    @Column(name="lmt_flg", length=1)
    private String LmtFlg;
    @Column(name="pay_flg", length=1)
    private String PayFlg;
    @Column(name="ps", length=2)
    private String Ps;
    @Column(name="ds", length=2)
    private String Ds;
    @Column(name="ty", length=2)
    private String Ty;
    @Column(name="grp", length=3)
    private String Grp;
    @Column(name="vd", length=2)
    private String Vd;
    @Column(name="pk", length=2)
    private String Pk;
    
    @Column(name="fl_pjk", length=1)
    private String FlPjk;
    @Column(name="user_def1", length=30)
    private String UserDef1;
    @Column(name="user_def2", length=30)
    private String UserDef2;
    @Column(name="m", length=1)
    private String M;
    @Column(name="flag_kab", length=1)
    private String FlagKab;
    
   
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "outlet2")
    @Fetch(FetchMode.JOIN)
    private Set<CvOutlet> cvOutletSet;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "outlet2")
    @Fetch(FetchMode.JOIN)
    private Set<JHeader> jheaderSet;

    public Set<JHeader> getJheaderSet() {
        return jheaderSet;
    }

    public void setJheaderSet(Set<JHeader> jheaderSet) {
        this.jheaderSet = jheaderSet;
    }
    
    public Set<CvOutlet> getCvOutletSet() {
        return cvOutletSet;
    }

    public void setCvOutletSet(Set<CvOutlet> cvOutletSet) {
        this.cvOutletSet = cvOutletSet;
    }
    
    
    
    
    

    
    
    public String getOutlet() {
        return Outlet;
    }

    public void setOutlet(String Outlet) {
        this.Outlet = Outlet;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getAlm1Toko() {
        return Alm1Toko;
    }

    public void setAlm1Toko(String Alm1Toko) {
        this.Alm1Toko = Alm1Toko;
    }

    public String getAlm2Toko() {
        return Alm2Toko;
    }

    public void setAlm2Toko(String Alm2Toko) {
        this.Alm2Toko = Alm2Toko;
    }

    public String getKotaToko() {
        return KotaToko;
    }

    public void setKotaToko(String KotaToko) {
        this.KotaToko = KotaToko;
    }

    public String getContactPr() {
        return ContactPr;
    }

    public void setContactPr(String ContactPr) {
        this.ContactPr = ContactPr;
    }

    public String getTlpToko() {
        return TlpToko;
    }

    public void setTlpToko(String TlpToko) {
        this.TlpToko = TlpToko;
    }

    public String getNoFax() {
        return NoFax;
    }

    public void setNoFax(String NoFax) {
        this.NoFax = NoFax;
    }

    public String getAlm1Rmh() {
        return Alm1Rmh;
    }

    public void setAlm1Rmh(String Alm1Rmh) {
        this.Alm1Rmh = Alm1Rmh;
    }

    public String getAlm2Rmh() {
        return Alm2Rmh;
    }

    public void setAlm2Rmh(String Alm2Rmh) {
        this.Alm2Rmh = Alm2Rmh;
    }

    public String getKotaRmh() {
        return KotaRmh;
    }

    public void setKotaRmh(String KotaRmh) {
        this.KotaRmh = KotaRmh;
    }

    public String getTrm() {
        return Trm;
    }

    public void setTrm(String Trm) {
        this.Trm = Trm;
    }

    public Integer getLimitK() {
        return LimitK;
    }

    public void setLimitK(Integer LimitK) {
        this.LimitK = LimitK;
    }

    public String getLmtFlg() {
        return LmtFlg;
    }

    public void setLmtFlg(String LmtFlg) {
        this.LmtFlg = LmtFlg;
    }

    public String getPayFlg() {
        return PayFlg;
    }

    public void setPayFlg(String PayFlg) {
        this.PayFlg = PayFlg;
    }

    public String getPs() {
        return Ps;
    }

    public void setPs(String Ps) {
        this.Ps = Ps;
    }

    public String getDs() {
        return Ds;
    }

    public void setDs(String Ds) {
        this.Ds = Ds;
    }

    public String getTy() {
        return Ty;
    }

    public void setTy(String Ty) {
        this.Ty = Ty;
    }

    public String getGrp() {
        return Grp;
    }

    public void setGrp(String Grp) {
        this.Grp = Grp;
    }

    public String getVd() {
        return Vd;
    }

    public void setVd(String Vd) {
        this.Vd = Vd;
    }

    public String getPk() {
        return Pk;
    }

    public void setPk(String Pk) {
        this.Pk = Pk;
    }

    public String getFlPjk() {
        return FlPjk;
    }

    public void setFlPjk(String FlPjk) {
        this.FlPjk = FlPjk;
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

    public String getM() {
        return M;
    }

    public void setM(String M) {
        this.M = M;
    }

    public String getFlagKab() {
        return FlagKab;
    }

    public void setFlagKab(String FlagKab) {
        this.FlagKab = FlagKab;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.Outlet);
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
        final Outlet other = (Outlet) obj;
        if (!Objects.equals(this.Outlet, other.Outlet)) {
            return false;
        }
        return true;
    }

 
    
    
}
