package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

import com.examly.springapp.model.Department;
import com.examly.springapp.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student ,Integer> {

    List<Student> findByDepartment(Department d);
    
}
