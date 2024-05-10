package com.examly.springapp.service;

import java.util.*;
import com.examly.springapp.model.Post;

public interface PostService {

    Post add(int userId,Post post);
    List<Post> getList();
    Post getPostById(int postId);
    Post putById(int postId,Post post);
    boolean delete(int postId);
    
}
