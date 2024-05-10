package com.examly.springapp.model;

import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Book {

    @Id
    @GeneratedValue
    private int id;
    private String title;

    @ManyToMany(mappedBy = "books")
    private Set<Author> author = new HashSet<>();

    public Book(){}

    public Book(String title, Set<Author> author) {
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Author> getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author.add(author);
    }

}
