package com.examly.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.User;
import com.examly.springapp.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repo;

    @Override
    public User add(User u) {
        if(u!=null){
            return repo.save(u);
        }
        return null;
    }

    @Override
    public User getById(int userId) {
       if(repo.existsById(userId)){
        return repo.findById(userId).get();
       }
       return null;
    }
    
}
