package com.examly.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import com.examly.springapp.model.Shirt;
import com.examly.springapp.service.ShirtService;

@RestController
public class ShirtController {

    @Autowired
    private ShirtService service;

    @PostMapping("/shirt")
    public ResponseEntity<Shirt> addS(@RequestBody Shirt s){
        Shirt s1 = service.add(s);
        if(s1 != null){
            return new ResponseEntity<>(s1,HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/shirt")
    public ResponseEntity<List<Shirt>> getListS(){
        List<Shirt> list = service.getList();
        if(list.size()>0){
            return new ResponseEntity<>(list,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    } 

    @GetMapping("/shirt/{shirtId}")
    public ResponseEntity<Shirt> getS(@PathVariable int shirtId){
        Shirt s = service.getShirt(shirtId);
        if(s != null){
            return new ResponseEntity<>(s,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/shirt/{shirtId}")
    public ResponseEntity<Shirt> updateS(@PathVariable int shirtId,@RequestBody Shirt s){
        Shirt s1 = service.update(shirtId,s);
        if(s1 != null){
            return new ResponseEntity<>(s1,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/shirt/{shirtId}")
    public ResponseEntity<Boolean> deleteS(@PathVariable int shirtId){
       boolean b = service.delete(shirtId);
       if(b){
        return new ResponseEntity<>(b,HttpStatus.OK);
       }else{
        return new ResponseEntity<>(b,HttpStatus.INTERNAL_SERVER_ERROR);
       }
    }
    
}
