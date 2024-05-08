package com.example.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import com.example.springapp.model.User;
import com.example.springapp.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/api/user")
    public ResponseEntity<User> addU(@RequestBody User u){
        User u1 = service.addUser(u);
        if(u1 != null){
            return new ResponseEntity<>(u1,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/user")
    public ResponseEntity<List<User>> getAllUser(){
        List<User> u1 = service.getAll();
        if(u1 != null){
            return new ResponseEntity<>(u1,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
}
