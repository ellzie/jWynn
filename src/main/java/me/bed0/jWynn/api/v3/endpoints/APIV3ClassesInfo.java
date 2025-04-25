package me.bed0.jWynn.api.v3.endpoints;

import com.google.gson.reflect.TypeToken;
import me.bed0.jWynn.api.APIMidpoint;
import me.bed0.jWynn.api.APIRequest;
import me.bed0.jWynn.api.v3.APIResponseV3;
import me.bed0.jWynn.api.v3.classes.WynncraftClassInfo;

import static me.bed0.jWynn.WynncraftAPI.GSON;

public class APIV3ClassesInfo extends APIRequest<WynncraftClassInfo> {
    public APIV3ClassesInfo(String requestURL, APIMidpoint midpoint) {
        super(requestURL, midpoint);
    }

    public APIResponseV3<WynncraftClassInfo> runIncludeMeta(){
        return new APIResponseV3<>(GSON.fromJson(getResponse(), new TypeToken<WynncraftClassInfo>() {}.getType()));
    }
}
