package com.example.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import com.example.springapp.model.Job;
import com.example.springapp.service.JobService;

@RestController
public class JobController {

    @Autowired
    private JobService service;

    @PostMapping("/api/job")
    public ResponseEntity<Job> addJ(@RequestBody Job j){
        Job j1 = service.add(j);
        if(j1 != null){
            return new ResponseEntity<>(j1,HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @GetMapping("/api/job")
    public ResponseEntity<List<Job>> getJL(){
        List<Job> j1 = service.getList();
        if(j1.size()>0){
            return new ResponseEntity<>(j1,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/api/job/{jobId}")
    public ResponseEntity<Job> getJ(@PathVariable int jobId){
        Job j1 = service.get(jobId);
        if(j1 != null){
            return new ResponseEntity<>(j1,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
