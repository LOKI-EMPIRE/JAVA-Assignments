package com.example.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.Category;
import com.example.springapp.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository repo;

    @Override
    public Category add(Category c) {
        return repo.save(c);
    }

    @Override
    public Category get(int id) {
       if(repo.existsById(id)){
        return repo.findById(id).get();
       }
       return null;
    }
    
}
