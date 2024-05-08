package com.examly.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.examly.springapp.entity.Player;
import com.examly.springapp.service.PlayerService;

@RestController
public class PlayerController {

    @Autowired
    private PlayerService service;

    @PostMapping("api/player")
    public Player addC(@RequestBody Player p){
       return service.addS(p);
    }

    @PutMapping("api/player/{playerId}")
    public Player putC(@PathVariable long playerId,@RequestBody Player p){
        return service.putS(playerId, p);
    }

    @GetMapping("api/player")
    public List<Player> getListC(){
        return service.getListS();
    }

    @GetMapping("api/player/{playerId}")
    public Player getPlayerC(@PathVariable long playerId){
        return service.getPlayerS(playerId);
    }

    @DeleteMapping("api/player/{playerId}")
    public boolean deleteC(@PathVariable long playerId){
        return service.deleteS(playerId);
    }
    
}
