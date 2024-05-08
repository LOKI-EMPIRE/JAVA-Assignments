package com.examly.springapp.service;
 
import org.springframework.stereotype.Service;
import java.util.*;
import com.examly.springapp.model.Laptop;
 
@Service
public class LaptopService {
 
    List<Laptop> list = new ArrayList<>();
 
    public Laptop addLaptop(Laptop l){
        list.add(l);
        return l;
    }
 
    public Laptop byId(int id){
        for(Laptop l:list){
            if(l.getLaptopid() == id){
                return l;
            }
        }
        return null;
    }
 
    public List<Laptop> getAll(){
        return list;
    }
   
}
