package me.bed0.jWynn.api.v3.endpoints;

import com.google.gson.reflect.TypeToken;
import me.bed0.jWynn.api.APIMidpoint;
import me.bed0.jWynn.api.APIRequest;
import me.bed0.jWynn.api.v3.APIResponseV3;
import me.bed0.jWynn.api.v3.guilds.WynncraftGuildListEntry;

import java.util.HashMap;

import static me.bed0.jWynn.WynncraftAPI.GSON;

public class APIV3GetGuildList extends APIRequest<HashMap<String, WynncraftGuildListEntry>> {
    public APIV3GetGuildList(String requestURL, APIMidpoint midpoint) {
        super(requestURL, midpoint);
    }
    public APIResponseV3<HashMap<String, WynncraftGuildListEntry>> runIncludeMeta() {
        return new APIResponseV3<>(GSON.fromJson(getResponse(),
                new TypeToken<HashMap<String, WynncraftGuildListEntry>>() {}.getType()));
    }
}
