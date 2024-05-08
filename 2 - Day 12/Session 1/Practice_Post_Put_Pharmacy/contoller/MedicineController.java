package com.example.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.Medicine;
import com.example.springapp.service.MedicineService;

@RestController
public class MedicineController {

    @Autowired
    private MedicineService service;

    @PostMapping("/medicine")
    public ResponseEntity<Medicine> addM(@RequestBody Medicine m){
        Medicine m1 = service.addMedicine(m);
        if(m1 != null){
            return new ResponseEntity<>(m1,HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @PutMapping("/medicine/{medicineId}")
    public ResponseEntity<Medicine> putM(@PathVariable int medicineId,@RequestBody Medicine m){
        Medicine m1 = service.updateMedicine(medicineId, m);
        if(m1 != null){
            return new ResponseEntity<>(m1,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
