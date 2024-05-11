package com.examly.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.examly.springapp.model.Doctor;
import com.examly.springapp.model.Patients;
import com.examly.springapp.repository.DoctorRepository;
import com.examly.springapp.repository.PatientRepository;

@Service
public class ApiService {

    @Autowired
    private DoctorRepository drepo;

    @Autowired
    private PatientRepository prepo;

    public Doctor addD(Doctor d){
        return drepo.save(d);
    }

    public Patients addP(Patients p){
        return prepo.save(p);
    }

    public Doctor addBoth(long did,long pid){
        if(drepo.existsById(did) && prepo.existsById(pid)){
            Doctor d = drepo.findById(did).get();
            Patients p = prepo.findById(pid).get();
            d.addPatient(p);
            p.addDoctor(d);
            prepo.save(p);
            return drepo.save(d);
        }
        return null;
    }

    public List<Doctor> getListD(){
        return drepo.findAll();
    }

    public List<Patients> getListP(){
        return prepo.findAll();
    }

    public boolean delete(long id){
        if(drepo.existsById(id)){
            drepo.deleteById(id);
            return true;
        }
        return false;
    }
    
}
