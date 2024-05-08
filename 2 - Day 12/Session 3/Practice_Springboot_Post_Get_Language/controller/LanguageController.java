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
import com.examly.springapp.model.Language;
import com.examly.springapp.service.LanguageService;

@RestController
public class LanguageController {
    
    @Autowired
    private LanguageService service;

    @PostMapping("/api/language")
    public ResponseEntity<Language> addL(@RequestBody Language l){
        Language l1 = service.add(l);
        if(l1 != null){
            return new ResponseEntity<>(l1,HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/language")
    public ResponseEntity<List<Language>> getL(){
       List<Language> list = service.getList();
       if(list.isEmpty()){
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
       }else{
        return new ResponseEntity<>(list, HttpStatus.OK);
       }
    }

    @GetMapping("/api/language/{languageId}")
    public ResponseEntity<Language> getLId(@PathVariable int languageId){
        Language l = service.get(languageId);
        if(l != null){
            return new ResponseEntity<>(l,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
