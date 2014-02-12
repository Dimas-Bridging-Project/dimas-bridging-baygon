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
@Table(name="map_tipe_outlet")
public class MapTipeOutlet implements Serializable {
    @Id
    @Basic(optional=false)
    @Column(name="id_tipe_outlet_scy", length=10, nullable=false)
    private String idTipeOutlet;
    @Column(name="tipe_outlet", length=10)
    private String TipeOutlet;
    @Column(name="deskripsi", length=50)
    private String Deskripsi;
    
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mapTipeOutlet")
    @Fetch(FetchMode.JOIN)
    private Set<JHeader> jheaderSet;

    public Set<JHeader> getJheaderSet() {
        return jheaderSet;
    }

    public void setJheaderSet(Set<JHeader> jheaderSet) {
        this.jheaderSet = jheaderSet;
    }
    

    
    
    
    
    
    public String getIdTipeOutlet() {
        return idTipeOutlet;
    }

    public void setIdTipeOutlet(String idTipeOutlet) {
        this.idTipeOutlet = idTipeOutlet;
    }

    public String getTipeOutlet() {
        return TipeOutlet;
    }

    public void setTipeOutlet(String TipeOutlet) {
        this.TipeOutlet = TipeOutlet;
    }

    public String getDeskripsi() {
        return Deskripsi;
    }

    public void setDeskripsi(String Deskripsi) {
        this.Deskripsi = Deskripsi;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.idTipeOutlet);
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
        final MapTipeOutlet other = (MapTipeOutlet) obj;
        if (!Objects.equals(this.idTipeOutlet, other.idTipeOutlet)) {
            return false;
        }
        return true;
    }
    
}
