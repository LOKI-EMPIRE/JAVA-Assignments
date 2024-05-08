package com.examly.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.examly.springapp.model.College;
import com.examly.springapp.service.CollegeService;

@RestController
public class CollegeController {

    @Autowired
    private CollegeService service;

    @PostMapping("/college")
    public ResponseEntity<College> addC(@RequestBody College c){
        College c1 = service.addS(c);
        if(c1 != null){
            return new ResponseEntity<>(c1,HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/college/startsWith/{name}")
    public ResponseEntity<List<College>> startsWithC(@PathVariable String name){
        List<College> list = service.startsWithS(name);
        if(list.isEmpty()){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }else{
            return new ResponseEntity<>(list,HttpStatus.OK);
        }
    } 
    
    @GetMapping("/college/endsWith/{name}")
    public ResponseEntity<List<College>> endsWithC(@PathVariable String name){
        List<College> list = service.endsWithS(name);
        if(list.isEmpty()){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }else{
            return new ResponseEntity<>(list,HttpStatus.OK);
        }
    }
}

