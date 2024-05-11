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
import com.examly.springapp.model.Message;
import com.examly.springapp.model.User;
import com.examly.springapp.service.ApiService;

@RestController
public class ApiController {

    @Autowired
    private ApiService service;

    @PostMapping("/user")
    public ResponseEntity<Boolean> addU(@RequestBody User u){
        User u1 = service.addU(u);
        if(u1 != null){
            return new ResponseEntity<>(true,HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(false,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("user/{id}/message")
    public ResponseEntity<Boolean> addM(@PathVariable int id,@RequestBody Message m){
        Message m1 = service.addM(id, m);
        if(m1 !=null){
            return new ResponseEntity<>(true,HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(false,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/user")
    public ResponseEntity<List<User>> getList(){
        List<User> list = service.getListU();
        if(list != null){
            return new ResponseEntity<>(list,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("user/{id}")
    public ResponseEntity<User> getU(@PathVariable int id){
        User u = service.getByIdU(id);
        if(u != null){
            return new ResponseEntity<>(u,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/user/{userId}/message/{msgId}")
    public ResponseEntity<Message> updateBoth(@PathVariable int userId,@PathVariable int msgId){
        Message m = service.updateBoth(userId, msgId);
        if(m!=null){
            return new ResponseEntity<>(m,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/user/{userId}/message/{msgId}")
    public ResponseEntity<Boolean> delete(@PathVariable int userId,@PathVariable int msgId){
        boolean b = service.deleteBoth(userId, msgId);
        if(b){
            return new ResponseEntity<>(b,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(b,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}
