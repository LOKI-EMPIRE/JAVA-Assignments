package com.example.springapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.*;

@Entity
@Table(name = "usrs")
public class User {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    
    @ManyToMany
    @JoinTable(
        name = "user_group",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name ="group_id")
    )
    private Set<Group> groups = new HashSet<>();

    public User(){}

    public User(String name, Set<Group> groups) {
        this.name = name;
        this.groups = groups;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Group> getGroups() {
        return groups;
    }

    public void addGroup(Group group){
        groups.add(group);
    }

    public void setGroups(Set<Group> groups) {
        this.groups = groups;
    }

    
    
}
