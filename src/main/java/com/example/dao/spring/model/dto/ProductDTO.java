package com.example.dao.spring.model.dto;

import com.example.dao.spring.model.entity.Product;
import lombok.Data;

@Data
public class ProductDTO {

    private String title;
    private Double price;

    public static ProductDTO toDTO(Product product){
        ProductDTO model = new ProductDTO();
        model.setTitle(product.getTitle());
        model.setPrice(product.getPrice());
        return model;
    }
}
