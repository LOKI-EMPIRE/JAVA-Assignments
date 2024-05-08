package com.example.springapp.service;

import java.util.*;
import org.springframework.stereotype.Service;

import com.example.springapp.exception.ItemException;
import com.example.springapp.model.Item;

@Service
public class InventoryService {
    
    List<Item> list = new ArrayList<>();

    public Item addItem(Item it){
        for(Item it1 : list){
            if(it1.getId() == it.getId()){
                throw new ItemException("Invalid item details.");
            }
        }
        list.add(it);
        return it;
    }

    public double getItem(){
       double product =0;
       for(Item it:list){
        product += (it.getPrice()*it.getQuantity());
       }
       return product;
    }

}
