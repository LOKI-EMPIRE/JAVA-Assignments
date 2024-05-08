package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examly.springapp.model.Sport;

public interface SportRepo extends JpaRepository<Sport,Integer>{
    
}
