package com.example.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.Category;
import com.example.springapp.model.Product;
import com.example.springapp.repository.CategoryRepository;
import com.example.springapp.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repo;

    @Autowired
    private CategoryRepository arepo;

    @Override
    public Product add(int id, Product p) {
        if(arepo.existsById(id)){
            Category c = arepo.findById(id).get();
            p.setCategories(c);
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
