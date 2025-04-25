package me.bed0.jWynn.api.v3.routes;

import me.bed0.jWynn.WynncraftAPI;
import me.bed0.jWynn.api.v3.endpoints.APIV3ClassesInfo;
import me.bed0.jWynn.api.v3.endpoints.APIV3ClassesList;

public class APIV3Classes {
    private WynncraftAPI api;

    public APIV3Classes(WynncraftAPI api) {
        this.api = api;
    }

    public APIV3ClassesList classesList() {
        return new APIV3ClassesList(api.getConfig().getBaseURL() + "v3/classes", api);
    }
    // TODO: Try Catch block to ensure that input is valid or use enum?
    // ENUM CASE: handles validity on this side, doesn't have to wait for server response.
    // TRY CATCH CASE: Offloads validity to user, probably not ideal?
    public APIV3ClassesInfo classesInfo(String class_name) {
        return new APIV3ClassesInfo(api.getConfig().getBaseURL() + "v3/classes/" + class_name, api);
    }
}
