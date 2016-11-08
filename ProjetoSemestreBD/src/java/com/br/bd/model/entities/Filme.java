/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.bd.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author fabio
 */
@Entity
@Table(name = "FILME")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Filme.findAll", query = "SELECT f FROM Filme f"),
    @NamedQuery(name = "Filme.findByIdFilme", query = "SELECT f FROM Filme f WHERE f.idFilme = :idFilme"),
    @NamedQuery(name = "Filme.findByIndicacoesoscar", query = "SELECT f FROM Filme f WHERE f.indicacoesoscar = :indicacoesoscar")})
public class Filme implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_FILME")
    private BigDecimal idFilme;
    @Basic(optional = false)
    @NotNull
    @Column(name = "INDICACOESOSCAR")
    private BigInteger indicacoesoscar;
    @JoinColumn(name = "ID_FILME", referencedColumnName = "ID_ATRACAO", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Atracao atracao;

    public Filme() {
    }

    public Filme(BigDecimal idFilme) {
        this.idFilme = idFilme;
    }

    public Filme(BigDecimal idFilme, BigInteger indicacoesoscar) {
        this.idFilme = idFilme;
        this.indicacoesoscar = indicacoesoscar;
    }

    public BigDecimal getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(BigDecimal idFilme) {
        this.idFilme = idFilme;
    }

    public BigInteger getIndicacoesoscar() {
        return indicacoesoscar;
    }

    public void setIndicacoesoscar(BigInteger indicacoesoscar) {
        this.indicacoesoscar = indicacoesoscar;
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
        hash += (idFilme != null ? idFilme.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Filme)) {
            return false;
        }
        Filme other = (Filme) object;
        if ((this.idFilme == null && other.idFilme != null) || (this.idFilme != null && !this.idFilme.equals(other.idFilme))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.br.bd.model.entities.Filme[ idFilme=" + idFilme + " ]";
    }
    
}
