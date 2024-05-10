package com.examly.springapp.entity;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Team {
    
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private double maximumBudget;

    @OneToMany(mappedBy = "team",cascade = CascadeType.ALL)
    List<Player> players = new ArrayList<>();

    public Team(){}

    public Team(String name,double maximumBudget){
        this.name = name;
        this.maximumBudget = maximumBudget;
    }

    public Team(String name, double maximumBudget, List<Player> players) {
        this.name = name;
        this.maximumBudget = maximumBudget;
        this.players = players;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaximumBudget() {
        return maximumBudget;
    }

    public void setMaximumBudget(double maximumBudget) {
        this.maximumBudget = maximumBudget;
    }

    @JsonIgnore
    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Player player) {
        this.players.add(player);
    }


}
