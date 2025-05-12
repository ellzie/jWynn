package me.bed0.jWynn.api.v3.routes;

import me.bed0.jWynn.WynncraftAPI;
import me.bed0.jWynn.api.v3.endpoints.APIV3ItemQuickSearch;

public class APIV3Items {
    private WynncraftAPI api;

    public APIV3Items(WynncraftAPI api) {
        this.api = api;
    }
    public APIV3ItemQuickSearch quick(String query){
        return new APIV3ItemQuickSearch(api.getConfig().getBaseURL()+ "v3/item/search/" + query, api);
    }
}
