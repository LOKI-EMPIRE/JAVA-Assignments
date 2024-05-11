package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.Movie;

@RestController
public interface MovieRepository extends JpaRepository<Movie,Integer>{
    
}
