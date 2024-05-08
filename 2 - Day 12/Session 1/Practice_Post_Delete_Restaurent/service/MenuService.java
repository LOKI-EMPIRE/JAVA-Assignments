package com.example.springapp.service;

import java.util.*;
import org.springframework.stereotype.Service;

import com.example.springapp.model.MenuItem;

@Service
public class MenuService {

    List<MenuItem> list = new ArrayList<>();

    public MenuItem addItem(MenuItem it){
        list.add(it);
        return it;
    }
    
    public boolean deleteItem(int id){
        for(MenuItem it : list){
            if(it.getMenuId() == id){
                list.remove(list.indexOf(it));
                return true;
            }
        }
        return false;
    }
    
}
