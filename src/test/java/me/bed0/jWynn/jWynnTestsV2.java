package me.bed0.jWynn;

import me.bed0.jWynn.api.common.WynncraftProfession;
import org.junit.jupiter.api.Test;

public class jWynnTestsV2 {
    private static WynncraftAPI api = new WynncraftAPI();

    @Test
    void v2IngredientListSuccessful() {
        api.v2().ingredient().list().run();
    }

    @Test
    void v2IngredientRequestSuccessful() {
        api.v2().ingredient().get("Accursed Effigy").run();
    }

    @Test
    void v2IngredientSearchSuccessful() {
        api.v2().ingredient().search().name("Test").run();
    }

    @Test
    void v2PlayerStatsSuccessful() {
        api.v2().player().statsUUID("5aa0ae01-8c1b-4e0a-b31b-825389a7cb7b").run();
    }

    @Test
    void v2RecipeListSuccessful() {
        api.v2().recipe().list().run();
    }

    @Test
    void v2RecipeSearchSuccessful() {
        api.v2().recipe().search().profession(WynncraftProfession.ALCHEMISM).run();
    }

    @Test
    void v2RecipeSuccessful() {
        api.v2().recipe().get("Boots-1-3").run();
    }
}
