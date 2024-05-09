package com.examly.springapp.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {

    @Id
    private long id;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private StudentIDCard studentIDCard;

    public Student(){}

    public Student(long id, String name, StudentIDCard studentIDCard) {
        this.id = id;
        this.name = name;
        this.studentIDCard = studentIDCard;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentIDCard getStudentIDCard() {
        return studentIDCard;
    }

    public void setStudentIDCard(StudentIDCard studentIDCard) {
        this.studentIDCard = studentIDCard;
    }
    
    
}
