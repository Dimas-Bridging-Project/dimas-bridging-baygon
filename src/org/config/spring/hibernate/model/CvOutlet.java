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
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 *
 * @author yhawin
 */
@Entity
@Table(name="cv_outlet")
public class CvOutlet implements Serializable {
    @Id
    @Basic(optional=true)
    @Column(name="outlet", length=6, nullable=false)
    private String Outlet;
    @Column(name="salesman", length=3)
    private String Salesman;
    @Column(name="kunjungan", length=1)
    private String kunjungan;
    @Column(name="hari", length=1)
    private String hari;
    

    @ManyToOne(optional = true)
    @JoinColumn(name = "outlet", referencedColumnName = "outlet", insertable = false, updatable = false)
    private Outlet outlet2;

    public Outlet getOutlet2() {
        return outlet2;
    }

    public void setOutlet2(Outlet outlet2) {
        this.outlet2 = outlet2;
    }
    
    
    
    public String getOutlet() {
        return Outlet;
    }

    public void setOutlet(String Outlet) {
        this.Outlet = Outlet;
    }

    public String getSalesman() {
        return Salesman;
    }

    public void setSalesman(String Salesman) {
        this.Salesman = Salesman;
    }

    public String getKunjungan() {
        return kunjungan;
    }

    public void setKunjungan(String kunjungan) {
        this.kunjungan = kunjungan;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
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
        final CvOutlet other = (CvOutlet) obj;
        if (!Objects.equals(this.Outlet, other.Outlet)) {
            return false;
        }
        return true;
    }
  
    
}
