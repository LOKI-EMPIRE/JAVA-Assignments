package com.examly.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.Job;
import com.examly.springapp.model.Skills;
import com.examly.springapp.service.JobSkillService;

@RestController
public class ApiController {
    @Autowired
    private JobSkillService service;

    @PostMapping("/api/jobs")
    public ResponseEntity<Job> addJob(@RequestBody Job j) {
        Job jo = service.add(j);
        if (jo != null) {
            return new ResponseEntity<>(jo, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/api/skills")
    public ResponseEntity<Skills> addSkill(@RequestBody Skills s) {
        Skills sk = service.add(s);
        if (sk != null) {
            return new ResponseEntity<>(sk, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/api/jobs/{jobId}/add-skill/{skillId}")
    public ResponseEntity<Job> assignSkill(@PathVariable long jobId, @PathVariable long skillId) {
        Job jo = service.assignJob(jobId, skillId);
        if (jo != null) {
            return new ResponseEntity<>(jo, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/jobs")
    public ResponseEntity<List<Job>> getAllJob() {
        List<Job> jo = service.getListJ();
        if (jo.size() > 0) {
            return new ResponseEntity<>(jo, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/api/skills")
    public ResponseEntity<List<Skills>> getAllSkill() {
        List<Skills> sk = service.getListS();
        if (sk.size() > 0) {
            return new ResponseEntity<>(sk, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/api/jobs/{id}")
    public ResponseEntity<Boolean> deleteByJobId(@PathVariable long id) {
        boolean sk = service.delete(id);
        if (sk) {
            return new ResponseEntity<>(sk, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
