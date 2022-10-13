package com.example.dao.spring.dao.impl;

import com.example.dao.spring.dao.abstracts.ProductDao;
import com.example.dao.spring.model.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDaoImpl extends ReadWriteDaoImpl<Product, Long> implements ProductDao {
    //    Здесь реализуются методы присущие только Product (из интерфейса ProductDao)
    @Override
    public List<Product> getProductByName(String name) {
        return em.createQuery("select i from Product i where i.title like :name", Product.class)
                .setParameter("name", name)
                .getResultList();
    }
}
