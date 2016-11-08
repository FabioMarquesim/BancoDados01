package com.br.bd.model.dao;

import java.util.List;

/**
 *
 * @author fabio
 */
public interface GenericDAO<E> {
    
    public List<E> findAll();
    
}
