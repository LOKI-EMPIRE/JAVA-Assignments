package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;
import com.examly.springapp.model.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person,Long> {
    
    public List<Person> findByLastnameNot(String lastname);
    public List<Person> findByAgeNotIn(List<Integer> ages);
}

