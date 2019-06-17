package com.github.gplnature.pubgapi.model.leaderboard;

import com.github.gplnature.pubgapi.holders.DataListHolder;
import com.github.gplnature.pubgapi.model.player.Player;
import java.util.List;

public class LeaderboardRelationships {

    private DataListHolder<Player> players;

    public LeaderboardRelationships() {
    }

    public List<Player> getPlayers() {
        return players.getData();
    }

    public void setPlayers(DataListHolder<Player> players) {
        this.players = players;
    }
}
