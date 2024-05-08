package com.examly.springapp.service;

import java.util.*;
import com.examly.springapp.entity.Player;

public interface PlayerService {
    
    abstract Player addS(Player p);
    abstract Player putS(long id,Player p);
    abstract List<Player> getListS();
    abstract Player getPlayerS(long id);
    abstract boolean deleteS(long id);


}
