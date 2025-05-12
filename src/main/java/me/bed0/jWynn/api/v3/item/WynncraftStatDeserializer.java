package me.bed0.jWynn.api.v3.item;

import com.google.gson.*;

import java.lang.reflect.Type;

public class WynncraftStatDeserializer implements JsonDeserializer<WynncraftStat> {
    @Override
    public WynncraftStat deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if (jsonElement.isJsonPrimitive()){
            return new WynncraftStatRaw(jsonElement.getAsInt());
        } else {
            JsonObject mainObject = jsonElement.getAsJsonObject();
            return new WynncraftStatDetailed(mainObject.get("min").getAsInt(), mainObject.get("max").getAsInt(), mainObject.get("raw").getAsInt());
        }
    }
}
