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

    @PostMapping("/department/{departmentId}/student")
    public ResponseEntity<Student> add(@PathVariable int departmentId,@RequestBody Student s){
        Student s1 = service.add(departmentId, s);
        if(s1 != null){
            return new ResponseEntity<>(s1,HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/department/{departmentId}/student")
    public ResponseEntity<List<Student>> getListById(@PathVariable int departmentId){
        List<Student> list = service.getListById(departmentId);
        if(list != null){
            return new ResponseEntity<>(list,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/department/student")
    public ResponseEntity<List<Student>> getListByDepartment(){
        List<Student> list = service.getListbyDepartment();
        if(list != null){
            return new ResponseEntity<>(list,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/department/student/{studentId}")
    public ResponseEntity<Student> getByStudentId(@PathVariable int studentId){
        Student s = service.getByStudentId(studentId);
        if(s != null){
            return new ResponseEntity<>(s,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    
}
