package com.examly.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.Customer;
import com.examly.springapp.repository.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepo repo;

    @Override
    public Customer add(Customer c) {
        if(c!=null){
            return repo.save(c);
        }
        return null;
    }

    @Override
    public Customer getById(int id) {
       if(repo.existsById(id)){
        return repo.findById(id).get();
       }
       return null;
    }
    
    
}
