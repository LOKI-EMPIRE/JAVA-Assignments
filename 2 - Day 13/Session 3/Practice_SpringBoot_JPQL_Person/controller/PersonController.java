package com.examly.springapp.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.Person;
import com.examly.springapp.service.PersonService;

@RestController
public class PersonController {

    @Autowired
    private PersonService service;

    @PostMapping("/person")
    public ResponseEntity<Person> addC(@RequestBody Person p){
        Person p1 = service.addS(p);
        if(p1 != null){
            return new ResponseEntity<>(p1,HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/person/findByLastnameNot")
    public ResponseEntity<List<Person>> getByLastNamenotC(@RequestParam("lastname") String lastname){
        List<Person> p1 = service.findByLastnameNotS(lastname);
        return new ResponseEntity<>(p1,HttpStatus.OK);
    }

    @GetMapping("/person/findByAgeNotIn")
    public ResponseEntity<List<Person>> getByAgeNotInC(@RequestParam("ages")List<Integer> ages){
        List<Person> p1 = service.findByAgeNotInS(ages);
        return new ResponseEntity<>(p1,HttpStatus.OK);
    }
    
}

