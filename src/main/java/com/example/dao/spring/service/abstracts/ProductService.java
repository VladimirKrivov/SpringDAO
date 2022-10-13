package com.example.dao.spring.service.abstracts;

import com.example.dao.spring.model.entity.Product;

import java.util.List;

public interface ProductService extends ReadWriteService<Product, Long>{
//    Здесь описываются методы сервиса Product
    List<Product> getProductByName(String name);

}
