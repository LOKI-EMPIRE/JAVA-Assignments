package com.examly.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    public ResponseEntity<Student> addC(@RequestBody Student s){
        Student s1 = service.addS(s);
        return new ResponseEntity<>(s1,HttpStatus.CREATED);
    }

    @GetMapping("/student")
    public ResponseEntity<List<Student>> getStudentC(){
        List<Student> list = service.getStudentS();
        if(list != null){
            return new ResponseEntity<>(list,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<Student> getStudentByIdC(@PathVariable long id){
        Student s1 = service.getStudentByIdS(id);
        if(s1 != null){
            return new ResponseEntity<>(s1,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/student/{id}")
    public ResponseEntity<Student> putStudentByIdC(@PathVariable long id,@RequestBody Student s){
        Student s1 = service.putStudentByIdS(id,s);
        if(s1 != null){
            return new ResponseEntity<>(s1, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/student/{id}")
    public ResponseEntity<String> deleteC(@PathVariable long id){
        boolean b = service.deleteS(id);
        if(b){
            return new ResponseEntity<>("Deleted Student successfully",HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Student with ID "+id+" not found",HttpStatus.OK);
        }
    }
}
