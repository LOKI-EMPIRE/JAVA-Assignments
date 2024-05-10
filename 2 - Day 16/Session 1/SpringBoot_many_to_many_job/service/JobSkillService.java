package com.examly.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.examly.springapp.model.Job;
import com.examly.springapp.model.Skills;
import com.examly.springapp.repository.JobRepository;
import com.examly.springapp.repository.SkillsRepository;

@Service
public class JobSkillService {

    @Autowired
    private JobRepository repo;

    @Autowired
    private SkillsRepository srepo;

    public Job add(Job j){
        return repo.save(j);
    }

    public Skills add(Skills s){
        return srepo.save(s);
    }

    public Job assignJob(long jid,long sid){
        if(repo.existsById(jid) && srepo.existsById(sid)){
            Job job = repo.findById(jid).get();
            Skills skill = srepo.findById(sid).get();
            job.setSkills(skill);
            repo.save(job);
            skill.setJobs(job);
            srepo.save(skill);
            return job;
        }
        return null;
    }

    public List<Job> getListJ(){
        return repo.findAll();
    }

    public List<Skills> getListS(){
        return srepo.findAll();
    }

    public boolean delete(long id){
        if(repo.existsById(id)){
            repo.deleteById(id);
            return true;
        }
        return false;
    }
    
}
