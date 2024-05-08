package com.example.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.exception.ProductException;
import com.example.springapp.model.Product;
import com.example.springapp.service.ProductService;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;
    
    @PostMapping("/api/product")
    public ResponseEntity<String> addP(@RequestBody Product p)throws ProductException{
        service.addProduct(p);
        return new ResponseEntity<>("Successfully added the product.",HttpStatus.CREATED);
    }

    @GetMapping("/api/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable long id){
        Product p1 = service.getProduct(id);
        if ( p1 != null ) {
            return new ResponseEntity<>(p1,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus. NOT_FOUND);
        }
    }
}
