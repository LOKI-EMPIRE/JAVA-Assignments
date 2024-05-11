package com.example.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.example.springapp.model.Group;
import com.example.springapp.model.User;
import com.example.springapp.repository.GroupRepository;
import com.example.springapp.repository.UserRepository;

@Service
public class ApiService {
    
    @Autowired
    private GroupRepository grepo;

    @Autowired
    private UserRepository urepo;

    public Group addG(Group g){
        return grepo.save(g);
    }

    public User addU(User u){
        return urepo.save(u);
    }

    public Group addBoth(int gid,int uid){
        if(grepo.existsById(gid) && urepo.existsById(uid)){
            Group g = grepo.findById(gid).get();
            User u = urepo.findById(uid).get();
            g.addUser(u);
            u.addGroup(g);
            urepo.save(u);
            return grepo.save(g);
        }
        return null;
    }

    public List<User> getListU(){
        return urepo.findAll();
    }

    public Group getGroupById(int gid){
        if(grepo.existsById(gid)){
            return grepo.findById(gid).get();
        }
        return null;
    }
}
