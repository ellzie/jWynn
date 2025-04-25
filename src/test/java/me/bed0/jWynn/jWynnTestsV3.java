package me.bed0.jWynn;

import org.junit.jupiter.api.Test;

public class jWynnTestsV3 {

    private WynncraftAPI api = new WynncraftAPI();

    @Test
    void v3LatestNewsSuccessful(){
        System.out.println(api.v3().news().latest().runIncludeMeta().getData()[0].toString());
    }
}
