package com.example.dao.spring.dao.abstracts;

import com.example.dao.spring.model.entity.Product;

import java.util.List;

public interface ProductDao extends ReadWriteDao<Product, Long>{
//    Здесь описываются методы, присущие только Product

    List<Product> getProductByName(String name);
}
