package com.example.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.example.springapp.model.Door;
import com.example.springapp.repository.DoorRepo;

@Service
public class DoorService {
    
    @Autowired
    private DoorRepo repo;

    public Door addS(Door d){
        if(!repo.existsById(d.getDoorId())){
           return repo.save(d);
        }
        return null;
    }

    public List<Door> getByColorS(String color){
        return repo.findByColor(color);
    }

    public Door updateByDoorIdS(int doorId,String color){
        if(repo.existsById(doorId)){
            Door d1 = repo.findById(doorId).get();
            d1.setColor(color);
            return d1;
        }
        return null;
    }

    public boolean deleteByIdS(int doorId){
        if(repo.existsById(doorId)){
            repo.deleteById(doorId);
            return true;
        }
        return false;
    }

    public List<Door> getByDoorTypeS(String doorType){
        return repo.findByDoorType(doorType);
    }

    public List<Door> getListS(){
        return repo.findAll();
    }

    public Door getByIdS(int doorType){
        if(repo.existsById(doorType)){
            return repo.findById(doorType).get();
        }
        return null;
    }
}
