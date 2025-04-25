package me.bed0.jWynn.api.v3;

import me.bed0.jWynn.WynncraftAPI;
import me.bed0.jWynn.api.v3.routes.APIV3Classes;
import me.bed0.jWynn.api.v3.routes.APIV3News;

public class APIVersion3 {
    private final WynncraftAPI api;
    private final APIV3News news;
    private final APIV3Classes classesList;

    public APIVersion3(WynncraftAPI api) {
        this.api = api;
        this.news = new APIV3News(api);
        this.classesList = new APIV3Classes(api);
    }

    public APIV3News news() {
        return news;
    }

    public APIV3Classes classes(){
        return classesList;
    }
}
