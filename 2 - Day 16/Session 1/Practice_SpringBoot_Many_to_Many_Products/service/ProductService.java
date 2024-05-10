package com.example.springapp.service;

import com.example.springapp.model.Product;

public interface ProductService {

    Product add(int id,Product p);
    boolean delete(int id);
    
}
