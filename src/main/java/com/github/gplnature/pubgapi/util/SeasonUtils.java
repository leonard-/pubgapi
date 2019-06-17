package com.pubgapi.util;


import java.util.List;
import com.pubgapi.exception.PubgClientException;
import com.pubgapi.model.season.Season;

public class SeasonUtils {

    public static Season getCurrentSeason(List<Season> seasons) throws PubgClientException {
        Season currentSeason = null;

        for (Season season : seasons) {
            if (season.getAttributes() == null) {
                throw new PubgClientException("Season with id " + season.getId() + " doesn't have attributes");
            }

            if (Boolean.TRUE.equals(season.getAttributes().getCurrentSeason())) {
                if (currentSeason != null) {
                    throw new PubgClientException("More than one season marked as current season");
                } else {
                    currentSeason = season;
                }
            }
        }

        if (currentSeason == null) {
            throw new PubgClientException("No season marked as current season");
        }

        return currentSeason;
    }
}
