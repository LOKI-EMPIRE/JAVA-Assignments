package com.examly.springapp.service;

import com.examly.springapp.model.Product;

public interface ProductService {

    Product add(int id,Product c);
    boolean delete(int id);
    
}
