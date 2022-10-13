package com.example.dao.spring.service.impl;

import com.example.dao.spring.dao.abstracts.ProductDao;
import com.example.dao.spring.dao.abstracts.ReadWriteDao;
import com.example.dao.spring.model.entity.Product;
import com.example.dao.spring.service.abstracts.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl extends ReadWriteServiceImpl<Product, Long> implements ProductService {

    private ProductDao productDao;

    @Autowired
    public void setProductDao(ProductDao productDao){
        this.productDao = productDao;
    }

    public ProductServiceImpl(ReadWriteDao<Product, Long> dao) {
        super(dao);
    }

    @Override
    public List<Product> getProductByName(String name) {
        return productDao.getProductByName(name);
    }
}
