package com.examly.springapp.service;

import java.util.*;
import com.examly.springapp.model.Task;

public interface TaskService {
    
    Task addS(int id,Task t);
    List<Task> getList();
    Task getById(int id);
    boolean delete(int id);

}
