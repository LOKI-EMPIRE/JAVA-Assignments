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
import com.examly.springapp.model.Person;
import com.examly.springapp.service.PersonService;


@RestController
public class PersonController {

    @Autowired
    private PersonService pservice;
    
    @PostMapping("/person")
    public ResponseEntity<Person> addPersonC(@RequestBody Person p){
        Person p1 = pservice.addPersonS(p);
        if(p1 != null){
            return new ResponseEntity<>(p1,HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/person")
    public ResponseEntity<List<Person>> getListPersonC(){
        List<Person> list = pservice.getPersonListS();
        if( list != null){
            return new ResponseEntity<>(list,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/person/{personId}")
    public ResponseEntity<Person> getPersonC(@PathVariable long personId){
        Person p = pservice.getByPersonIdS(personId);
        if(p!=null){
            return new ResponseEntity<>(p,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
}
