package com.br.bd.model.dao;

import com.br.bd.model.entities.Atracao;
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
public class AtracaoDAO implements GenericDAO<Atracao> {

    @PersistenceContext(unitName = "ProjetoSemestreBDPU", type = PersistenceContextType.TRANSACTION)
    private EntityManager em;
    
    @Override
    public List<Atracao> findAll() {
        return em.createNamedQuery("Atracao.findAll", Atracao.class).getResultList();
    }
    
}
