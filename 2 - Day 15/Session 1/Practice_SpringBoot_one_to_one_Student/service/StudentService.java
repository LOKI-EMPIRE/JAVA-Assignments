package com.examly.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.examly.springapp.model.Student;
import com.examly.springapp.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository srepo;

    public Student addS(Student s){
        return srepo.save(s);
    }

    public List<Student> getStudentS(){
        return srepo.findAll();
    }

    public Student getStudentByIdS(long id){
        if(srepo.existsById(id)){
            return srepo.findById(id).get();
        }
        return null;
    }

    public Student putStudentByIdS(long id,Student s){
        if(srepo.existsById(id)){
            Student s1 = srepo.findById(id).get(); 
            s1.setName(s.getName());
            s1.setStudentIDCard(s.getStudentIDCard());
            return s;
        }
        return null;
    }

    public boolean deleteS(long id){
        if(srepo.existsById(id)){
            srepo.deleteById(id);
            return true;
        }
        return false;
    }
    
}
