/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juhnowski;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 7634
 */
@Entity
@Table(name = "pets")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pets.findAll", query = "SELECT p FROM Pets p"),
    @NamedQuery(name = "Pets.findByNickname", query = "SELECT p FROM Pets p WHERE p.nickname = :nickname"),
    @NamedQuery(name = "Pets.findBySpeciesName", query = "SELECT p FROM Pets p WHERE p.speciesName = :speciesName"),
    @NamedQuery(name = "Pets.findByBirthdate", query = "SELECT p FROM Pets p WHERE p.birthdate = :birthdate"),
    @NamedQuery(name = "Pets.findByMale", query = "SELECT p FROM Pets p WHERE p.male = :male"),
    @NamedQuery(name = "Pets.findByOwner", query = "SELECT p FROM Pets p WHERE p.owner = :owner")})
public class Pets implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "nickname")
    private String nickname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "species_name")
    private String speciesName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "birthdate")
    @Temporal(TemporalType.DATE)
    private Date birthdate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "male")
    private boolean male;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "owner")
    private String owner;

    public Pets() {
    }

    public Pets(String nickname) {
        this.nickname = nickname;
    }

    public Pets(String nickname, String speciesName, Date birthdate, boolean male, String owner) {
        this.nickname = nickname;
        this.speciesName = speciesName;
        this.birthdate = birthdate;
        this.male = male;
        this.owner = owner;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public boolean getMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nickname != null ? nickname.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pets)) {
            return false;
        }
        Pets other = (Pets) object;
        if ((this.nickname == null && other.nickname != null) || (this.nickname != null && !this.nickname.equals(other.nickname))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ru.balov.Pets[ nickname=" + nickname + " ]";
    }
    
}
