package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
