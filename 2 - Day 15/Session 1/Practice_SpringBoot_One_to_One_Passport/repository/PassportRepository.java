package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.Passport;

@Repository
public interface PassportRepository extends JpaRepository<Passport,Long> {

    
}
