package com.examly.springapp.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.examly.springapp.entity.Player;
import com.examly.springapp.repository.PlayerRepo;
import com.examly.springapp.service.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService {
    
    @Autowired
    private PlayerRepo repo;

    public Player addS(Player p){
        return repo.save(p);
    }
    public Player putS(long id,Player p){
        if(repo.existsById(id)){
            Player p1 = repo.findById(id).get();
            p1.setName(p.getName());
            p1.setAge(p.getAge());
            p1.setCategory(p.getCategory());
            p1.setBiddingPrice(p.getBiddingPrice());
            p1.setSold(p.isSold());
            return p1;
        }
        return null;
    }

    public List<Player> getListS(){
        return repo.findAll();
    }

    public Player getPlayerS(long id){
        if(repo.existsById(id)){
            return repo.findById(id).get();
        }
        return null;
    }

    public boolean deleteS(long id){
        if(repo.existsById(id)){
            repo.deleteById(id);
            return true;
        }
        return false;
    }
}
