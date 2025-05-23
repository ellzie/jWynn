package me.bed0.jWynn.api.v3.routes;

import me.bed0.jWynn.WynncraftAPI;
import me.bed0.jWynn.api.common.Identifier;
import me.bed0.jWynn.api.v3.endpoints.APIV3GetGuild;
import me.bed0.jWynn.api.v3.endpoints.APIV3GetGuildList;
import me.bed0.jWynn.api.v3.endpoints.APIV3GetTerritoryList;

public class APIV3Guilds {
    private WynncraftAPI api;

    public APIV3Guilds(WynncraftAPI api) {
        this.api = api;
    }

    public APIV3GetGuild byName(String guildName){
        return new APIV3GetGuild(api.getConfig().getBaseURL() + "v3/guild/" + guildName + "?identifier=uuid",api);
    }
    public APIV3GetGuild byName(String guildName, Identifier identifier){
        return new APIV3GetGuild(api.getConfig().getBaseURL() + "v3/guild/" + guildName + "?identifier=" + identifier,api);
    }

    public APIV3GetGuild byPrefix(String guildPrefix){
        return new APIV3GetGuild(api.getConfig().getBaseURL() + "v3/guild/prefix/" + guildPrefix + "?identifier=uuid",api);
    }
    public APIV3GetGuild byPrefix(String guildPrefix, Identifier identifier){
        return new APIV3GetGuild(api.getConfig().getBaseURL() + "v3/guild/prefix/" + guildPrefix + "?identifier=" + identifier,api);
    }

    /*
     * This endpoint is undocumented. TODO: considering using actual UUID type instead of string.
     *                                 I think that UUID is actually slower than String when not generating UUIDs which
     *                                 will not be happening.
     */
    public APIV3GetGuild byUUID(String guildUUID){
        return new APIV3GetGuild(api.getConfig().getBaseURL() + "v3/guild/uuid/" + guildUUID + "?identifier=uuid",api);
    }
    public APIV3GetGuild byUUID(String guildUUID, Identifier identifier){
        return new APIV3GetGuild(api.getConfig().getBaseURL() + "v3/guild/uuid/" + guildUUID + "?identifier=" + identifier,api);
    }

    public APIV3GetGuildList guildList(){
        return new APIV3GetGuildList(api.getConfig().getBaseURL() + "v3/guild/list/guild", api);
    }
    public APIV3GetTerritoryList territoryList(){
        return new APIV3GetTerritoryList(api.getConfig().getBaseURL() + "v3/guild/list/territory", api);
    }
}
