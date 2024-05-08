package com.example.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.Car;
import com.example.springapp.repository.CarRepo;

@Service
public class CarService {

    @Autowired
    private CarRepo repo;

    public Car add(Car c){
      return repo.save(c);
    }

    public Car update(int id , Car c){
        if(repo.existsById(id)){
            Car c1 = repo.findById(id).get();
            c1.setBrand(c.getBrand());
            c1.setColor(c.getColor());
            c1.setPrice(c.getPrice());
            return c1;
        }
        return null;
    }

    public boolean delete(int id){
        if(repo.existsById(id)){
            repo.deleteById(id);
            return true;
        }
    return false;
    }
    
}
