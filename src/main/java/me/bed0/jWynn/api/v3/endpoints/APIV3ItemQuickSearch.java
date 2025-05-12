package me.bed0.jWynn.api.v3.endpoints;

import com.google.gson.reflect.TypeToken;
import me.bed0.jWynn.api.APIMidpoint;
import me.bed0.jWynn.api.APIRequest;
import me.bed0.jWynn.api.v3.APIResponseV3;
import me.bed0.jWynn.api.v3.item.WynncraftItem;

import java.util.HashMap;

import static me.bed0.jWynn.WynncraftAPI.GSON;

public class APIV3ItemQuickSearch extends APIRequest<HashMap<String, WynncraftItem>> {
    public APIV3ItemQuickSearch(String requestURL, APIMidpoint midpoint) {
        super(requestURL, midpoint);
    }
    public APIResponseV3<HashMap<String,WynncraftItem>> runIncludeMeta(){
        return new APIResponseV3<>(GSON.fromJson(getResponse(), new TypeToken<HashMap<String,WynncraftItem>>() {}.getType()));
    }
}
