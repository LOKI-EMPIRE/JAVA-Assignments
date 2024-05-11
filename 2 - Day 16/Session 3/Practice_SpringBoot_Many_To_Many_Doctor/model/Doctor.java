package com.examly.springapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import java.util.*;

@Entity
public class Doctor {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String specialization;

    @ManyToMany
    @JoinTable(
        name = "doctor_patients",
        joinColumns = @JoinColumn(name = "doctor_id"),
        inverseJoinColumns = @JoinColumn(name ="patient_id")
    )
    private Set<Patients> patients = new HashSet<>();

    public Doctor(){}

    public Doctor(String name, String specialization, Set<Patients> patients) {
        this.name = name;
        this.specialization = specialization;
        this.patients = patients;
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

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Set<Patients> getPatients() {
        return patients;
    }

    public void setPatients(Set<Patients> patients) {
        this.patients = patients;
    }
    
    public void addPatient(Patients patient){
        this.patients.add(patient);
    }
    
}
