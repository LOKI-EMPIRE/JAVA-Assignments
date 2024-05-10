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
import com.examly.springapp.model.Post;
import com.examly.springapp.service.PostServiceImpl;

@RestController
public class PostController {

    @Autowired
    private PostServiceImpl service;

    @PostMapping("/post/user/{userId}")
    public ResponseEntity<Post> addC(@PathVariable int userId,@RequestBody Post p){
        Post p1  = service.add(userId, p);
        if(p1 != null){
            return new ResponseEntity<>(p1,HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @GetMapping("/post")
    public ResponseEntity<List<Post>> getListC(){
        List<Post> list = service.getList();
        if(list != null){
            return new ResponseEntity<>(list,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/post/{postId}")
    public ResponseEntity<Post> getById(@PathVariable int postId){
        Post p = service.getPostById(postId);
        if(p != null){
            return new ResponseEntity<>(p,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/post/{postId}")
    public ResponseEntity<Post> putPostById(@PathVariable int postId,@RequestBody Post p){
        Post p1 = service.putById(postId, p);
        if(p1!=null){
            return new ResponseEntity<>(p1,HttpStatus.OK);
        }else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/post/{postId}")
    public ResponseEntity<String> deleteById(@PathVariable int postId){
        boolean b = service.delete(postId);
        if(b){
            return new ResponseEntity<>("Post deleted successfully",HttpStatus.OK);    
        }else{
            return new ResponseEntity<>("Post not found with ID: "+postId,HttpStatus.NOT_FOUND);
        }
    }

}
