package com.examly.springapp.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.Person;
import com.examly.springapp.repository.PersonRepo;

@Service
public class PersonService {
    
    @Autowired
    private PersonRepo repo;
    
    public Person addS(Person p){
        if(!repo.existsById(p.getId())){
            return repo.save(p);
        }
        return null;
    }

    public List<Person> findByLastnameNotS(String lastname){
        return repo.findByLastnameNot(lastname);
    }

    public List<Person> findByAgeNotInS(List<Integer> ages){
        return repo.findByAgeNotIn(ages);
    }
}

