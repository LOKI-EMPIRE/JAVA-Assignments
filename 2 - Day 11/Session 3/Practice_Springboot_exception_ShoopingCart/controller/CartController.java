package com.examly.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.ShoppingCart;
import com.examly.springapp.service.ApiService;

@RestController
public class CartController {

    @Autowired
    private ApiService service;

    @PostMapping("/api/product")
    public ResponseEntity<String> addP(@RequestBody ShoppingCart s) throws ProductException{
        service.addProduct(s);
        return new ResponseEntity<>("Successfully added the product to the cart",HttpStatus.CREATED);
    }    

    @GetMapping("/api/product")
    public ResponseEntity<String> getP(){
        double product = service.getProduct();
        return new ResponseEntity<>("Successfully retrieved the total price of the cart: "+product,HttpStatus.OK);
    }  

}
