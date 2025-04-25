package me.bed0.jWynn.api.v3.endpoints;

import com.google.gson.reflect.TypeToken;
import me.bed0.jWynn.api.APIMidpoint;
import me.bed0.jWynn.api.APIRequest;
import me.bed0.jWynn.api.v3.APIResponseV3;
import me.bed0.jWynn.api.v3.classes.WynncraftClass;

import java.util.Map;

import static me.bed0.jWynn.WynncraftAPI.GSON;

public class APIV3ClassesList extends APIRequest<Map<String,WynncraftClass>> {
    public APIV3ClassesList(String requestURL, APIMidpoint midpoint){
        super(requestURL, midpoint);
    }

    public APIResponseV3<Map<String,WynncraftClass>> runIncludeMeta(){
        return new APIResponseV3<>(GSON.fromJson(getResponse(), new TypeToken<Map<String,WynncraftClass>>() {
        }.getType()));
    }
}
