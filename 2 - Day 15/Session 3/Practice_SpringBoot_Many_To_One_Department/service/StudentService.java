package com.examly.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.examly.springapp.model.Department;
import com.examly.springapp.model.Student;
import com.examly.springapp.repository.DepartmentRepo;
import com.examly.springapp.repository.StudentRepo;

@Service
public class StudentService {

    @Autowired
    private StudentRepo repo;

    @Autowired
    private DepartmentRepo arepo;

    public Student add(int id,Student s){
        if(arepo.existsById(id)){
            Department d = arepo.findById(id).get();
            s.setDepartment(d);
            return repo.save(s);
        }
        return null;
    }

    public List<Student> getListById(int id){
        return repo.findByDepartment(arepo.findById(id).get());
    }

    public List<Student> getListbyDepartment(){
        return repo.findAll();
    }

    public Student getByStudentId(int id){
        if(repo.existsById(id)){
            return repo.findById(id).get();
        }
        return null;
    }
    
}
