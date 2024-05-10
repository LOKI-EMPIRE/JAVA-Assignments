package com.examly.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.examly.springapp.model.Author;
import com.examly.springapp.model.Book;
import com.examly.springapp.repository.AuthorRepo;
import com.examly.springapp.repository.BookRepo;

@Service
public class ApiService {

    @Autowired
    private AuthorRepo arepo;

    @Autowired
    private BookRepo brepo;

    public Author add(Author a){
        return arepo.save(a);
    }

    public Book addB(int id,Book b){
        if(arepo.existsById(id)){
            Author a = arepo.findById(id).get();
            b.setAuthor(a);
            return brepo.save(b);
        }
        return null;
    }

    public List<Author> getList(){
        return arepo.findAll();
    }

    public Author getById(int id){
        if(arepo.existsById(id)){
            return arepo.findById(id).get();
        }
        return null;
    }

    public Book update(int aid,int bid){
        if(arepo.existsById(aid) && brepo.existsById(bid)){
            Author a = arepo.findById(aid).get();
            Book b = brepo.findById(bid).get();
            b.setAuthor(a);
            a.setBooks(b);
            arepo.save(a);
            return brepo.save(b);
        }
        return null;
    }
    
}
