/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.bd.model.dao;

import com.br.bd.model.entities.Usuarioinfo;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;

/**
 *
 * @author fabio
 */
@Stateful
@LocalBean
public class UsuarioinfoDAO implements GenericDAO<Usuarioinfo> {

    @PersistenceContext(unitName = "ProjetoSemestreBDPU", type = PersistenceContextType.TRANSACTION)
    private EntityManager em;

    @Override
    public List<Usuarioinfo> findAll() {
        Query query = em.createNamedQuery("Usuarioinfo.findAll");
        return query.getResultList();
    }

}
