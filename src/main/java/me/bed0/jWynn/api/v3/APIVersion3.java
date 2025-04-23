package me.bed0.jWynn.api.v3;

import me.bed0.jWynn.WynncraftAPI;

public class APIVersion3 {
    private WynncraftAPI api;
    private APIV3News news;

    public APIVersion3(WynncraftAPI api) {
        this.api = api;
        this.news = new APIV3News(api);
    }

    public APIV3News news() {
        return news;
    }
}
