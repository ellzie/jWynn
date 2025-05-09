package me.bed0.jWynn.api.v3.endpoints;

import com.google.gson.reflect.TypeToken;
import me.bed0.jWynn.api.APIMidpoint;
import me.bed0.jWynn.api.APIRequest;
import me.bed0.jWynn.api.v3.APIResponseV3;
import me.bed0.jWynn.api.v3.maps.WynncraftPlayerLocation;

import static me.bed0.jWynn.WynncraftAPI.GSON;

public class APIV3GetPlayerLocation extends APIRequest<WynncraftPlayerLocation[]> {
    public APIV3GetPlayerLocation(String requestURL, APIMidpoint midpoint) {
        super(requestURL, midpoint);
    }
    public APIResponseV3<WynncraftPlayerLocation[]> runIncludeMeta(){
        return new APIResponseV3<>(GSON.fromJson(getResponse(), new TypeToken<WynncraftPlayerLocation[]>() {}.getType()));
    }
}
