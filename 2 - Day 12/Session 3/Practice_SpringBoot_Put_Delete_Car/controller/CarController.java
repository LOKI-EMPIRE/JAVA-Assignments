package com.example.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.Car;
import com.example.springapp.service.CarService;

@RestController
public class CarController {

    @Autowired
    private CarService service;

    @PostMapping("/car")
    public ResponseEntity<Car> addC(@RequestBody Car c){
        Car c1 = service.add(c);
        if(c1 != null){
            return new ResponseEntity<>(c1,HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/car/{carId}")
    public ResponseEntity<Car> putC(@PathVariable int carId,@RequestBody Car c){
        Car c1 = service.update(carId,c);
        if(c1 != null){
            return new ResponseEntity<>(c1,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/car/{carId}")
    public ResponseEntity<Boolean> deleteC(@PathVariable int carId){
        boolean c1 = service.delete(carId);
        if(c1){
            return new ResponseEntity<>(c1,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(c1,HttpStatus.NOT_FOUND);
        }
    }
    
}
