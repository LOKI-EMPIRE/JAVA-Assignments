package com.example.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.example.springapp.model.Group;
import com.example.springapp.model.User;
import com.example.springapp.service.ApiService;

@RestController
public class ApiController {

    @Autowired
    private ApiService service;

    @PostMapping("/api/groups")
    public ResponseEntity<Group> add(@RequestBody Group g){
        Group g1 = service.addG(g);
        if(g1 != null){
            return new ResponseEntity<>(g1,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/api/users")
    public ResponseEntity<User> add(@RequestBody User u){
        User u1 = service.addU(u);
        if(u1 != null){
            return new ResponseEntity<>(u1,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/api/groups/{groupId}/addUser/{userId}")
    public ResponseEntity<Group> add(@PathVariable int groupId,@PathVariable int userId){
        Group g1 = service.addBoth(groupId, userId);
        if(g1 != null){
            return new ResponseEntity<>(g1,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/users")
    public ResponseEntity<List<User>> getListC(){
        List<User> list = service.getListU();
        if(list != null){
            return new ResponseEntity<>(list,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @GetMapping("/api/groups/{groupId}")
    public ResponseEntity<Group> getById(@PathVariable int groupId){
        Group g = service.getGroupById(groupId);
        if(g != null){
            return new ResponseEntity<>(g,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}
