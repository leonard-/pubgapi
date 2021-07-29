# PUBG-API
Java wrapper for the PlayerUnknown's Battlegrounds (PUBG) API.

# Contact Me
- [Discord] GPL_Nature#5497
- [Discord Server] https://discord.gg/A8Htj94  (For Update Notice)

# Overview
**Note This project is being updated by a high school student. The API can change at anytime.**

**The project is based on mautini's pubgjava project. I'm using it with permission from him.**

**README.md is being updated frequently. Please let me know if there is anything else that needs to be added.**

**There are some things I didn't test In the event of an error, please open an issue and let me know.**

This library supports the version 21.1.0 of the PUBG Official API

## Maven Dependencies

- For the Java Wrapper
```xml
<dependency>
    <groupId>com.github.gplnature</groupId>
    <artifactId>pubgapi</artifactId>
    <version>{Latest}</version>
</dependency>
```

[![Maven Central](https://img.shields.io/maven-central/v/com.github.gplnature/pubgapi.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22com.github.gplnature%22%20AND%20a:%22pubgapi%22)

You can use the pubgapi on the Maven Central.

- Maven Central 
```xml
<repository>
    <id>central</id>
    <name>Central Repository</name>
    <url>https://repo.maven.apache.org/maven2</url>
</repository>
```

## PUBG-Java

### Configuration
You can also provide an application.conf file as the project use **[typesafe](https://github.com/lightbend/config)** for the configuration

**Make reference.conf file in src/main/resource in your project folder as shown below.**
```conf
{
    apiKey: Your Api key
}
```

or
```java
public class main {
    public static final void main(String[] args) {
        PubgClient pubgClient = new PubgClient("Api Key");
    }
}
```
### Make API Key
You can get an API key from **[PUBG Developer Site](https://developer.playbattlegrounds.com/)**


### API Call Example
**[PUBG API Documentation](https://documentation.pubg.com/en/introduction.html)**
To search for player(s) by name(s) :
```java
public class test {
    public static final void main(String[] args) throws PubgClientException {
        // Create a pubg client to make requests to the API
        PubgClient pubgClient = new PubgClient();
    
        // Get a list of players using their names in-game
        List<Player> playerList = pubgClient.getPlayersByNames(Platform.STEAM, "name", "name2");
        LOGGER.info(playerList.get(0).getPlayerAttributes().getName());
    
        // Get a list of players using their id in-game
        List<Player> playerList = pubgClient.getPlayersByIds(Platform.STEAM, "id", "id2");
        LOGGER.info(playerList.get(0).getPlayerAttributes().getName());
    
        // Get a single player using its id
        Player player = pubgClient.getPlayer(Platform.STEAM, "id");
        LOGGER.info(player.getPlayerAttributes().getName());
        LOGGER.info(player.getPlayerRelationships().getMatches().get(0).getId());
        // Player documentation
        // [https://documentation.pubg.com/en/players-endpoint.html]
    
        // Get a single match using its id
        // [https://documentation.pubg.com/en/matches-endpoint.html]
        MatchResponse match = pubgClient.getMatch(Platform.STEAM, "matchid");
        LOGGER.info(match.getData().getMatchAttributes().getGameMode());
    
        // Get the telemetry for a match
        // [https://documentation.pubg.com/en/telemetry.html]
        Telemetry telemetry = pubgClient.getTelemetry("Telemetry URL");
        LOGGER.info("{}", telemetry.getTelemetryEvents().size());
    }
}
```

### Rate Limit
The PUBG API has a rate limit (currently it's 10 requests / minute). You can get information about this limit using the methods :
```java
getRateLimitRemaining()
getRateLimit()
getRateLimitReset()
```
in your PUBG client.

### Links
- [PUBG developer portal](https://developer.playbattlegrounds.com/)
- [Mautini pubg java](https://github.com/mautini/pubgjava)

### Promotion
Empty
