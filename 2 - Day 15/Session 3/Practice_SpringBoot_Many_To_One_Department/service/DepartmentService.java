package com.examly.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.examly.springapp.model.Department;
import com.examly.springapp.repository.DepartmentRepo;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepo repo;

    public Department add(Department d){
        if(d!=null){
            return repo.save(d);
        }
        return null;
    }

    public List<Department> getList(){
        return repo.findAll();
    }
    
}
