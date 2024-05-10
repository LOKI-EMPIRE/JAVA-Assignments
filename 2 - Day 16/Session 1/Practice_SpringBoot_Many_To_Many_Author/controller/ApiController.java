package com.examly.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.examly.springapp.model.Author;
import com.examly.springapp.model.Book;
import com.examly.springapp.service.ApiService;

@RestController
public class ApiController {

    @Autowired
    private ApiService service;

    @PostMapping("/author")
    public ResponseEntity<Boolean> add(@RequestBody Author a){
        Author a1 = service.add(a);
        if(a1 != null){
            return new ResponseEntity<>(true,HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(false,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/author/{authorId}/book")
    public ResponseEntity<Boolean> addB(@PathVariable int authorId,@RequestBody Book b){
        Book b1 = service.addB(authorId, b);
        if(b1 != null){
            return new ResponseEntity<>(true,HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(false,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/author")
    public ResponseEntity<List<Author>> getList(){
        List<Author> list = service.getList();
        if(list != null){
            return new ResponseEntity<>(list,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("author/{id}")
    public ResponseEntity<Author> get(@PathVariable int id){
        Author a = service.getById(id);
        if(a != null){
            return new ResponseEntity<>(a,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/author/{authorId}/book/{bookId}")
    public ResponseEntity<Book> getB(@PathVariable int authorId,@PathVariable int bookId){
        Book b = service.update(authorId,bookId);
        if(b != null){
            return new ResponseEntity<>(b,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}
