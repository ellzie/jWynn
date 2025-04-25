package me.bed0.jWynn.api.v3.endpoints;

import com.google.gson.reflect.TypeToken;
import me.bed0.jWynn.api.APIMidpoint;
import me.bed0.jWynn.api.APIRequest;
import me.bed0.jWynn.api.v3.APIResponseV3;
import me.bed0.jWynn.api.v3.WynncraftNews;

import static me.bed0.jWynn.WynncraftAPI.GSON;

public class APIV3WynncraftNewsLatest extends APIRequest<WynncraftNews[]> {

    public APIV3WynncraftNewsLatest(String requestURL, APIMidpoint midpoint){
        super(requestURL, midpoint);
    }

    @Override
    public APIResponseV3<WynncraftNews[]> runIncludeMeta() {
        return new APIResponseV3<>(GSON.fromJson(getResponse(), new TypeToken<WynncraftNews[]>() {
        }.getType()));
    }

}
