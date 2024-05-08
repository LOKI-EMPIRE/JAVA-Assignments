package com.examly.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import com.examly.springapp.model.Book;
import com.examly.springapp.service.BookService;

@RestController
public class BookController {
    
    @Autowired
    private BookService service;

    @PostMapping("/books")
    public ResponseEntity<Book> addBook(@RequestBody Book b){
       Book b1 = service.addB(b);
       if(b1 != null){
        return new ResponseEntity<>(b1,HttpStatus.CREATED);
       }else{
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
       }
    }

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getAllBook(){
       List<Book> b1 = service.getAll();
       if(b1 != null){
        return new ResponseEntity<>(b1,HttpStatus.OK);
       }else{
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
       }
    }

    @GetMapping("/books/{id}")
    public ResponseEntity<Book> getBook(@PathVariable int id){
       Book b1 = service.get(id);
       if(b1 != null){
        return new ResponseEntity<>(b1,HttpStatus.OK);
       }else{
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }
    }

    @GetMapping("/books/authors/{author}")
    public ResponseEntity<List<Book>> getByAuthor(@PathVariable String author){
       List<Book> b1 = service.getbyAuthor(author);
       if(b1 != null){
        return new ResponseEntity<>(b1,HttpStatus.OK);
       }else{
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }
    }

    @GetMapping("/books/year/{year}")
    public ResponseEntity<List<Book>> getYear(@PathVariable int year){
       List<Book> b1 = service.getbyYear(year);
       if(b1 != null){
        return new ResponseEntity<>(b1,HttpStatus.OK);
       }else{
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }
    }
}

