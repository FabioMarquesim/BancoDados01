/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.bd.model.dao;

import com.br.bd.model.entities.Episodio;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

/**
 *
 * @author fabio
 */
@Stateful
@LocalBean
public class EpisodioDAO implements GenericDAO<Episodio> {

    @PersistenceContext(unitName = "ProjetoSemestreBDPU", type = PersistenceContextType.TRANSACTION)
    private EntityManager em;
    
    @Override
    public List<Episodio> findAll() {
    return em.createNamedQuery("Episodio.findAll", Episodio.class).getResultList();
    }
    
}
