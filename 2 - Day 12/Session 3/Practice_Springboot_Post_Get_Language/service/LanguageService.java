package com.examly.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import com.examly.springapp.model.Language;
import com.examly.springapp.repository.LanguageRepository;

@Service
public class LanguageService {

    @Autowired
    private LanguageRepository repo;

    public Language add(Language l){
        return repo.save(l);
    }

    public Language get(int id){
        if(repo.existsById(id)){
            return repo.findById(id).get();
        }
        return null;
    }
    
    public List<Language> getList(){
        return repo.findAll();
    }
}
