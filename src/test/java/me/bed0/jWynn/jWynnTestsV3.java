package me.bed0.jWynn;

import org.junit.jupiter.api.Test;

public class jWynnTestsV3 {

    private WynncraftAPI api = new WynncraftAPI();

    @Test
    void v3LatestNewsSuccessful(){
        api.v3().news().latest().run();
    }

    @Test
    void v3ClassListSuccessful(){
        api.v3().classes().classesList().run();
    }

    @Test
    void v3ClassInfoSuccessful(){
        api.v3().classes().classesInfo("mage").run();
    }
    @Test
    void v3GuildInfoSuccessful(){
        api.v3().guilds().byName("NewEridu").run();
    }

    @Test
    void v3GuildTerritories(){
        api.v3().guilds().territoryList().run();
    }
    @Test
    void v3MapMarkers(){
        api.v3().map().list().run();
    }
    @Test
    void v3MapPlayer(){
        api.v3().map().player().run();
    }
}
