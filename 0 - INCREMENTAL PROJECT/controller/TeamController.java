package com.examly.springapp.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.entity.Team;
import com.examly.springapp.service.serviceImpl.TeamServiceImpl;

@RestController
public class TeamController {

    @Autowired
    private TeamServiceImpl service;

    List<Team> list = new ArrayList<>();
    Team t1 = new Team("Loki",10000.66);
    Team t2 = new Team("Gokul",10000.88);
    Team t3 = new Team("Sekar",10000.99);
    
    @GetMapping("api/test/team")
    public List<Team> getList(){
        list.add(t1);
        list.add(t2);
        list.add(t3);
        return list;
    }
    
    @PostMapping("api/team")
    public Team addT(@RequestBody Team t){
        return service.add(t);
    }

    @PutMapping("api/team/{teamId}")
    public Team updateT(@PathVariable int teamId,@RequestBody Team t){
        return service.update(teamId,t);
    }

    @GetMapping("api/team")
    public List<Team> getListT(){
        return service.getAll();
    }

    @GetMapping("api/team/{teamId}")
    public Team getById(@PathVariable long teamId){
        return service.get(teamId);
    }

    @DeleteMapping("api/team/{teamId}")
    public boolean deleteT(@PathVariable long teamId){
        return service.delete(teamId);
    }
}
