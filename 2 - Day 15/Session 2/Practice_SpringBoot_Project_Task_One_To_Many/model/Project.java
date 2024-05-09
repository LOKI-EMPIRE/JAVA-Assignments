package com.examly.springapp.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Project {

    @Id
    @GeneratedValue
    private int projectId;
    private String projectName;
    
    @OneToMany(mappedBy = "project")
    @JsonManagedReference
    private List<Task> tasks;

    public Project(){}

    public Project(String projectName, List<Task> tasks) {
        this.projectName = projectName;
        this.tasks = tasks;
    }

    public int getProjectId() {
        return projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(Task task) {
        this.tasks.add(task);
    } 
    
}
