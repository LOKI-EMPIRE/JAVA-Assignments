package com.examly.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.Project;
import com.examly.springapp.model.Task;
import com.examly.springapp.repository.ProjectRepository;
import com.examly.springapp.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository repo;

    @Autowired
    private ProjectRepository prepo;
    
    @Override
    public Task addS(int id, Task t) {
        if(prepo.existsById(id)){
            Project p = prepo.findById(id).get();
            t.setProject(p);
            return repo.save(t);
        }
        return null;
    }

    @Override
    public List<Task> getList() {      
        return repo.findAll();
    }

    @Override
    public Task getById(int id) {
        if(repo.existsById(id)){
            return repo.findById(id).get();
        }
        return null;
    }

    @Override
    public boolean delete(int id) {
        if(repo.existsById(id)){
            repo.deleteById(id);
            return true;
        }
        return false;
    }
    
}
