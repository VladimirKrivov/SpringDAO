package com.example.dao.spring.webapp.controller;

import com.example.dao.spring.model.dto.ProductDTO;
import com.example.dao.spring.model.entity.Product;
import com.example.dao.spring.service.abstracts.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductRestController {

    private final ProductService productService;

    public ProductRestController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping
    public ResponseEntity<List<Product>> getAllProduct() {
        return new ResponseEntity<>(productService.findAll(), HttpStatus.OK);

    }

    @GetMapping("/search")
    public ResponseEntity<List<Product>> getProductByTitle(@RequestParam String title) {
        List<Product> products = productService.getProductByName(title);
        return new ResponseEntity<>(products, HttpStatus.OK);

    }


}
