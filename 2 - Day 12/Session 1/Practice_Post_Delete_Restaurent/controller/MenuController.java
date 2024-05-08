package com.example.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.MenuItem;
import com.example.springapp.service.MenuService;

@RestController
public class MenuController {

    @Autowired
    private MenuService service;

    @PostMapping("/menu")
    public ResponseEntity<MenuItem> addIt(@RequestBody MenuItem item){
        MenuItem it = service.addItem(item);
        if(it != null){
            return new ResponseEntity<>(it,HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/menu/{menuId}")
    public ResponseEntity<String> deleteIt(@PathVariable int menuId){
        boolean b = service.deleteItem(menuId);
        if(b){
            return new ResponseEntity<>("Menu item deleted successfully",HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Menu item not found with the specified menuId",HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    
}
