package com.example.springapp.service;

import java.util.*;
import org.springframework.stereotype.Service;
import com.example.springapp.model.Product;

@Service
public class ProductService {

    List<Product> list = new ArrayList<>();

    public Product addProduct(Product p){
        list.add(p);
        return p;
    }

    public Product getProduct(long id){
        for(Product p:list){
            if(p.getProductId() == id){
                return p;
            }
        }
        return null;
    }
    
}
