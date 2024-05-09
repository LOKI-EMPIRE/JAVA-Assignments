package com.examly.springapp.service;

import com.examly.springapp.model.Customer;

public interface CustomerService {

    Customer add(Customer c);
    Customer getById(int id);
    
}
