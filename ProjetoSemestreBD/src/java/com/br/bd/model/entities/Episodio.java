/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.bd.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author fabio
 */
@Entity
@Table(name = "EPISODIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Episodio.findAll", query = "SELECT e FROM Episodio e"),
    @NamedQuery(name = "Episodio.findByIdEpisodio", query = "SELECT e FROM Episodio e WHERE e.idEpisodio = :idEpisodio"),
    @NamedQuery(name = "Episodio.findByNome", query = "SELECT e FROM Episodio e WHERE e.nome = :nome")})
public class Episodio implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_EPISODIO")
    private BigDecimal idEpisodio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "NOME")
    private String nome;
    @JoinColumn(name = "FK_SERIE", referencedColumnName = "ID_SERIE")
    @ManyToOne(optional = false)
    private Serie fkSerie;

    public Episodio() {
    }

    public Episodio(BigDecimal idEpisodio) {
        this.idEpisodio = idEpisodio;
    }

    public Episodio(BigDecimal idEpisodio, String nome) {
        this.idEpisodio = idEpisodio;
        this.nome = nome;
    }

    public BigDecimal getIdEpisodio() {
        return idEpisodio;
    }

    public void setIdEpisodio(BigDecimal idEpisodio) {
        this.idEpisodio = idEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getFkSerie() {
        return fkSerie;
    }

    public void setFkSerie(Serie fkSerie) {
        this.fkSerie = fkSerie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEpisodio != null ? idEpisodio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Episodio)) {
            return false;
        }
        Episodio other = (Episodio) object;
        if ((this.idEpisodio == null && other.idEpisodio != null) || (this.idEpisodio != null && !this.idEpisodio.equals(other.idEpisodio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.br.bd.model.entities.Episodio[ idEpisodio=" + idEpisodio + " ]";
    }
    
}
