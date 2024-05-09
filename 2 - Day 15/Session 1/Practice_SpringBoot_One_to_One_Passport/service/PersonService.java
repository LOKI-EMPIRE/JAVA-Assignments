package com.examly.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.Passport;
import com.examly.springapp.model.Person;
import com.examly.springapp.repository.PassportRepository;
import com.examly.springapp.repository.PersonRepository;

@Service
public class PersonService{

    @Autowired
    private PersonRepository repop;

    @Autowired
    private PassportRepository repo;

    public Person addPS(long id,Person p){
        if(repo.existsById(id)){
            Passport p1 = repo.findById(id).get();
            p.setPassport(p1);
            return repop.save(p);
        }
        return null;
    }

    public Person getSR(long id){
        if(repop.existsById(id)){
            return repop.findById(id).get();
        }
        return null;
    }
    
}
