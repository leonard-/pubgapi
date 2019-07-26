package com.github.gplnature.pubgapi.api;

import com.github.gplnature.pubgapi.holders.DataHolder;
import com.github.gplnature.pubgapi.holders.DataListHolder;
import com.github.gplnature.pubgapi.model.leaderboard.Leaderboard;
import com.github.gplnature.pubgapi.model.match.MatchResponse;
import com.github.gplnature.pubgapi.model.player.Player;
import com.github.gplnature.pubgapi.model.playerseason.PlayerSeason;
import com.github.gplnature.pubgapi.model.sample.Sample;
import com.github.gplnature.pubgapi.model.season.Season;
import com.github.gplnature.pubgapi.model.status.Status;
import com.github.gplnature.pubgapi.model.telemetry.event.TelemetryEvent;
import com.github.gplnature.pubgapi.model.tournament.Tournament;
import retrofit2.Call;
import retrofit2.http.*;

import java.time.Instant;
import java.util.List;

public interface PubgInterface {

    String BASE_URL = "https://api.playbattlegrounds.com";

    @Headers("@: Auth")
    @GET("/shards/{shard}/players")
    Call<DataListHolder<Player>> getPlayersByNames(@Path("shard") String shard,
                                                           @Query("filter[playerNames]") String playerNames);

    @Headers("@: Auth")
    @GET("/shards/{shard}/players")
    Call<DataListHolder<Player>> getPlayersByIds(@Path("shard") String shard,
                                                         @Query("filter[playerIds]") String playerIds);

    @Headers("@: Auth")
    @GET("/shards/{shard}/players/{id}")
    Call<DataHolder<Player>> getPlayer(@Path("shard") String shard, @Path("id") String id);

    @Headers("@: Auth")
    @GET("/shards/{shard}/players/{id}/seasons/{seasonId}")
    Call<DataHolder<PlayerSeason>> getPlayerSeason(@Path("shard") String shard, @Path("id") String playerId,
                                                           @Path("seasonId") String seasonId);
    
    @Headers("@: Auth")
    @GET("/shards/{shard}/seasons/{seasonId}/gameMode/{gameMode}/players")
    Call<DataHolder<PlayerSeason>> getSeasonPlayers(@Path("shard") String shard, @Path("gameMode") String gameMode,
                                                           @Path("seasonId") String seasonId);

    @GET("/status")
    Call<DataHolder<Status>> getStatus();

    @Headers("@: Auth")
    @GET("/shards/{shard}/matches/{id}")
    Call<MatchResponse> getMatch(@Path("shard") String shard, @Path("id") String id);

    @Headers("@: Auth")
    @GET("/shards/{shard}/samples")
    Call<DataHolder<Sample>> getSamples(@Path("shard") String shard,
                                        @Query("filter[createdAt-start]") Instant createdAtStart);

    @Headers("@: Auth")
    @GET("/shards/{shard}/seasons")
    Call<DataListHolder<Season>> getSeasons(@Path("shard") String shard);

    @Headers("@: Auth")
    @GET("/tournaments")
    Call<DataListHolder<Tournament>> getTournaments();

    @Headers("@: Auth")
    @GET("/tournaments/{id}")
    Call<DataHolder<Tournament>> getTournament(@Path("id") String id);

    @Headers("@: Auth")
    @GET("/shards/{shard}/leaderboards/{gameMode}")
    Call<DataHolder<Leaderboard>> getLeaderboard(@Path("shard") String shard, @Path("gameMode") String gameMode,
                                                         @Query("page[number]") int pageNumber);

    @GET
    Call<List<TelemetryEvent>> getTelemetry(@Url String url);
}
