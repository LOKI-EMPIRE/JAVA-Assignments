package com.examly.springapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import java.util.*;

@Entity
public class Song {

    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String artist;

    @ManyToMany
    @JoinTable(
        name = "song_playlist",
        joinColumns = @JoinColumn(name ="song_id"),
        inverseJoinColumns = @JoinColumn(name ="playlist_id")
    )
    private Set<Playlist> playlists = new HashSet<>();

    public Song(){}
    
    public Song(String title, String artist, Set<Playlist> playlists) {
        this.title = title;
        this.artist = artist;
        this.playlists = playlists;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Set<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(Set<Playlist> playlists) {
        this.playlists = playlists;
    }

    public void addPlaylist(Playlist playlist){
        this.playlists.add(playlist);
    }
    
}
