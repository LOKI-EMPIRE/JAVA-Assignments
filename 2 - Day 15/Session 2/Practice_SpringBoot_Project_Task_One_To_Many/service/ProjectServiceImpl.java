package com.examly.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.Project;
import com.examly.springapp.repository.ProjectRepository;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectRepository repo;

    @Override
    public Project addS(Project p) {
        if(p != null){
            return repo.save(p);
        }
        return null;
    }

    @Override
    public Project getByIdS(int id) {
        if(repo.existsById(id)){
            return repo.findById(id).get();
        }
        return null;
    }

    
}
