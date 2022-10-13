package com.example.dao.spring.service.impl;

import com.example.dao.spring.dao.abstracts.ReadWriteDao;
import com.example.dao.spring.service.abstracts.ReadWriteService;

import javax.transaction.Transactional;
import java.util.List;

public class ReadWriteServiceImpl<T, K> implements ReadWriteService<T, K> {

    protected final ReadWriteDao<T, K> dao;

    public ReadWriteServiceImpl(ReadWriteDao<T, K> dao) {
        this.dao = dao;
    }

    @Override
    @Transactional
    public T findById(K id) {
        return dao.findById(id);
    }

    @Override
    public List<T> findAll() {
        return dao.findAll();
    }
}
