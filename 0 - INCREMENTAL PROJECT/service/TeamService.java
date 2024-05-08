package com.examly.springapp.service;

import java.util.*;
import com.examly.springapp.entity.Team;

public interface TeamService {

    abstract Team add(Team t);
    abstract Team get(int id);
    abstract List<Team> getAll();
    abstract Team update(int id,Team t);
    abstract boolean delete(int id);
    
}
