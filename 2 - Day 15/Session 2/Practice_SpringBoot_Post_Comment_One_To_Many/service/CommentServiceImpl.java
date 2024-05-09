package com.examly.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.Comment;
import com.examly.springapp.model.Post;
import com.examly.springapp.repository.CommentRepo;
import com.examly.springapp.repository.PostRepo;

@Service
public class CommentServiceImpl implements CommentService {
    
    @Autowired
    private CommentRepo repo;

    @Autowired
    private PostRepo prepo;

    @Override
    public Comment addS(int id, Comment c) {
        if(prepo.existsById(id)){
            Post p1 = prepo.findById(id).get();
            c.setPost(p1);
            return repo.save(c);
        }
        return null;
    }

    @Override
    public boolean deleteById(int id) {
       if(repo.existsById(id)){
        repo.deleteById(id);
        return true;
       }
        return false;
    }
    
    @Override
    public Comment putById(int id,Comment c) {
        if(repo.existsById(id)){
            Comment c1 = repo.findById(id).get();
            c1.setText(c.getText());
            return repo.save(c1);
        }
        return null;
    }



}
