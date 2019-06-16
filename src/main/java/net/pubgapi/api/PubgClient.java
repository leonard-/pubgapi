package net.pubgapi.api;

import net.pubgapi.exception.PubgClientException;
import net.pubgapi.model.GameMode;
import net.pubgapi.model.Platform;
import net.pubgapi.model.PlatformRegion;
import net.pubgapi.model.leaderboard.Leaderboard;
import net.pubgapi.model.match.MatchResponse;
import net.pubgapi.model.player.Player;
import net.pubgapi.model.playerseason.PlayerSeason;
import net.pubgapi.model.sample.Sample;
import net.pubgapi.model.season.Season;
import net.pubgapi.model.status.Status;
import net.pubgapi.model.telemetry.Telemetry;
import net.pubgapi.model.telemetry.event.TelemetryEvent;
import net.pubgapi.model.tournament.Tournament;
import net.pubgapi.util.RetrofitUtil;

import java.time.Instant;
import java.util.List;

public class PubgClient extends AbstractPubgClient {

    public PubgClient() {
        super();
    }

    /**
     * Get the list of players matching the playerNames in the provided platform
     */
    public List<Player> getPlayersByNames(Platform platform, String... playersNames)
            throws PubgClientException {

        String players = String.join(",", playersNames);

        return RetrofitUtil.getResponse(pubgInterface.getPlayersByNames(platform.toString(), players));
    }

    /**
     * Get the list of players matching the playerIds in the provided platform
     */
    public List<Player> getPlayersByIds(Platform platform, String... playerIds)
            throws PubgClientException {

        String players = String.join(",", playerIds);

        return RetrofitUtil.getResponse(pubgInterface.getPlayersByIds(platform.toString(), players));
    }

    /**
     * Get a player given its Id and platform
     */
    public Player getPlayer(Platform platform, String id) throws PubgClientException {
        return RetrofitUtil.getResponse(pubgInterface.getPlayer(platform.toString(), id));
    }

    /**
     * Return the status of the API
     */
    public Status getStatus() throws PubgClientException {
        return RetrofitUtil.getResponse(pubgInterface.getStatus());
    }

    /**
     * Get a match given its Id and platformRegion
     */
    public MatchResponse getMatch(Platform platform, String id) throws PubgClientException {
        return RetrofitUtil.getResponse(pubgInterface.getMatch(platform.toString(), id));
    }

    /**
     * Get the telemetry from the provided link
     */
    public Telemetry getTelemetry(String link) throws PubgClientException {
        List<TelemetryEvent> telemetryEvents = RetrofitUtil.getResponse(pubgInterface.getTelemetry(link));

        return new Telemetry(telemetryEvents);
    }

    /**
     * Get a list of sample matches.
     * A starting search date (in UTC) can be provided. If it's set to null, the default time now() is used.
     * Note that the date must be 24 hours prior to now, otherwise you will get an error.
     */
    public Sample getSamples(PlatformRegion platformRegion, Instant createdAtStart)
            throws PubgClientException {

        return RetrofitUtil.getResponse(pubgInterface.getSamples(platformRegion.toString(), createdAtStart));
    }

    /**
     * Get a list of available seasons.
     */
    public List<Season> getSeasons(PlatformRegion platformRegion) throws PubgClientException {
        return RetrofitUtil.getResponse(pubgInterface.getSeasons(platformRegion.toString()));
    }

    /**
     * Get a list of available seasons.
     */
    public List<Season> getSeasons(Platform platform) throws PubgClientException {
        return RetrofitUtil.getResponse(pubgInterface.getSeasons(platform.toString()));
    }

    /**
     * Get lifetime stats (as of division.bro.official.pc-2018-01) for a single player (PC only)
     */
    public void getPlayerLifetimeStats(ResponseCallback<PlayerSeason> responseCallback,
                                       Platform platform, String playerId) {

        RetrofitUtil.getResponseAsync(
                pubgInterface.getPlayerSeason(platform.toString(), playerId, LIFETIME_STATS), responseCallback
        );
    }

    /**
     * Get season information for a single player.
     * This method must be used for Xbox or PC seasons before 18/10/03.
     * After this date, use {@link #getPlayerSeason(Platform, String, String)}
     */
    public PlayerSeason getPlayerSeason(PlatformRegion platformRegion, String playerId,
                                                            String seasonId) throws PubgClientException {

        return RetrofitUtil.getResponse(pubgInterface.getPlayerSeason(platformRegion.toString(), playerId, seasonId));
    }

    /**
     * Get season information for a single player.
     * This method must be used for PC seasons after 18/10/03.
     * Before this date, use {@link #getPlayerSeason(PlatformRegion, String, String)}
     */
    public PlayerSeason getPlayerSeason(Platform platform, String playerId,
                                                            String seasonId) throws PubgClientException {

        return RetrofitUtil.getResponse(pubgInterface.getPlayerSeason(platform.toString(), playerId, seasonId));
    }

    /**
     * Get list of tournaments
     */
    public Tournament getTournaments() throws PubgClientException {
        return RetrofitUtil.getResponse(pubgInterface.getTournaments());
    }

    /**
     * Get a tournament by id
     */
    public Tournament getTournament(String id) throws PubgClientException {
        return RetrofitUtil.getResponse(pubgInterface.getTournament(id));
    }

    /**
     * Get the leaderboard for a platform and a game mode. The leaderboard is paginated (0-9)
     */
    public Leaderboard getLeaderboard(Platform platform, GameMode gameMode, int page)
            throws PubgClientException {

        return RetrofitUtil.getResponse(pubgInterface.getLeaderboard(platform.toString(), gameMode.toString(), page));
    }
}
