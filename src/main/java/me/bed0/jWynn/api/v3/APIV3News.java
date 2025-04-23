package me.bed0.jWynn.api.v3;

import me.bed0.jWynn.WynncraftAPI;
import me.bed0.jWynn.api.v3.endpoints.APIV3WynncraftNewsLatest;

public class APIV3News {

    private WynncraftAPI api;

    public APIV3News(WynncraftAPI api) {
        this.api = api;
    }

    public APIV3WynncraftNewsLatest latest(){
        return new APIV3WynncraftNewsLatest(api.getConfig().getBaseURL() + "v3/latest-news", api);
    }
}
