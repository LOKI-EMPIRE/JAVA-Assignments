package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.StudentIDCard;

@Repository
public interface StudentIDRepository extends JpaRepository<StudentIDCard,Long> {

    
} 
