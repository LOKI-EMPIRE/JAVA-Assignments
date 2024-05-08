package com.examly.springapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Sport {

    @Id
    @GeneratedValue
    private int sportId;
    private String sportName;
    private int playersCount;

    public Sport(){}
    
    public Sport(int sportId, String sportName, int playersCount) {
        this.sportId = sportId;
        this.sportName = sportName;
        this.playersCount = playersCount;
    }
    public int getSportId() {
        return sportId;
    }
    public void setSportId(int sportId) {
        this.sportId = sportId;
    }
    public String getSportName() {
        return sportName;
    }
    public void setSportName(String sportName) {
        this.sportName = sportName;
    }
    public int getPlayersCount() {
        return playersCount;
    }
    public void setPlayersCount(int playersCount) {
        this.playersCount = playersCount;
    }   
    
}
