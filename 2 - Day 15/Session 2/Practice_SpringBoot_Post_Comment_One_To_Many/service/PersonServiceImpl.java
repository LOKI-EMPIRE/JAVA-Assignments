package com.examly.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.Post;
import com.examly.springapp.repository.PostRepo;

@Service
public class PostServiceImpl implements PostService {
    
    @Autowired
    private PostRepo repo;

    public Post addS(Post p){
        if(p != null){
            return repo.save(p);
        }
    return null;
    }

    public Post getByIdS(int id){
        if(repo.existsById(id)){
            return repo.findById(id).get();
        }
        return null;
    } 

}
