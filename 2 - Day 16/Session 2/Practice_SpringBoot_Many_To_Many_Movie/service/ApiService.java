package com.examly.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.examly.springapp.model.Actor;
import com.examly.springapp.model.Movie;
import com.examly.springapp.repository.ActorRepository;
import com.examly.springapp.repository.MovieRepository;

@Service
public class MovieService {

    @Autowired
    private ActorRepository arepo;

    @Autowired
    private MovieRepository mrepo;

    public Movie add(Movie m){
        return mrepo.save(m);
    }

    public Actor add(Actor a){
        return arepo.save(a);
    }

    public boolean add(int mid,int aid){
        if(mrepo.existsById(mid) && arepo.existsById(aid)){
            Movie m = mrepo.findById(mid).get();
            Actor a = arepo.findById(aid).get();
            m.addActor(a);
            mrepo.save(m);
            a.addMovie(m);
            arepo.save(a);
            return true;
        }
        return false;
    }

    public List<Movie> getList(){
        return mrepo.findAll();
    }

    public Actor getByIdActor(int id){
        if(arepo.existsById(id)){
            return arepo.findById(id).get();
        }
        return null;
    }

    public Actor updateActor(int id,Actor a1){
        if(arepo.existsById(id)){
            Actor a = arepo.findById(id).get();
            a.setName(a1.getName());
            return arepo.save(a);
        }
        return null;
    }

    public Movie updateMovie(int id,Movie m1){
        if(mrepo.existsById(id)){
            Movie m = mrepo.findById(id).get();
            m.setYear(m1.getYear());
            m.setTitle(m1.getTitle());
            return mrepo.save(m);
        }
        return null;
    }
    
}
