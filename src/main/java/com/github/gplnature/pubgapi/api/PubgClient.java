package com.pubgapi.api;

import com.pubgapi.exception.PubgClientException;
import com.pubgapi.model.GameMode;
import com.pubgapi.model.Platform;
import com.pubgapi.model.PlatformRegion;
import com.pubgapi.model.leaderboard.Leaderboard;
import com.pubgapi.model.match.MatchResponse;
import com.pubgapi.model.player.Player;
import com.pubgapi.model.playerseason.PlayerSeason;
import com.pubgapi.model.sample.Sample;
import com.pubgapi.model.season.Season;
import com.pubgapi.model.status.Status;
import com.pubgapi.model.telemetry.Telemetry;
import com.pubgapi.model.telemetry.event.TelemetryEvent;
import com.pubgapi.model.tournament.Tournament;
import com.pubgapi.util.RetrofitUtil;

import java.time.Instant;
import java.util.List;

public class PubgClient extends AbstractPubgClient {

    public PubgClient() {
        super();
    }

    /**
     * Get the list of players matching the playerNames in the provided platform
     * @param platform Platform (example: Platform.STEAM)
     * @param playersNames PUBG PLAYER NAMES
     * @return Players by playerNames
     * @throws com.pubgapi.exception.PubgClientException 
     */
    public List<Player> getPlayersByNames(Platform platform, String... playersNames)
            throws PubgClientException {

        String players = String.join(",", playersNames);

        return RetrofitUtil.getResponse(pubgInterface.getPlayersByNames(platform.toString(), players));
    }

    /**
     * Get the list of players matching the playerIds in the provided platform
     * @param platform Platform (example: Platform.STEAM)
     * @param playerIds PUBG PLAYER IDS
     * @return Players by ids
     * @throws com.pubgapi.exception.PubgClientException
     */
    public List<Player> getPlayersByIds(Platform platform, String... playerIds)
            throws PubgClientException {

        String players = String.join(",", playerIds);

        return RetrofitUtil.getResponse(pubgInterface.getPlayersByIds(platform.toString(), players));
    }

    /**
     * Get a player given its Id and platform
     * @param platform Platform (example: Platform.STEAM)
     * @param id PUBG PLAYER ID
     * @return Player by id
     * @throws com.pubgapi.exception.PubgClientException 
     */
    public Player getPlayer(Platform platform, String id) throws PubgClientException {
        return RetrofitUtil.getResponse(pubgInterface.getPlayer(platform.toString(), id));
    }

    /**
     * Return the status of the API
     * @return status
     * @throws com.pubgapi.exception.PubgClientException
     */
    public Status getStatus() throws PubgClientException {
        return RetrofitUtil.getResponse(pubgInterface.getStatus());
    }

    /**
     * Get a match given its Id and platformRegion
     * @param platform Platform (example: Platform.STEAM)
     * @param id match id
     * @return MatchResponse by matchid
     * @throws com.pubgapi.exception.PubgClientException
     */
    public MatchResponse getMatch(Platform platform, String id) throws PubgClientException {
        return RetrofitUtil.getResponse(pubgInterface.getMatch(platform.toString(), id));
    }

    /**
     * Get the telemetry from the provided link
     * @param link Telemetry link
     * @return Telemetry data by Telemetrylink
     * @throws com.pubgapi.exception.PubgClientException
     */
    public Telemetry getTelemetry(String link) throws PubgClientException {
        List<TelemetryEvent> telemetryEvents = RetrofitUtil.getResponse(pubgInterface.getTelemetry(link));

        return new Telemetry(telemetryEvents);
    }

    /**
     * Get a list of sample matches.
     * A starting search date (in UTC) can be provided. If it's set to null, the default time now() is used.
     * Note that the date must be 24 hours prior to now, otherwise you will get an error.
     * @param platformRegion PlatformRegion (example: PlatformRegion.PC_JP)
     * @param createdAtStart 
     * @return 
     * @throws com.pubgapi.exception.PubgClientException 
     */
    public Sample getSamples(PlatformRegion platformRegion, Instant createdAtStart)
            throws PubgClientException {

        return RetrofitUtil.getResponse(pubgInterface.getSamples(platformRegion.toString(), createdAtStart));
    }

    /**
     * Get a list of available seasons.
     * @param platformRegion PlatformRegion (example: PlatformRegion.PC_JP)
     * @return Season by PlatformRegion
     * @throws com.pubgapi.exception.PubgClientException
     */
    public List<Season> getSeasons(PlatformRegion platformRegion) throws PubgClientException {
        return RetrofitUtil.getResponse(pubgInterface.getSeasons(platformRegion.toString()));
    }

    /**
     * Get a list of available seasons.
     * @param platform Platform (example: Platform.STEAM)
     * @return Seasons data by platform
     * @throws com.pubgapi.exception.PubgClientException
     */
    public List<Season> getSeasons(Platform platform) throws PubgClientException {
        return RetrofitUtil.getResponse(pubgInterface.getSeasons(platform.toString()));
    }

    /**
     * Get lifetime stats (as of division.bro.official.pc-2018-01) for a single player (PC only)
     * @param responseCallback
     * @param platform Platform (example: Platform.STEAM)
     * @param playerId PUBG PLAYER IDS
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
     * @param platformRegion PlatformRegion (example: PlatformRegion.PC_JP)
     * @param playerId PUBG PLAYER IDS
     * @param seasonId SeasonID (example: Season.getId())
     * @return PlayerSeason data by playerId with seasonId
     * @throws com.pubgapi.exception.PubgClientException 
     */
    public PlayerSeason getPlayerSeason(PlatformRegion platformRegion, String playerId,
                                                            String seasonId) throws PubgClientException {

        return RetrofitUtil.getResponse(pubgInterface.getPlayerSeason(platformRegion.toString(), playerId, seasonId));
    }

    /**
     * Get season information for a single player.
     * This method must be used for PC seasons after 18/10/03.
     * Before this date, use {@link #getPlayerSeason(PlatformRegion, String, String)}
     * @param platform Platform (example: Platform.STEAM)
     * @param playerId PUBG PLAYER IDS
     * @param seasonId SeasonID (example: Season.getId())
     * @return PlayerSeason data by playerId with seasonId
     * @throws com.pubgapi.exception.PubgClientException 
     */
    public PlayerSeason getPlayerSeason(Platform platform, String playerId,
                                                            String seasonId) throws PubgClientException {

        return RetrofitUtil.getResponse(pubgInterface.getPlayerSeason(platform.toString(), playerId, seasonId));
    }

    /**
     * Get list of tournaments
     * @return Tournaments Data
     * @throws com.pubgapi.exception.PubgClientException
     */
    public Tournament getTournaments() throws PubgClientException {
        return RetrofitUtil.getResponse(pubgInterface.getTournaments());
    }

    /**
     * Get a tournament by id
     * @param id Tournament id
     * @return Tournaments Data by id
     * @throws com.pubgapi.exception.PubgClientException
     */
    public Tournament getTournament(String id) throws PubgClientException {
        return RetrofitUtil.getResponse(pubgInterface.getTournament(id));
    }

    /**
     * Get the leaderboard for a platform and a game mode. The leaderboard is paginated (0-9)
     * @param platform Platform (example: Platform.STEAM)
     * @param gameMode GamMode (example: GameMode.SOLO)
     * @param page page
     * @return Leaderboard by gameMode with platform, page
     * @throws com.pubgapi.exception.PubgClientException
     */
    public Leaderboard getLeaderboard(Platform platform, GameMode gameMode, int page)
            throws PubgClientException {

        return RetrofitUtil.getResponse(pubgInterface.getLeaderboard(platform.toString(), gameMode.toString(), page));
    }
}