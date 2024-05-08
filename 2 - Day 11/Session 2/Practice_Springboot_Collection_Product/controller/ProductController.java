package com.example.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.Product;
import com.example.springapp.service.ProductService;

@RestController
public class ProductController {
    
    @Autowired
    private ProductService service;

    @PostMapping("/products")
    public ResponseEntity<Product> addP(@RequestBody Product p){
        Product p1 = service.addProduct(p);
        if(p1 != null){
           return new ResponseEntity<>(p1,HttpStatus.OK);
        }else{
           return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getP(@PathVariable long id){
        Product p2 = service.getProduct(id);
        if(p2 != null){
           return new ResponseEntity<>(p2,HttpStatus.OK);
        }else{
           return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}
