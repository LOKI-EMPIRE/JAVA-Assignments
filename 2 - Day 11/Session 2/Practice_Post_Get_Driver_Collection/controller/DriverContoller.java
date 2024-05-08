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
import com.examly.springapp.model.Driver;
import com.examly.springapp.service.DriverService;


@RestController
public class DriverController {
    
    @Autowired
    private DriverService service;

    @PostMapping("/driver")
    public ResponseEntity<Driver> addDriver(@RequestBody Driver d){
        Driver d1 = service.addD(d);
        if(d1 != null){
            return new ResponseEntity<>(d1,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/driver")
    public ResponseEntity<List<Driver>> getAllDriver(){
        List<Driver> l = service.getAllD();
        if(l != null){
            return new ResponseEntity<>(l,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/driver/{driverId}")
    public ResponseEntity<Driver> getDriver(@PathVariable int driverId){
        Driver d1 = service.getD(driverId);
        if(d1 != null){
            return new ResponseEntity<>(d1,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
