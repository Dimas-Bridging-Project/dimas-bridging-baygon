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
@Table(name="salesman")
public class Salesman implements Serializable {
    @Id
    @Basic(optional=false)
    @Column(name="salesman", length=3, nullable=false)
    private String salesman;
    @Column(name="nama_sls", length=20)
    private String namaSls;
    @Column(name="alamat1", length=25)
    private String Alamat1;
    @Column(name="alamat2", length=25)
    private String Alamat2;    
    @Column(name="kota", length=20)
    private String Kota;
    @Column(name="pddk", length=10)
    private String Pddk;
    @Column(name="tgl_lahir")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date TglLahir;
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="tgl_masuk")
    private Date TglMasuk;

    @Column(name="opr", length=1)
    private String Opr;
    @Column(name="team", length=4)
    private String Team;
    @Column(name="bonus", length=1)
    private String Bonus;
    @Column(name="gudang", length=2)
    private String Gudang;
    @Column(name="gaji")
    private Integer Gaji;

    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "salesman2")
    @Fetch(FetchMode.JOIN)
    private Set<JHeader> jheaderSet;

    public Set<JHeader> getJheaderSet() {
        return jheaderSet;
    }

    public void setJheaderSet(Set<JHeader> jheaderSet) {
        this.jheaderSet = jheaderSet;
    }
   
    
    
    public String getSalesman() {
        return salesman;
    }

    public void setSalesman(String salesman) {
        this.salesman = salesman;
    }

    public String getNamaSls() {
        return namaSls;
    }

    public void setNamaSls(String namaSls) {
        this.namaSls = namaSls;
    }

    public String getAlamat1() {
        return Alamat1;
    }

    public void setAlamat1(String Alamat1) {
        this.Alamat1 = Alamat1;
    }

    public String getAlamat2() {
        return Alamat2;
    }

    public void setAlamat2(String Alamat2) {
        this.Alamat2 = Alamat2;
    }

    public String getKota() {
        return Kota;
    }

    public void setKota(String Kota) {
        this.Kota = Kota;
    }

    public String getPddk() {
        return Pddk;
    }

    public void setPddk(String Pddk) {
        this.Pddk = Pddk;
    }

    public Date getTglLahir() {
        return TglLahir;
    }

    public void setTglLahir(Date TglLahir) {
        this.TglLahir = TglLahir;
    }

    public Date getTglMasuk() {
        return TglMasuk;
    }

    public void setTglMasuk(Date TglMasuk) {
        this.TglMasuk = TglMasuk;
    }

    public String getOpr() {
        return Opr;
    }

    public void setOpr(String Opr) {
        this.Opr = Opr;
    }

    public String getTeam() {
        return Team;
    }

    public void setTeam(String Team) {
        this.Team = Team;
    }

    public String getBonus() {
        return Bonus;
    }

    public void setBonus(String Bonus) {
        this.Bonus = Bonus;
    }

    public String getGudang() {
        return Gudang;
    }

    public void setGudang(String Gudang) {
        this.Gudang = Gudang;
    }

    public Integer getGaji() {
        return Gaji;
    }

    public void setGaji(Integer Gaji) {
        this.Gaji = Gaji;
    }

    @Override
    public String toString() {
        return "Salesman{" + "salesman=" + salesman + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.salesman);
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
        final Salesman other = (Salesman) obj;
        if (!Objects.equals(this.salesman, other.salesman)) {
            return false;
        }
        return true;
    }
  
    
}
