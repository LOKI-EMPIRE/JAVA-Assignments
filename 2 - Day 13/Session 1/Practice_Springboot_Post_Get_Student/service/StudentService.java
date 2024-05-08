package com.examly.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import com.examly.springapp.model.Student;
import com.examly.springapp.repository.StudentRepo;

@Service
public class StudentService {

    @Autowired
    private StudentRepo repo;

    public Student addStudent(Student s){
        return repo.save(s);
    }

    public Student getStudent(int id){
        if(repo.existsById(id)){
            return repo.findById(id).get();
        }
        return null;
    }

    public List<Student> getList(){
        return repo.findAll();
    }
    
}
