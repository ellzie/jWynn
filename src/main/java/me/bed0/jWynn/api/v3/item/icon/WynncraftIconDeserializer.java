package me.bed0.jWynn.api.v3.item.icon;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.Objects;

public class WynncraftIconDeserializer implements JsonDeserializer<WynncraftIcon> {
    @Override
    public WynncraftIcon deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject mainObject = jsonElement.getAsJsonObject();
        if (Objects.equals(mainObject.get("format").getAsString(), "attribute")){
            JsonObject value = mainObject.get("value").getAsJsonObject();
            String id = value.get("id").getAsString();
            String name = value.get("name").getAsString();
            String customModelData = value.get("customModelData").getAsString();
            return new WynncraftIcon(mainObject.get("format").getAsString(), new WynncraftIconValue(new WynncraftAttribute(id, name, customModelData)));
        } else {
            return new WynncraftIcon(mainObject.get("format").getAsString(), new WynncraftIconValue(mainObject.get("value").getAsString()));
        }
    }
}
