package com.examly.springapp.service;

import com.examly.springapp.model.Post;

public interface PostService {

    Post addS(Post p);
    Post getByIdS(int id);
    
}
