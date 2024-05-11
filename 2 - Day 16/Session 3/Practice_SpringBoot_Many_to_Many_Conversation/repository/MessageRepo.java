package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.Message;

@Repository
public interface MessageRepo extends JpaRepository<Message,Integer>{
    
}
