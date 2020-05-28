package com.github.gplnature.pubgapi.api;

import com.github.gplnature.pubgapi.exception.PubgClientException;
import com.github.gplnature.pubgapi.holders.DataHolder;
import com.github.gplnature.pubgapi.model.*;
import com.github.gplnature.pubgapi.model.leaderboard.Leaderboard;
import com.github.gplnature.pubgapi.model.match.MatchResponse;
import com.github.gplnature.pubgapi.model.player.Player;
import com.github.gplnature.pubgapi.model.playerseason.PlayerSeason;
import com.github.gplnature.pubgapi.model.ranked.RankedData;
import com.github.gplnature.pubgapi.model.sample.Sample;
import com.github.gplnature.pubgapi.model.season.Season;
import com.github.gplnature.pubgapi.model.status.Status;
import com.github.gplnature.pubgapi.model.telemetry.Telemetry;
import com.github.gplnature.pubgapi.model.telemetry.event.TelemetryEvent;
import com.github.gplnature.pubgapi.model.tournament.Tournament;
import com.github.gplnature.pubgapi.model.weapon.WeaponMastery;
import com.github.gplnature.pubgapi.util.RetrofitUtil;

import java.time.Instant;
import java.util.List;

public class PubgClient extends AbstractPubgClient {

    public PubgClient() {
        super();
    }

    public PubgClient(String apiKey) {
        super(apiKey);
    }

    /**
     * Get the list of players matching the playerNames in the provided platform
     *
     * @param platform     Platform (example: Platform.STEAM)
     * @param playersNames PUBG PLAYER NAMES
     * @return Players by playerNames
     * @throws com.github.gplnature.pubgapi.exception.PubgClientException
     */
    public List<Player> getPlayersByNames(MiddlePlatform platform, String... playersNames)
            throws PubgClientException {
        String players = String.join(",", playersNames);

        return RetrofitUtil.getResponse(pubgInterface.getPlayersByNames(platform.toString(), players)).getData();
    }

    /**
     * Get the list of players matching the playerIds in the provided platform
     *
     * @param platform  Platform (example: Platform.STEAM)
     * @param playerIds PUBG PLAYER IDS
     * @return Players by ids
     * @throws com.github.gplnature.pubgapi.exception.PubgClientException
     */
    public List<Player> getPlayersByIds(MiddlePlatform platform, String... playerIds)
            throws PubgClientException {

        String players = String.join(",", playerIds);

        return RetrofitUtil.getResponse(pubgInterface.getPlayersByIds(platform.toString(), players)).getData();
    }

    /**
     * Get a player given its Id and platform
     *
     * @param platform Platform (example: Platform.STEAM)
     * @param id       PUBG PLAYER ID
     * @return Player by id
     * @throws com.github.gplnature.pubgapi.exception.PubgClientException
     */
    public Player getPlayer(MiddlePlatform platform, String id) throws PubgClientException {
        return RetrofitUtil.getResponse(pubgInterface.getPlayer(platform.toString(), id)).getData();
    }

    /**
     * Return the status of the API
     *
     * @return status
     * @throws com.github.gplnature.pubgapi.exception.PubgClientException
     */
    public Status getStatus() throws PubgClientException {
        return RetrofitUtil.getResponse(pubgInterface.getStatus()).getData();
    }

    /**
     * Get a match given its Id and platformRegion
     *
     * @param platform Platform (example: Platform.STEAM)
     * @param id       match id
     * @return MatchResponse by matchid
     * @throws com.github.gplnature.pubgapi.exception.PubgClientException
     */
    public MatchResponse getMatch(ExtendedPlatform platform, String id) throws PubgClientException {
        return RetrofitUtil.getResponse(pubgInterface.getMatch(platform.toString(), id));
    }

    public WeaponMastery getWeaponMastery(MiddlePlatform platform, String userId) throws PubgClientException {
        return RetrofitUtil.getResponse(pubgInterface.getWeaponMastery(platform.toString(), userId));
    }

    /**
     * Get the telemetry from the provided link
     *
     * @param link Telemetry link
     * @return Telemetry data by Telemetrylink
     * @throws com.github.gplnature.pubgapi.exception.PubgClientException
     */
    public Telemetry getTelemetry(String link) throws PubgClientException {
        List<TelemetryEvent> telemetryEvents = RetrofitUtil.getResponse(pubgInterface.getTelemetry(link));

        return new Telemetry(telemetryEvents);
    }

    /**
     * Get a list of sample matches. A starting search date (in UTC) can be
     * provided. If it's set to null, the default time now() is used. Note that
     * the date must be 24 hours prior to now, otherwise you will get an error.
     *
     * @param platformRegion PlatformRegion (example: PlatformRegion.PC_JP)
     * @param createdAtStart
     * @return
     * @throws com.github.gplnature.pubgapi.exception.PubgClientException
     */
    public Sample getSamples(Platform platformRegion, Instant createdAtStart)
            throws PubgClientException {

        return RetrofitUtil.getResponse(pubgInterface.getSamples(platformRegion.toString(), createdAtStart)).getData();
    }

    /**
     * Get a list of available seasons.
     *
     * @param platform Platform (example: Platform.STEAM)
     * @return Seasons data by platform
     * @throws com.github.gplnature.pubgapi.exception.PubgClientException
     */
    public List<Season> getSeasons(MiddlePlatform platform) throws PubgClientException {
        return RetrofitUtil.getResponse(pubgInterface.getSeasons(platform.toString())).getData();
    }

    /**
     * Get lifetime stats (as of division.bro.official.pc-2018-01) for a single
     * player (PC only)
     *
     * @param responseCallback
     * @param platform         Platform (example: Platform.STEAM)
     * @param playerId         PUBG PLAYER IDS
     */
    public void getPlayerLifetimeStats(ResponseCallback<DataHolder<PlayerSeason>> responseCallback,
                                       MiddlePlatform platform, String playerId) {
        RetrofitUtil.getResponseAsync(
                pubgInterface.getPlayerSeason(platform.toString(), playerId, LIFETIME_STATS), responseCallback
        );
    }

    /**
     * Get lifetime stats (as of division.bro.official.pc-2018-01) for a single
     * player (PC only)
     *
     * @param responseCallback
     * @param platform         Platform (example: Platform.STEAM)
     * @param gameMode         PUBG GameMode
     */
    public void getPlayersLifetimeStat(ResponseCallback<DataHolder<PlayerSeason>> responseCallback,
                                       Platform platform, GameMode gameMode) {
        RetrofitUtil.getResponseAsync(
                pubgInterface.getSeasonPlayers(platform.toString(), gameMode.toString(), LIFETIME_STATS), responseCallback
        );
    }

    /**
     * Get season information for a single player. This method must be used for
     * Xbox or PC seasons before 18/10/03. After this date, use
     * {@link #getPlayerSeason(MiddlePlatform, String, String)}
     *
     * @param platform PlatformRegion (example: Platform.STEAM)
     * @param playerId PUBG PLAYER IDS
     * @param seasonId SeasonID (example: Season.getId())
     * @return PlayerSeason data by playerId with seasonId
     * @throws com.github.gplnature.pubgapi.exception.PubgClientException
     */
    public PlayerSeason getPlayerSeason(MiddlePlatform platform, String playerId,
                                        String seasonId) throws PubgClientException {

        return PlayerSeason(platform.toString(), playerId, seasonId);
    }

    /**
     * Get season information for a single player. This method must be used for
     * Xbox or PC seasons before 18/10/03. After this date, use
     * {@link #getPlayerSeason(PlatformRegion, String, String)}
     *
     * @param platform PlatformRegion (example: PlatformRegion.PC_AS)
     * @param playerId PUBG PLAYER IDS
     * @param seasonId SeasonID (example: Season.getId())
     * @return PlayerSeason data by playerId with seasonId
     * @throws com.github.gplnature.pubgapi.exception.PubgClientException
     */
    public PlayerSeason getPlayerSeason(PlatformRegion platform, String playerId,
                                        String seasonId) throws PubgClientException {

        return PlayerSeason(platform.toString(), playerId, seasonId);
    }

    private PlayerSeason PlayerSeason(String platform, String playerId,
                                      String seasonId) throws PubgClientException {
        return RetrofitUtil.getResponse(pubgInterface.getPlayerSeason(platform, playerId, seasonId)).getData();
    }

    /**
     * Get season information for a single player. This method must be used for
     * Xbox or PC seasons before 18/10/03. After this date, use
     * {@link #getPlayerSeason(MiddlePlatform, String, String)}
     *
     * @param platform MiddlePlatform (example: MiddlePlatform.STEAM)
     * @param gameMode PUBG GAME MODE (example: GameMode.SOLO)
     * @param seasonId SeasonID (example: Season.getId())
     * @return PlayerSeason data by playerId with seasonId
     * @throws com.github.gplnature.pubgapi.exception.PubgClientException
     */
    public PlayerSeason getSeasonPlayers(MiddlePlatform platform, GameMode gameMode,
                                         String seasonId) throws PubgClientException {

        return PlayersSeason(platform.toString(), gameMode.toString(), seasonId);
    }

    /**
     * Get season information for a single player. This method must be used for
     * Xbox or PC seasons before 18/10/03. After this date, use
     * {@link #getPlayerSeason(PlatformRegion, String, String)}
     *
     * @param platform PlatformRegion (example: PlatformRegion.PC_AS)
     * @param gameMode PUBG GAME MODE (example: GameMode.SOLO)
     * @param seasonId SeasonID (example: Season.getId())
     * @return PlayerSeason data by playerId with seasonId
     * @throws com.github.gplnature.pubgapi.exception.PubgClientException
     */
    public PlayerSeason getSeasonPlayers(PlatformRegion platform, GameMode gameMode,
                                         String seasonId) throws PubgClientException {
        return PlayersSeason(platform.toString(), gameMode.toString(), seasonId);
    }

    private PlayerSeason PlayersSeason(String platform, String gameMode,
                                      String seasonId) throws PubgClientException {
        return RetrofitUtil.getResponse(pubgInterface.getSeasonPlayers(platform, gameMode, seasonId)).getData();
    }

    /**
     * Get ranked information for a single player.
     *
     * @param platform MiddlePlatform (example: MiddlePlatform.STEAM)
     * @param playerId PUBG PLAYER ID
     * @param seasonId SeasonID (example: Season.getId())
     * @return Ranked data by playerId with seasonId
     * @throws com.github.gplnature.pubgapi.exception.PubgClientException
     */
    public RankedData getPlayerRanked(MiddlePlatform platform, String playerId,
                                         String seasonId) throws PubgClientException {

        return PlayerRanked(platform.toString(), playerId, seasonId);
    }

    /**
     * Get ranked information for a single player.
     *
     * @param platform PlatformRegion (example: PlatformRegion.PC_AS)
     * @param playerId PUBG PLAYER ID
     * @param seasonId SeasonID (example: Season.getId())
     * @return Ranked data by playerId with seasonId
     * @throws com.github.gplnature.pubgapi.exception.PubgClientException
     */
    public RankedData getPlayerRanked(PlatformRegion platform, String playerId,
                                         String seasonId) throws PubgClientException {
        return PlayerRanked(platform.toString(), playerId, seasonId);
    }

    private RankedData PlayerRanked(String platform, String playerId,
                                    String seasonId) throws PubgClientException {
        return RetrofitUtil.getResponse(pubgInterface.getPlayerRanked(platform, playerId, seasonId)).getData();
    }

    /**
     * Get list of tournaments
     *
     * @return Tournaments Data
     * @throws com.github.gplnature.pubgapi.exception.PubgClientException
     */
    public List<Tournament> getTournaments() throws PubgClientException {
        return RetrofitUtil.getResponse(pubgInterface.getTournaments()).getData();
    }

    /**
     * Get a tournament by id
     *
     * @param id Tournament id
     * @return Tournaments Data by id
     * @throws com.github.gplnature.pubgapi.exception.PubgClientException
     */
    public Tournament getTournament(String id) throws PubgClientException {
        return RetrofitUtil.getResponse(pubgInterface.getTournament(id)).getData();
    }

    /**
     * Get the leaderboard for a platform and a game mode.
     *
     * @param platform Platform (example: Platform.STEAM)
     * @param gameMode GamMode (example: GameMode.SOLO)
     * @return Leaderboard by gameMode with platform, page
     * @throws com.github.gplnature.pubgapi.exception.PubgClientException
     */
    public Leaderboard getLeaderboard(MiddlePlatform platform, GameMode gameMode)
            throws PubgClientException {

        return RetrofitUtil.getResponse(pubgInterface.getLeaderboard(platform.toString(), gameMode.toString())).getData();
    }

    /**
     * Get the leaderboard for a platform and a game mode.
     *
     * @param platform Platform (example: PlatformRegion.PC_AS)
     * @param gameMode GamMode (example: GameMode.SOLO)
     * @return Leaderboard by gameMode with platform, page
     * @throws com.github.gplnature.pubgapi.exception.PubgClientException
     */
    public Leaderboard getLeaderboard(PlatformRegion platform, GameMode gameMode)
            throws PubgClientException {

        return RetrofitUtil.getResponse(pubgInterface.getLeaderboard(platform.toString(), gameMode.toString())).getData();
    }
}
