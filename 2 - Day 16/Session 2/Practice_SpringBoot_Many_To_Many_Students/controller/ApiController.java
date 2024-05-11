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

import com.examly.springapp.model.Course;
import com.examly.springapp.model.Student;
import com.examly.springapp.service.ApiService;

@RestController
public class ApiController {

    @Autowired
    private ApiService service;

    @PostMapping("/addstudent")
    public ResponseEntity<Student> add(@RequestBody Student s){
        Student s1 = service.addS(s);
        if(s1 != null){
            return new ResponseEntity<>(s1,HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/getallstudent")
    public ResponseEntity<List<Student>> getList(){
        List<Student> list = service.getListS();
        if(list != null){
            return new ResponseEntity<>(list,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/student/{studentId}")
    public ResponseEntity<Student> getById(@PathVariable int studentId){
        Student s = service.getByIdS(studentId);
        if(s != null){
            return new ResponseEntity<>(s,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("updatestudent/{studentId}")
    public ResponseEntity<Student> update(@PathVariable int studentId,@RequestBody Student s1){
        Student s = service.updateById(studentId, s1);
        if(s != null){
            return new ResponseEntity<>(s,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/updatecourse/{courseId}")
    public ResponseEntity<Course> updateS(@PathVariable int courseId,@RequestBody Course c){
        Course s = service.updateCourse(courseId, c);
        if(s!=null){
            return new ResponseEntity<>(s,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/deletestudent/{studentId}")
    public ResponseEntity<String> delete(@PathVariable int studentId){
        boolean b = service.delete(studentId);
        if(b){
            return new ResponseEntity<>("Student deleted Successfully",HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Student not found",HttpStatus.NOT_FOUND);
        }
    }

    
}
