package me.bed0.jWynn;


import me.bed0.jWynn.api.v1.item.ItemCategory;
import me.bed0.jWynn.exceptions.APIConnectionException;
import me.bed0.jWynn.exceptions.APIResponseException;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *  @deprecated This class of tests uses the v1 API which is no longer available (returns 404)
 *  Use the V2 equivalent instead. This function will be removed in a future update.
 */
@Deprecated
@Disabled("API V1 no longer supported")
public class jWynnTestsV1 {

    private static WynncraftAPI api = new WynncraftAPI();

    @Test
    void exceptionThrownWhenAPIDown() {
        assertThrows(APIConnectionException.class, () -> api.v1().guildStats("Imperial").toURL("aokegfjkjiadvfjidasnjvsnvjuiqebvhuirqnevjuibqnrecn.com").run());
    }

    @Test
    void exceptionThrownWhenNotJSON() {
        assertThrows(APIResponseException.class, () -> api.v1().guildStats("Imperial").toURL("https://example.com").run());
    }

    @Test
    void v1GuildStatsSuccessful() {
        api.v1().guildStats("Imperial").run();
    }

    @Test
    void v1GuildListSuccessful() {
        api.v1().guildList().run();
    }

    @Test
    void v1GuildLeaderboardSuccessful() {
        api.v1().guildLeaderboard().run();
    }

    @Test
    void v1ItemDBSuccessful() {
        api.v1().itemDBByCategory(ItemCategory.BOOTS).run();
    }

    @Test
    void v1MapLocationsSuccessful() {
        api.v1().mapLocations().run();
    }

    @Test
    void v1OnlinePlayersSuccessful() {
        api.v1().onlinePlayers().run();
    }

    @Test
    void v1OnlinePlayerSumSuccessful() {
        api.v1().onlinePlayerSum().run();
    }

    @Test
    void v1PlayerLeaderboardSuccessful() {
        api.v1().playerLeaderboard().run();
    }

    @Test
    void v1StatsSearchSuccessful() {
        api.v1().statsSearch("Test").run();
    }

    @Test
    void v1TerritoryListSuccessful() {
        api.v1().territoryList().run();
    }




}
