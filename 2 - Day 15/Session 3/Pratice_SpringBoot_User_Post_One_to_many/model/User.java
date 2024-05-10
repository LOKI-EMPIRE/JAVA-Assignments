package com.examly.springapp.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class User {

    @Id
    @GeneratedValue
    private int userId;
    private String username;
    private String email;
    
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Post> posts = new ArrayList<>();

    public User(){}

    public User(String username, String email, List<Post> posts) {
        this.username = username;
        this.email = email;
        this.posts = posts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(Post post) {
        this.posts.add(post);
    }

    
}
