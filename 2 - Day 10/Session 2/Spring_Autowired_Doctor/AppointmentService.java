package com.examly.springapp;

public class AppointmentService {

    Doctor doctor;
    Patient patient;
    

    public Doctor getDoctor() {
        return doctor;
    }


    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }


    public Patient getPatient() {
        return patient;
    }


    public void setPatient(Patient patient) {
        this.patient = patient;
    }


    @Override
    public String toString() {
        return doctor.toString() + patient.toString();
    }

    
    
}
