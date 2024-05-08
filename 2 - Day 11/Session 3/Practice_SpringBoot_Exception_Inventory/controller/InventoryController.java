package com.example.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.Item;
import com.example.springapp.service.InventoryService;

@RestController
public class InventoryController {
    
     @Autowired
     private InventoryService service;

     @PostMapping("/api/item")
     public ResponseEntity<String> addI(@RequestBody Item it)throws ItemException{
          service.addItem(it);
          return new ResponseEntity<>("Successfully added the item to the inventory",HttpStatus.CREATED);
     }

     @GetMapping("/api/item")
     public ResponseEntity<String> getI(){
        double product = service.getItem();
        return new ResponseEntity<>("Successfully retrieved the total value of the inventory: "+product ,HttpStatus.OK);
     }

}
