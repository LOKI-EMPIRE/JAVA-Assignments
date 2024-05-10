package com.example.springapp.service;

import com.example.springapp.model.Category;

public interface CategoryService {

    Category add(Category c);
    Category get(int id);
    
}
