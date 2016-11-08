/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.bd.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author fabio
 */
@Entity
@Table(name = "USUARIOINFO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuarioinfo.findAll", query = "SELECT u FROM Usuarioinfo u"),
    @NamedQuery(name = "Usuarioinfo.findByIdUsuarioinfo", query = "SELECT u FROM Usuarioinfo u WHERE u.idUsuarioinfo = :idUsuarioinfo"),
    @NamedQuery(name = "Usuarioinfo.findByNome", query = "SELECT u FROM Usuarioinfo u WHERE u.nome = :nome"),
    @NamedQuery(name = "Usuarioinfo.findByEmail", query = "SELECT u FROM Usuarioinfo u WHERE u.email = :email"),
    @NamedQuery(name = "Usuarioinfo.findByTelefone", query = "SELECT u FROM Usuarioinfo u WHERE u.telefone = :telefone"),
    @NamedQuery(name = "Usuarioinfo.findByUsuario", query = "SELECT u FROM Usuarioinfo u WHERE u.usuario = :usuario"),
    @NamedQuery(name = "Usuarioinfo.findBySenha", query = "SELECT u FROM Usuarioinfo u WHERE u.senha = :senha")})
public class Usuarioinfo implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_USUARIOINFO")
    private BigDecimal idUsuarioinfo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "NOME")
    private String nome;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="E-mail inválido")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "EMAIL")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "TELEFONE")
    private String telefone;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "USUARIO")
    private String usuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "SENHA")
    private String senha;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuario")
    private List<Atracao> atracaoList;

    public Usuarioinfo() {
    }

    public Usuarioinfo(BigDecimal idUsuarioinfo) {
        this.idUsuarioinfo = idUsuarioinfo;
    }

    public Usuarioinfo(BigDecimal idUsuarioinfo, String nome, String email, String telefone, String usuario, String senha) {
        this.idUsuarioinfo = idUsuarioinfo;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.usuario = usuario;
        this.senha = senha;
    }

    public BigDecimal getIdUsuarioinfo() {
        return idUsuarioinfo;
    }

    public void setIdUsuarioinfo(BigDecimal idUsuarioinfo) {
        this.idUsuarioinfo = idUsuarioinfo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @XmlTransient
    public List<Atracao> getAtracaoList() {
        return atracaoList;
    }

    public void setAtracaoList(List<Atracao> atracaoList) {
        this.atracaoList = atracaoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuarioinfo != null ? idUsuarioinfo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuarioinfo)) {
            return false;
        }
        Usuarioinfo other = (Usuarioinfo) object;
        if ((this.idUsuarioinfo == null && other.idUsuarioinfo != null) || (this.idUsuarioinfo != null && !this.idUsuarioinfo.equals(other.idUsuarioinfo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.br.bd.model.entities.Usuarioinfo[ idUsuarioinfo=" + idUsuarioinfo + " ]";
    }
    
}
