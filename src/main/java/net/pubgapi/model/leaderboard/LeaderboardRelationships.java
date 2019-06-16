package net.pubgapi.model.leaderboard;

import java.util.List;
import net.pubgapi.model.player.Player;

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
