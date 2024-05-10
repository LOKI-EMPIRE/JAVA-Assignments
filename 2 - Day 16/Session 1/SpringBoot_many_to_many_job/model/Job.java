package com.examly.springapp.model;

import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Job {

    @Id
    @GeneratedValue
    private long id;
    private String title;
    private String description;
    
    @ManyToMany
    @JoinTable(
        name="job_skill",
        joinColumns = @JoinColumn(name="job_id"),
        inverseJoinColumns = @JoinColumn(name="skill_id")
    )
    private Set<Skills> skills = new HashSet<>();

    public Job(){}

    public Job(String title, String description, Set<Skills> skills) {
        this.title = title;
        this.description = description;
        this.skills = skills;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Skills> getSkills() {
        return skills;
    }

    public void setSkills(Skills skill) {
        this.skills.add(skill);
    }   
    
}
