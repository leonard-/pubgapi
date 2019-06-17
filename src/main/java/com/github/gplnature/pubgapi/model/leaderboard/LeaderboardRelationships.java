package com.github.gplnature.pubgapi.model.leaderboard;

import com.github.gplnature.pubgapi.model.player.Player;
import java.util.List;

public class LeaderboardRelationships {

    private List<Player> players;

    public LeaderboardRelationships() {
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
