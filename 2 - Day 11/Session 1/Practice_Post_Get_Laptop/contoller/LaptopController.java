package com.examly.springapp.controller;
 
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
 
import com.examly.springapp.model.Laptop;
import com.examly.springapp.service.LaptopService;
 
@RestController
public class LaptopController {
 
    @Autowired
    private LaptopService service;
 
    @PostMapping("/laptop")
    public ResponseEntity<Laptop> addLaptop(@RequestBody Laptop l){
        Laptop l1 = service.addLaptop(l);
        if(l1 != null){
            return new ResponseEntity<>(l1,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
 
    @GetMapping("/laptop/{laptopId}")
    public ResponseEntity<Laptop> getById(@PathVariable int laptopId){
        Laptop l1 = service.byId(laptopId);
        if(l1 != null){
            return new ResponseEntity<>(l1,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
 
    @GetMapping("/laptop")
    public ResponseEntity<List<Laptop>> getAllLaptop(){
        List<Laptop> list = service.getAll();
        if(list != null){
            return new ResponseEntity<>(list,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
   
}
