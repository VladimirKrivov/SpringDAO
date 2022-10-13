package com.example.dao.spring.dao.abstracts;

import java.util.List;

public interface ReadWriteDao<T, K> {
//    Здесь описываются стандартные и часто используемые методы (CRUD)

    T findById(K id);

    List<T> findAll();
}
