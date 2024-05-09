package com.examly.springapp.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Comment {
    
    @Id
    @GeneratedValue
    private int id;
    private String text;
    
    @ManyToOne
    @JsonBackReference
    private Post post;

    public Comment(){}

    public Comment(String text, Post post) {
        this.text = text;
        this.post = post;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

}
