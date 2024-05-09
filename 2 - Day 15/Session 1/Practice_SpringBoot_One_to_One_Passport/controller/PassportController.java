package com.examly.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.examly.springapp.model.Passport;
import com.examly.springapp.service.PassportService;

@RestController
public class PassportController {
    
    @Autowired
    private PassportService pservice;

    @PostMapping("/passport")
    public ResponseEntity<Passport> addSC(@RequestBody Passport p){
        Passport p1 = pservice.addSP(p);
        if(p1 != null){
            return new ResponseEntity<>(p1,HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/passport")
    public ResponseEntity<List<Passport>> getListCP(){
        List<Passport> list = pservice.getListSP();
        if(list != null){
            return new ResponseEntity<>(list,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
