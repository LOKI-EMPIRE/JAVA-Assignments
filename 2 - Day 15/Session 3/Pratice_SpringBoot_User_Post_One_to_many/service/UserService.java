package com.examly.springapp.service;

import com.examly.springapp.model.User;

public interface UserService {
    
    User add(User u);
    User getById(int userId);
    
}
