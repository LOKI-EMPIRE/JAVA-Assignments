package com.examly.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import com.examly.springapp.model.Shirt;
import com.examly.springapp.repository.ShirtRepo;

@Service
public class ShirtService {

    @Autowired
    private ShirtRepo repo;

    public Shirt add(Shirt s){
        return repo.save(s);
    }

    public List<Shirt> getList(){
        return repo.findAll();
    }

    public Shirt getShirt(int id){
        if(repo.existsById(id)){
            return repo.findById(id).get();
        }
        return null;
    }

    public Shirt update(int id,Shirt s){
        if(repo.existsById(id)){
            Shirt s1 = repo.findById(id).get();
            s1.setShirtSize(s.getShirtSize());
            s1.setShirtColor(s.getShirtColor());
            return s1;
        }
        return null;
    }

    public boolean delete(int id){
        if(repo.existsById(id)){
            repo.deleteById(id);
            return true;
        }
        return false;
    }
    
}
