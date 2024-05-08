package com.examly.springapp.service;

import java.util.*;
import org.springframework.stereotype.Service;
import com.examly.springapp.model.Truck;

@Service
public class TruckService {
    
    List<Truck> list = new ArrayList<>();

    public Truck add(Truck t){
        list.add(t);
        return t;
    }

    public List<Truck> getAll(){
        return list;
    }

    public Truck getId(int id){
        for(Truck t: list){
            if(t.getTruckId() == id){
                return t;
            }
        }
        return null;
    }
}
