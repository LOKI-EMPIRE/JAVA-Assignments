package com.examly.springapp.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.Sport;
import com.examly.springapp.repository.SportRepo;

@Service
public class SportService {

    @Autowired
    private SportRepo repo;

    public Sport addSportS(Sport s){
        return repo.save(s);
    }

    public Sport getByIDS(int id){
        if(repo.existsById(id)){
            return repo.findById(id).get();
        }
        return null;
    }

    public List<Sport> getAllList(){
        return repo.findAll();
    }
    
}
