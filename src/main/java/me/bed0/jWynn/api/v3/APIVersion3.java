package me.bed0.jWynn.api.v3;

import me.bed0.jWynn.WynncraftAPI;
import me.bed0.jWynn.api.v3.routes.APIV3Classes;
import me.bed0.jWynn.api.v3.routes.APIV3Guilds;
import me.bed0.jWynn.api.v3.routes.APIV3Map;
import me.bed0.jWynn.api.v3.routes.APIV3News;

public class APIVersion3 {
    private final WynncraftAPI api;
    private final APIV3News news;
    private final APIV3Classes classesList;
    private final APIV3Guilds guilds;
    private final APIV3Map map;

    public APIVersion3(WynncraftAPI api) {
        this.api = api;
        this.news = new APIV3News(api);
        this.classesList = new APIV3Classes(api);
        this.guilds = new APIV3Guilds(api);
        this.map = new APIV3Map(api);
    }

    public APIV3News news() {
        return news;
    }

    public APIV3Classes classes(){
        return classesList;
    }

    public APIV3Guilds guilds() {
        return guilds;
    }

    public APIV3Map map() {
        return map;
    }
}
