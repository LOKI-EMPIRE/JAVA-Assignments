package com.example.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.Category;
import com.example.springapp.service.CategoryServiceImpl;

@RestController
public class CategoryController {

    @Autowired
    private CategoryServiceImpl cservice;

    @PostMapping("/categories")
    public ResponseEntity<Category> add(@RequestBody Category c1){
        Category c = cservice.add(c1);
        if(c!= null){
            return new ResponseEntity<>(c,HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/categories/{categoryId}")
    public ResponseEntity<Category> get(@PathVariable int categoryId){
        Category c = cservice.get(categoryId);
        if(c!= null){
            return new ResponseEntity<>(c,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    
}
