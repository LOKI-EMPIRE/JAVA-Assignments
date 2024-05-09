package com.examly.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.Person;
import com.examly.springapp.service.PersonService;

@RestController
public class PersonController {

    @Autowired
    private PersonService service;

    @PostMapping("/person/passport/{passportId}")
    public ResponseEntity<Person> addPC(@PathVariable long passportId,@RequestBody Person p){
        Person p1 = service.addPS(passportId, p);
        if(p1 != null){
            return new ResponseEntity<>(p1,HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/person/{personId}")
    public ResponseEntity<Person> getCR(@PathVariable long personId){
        Person p = service.getSR(personId);
        if(p!=null){
            return new ResponseEntity<>(p,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
}
