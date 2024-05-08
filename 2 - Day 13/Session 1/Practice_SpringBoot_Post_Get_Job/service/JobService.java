package com.example.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import com.example.springapp.model.Job;
import com.example.springapp.repository.JobRepo;

@Service
public class JobService {
    
    @Autowired
    private JobRepo repo;

    public Job add(Job b){
        return repo.save(b);
    }

    public List<Job> getList(){
        return repo.findAll();
    }

    public Job get(int id){
        if(repo.existsById(id)){
            return repo.findById(id).get();
        }
        return null;
    }
}
