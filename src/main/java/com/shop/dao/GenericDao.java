package com.shop.dao;

import java.io.Serializable;
import java.util.List;

/**
 * learn
 */
public interface GenericDao<T, PK extends Serializable> {

    T getById(PK id);

    List<T> findAll();

    PK save(T entity);
}
