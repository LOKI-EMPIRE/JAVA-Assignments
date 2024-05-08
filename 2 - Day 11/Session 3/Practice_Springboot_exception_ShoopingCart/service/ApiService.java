package com.examly.springapp.service;

import java.util.*;
import org.springframework.stereotype.Service;
import com.examly.springapp.exception.ProductException;
import com.examly.springapp.model.ShoppingCart;

@Service
public class ApiService {

    List<ShoppingCart> list = new ArrayList<>();

    public ShoppingCart addProduct(ShoppingCart s) throws ProductException{
        for(ShoppingCart s1 : list){
          if(s1.getName().equals(s.getName())){
              throw new ProductException("Invalid product details");
            }
        }
        list.add(s);
        return s;
    }

    public double getProduct() {
        double product = 0;
        for(ShoppingCart s:list){
            product = product + (s.getPrice() * s.getQuantity());
        }
        return product;
    }
    
}
