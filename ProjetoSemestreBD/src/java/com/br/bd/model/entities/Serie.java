/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.bd.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author fabio
 */
@Entity
@Table(name = "SERIE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Serie.findAll", query = "SELECT s FROM Serie s"),
    @NamedQuery(name = "Serie.findByIdSerie", query = "SELECT s FROM Serie s WHERE s.idSerie = :idSerie"),
    @NamedQuery(name = "Serie.findByNumtemporadas", query = "SELECT s FROM Serie s WHERE s.numtemporadas = :numtemporadas")})
public class Serie implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_SERIE")
    private BigDecimal idSerie;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUMTEMPORADAS")
    private BigInteger numtemporadas;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkSerie")
    private List<Episodio> episodioList;
    @JoinColumn(name = "ID_SERIE", referencedColumnName = "ID_ATRACAO", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Atracao atracao;

    public Serie() {
    }

    public Serie(BigDecimal idSerie) {
        this.idSerie = idSerie;
    }

    public Serie(BigDecimal idSerie, BigInteger numtemporadas) {
        this.idSerie = idSerie;
        this.numtemporadas = numtemporadas;
    }

    public BigDecimal getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(BigDecimal idSerie) {
        this.idSerie = idSerie;
    }

    public BigInteger getNumtemporadas() {
        return numtemporadas;
    }

    public void setNumtemporadas(BigInteger numtemporadas) {
        this.numtemporadas = numtemporadas;
    }

    @XmlTransient
    public List<Episodio> getEpisodioList() {
        return episodioList;
    }

    public void setEpisodioList(List<Episodio> episodioList) {
        this.episodioList = episodioList;
    }

    public Atracao getAtracao() {
        return atracao;
    }

    public void setAtracao(Atracao atracao) {
        this.atracao = atracao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSerie != null ? idSerie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Serie)) {
            return false;
        }
        Serie other = (Serie) object;
        if ((this.idSerie == null && other.idSerie != null) || (this.idSerie != null && !this.idSerie.equals(other.idSerie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.br.bd.model.entities.Serie[ idSerie=" + idSerie + " ]";
    }
    
}
