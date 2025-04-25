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
}
