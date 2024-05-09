package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.Post;

@Repository
public interface PostRepo extends JpaRepository<Post,Integer> {
    
}
