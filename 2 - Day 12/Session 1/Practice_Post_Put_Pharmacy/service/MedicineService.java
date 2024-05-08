package com.example.springapp.service;

import java.util.*;
import org.springframework.stereotype.Service;

import com.example.springapp.model.Medicine;

@Service
public class MedicineService {

    List<Medicine> list = new ArrayList<>();

    public Medicine addMedicine(Medicine m){
        list.add(m);
        return m;
    }

    public Medicine updateMedicine(int medicineId,Medicine m){
        for(Medicine m1:list){
            if(m1.getMedicineId() == medicineId ){
                m1.setMedicineName(m.getMedicineName());
                m1.setPrice(m.getPrice());
                m1.setQuantity(m.getQuantity());
                m1.setDescription(m.getDescription());
                return m1;
            }
        }
        return null;
    }
}
