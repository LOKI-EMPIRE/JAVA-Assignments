package com.examly.springapp.service.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.examly.springapp.entity.Player;
import com.examly.springapp.service.OrganizerService;

@Service
public class OrganizerServiceImpl implements OrganizerService {

    @Override
    public List<Player> getUnsoldPlayers() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUnsoldPlayers'");
    }

    @Override
    public List<Player> getSoldPlayers() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSoldPlayers'");
    }

    @Override
    public boolean assignPlayerToTeam(Long playerId, Long teamId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assignPlayerToTeam'");
    }

    @Override
    public void releasePlayerFromTeam(Long playerId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'releasePlayerFromTeam'");
    }

    @Override
    public List<Player> getPlayerListByTeamId(Long team) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPlayerListByTeamId'");
    }
    
}
