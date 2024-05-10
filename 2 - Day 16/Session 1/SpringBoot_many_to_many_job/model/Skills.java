package com.examly.springapp.model;

import java.util.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Skills {

    @Id
    @GeneratedValue
    private long id;
    private String name;

    @ManyToMany(mappedBy = "skills")
    private Set<Job> jobs = new HashSet<>();

    public Skills(){}

    public Skills(String name, Set<Job> jobs) {
        this.name = name;
        this.jobs = jobs;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Job> getJobs() {
        return jobs;
    }

    public void setJobs(Job job) {
        this.jobs.add(job);
    }

}
