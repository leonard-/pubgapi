package com.github.gplnature.pubgapi.util;

import com.github.gplnature.pubgapi.exception.PubgClientException;
import com.github.gplnature.pubgapi.model.generic.Entity;
import com.github.gplnature.pubgapi.model.match.Match;
import com.github.gplnature.pubgapi.model.player.Player;
import com.github.gplnature.pubgapi.model.player.PlayerRelationships;
import java.util.List;
import java.util.stream.Collectors;

public class PlayerUtils {

    private Player player;

    public PlayerUtils(Player player) throws PubgClientException {
        if (player == null) {
            throw new PubgClientException("The player cannot be null");
        }

        this.player = player;
    }

    public List<String> getMatchsIds() throws PubgClientException {
        return PlayerUtils.getMatchsIds(player);
    }

    public static List<String> getMatchsIds(Player player) throws PubgClientException {
        PlayerRelationships playerRelationships = player.getRelationships();

        if (playerRelationships == null) {
            throw new PubgClientException("Unable to get the relationships of the player");
        }

        List<Entity> matchs = playerRelationships.getMatches();
        if (matchs == null || matchs == null) {
            throw new PubgClientException("Unable to get the matchs of the player");
        }

        return matchs.stream()
                .map(Entity::getId)
                .collect(Collectors.toList());
    }
}
