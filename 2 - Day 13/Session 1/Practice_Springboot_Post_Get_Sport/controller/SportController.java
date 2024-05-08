package com.examly.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.Sport;
import com.examly.springapp.service.SportService;

@RestController
public class SportController {

    @Autowired
    private SportService service;

    @PostMapping("/sport")
    public ResponseEntity<Sport> addSportC(@RequestBody Sport s){
        Sport s1 = service.addSportS(s);
        if(s1 != null){
            return new ResponseEntity<>(s1,HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/sport/{sportId}")
    public ResponseEntity<Sport> getSportId(@PathVariable int sportId){
        Sport s1 = service.getByIDS(sportId);
        if(s1 != null){
            return new ResponseEntity<>(s1,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        } 
    }

    @GetMapping("/sport")
    public ResponseEntity<List<Sport>> getAllSport(){
        List<Sport> list = service.getAllList();
        if(list.size()>0){
            return new ResponseEntity<>(list,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
}
