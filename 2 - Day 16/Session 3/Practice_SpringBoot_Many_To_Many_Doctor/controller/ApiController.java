package com.examly.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.examly.springapp.model.Doctor;
import com.examly.springapp.model.Patients;
import com.examly.springapp.service.ApiService;

@RestController
public class ApiController {
    
    @Autowired
    private ApiService service;

    @PostMapping("api/doctors")
    public ResponseEntity<Doctor> addD(@RequestBody Doctor d){
        Doctor d1 = service.addD(d);
        if(d1 != null){
            return new ResponseEntity<>(d1,HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/api/patients")
    public ResponseEntity<Patients> addP(@RequestBody Patients p){
        Patients p1 = service.addP(p);
        if(p1 != null){
            return new ResponseEntity<>(p1,HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/api/doctors/{doctorId}/add-patient/{patientId}")
    public ResponseEntity<Doctor> addBoth(@PathVariable long doctorId,@PathVariable long patientId){
        Doctor d = service.addBoth(doctorId, patientId);
        if(d != null){
            return new ResponseEntity<>(d ,HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/patients")
    public ResponseEntity<List<Patients>> getListP(){
        List<Patients> list = service.getListP();
        if(list != null){
            return new ResponseEntity<>(list,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/api/doctors")
    public ResponseEntity<List<Doctor>> getListD(){
        List<Doctor> list = service.getListD();
        if(list != null){
            return new ResponseEntity<>(list,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/api/doctors/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable long id){
        boolean b = service.delete(id);
        if(b){
            return new ResponseEntity<>(b,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(b,HttpStatus.NOT_FOUND);
        }
    }
}
