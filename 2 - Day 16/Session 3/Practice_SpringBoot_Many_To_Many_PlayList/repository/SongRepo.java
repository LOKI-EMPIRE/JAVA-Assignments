package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.Song;

@Repository
public interface SongRepo extends JpaRepository<Song,Integer>{
    
}
