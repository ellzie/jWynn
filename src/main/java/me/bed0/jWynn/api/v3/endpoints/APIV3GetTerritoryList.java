package me.bed0.jWynn.api.v3.endpoints;

import com.google.gson.reflect.TypeToken;
import me.bed0.jWynn.api.APIMidpoint;
import me.bed0.jWynn.api.APIRequest;
import me.bed0.jWynn.api.v3.APIResponseV3;
import me.bed0.jWynn.api.v3.guilds.WynncraftTerritory;

import java.util.HashMap;

import static me.bed0.jWynn.WynncraftAPI.GSON;

public class APIV3GetTerritoryList extends APIRequest<HashMap<String, WynncraftTerritory>> {
    public APIV3GetTerritoryList(String requestURL, APIMidpoint midpoint) {
        super(requestURL, midpoint);
    }
    public APIResponseV3<HashMap<String, WynncraftTerritory>> runIncludeMeta() {
        return new APIResponseV3<>(GSON.fromJson(getResponse(),
                new TypeToken<HashMap<String, WynncraftTerritory>>() {}.getType()));
    }
}
