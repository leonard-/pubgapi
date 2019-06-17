package com.github.gplnature.pubgapi.util;


import com.github.gplnature.pubgapi.exception.PubgClientException;
import com.github.gplnature.pubgapi.model.season.Season;
import java.util.List;

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
