package com.examly.springapp.service;

import java.util.*;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.ClassRoom;

@Service
public class ClassRoomService {

    List<ClassRoom> list = new ArrayList<>();

    public ClassRoom addClass(ClassRoom c){
        list.add(c);
        return c;
    }
    
    public ClassRoom getClass(int id){
        for(ClassRoom c1: list){
            if(c1.getRoomId() == id){
                return c1;
            }
        }
        return null;
    }

    public List<ClassRoom> getList(){
        return list;
    }
}
