package com.example.dao.spring.service.abstracts;

import java.util.List;

public interface ReadWriteService<T, K> {
    //    Здесь описываются обобщенные методы сервиса

    T findById(K id);

    List<T> findAll();

}
