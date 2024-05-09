package com.examly.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.Customer;
import com.examly.springapp.model.Product;
import com.examly.springapp.repository.CustomerRepo;
import com.examly.springapp.repository.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo repo;

    @Autowired
    private CustomerRepo prepo;

    @Override
    public Product add(int id, Product p) {
        if(prepo.existsById(id)){
            Customer c = prepo.findById(id).get();
            p.setCustomer(c);
            return repo.save(p);
        }
        return null;
    }

    @Override
    public boolean delete(int id) {
        if(repo.existsById(id)){
            repo.deleteById(id);
            return true;
        }
        return false;
    }

    
    
}
