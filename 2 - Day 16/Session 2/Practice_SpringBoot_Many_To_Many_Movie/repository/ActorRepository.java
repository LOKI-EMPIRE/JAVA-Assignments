package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.Actor;

@Repository
public interface ActorRepository extends JpaRepository<Actor,Integer> {
    
}
