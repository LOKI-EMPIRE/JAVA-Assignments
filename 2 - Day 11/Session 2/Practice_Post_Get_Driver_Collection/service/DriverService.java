package com.examly.springapp.service;

import java.util.*;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.Driver;

@Service
public class DriverService {

    List<Driver> list = new ArrayList<>();

    public Driver addD(Driver d){
        list.add(d);
        return d;
    }

    public Driver getD(int id){
        for(Driver d : list){
            if(d.getDriverId() == id){
                return d;
            }
        }
        return null;
    }

    public List<Driver> getAllD(){
        return list;
    }
    
}
