package com.examly.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.examly.springapp.model.College;
import com.examly.springapp.repository.CollegeRepo;

@Service
public class CollegeService {

    @Autowired
    private CollegeRepo repo;
    
    public College addS(College c){
        if(!repo.existsById(c.getId())){
            return repo.save(c);
        }
        return null;
    }

    public List<College> startsWithS(String name){
       return repo.findByCollegeNameStartsWith(name);
    }

    public List<College> endsWithS(String name){
       return repo.findByCollegeNameEndsWith(name);
    }
}

