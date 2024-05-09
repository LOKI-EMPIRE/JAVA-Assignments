package com.examly.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.Project;
import com.examly.springapp.service.ProjectServiceImpl;

@RestController
public class ProjectController {

    @Autowired
    private ProjectServiceImpl service;


    @PostMapping("/project")
    public ResponseEntity<Project> addC(@RequestBody Project p){
        Project p1 = service.addS(p);
        if(p1 != null){
            return new ResponseEntity<>(p1,HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/project/{projectId}")
    public ResponseEntity<Project> getByIdC(@PathVariable int projectId){
        Project p1 = service.getByIdS(projectId);
        if(p1 != null){
            return new ResponseEntity<>(p1,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); 
        }
    }
    
}
