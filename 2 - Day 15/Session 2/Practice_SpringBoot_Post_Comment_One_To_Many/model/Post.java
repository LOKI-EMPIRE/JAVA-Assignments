package com.examly.springapp.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Post {

    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String content;

    @OneToMany(mappedBy = "post")
    @JsonManagedReference
    List<Comment> comments = new ArrayList<>();

    public Post(){}

    public Post(String title, String content, List<Comment> comments) {
        this.title = title;
        this.content = content;
        this.comments = comments;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(Comment c) {
        this.comments.add(c);
    }
    
}
