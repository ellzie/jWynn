package me.bed0.jWynn.api.v3.endpoints;

import com.google.gson.reflect.TypeToken;
import me.bed0.jWynn.api.APIMidpoint;
import me.bed0.jWynn.api.APIRequest;
import me.bed0.jWynn.api.common.WynncraftMapLocation;
import me.bed0.jWynn.api.v3.APIResponseV3;

import static me.bed0.jWynn.WynncraftAPI.GSON;

public class APIV3GetMapLocations extends APIRequest<WynncraftMapLocation[]> {
    public APIV3GetMapLocations(String requestURL, APIMidpoint midpoint) {
        super(requestURL, midpoint);
    }

    @Override
    public APIResponseV3<WynncraftMapLocation[]> runIncludeMeta() {
        return new APIResponseV3<>(GSON.fromJson(getResponse(), new TypeToken<WynncraftMapLocation[]>() {}.getType()));
    }
}
