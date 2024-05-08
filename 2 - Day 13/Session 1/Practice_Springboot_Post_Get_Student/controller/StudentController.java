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
import com.examly.springapp.model.Student;
import com.examly.springapp.service.StudentService;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/student")
    public ResponseEntity<Student> addS(@RequestBody Student s){
        Student s1 = service.addStudent(s);
        if(s1 != null){
            return new ResponseEntity<>(s1, HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/student/{studentId}")
    public ResponseEntity<Student> getS(@PathVariable int studentId){
        Student s1 = service.getStudent(studentId);
        if(s1 != null){
            return new ResponseEntity<>(s1,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/student")
    public ResponseEntity<List<Student>> getAllS(){
        List<Student> list = service.getList();
        if(list.size()>0){
            return new ResponseEntity<>(list,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
}
