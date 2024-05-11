package com.examly.springapp.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.examly.springapp.model.Message;
import com.examly.springapp.model.User;
import com.examly.springapp.repository.MessageRepo;
import com.examly.springapp.repository.UserRepo;

@Service
public class ApiService {

    @Autowired
    private UserRepo urepo;

    @Autowired
    private MessageRepo mrepo;

    public User addU(User u){
        return urepo.save(u);
    }

    public Message addM(int uid,Message m){
        if(urepo.existsById(uid)){
            User u = urepo.findById(uid).get();
            m.addUser(u);
            return mrepo.save(m);
        }
        return null;
    }

    public List<User> getListU(){
        return urepo.findAll();
    }

    public User getByIdU(int uid){
        if(urepo.existsById(uid)){
            return urepo.findById(uid).get();
        }
        return null;
    }

    public Message updateBoth(int uid,int mid){
        if(urepo.existsById(uid) && mrepo.existsById(mid)){
            User u = urepo.findById(uid).get();
            Message m = mrepo.findById(mid).get();
            u.addMessage(m);
            m.addUser(u);
            urepo.save(u);
            return mrepo.save(m);
        }
        return null;
    }

    public boolean deleteBoth(int uid , int mid){
        if(urepo.existsById(uid) && mrepo.existsById(mid)){
            urepo.deleteById(uid);
            mrepo.deleteById(mid);
            return true;
        }
        return false;
    }
}
package com.examly.springapp.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.examly.springapp.model.Message;
import com.examly.springapp.model.User;
import com.examly.springapp.repository.MessageRepo;
import com.examly.springapp.repository.UserRepo;

@Service
public class ApiService {

    @Autowired
    private UserRepo urepo;

    @Autowired
    private MessageRepo mrepo;

    public User addU(User u){
        return urepo.save(u);
    }

    public Message addM(int uid,Message m){
        if(urepo.existsById(uid)){
            User u = urepo.findById(uid).get();
            m.addUser(u);
            return mrepo.save(m);
        }
        return null;
    }

    public List<User> getListU(){
        return urepo.findAll();
    }

    public User getByIdU(int uid){
        if(urepo.existsById(uid)){
            return urepo.findById(uid).get();
        }
        return null;
    }

    public Message updateBoth(int uid,int mid){
        if(urepo.existsById(uid) && mrepo.existsById(mid)){
            User u = urepo.findById(uid).get();
            Message m = mrepo.findById(mid).get();
            u.addMessage(m);
            m.addUser(u);
            urepo.save(u);
            return mrepo.save(m);
        }
        return null;
    }

    public boolean deleteBoth(int uid , int mid){
        if(urepo.existsById(uid) && mrepo.existsById(mid)){
            urepo.deleteById(uid);
            mrepo.deleteById(mid);
            return true;
        }
        return false;
    }
}
