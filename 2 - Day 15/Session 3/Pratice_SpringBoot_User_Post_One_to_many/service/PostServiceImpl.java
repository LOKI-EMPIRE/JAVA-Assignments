package com.examly.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.Post;
import com.examly.springapp.model.User;
import com.examly.springapp.repository.PostRepository;
import com.examly.springapp.repository.UserRepository;

@Service

public class PostServiceImpl implements PostService{

    @Autowired
    private PostRepository repo;

    @Autowired
    private UserRepository prepo;

    @Override
    public Post add(int userId, Post post) {
       if(prepo.existsById(userId)){
        User u = prepo.findById(userId).get();
        post.setUser(u);
        return repo.save(post);
       }
       return null;
    }

    @Override
    public List<Post> getList() {
        return repo.findAll();
    }

    @Override
    public Post getPostById(int postId) {
        if(repo.existsById(postId)){
            return repo.findById(postId).get();
        }
        return null;
    }

    @Override
    public Post putById(int postId, Post post) {
        if(repo.existsById(postId)){
            Post p = repo.findById(postId).get();
            p.setContent(post.getContent());
            p.setTitle(post.getTitle());
            p.setUser(post.getUser());
            repo.deleteById(postId);
            return repo.save(p);
        }
        return null;
    }

    @Override
    public boolean delete(int postId) {
        if(repo.existsById(postId)){
            repo.deleteById(postId);
            return true;
        }
        return false;
    }
    
    
}
