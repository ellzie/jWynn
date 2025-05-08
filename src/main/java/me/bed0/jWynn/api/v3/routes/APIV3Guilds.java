package me.bed0.jWynn.api.v3.routes;

import me.bed0.jWynn.WynncraftAPI;
import me.bed0.jWynn.api.v3.endpoints.APIV3GetGuild;
import me.bed0.jWynn.api.v3.endpoints.APIV3GetGuildList;
import me.bed0.jWynn.api.v3.endpoints.APIV3GetTerritoryList;

public class APIV3Guilds {
    private WynncraftAPI api;

    public APIV3Guilds(WynncraftAPI api) {
        this.api = api;
    }
    // TODO: consider handling ?identifier, default to username but allow specification maybe?
    public APIV3GetGuild byName(String guildName){
        return new APIV3GetGuild(api.getConfig().getBaseURL() + "v3/guild/" + guildName + "?identifier=username",api);
    }
    public APIV3GetGuild byPrefix(String guildPrefix){
        return new APIV3GetGuild(api.getConfig().getBaseURL() + "v3/guild/prefix/" + guildPrefix + "?identifier=username",api);
    }

    /*
     * This endpoint is undocumented. TODO: considering using actual UUID type instead of string.
     */
    public APIV3GetGuild byUUID(String guildUUID){
        return new APIV3GetGuild(api.getConfig().getBaseURL() + "v3/guild/uuid/" + guildUUID + "?identifier=username",api);
    }

    public APIV3GetGuildList guildList(){
        return new APIV3GetGuildList(api.getConfig().getBaseURL() + "v3/guild/list/guild", api);
    }
    public APIV3GetTerritoryList territoryList(){
        return new APIV3GetTerritoryList(api.getConfig().getBaseURL() + "v3/guild/list/territory", api);
    }
}
