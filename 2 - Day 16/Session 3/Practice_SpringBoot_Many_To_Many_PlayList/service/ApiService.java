package com.examly.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.examly.springapp.model.Playlist;
import com.examly.springapp.model.Song;
import com.examly.springapp.repository.PlaylistRepo;
import com.examly.springapp.repository.SongRepo;

@Service
public class ApiService {
    
    @Autowired
    private SongRepo srepo;

    @Autowired
    private PlaylistRepo prepo;

    public Playlist addP(Playlist p){
        return prepo.save(p);
    }

    public Song addS(Song s){
        return srepo.save(s);
    }

    public boolean addBoth(int pid,int sid){
        if(prepo.existsById(pid) && srepo.existsById(sid)){
            Playlist p = prepo.findById(pid).get();
            Song s = srepo.findById(sid).get();
            p.addSong(s);
            s.addPlaylist(p);
            prepo.save(p);
            srepo.save(s);
            return true;
        }
        return false;
    }

    public List<Playlist> getListP(){
        return prepo.findAll();
    }

    public List<Song> getListS(){
        return srepo.findAll();
    }
}
