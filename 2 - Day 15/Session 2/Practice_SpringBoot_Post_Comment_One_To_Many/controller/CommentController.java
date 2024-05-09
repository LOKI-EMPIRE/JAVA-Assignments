package com.examly.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.Comment;
import com.examly.springapp.service.CommentServiceImpl;

@RestController
public class CommentController {

    @Autowired
    private CommentServiceImpl service;

    @PostMapping("comment/post/{postId}")
    public ResponseEntity<Comment> addC(@PathVariable int postId,@RequestBody Comment c){
        Comment c1 = service.addS(postId, c);
        if(c1 != null){
            return new ResponseEntity<>(c1,HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/comment/{commentId}")
    public ResponseEntity<Comment> putByIdC(@PathVariable int commentId,@RequestBody Comment c){
        Comment c1 = service.putById(commentId,c);
        if(c1 != null){
            return new ResponseEntity<>(c1,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/comment/{commentId}")
    public ResponseEntity<String> deleteByIdC(@PathVariable int commentId){
        boolean b = service.deleteById(commentId);
        if(b){
            return new ResponseEntity<>("Comment deleted successfully",HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Comment not found with ID " + commentId,HttpStatus.OK);
        }
    }
    
}
