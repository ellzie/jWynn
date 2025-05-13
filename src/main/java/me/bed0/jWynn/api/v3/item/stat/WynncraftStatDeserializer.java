package me.bed0.jWynn.api.v3.item.stat;

import com.google.gson.*;

import java.lang.reflect.Type;

public class WynncraftStatDeserializer implements JsonDeserializer<WynncraftStat> {
    @Override
    public WynncraftStat deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        int min, max, raw;
        String source;
        if (json.isJsonObject()) {
            JsonObject obj = json.getAsJsonObject();
            min = obj.get("min").getAsInt();
            max = obj.get("max").getAsInt();
            raw = obj.get("raw").getAsInt();
            source = "detailed";
        } else {
            raw = json.getAsInt();
            min = 0;
            max = 0;
            source = "raw";
        }
        return new WynncraftStat(min, max, raw, source);
    }
}
