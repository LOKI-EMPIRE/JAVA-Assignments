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
import com.examly.springapp.model.Task;
import com.examly.springapp.service.TaskServiceImpl;

@RestController
public class TaskController {

    @Autowired
    private TaskServiceImpl service;

    @PostMapping("/task/project/{projectId}")
    public ResponseEntity<Task> addC(@PathVariable int projectId,@RequestBody Task t){
        Task t1 = service.addS(projectId, t);
        if(t1 != null){
            return new ResponseEntity<>(t1,HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/task")
    public ResponseEntity<List<Task>> getListC(){
        List<Task> list = service.getList();
        if(list != null){
            return new ResponseEntity<>(list,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/task/{taskId}")
    public ResponseEntity<Task> getByIdC(@PathVariable int taskId){
        Task t = service.getById(taskId);
        if(t != null){
            return new ResponseEntity<>(t,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/task/{taskId}")
    public ResponseEntity<String> deleteC(@PathVariable int taskId){
        boolean b = service.delete(taskId);
        if(b){
            return new ResponseEntity<>("Task deleted successfully",HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Task not found with ID: "+taskId,HttpStatus.NOT_FOUND);
        }
    }

    
}
