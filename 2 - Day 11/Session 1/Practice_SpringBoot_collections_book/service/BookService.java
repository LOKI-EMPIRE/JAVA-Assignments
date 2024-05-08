package com.examly.springapp.service;

import java.util.*;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.Book;

@Service
public class BookService {
    List<Book> list = new ArrayList<>();
    
    public Book addB(Book b){
        list.add(b);
        return b;
    }

    public List<Book> getAll(){
        return list;
    }

    public Book get(int id){
        for(Book b:list){
            if(b.getId()==id){
                return b;
            }
        }
        return null;
    }

    public List<Book> getbyAuthor(String author){
        List<Book> b1 = new ArrayList<>();
        for(Book b:list){
            if(b.getAuthor().equals(author)){
                b1.add(b);
            }
        }
        return b1;
    }

    public List<Book> getbyYear(int year){
        List<Book> b1 = new ArrayList<>();
        for(Book b:list){
            if(b.getYear() == year){
                b1.add(b);
            }
        }
        return b1;
    }
}

