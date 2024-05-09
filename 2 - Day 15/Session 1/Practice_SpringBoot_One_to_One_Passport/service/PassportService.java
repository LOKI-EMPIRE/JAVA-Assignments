package com.examly.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.examly.springapp.model.Passport;
import com.examly.springapp.repository.PassportRepository;

@Service
public class PassportService {

    @Autowired
    private PassportRepository prepo;

    public Passport addSP(Passport p){
        if(p!=null){
           return prepo.save(p);
        }
        return null;
    }

    public List<Passport> getListSP(){
        return prepo.findAll();
    }

    
}
