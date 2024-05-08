package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;
import com.example.springapp.model.Door;

@Repository
public interface DoorRepo extends JpaRepository<Door,Integer> {

    public List<Door> findByColor(String color);
    public List<Door> findByDoorType(String doorType);
    
} 
