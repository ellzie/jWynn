package me.bed0.jWynn.api.v3.endpoints;

import com.google.gson.reflect.TypeToken;
import me.bed0.jWynn.api.APIMidpoint;
import me.bed0.jWynn.api.APIRequest;

import me.bed0.jWynn.api.v3.APIResponseV3;
import me.bed0.jWynn.api.v3.guilds.WynncraftGuild;

import static me.bed0.jWynn.WynncraftAPI.GSON;

public class APIV3GetGuild extends APIRequest<WynncraftGuild> {
    public APIV3GetGuild(String requestURL, APIMidpoint midpoint) {
        super(requestURL, midpoint);
    }

    public APIResponseV3<WynncraftGuild> runIncludeMeta(){
        return new APIResponseV3<>(GSON.fromJson(getResponse(), new TypeToken<WynncraftGuild>() {}.getType()));
    }
}
