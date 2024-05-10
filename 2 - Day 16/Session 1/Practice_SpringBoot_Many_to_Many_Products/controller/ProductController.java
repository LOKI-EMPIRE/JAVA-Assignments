package com.example.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.Product;
import com.example.springapp.service.ProductServiceImpl;

@RestController
public class ProductController {


    @Autowired
    private ProductServiceImpl pservice;

    @PostMapping("/categories/{categoryId}/product")
    public ResponseEntity<Product> addC(@PathVariable int categoryId,@RequestBody Product p){
        Product p1 = pservice.add(categoryId, p);
        if(p1 != null){
            return new ResponseEntity<>(p1,HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/products/{productId}")
    public ResponseEntity<Boolean> delete(@PathVariable int productId){
        boolean b = pservice.delete(productId);
        if(b){
            return new ResponseEntity<>(b,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(b,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}
