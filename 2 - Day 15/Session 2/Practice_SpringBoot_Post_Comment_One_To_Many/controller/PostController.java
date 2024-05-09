package com.examly.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.Post;
import com.examly.springapp.service.PostServiceImpl;

@RestController
public class PostController {

    @Autowired
    private PostServiceImpl service;

    @PostMapping("/post")
    public ResponseEntity<Post> addC(@RequestBody Post p){
        Post p1 = service.addS(p);
        if(p1 != null){
            return new ResponseEntity<>(p1, HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/post/{postId}")
    public ResponseEntity<Post> getByIdS(@PathVariable int postId){
        Post p1 = service.getByIdS(postId);
        if(p1 != null){
            return new ResponseEntity<>(p1,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
}
