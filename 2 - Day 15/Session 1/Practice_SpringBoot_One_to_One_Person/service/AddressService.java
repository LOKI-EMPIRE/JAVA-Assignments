package com.examly.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.examly.springapp.model.Address;
import com.examly.springapp.model.Person;
import com.examly.springapp.repository.AddressRepository;
import com.examly.springapp.repository.PersonRepository;

@Service
public class AddressService {
    
    @Autowired
    private AddressRepository arepo;

    @Autowired
    private PersonRepository prepo;

    public Address addAddressS(long pid , Address addr){
        if(prepo.existsById(pid)){
            Person p = prepo.findById(pid).get();
            Address a = arepo.save(addr);
            p.setAddress(a);
            prepo.save(p);
            return addr;
        }
        return null;
    }
}
