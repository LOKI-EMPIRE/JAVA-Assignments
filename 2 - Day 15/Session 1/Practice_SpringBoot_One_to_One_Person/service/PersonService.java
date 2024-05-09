package com.examly.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.examly.springapp.model.Person;
import com.examly.springapp.repository.PersonRepository;

@Service
public class PersonService {
    
    @Autowired
    private PersonRepository prepo;

    public Person addPersonS(Person p){
        if(p != null){
        return prepo.save(p);
        }
        return null;
    }

    public List<Person> getPersonListS(){
        return prepo.findAll();
    }

    public Person getByPersonIdS(long pid){
        if(prepo.existsById(pid)){
            return prepo.findById(pid).get();
        }
        return null;
    }
}
