package com.examly.springapp.service;

import com.examly.springapp.model.Comment;

public interface CommentService {
   
    Comment addS(int id,Comment c);
    Comment putById(int id,Comment c);
    boolean deleteById(int id);

}
