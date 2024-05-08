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
import com.examly.springapp.model.ClassRoom;
import com.examly.springapp.service.ClassRoomService;

@RestController
public class ClassRoomController {

    @Autowired
    private ClassRoomService service;
    
    @PostMapping("/classrooms")
    public ResponseEntity<ClassRoom> addCl(@RequestBody ClassRoom cl){
        ClassRoom cl1 = service.addClass(cl);
        if(cl1 != null){
            return new ResponseEntity<>(cl1, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/classrooms/{roomId}")
    public ResponseEntity<ClassRoom> getCl(@PathVariable int roomId){
        ClassRoom c1 = service.getClass(roomId);
        if(c1 != null){
            return new ResponseEntity<>(c1, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/classrooms")
    public ResponseEntity<List<ClassRoom>> getAll(){
        List<ClassRoom> list = service.getList();
        if(list.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<>(list,HttpStatus.OK);
        }
    }
}
