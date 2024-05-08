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
import com.examly.springapp.model.Truck;
import com.examly.springapp.service.TruckService;

@RestController
public class TruckController {
    
 @Autowired
 private TruckService service;

 @PostMapping("/truck")
 public ResponseEntity<Truck> addtruck(@RequestBody Truck t){
    Truck t1 = service.add(t);
    if(t1 != null){
        return new ResponseEntity<>(t1,HttpStatus.OK);
    }else{
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
 }

 @GetMapping("/truck")
 public ResponseEntity<List<Truck>> getAllTruck(){
    List<Truck> list1 = service.getAll();
    if(list1 != null){
        return new ResponseEntity<>(list1,HttpStatus.OK);
    }else{
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
 }

 @GetMapping("/truck/{truckId}")
 public ResponseEntity<Truck> getTruckbyId(@PathVariable int truckId){
    Truck t = service.getId(truckId);
    if(t!=null){
        return new ResponseEntity<>(t,HttpStatus.OK);
    }else{
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
 }

}
