package com.examly.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.Product;
import com.examly.springapp.service.ProductService;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/product/customer/{customerId}")
    public ResponseEntity<Product> add(@PathVariable int customerId,@RequestBody Product p){
        Product p1 = service.add(customerId,p);
        if(p1 != null){
            return new ResponseEntity<>(p1,HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/product/{productId}")
    public ResponseEntity<String> delete(@PathVariable int productId){
        boolean b = service.delete(productId);
        if(b){
            return new ResponseEntity<>("Product deleted successfully",HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Product not found with ID "+productId,HttpStatus.NOT_FOUND);
        }
    }
    
}
