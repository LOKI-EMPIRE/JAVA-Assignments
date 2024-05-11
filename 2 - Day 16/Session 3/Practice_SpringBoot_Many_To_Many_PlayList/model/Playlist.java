package com.examly.springapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import java.util.*;

@Entity
public class Playlist {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    
    @ManyToMany(mappedBy = "playlists")
    private Set<Song> songs = new HashSet<>();

    public Playlist(){}

    public Playlist(String name, Set<Song> songs) {
        this.name = name;
        this.songs = songs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Song> getSongs() {
        return songs;
    }

    public void setSongs(Set<Song> songs) {
        this.songs = songs;
    }
    
    public void addSong(Song song){
        this.songs.add(song);
    }
    
}
