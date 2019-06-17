# PUBG-Java
Java wrapper and utilities for the PlayerUnknown's Battlegrounds (PUBG) API.

# Contact Me
- [Discord] GPL_Nature#5497

# Overview
**Note This project is being updated by a high school student. The API can change at anytime.**

**The project is based on mautini's pubgjava project. I'm using it with permission from him.**

**README.md is being updated frequently. Please let me know if there is anything else that needs to be added.**

This library supports the version 12.0.0 of the PUBG Official API

## Maven Dependencies

- For the Java Wrapper
```xml
<dependency>
    <groupId>com.github.gplnature</groupId>
    <artifactId>pubgapi</artifactId>
    <version>{Latest}</version>
</dependency>
```
** You can find the latest version at https://bintray.com/gplnature/java-wrappers/pubgapi **

## PUBG-Java

### Current functionalities
- Get the status of the API
- Search for one or many players
- Search for a match
- Access to the telemetry of a match
- List the seasons
- Get the stats of a player for a season
- Get information about tournaments

### Api call example
To search for player(s) by name(s) :
```java
public static final void main(String[] args) throws PubgClientException {
    // Create a pubg client to make requests to the API
    PubgClient pubgClient = new PubgClient();

    // Get a list of players using their names in-game
    List<Player> playerList = pubgClient.getPlayersByNames(Platform.STEAM, <name1>, <name2>, <name3>);
    LOGGER.info(playerList.get(0).getPlayerAttributes().getName());

    // Get a list of players using their id in-game
    List<Player> playerList = pubgClient.getPlayersByIds(Platform.STEAM, <id1>, <id2>, <id3>);
    LOGGER.info(playerList.get(0).getPlayerAttributes().getName());

    // Get a single player using its id
    Player player = pubgClient.getPlayer(Platform.STEAM, <idPlayer>);
    LOGGER.info(player.getPlayerAttributes().getName());
    LOGGER.info(player.getPlayerRelationships().getMatches().get(0).getId());

    // Get a single match using its id
    MatchResponse match = pubgClient.getMatch(Platform.STEAM, <idMatch>);
    LOGGER.info(match.getData().getMatchAttributes().getGameMode());

    // Get the telemetry for a match
    Telemetry telemetry = pubgClient.getTelemetry(<telemetryLinkUrl>);
    LOGGER.info("{}", telemetry.getTelemetryEvents().size());
}
```

For more example, you can check out the PubgClientSample.java class

### Rate Limit
The PUBG API has a rate limit (currently it's 10 requests / minute). You can get information about this limit using the methods :
```java
getRateLimitRemaining()
getRateLimit()
getRateLimitReset()
```
in your PUBG client.

### Configuration
The only thing you have to do is to set your PUBG Api Key (that you can find by registering here : https://developer.playbattlegrounds.com/) in the reference.conf file.
You can also provide an application.conf file as the project use typesafe for the configuration (https://github.com/lightbend/config).

## Links
- [PUBG developer portal](https://developer.playbattlegrounds.com/)
- [Mautini pubg java](https://github.com/mautini/pubgjava)