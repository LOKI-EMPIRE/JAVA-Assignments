package com.examly.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.examly.springapp.model.Department;
import com.examly.springapp.service.DepartmentService;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @PostMapping("/department")
    public ResponseEntity<Department> add(@RequestBody Department d){
        Department d1 = service.add(d);
        if(d1 != null){
            return new ResponseEntity<>(d1,HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/department")
    public ResponseEntity<List<Department>> getList(){
        List<Department> list = service.getList();
        if(list != null){
            return new ResponseEntity<>(list,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
}
