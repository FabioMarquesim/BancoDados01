/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.bd.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author fabio
 */
@Entity
@Table(name = "ATRACAO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Atracao.findAll", query = "SELECT a FROM Atracao a"),
    @NamedQuery(name = "Atracao.findByIdAtracao", query = "SELECT a FROM Atracao a WHERE a.idAtracao = :idAtracao"),
    @NamedQuery(name = "Atracao.findByNome", query = "SELECT a FROM Atracao a WHERE a.nome = :nome"),
    @NamedQuery(name = "Atracao.findBySinopse", query = "SELECT a FROM Atracao a WHERE a.sinopse = :sinopse")})
public class Atracao implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_ATRACAO")
    private BigDecimal idAtracao;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "NOME")
    private String nome;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "SINOPSE")
    private String sinopse;
    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIOINFO")
    @ManyToOne(optional = false)
    private Usuarioinfo idUsuario;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "atracao")
    private Filme filme;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "atracao")
    private Serie serie;

    public Atracao() {
    }

    public Atracao(BigDecimal idAtracao) {
        this.idAtracao = idAtracao;
    }

    public Atracao(BigDecimal idAtracao, String nome, String sinopse) {
        this.idAtracao = idAtracao;
        this.nome = nome;
        this.sinopse = sinopse;
    }

    public BigDecimal getIdAtracao() {
        return idAtracao;
    }

    public void setIdAtracao(BigDecimal idAtracao) {
        this.idAtracao = idAtracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public Usuarioinfo getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuarioinfo idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAtracao != null ? idAtracao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Atracao)) {
            return false;
        }
        Atracao other = (Atracao) object;
        if ((this.idAtracao == null && other.idAtracao != null) || (this.idAtracao != null && !this.idAtracao.equals(other.idAtracao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.br.bd.model.entities.Atracao[ idAtracao=" + idAtracao + " ]";
    }
    
}
