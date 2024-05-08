package com.examly.springapp.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import com.examly.springapp.entity.Team;
import com.examly.springapp.repository.TeamRepo;
import com.examly.springapp.service.TeamService;

@Service
public class TeamServiceImpl implements TeamService {


    @Autowired
    private TeamRepo repo;

    public Team add(Team t){
        return repo.save(t);
    }

    public Team get(int id){
        if(repo.existsById(id)){
            return repo.findById(id).get();
        }
        return null;
    }

    public List<Team> getAll(){
        return repo.findAll();
    }

    public Team update(int id,Team t){
        if(repo.existsById(id)){
            Team t1 = repo.findById(id).get();
            t1.setName(t.getName());
            t1.setMaximumBudget(t.getMaximumBudget());
            return t1;
        }
        return null;
    }

    public boolean delete(int id){
        if(repo.existsById(id)){
            delete(id);
            return true;
        }
       return false;
    }
    
}
