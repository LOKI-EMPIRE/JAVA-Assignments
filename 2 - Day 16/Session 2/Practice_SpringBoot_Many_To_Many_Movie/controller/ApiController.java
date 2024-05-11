package com.examly.springapp.controller;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.examly.springapp.model.Actor;
import com.examly.springapp.model.Movie;
import com.examly.springapp.service.MovieService;

@RestController
public class ApiController {

    @Autowired
    private MovieService service;

    @PostMapping("/addmovie")
    public ResponseEntity<Movie> add(@RequestBody Movie m){
        Movie m1 = service.add(m);
        if(m1 != null){
            return new ResponseEntity<>(m1,HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/addactor")
    public ResponseEntity<Actor> add(@RequestBody Actor a){
        Actor a1 = service.add(a);
        if(a1 != null){
            return new ResponseEntity<>(a1,HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("movies/{movieId}/actors/{actorId}")
    public ResponseEntity<Boolean> add(@PathVariable int movieId,@PathVariable int actorId){
        boolean b = service.add(movieId, actorId);
        if(b){
            return new ResponseEntity<>(b,HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @GetMapping("/movies")
    public ResponseEntity<List<Movie>> getListM(){
        List<Movie> list = service.getList();
        if(list != null){
            return new ResponseEntity<>(list,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/actors/{actorId}")
    public ResponseEntity<Actor> getByActor(@PathVariable int actorId){
        Actor a = service.getByIdActor(actorId);
        if(a != null){
            return new ResponseEntity<>(a,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/updateactor/{actorId}")
    public ResponseEntity<Actor> update(@PathVariable int actorId,@RequestBody Actor a){
        Actor a1 = service.updateActor(actorId, a);
        if(a1 != null){
            return new ResponseEntity<>(a1,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/updatemovie/{movieId}")
    public ResponseEntity<Movie> update(@PathVariable int movieId,@RequestBody Movie m){
        Movie m1 = service.updateMovie(movieId, m);
        if(m1 != null){
            return new ResponseEntity<>(m1,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
