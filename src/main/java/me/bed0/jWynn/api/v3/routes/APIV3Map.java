package me.bed0.jWynn.api.v3.routes;

import me.bed0.jWynn.WynncraftAPI;
import me.bed0.jWynn.api.v3.endpoints.APIV3GetMapLocations;
import me.bed0.jWynn.api.v3.endpoints.APIV3GetPlayerLocation;

public class APIV3Map {
    private WynncraftAPI api;

    public APIV3Map(WynncraftAPI api) {
        this.api = api;
    }

    public APIV3GetMapLocations list(){
        return new APIV3GetMapLocations(api.getConfig().getBaseURL() + "v3/map/locations/markers", api);
    }

    public APIV3GetPlayerLocation player(){
        return new APIV3GetPlayerLocation(api.getConfig().getBaseURL() + "v3/map/locations/player", api);
    }

}
