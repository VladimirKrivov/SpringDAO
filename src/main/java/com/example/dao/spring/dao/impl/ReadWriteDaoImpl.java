package com.example.dao.spring.dao.impl;

import com.example.dao.spring.dao.abstracts.ReadWriteDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public class ReadWriteDaoImpl<T, K> implements ReadWriteDao<T, K> {

    private final Class<T> clazz;

    @PersistenceContext
    protected EntityManager em;

    @SuppressWarnings("unchecked")
    public ReadWriteDaoImpl() {
        this.clazz = (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass())
                .getActualTypeArguments()[0];
    }

    @Override
    public T findById(K id) {
        return em.find(clazz, id);
    }

    @Override
    public List<T> findAll() {
        return em.createQuery("select u from " +clazz.getName() + " u", clazz)
                .getResultList();
    }
}
