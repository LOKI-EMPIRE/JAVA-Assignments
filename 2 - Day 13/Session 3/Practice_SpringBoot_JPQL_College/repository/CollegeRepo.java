package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;
import com.examly.springapp.model.College;

@Repository
public interface CollegeRepo extends JpaRepository<College,Long> {

    public List<College> findByCollegeNameStartsWith(String name);
    public List<College> findByCollegeNameEndsWith(String name);

}
