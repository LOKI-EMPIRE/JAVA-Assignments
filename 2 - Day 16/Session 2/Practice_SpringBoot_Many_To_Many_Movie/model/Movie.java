package com.examly.springapp.model;

import java.util.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Movie {

    @Id
    @GeneratedValue
    private int id;
    private String title;
    private int year;

    @ManyToMany
    @JoinTable(
        name = "Actor_Movie",
        joinColumns = @JoinColumn(name = "movie_id"),
        inverseJoinColumns = @JoinColumn(name = "author_id")
    )
    private Set<Actor> actors = new HashSet<>();

    public Movie(){}
    
    public Movie(String title, int year, Set<Actor> actors) {
        this.title = title;
        this.year = year;
        this.actors = actors;
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


    public int getYear() {
        return year;
    }


    public void setYear(int year) {
        this.year = year;
    }


    public Set<Actor> getActors() {
        return actors;
    }


    public void setActors(Set<Actor> actors) {
        this.actors=actors;
    }   
    
    public void addActor(Actor actor) {
        this.actors.add(actor);
    }
}
