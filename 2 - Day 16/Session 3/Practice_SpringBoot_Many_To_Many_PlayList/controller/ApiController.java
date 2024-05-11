package com.examly.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.examly.springapp.model.Playlist;
import com.examly.springapp.model.Song;
import com.examly.springapp.service.ApiService;

@RestController
public class ApiController {

    @Autowired
    private ApiService service;

    @PostMapping("/addplaylist")
    public ResponseEntity<Boolean> addP(@RequestBody Playlist p){
        Playlist p1 = service.addP(p);
        if(p1!=null){
            return new ResponseEntity<>(true,HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(false,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/addsong")
    public ResponseEntity<Boolean> addS(@RequestBody Song s){
        Song s1 = service.addS(s);
        if(s1!=null){
            return new ResponseEntity<>(true,HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(false,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/playlists/{playlistId}/addSong/{songId}")
    public ResponseEntity<Boolean> addBoth(@PathVariable int playlistId,@PathVariable int songId){
        boolean b = service.addBoth(playlistId, songId);
        if(b){
            return new ResponseEntity<>(b,HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(b,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/playlists")
    public ResponseEntity<List<Playlist>> getListP(){
        List<Playlist> list = service.getListP();
        if(list !=null){
            return new ResponseEntity<>(list,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/songs")
    public ResponseEntity<List<Song>> getListS(){
        List<Song> list = service.getListS();
        if(list !=null){
            return new ResponseEntity<>(list,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}
