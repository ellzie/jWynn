package me.bed0.jWynn.api.v3.classes;

import java.util.HashMap;

public class WynncraftClassInfo {
    private String id;
    private String name;
    private String lore;
    private int overallDifficulty;
    private int overallMax; // This field is returned but not documented in any way.
    private HashMap<String, WynncraftClassArchetype> archetypes;

    public WynncraftClassInfo(String id, String name, String lore, int overallDifficulty, int overallMax, HashMap<String, WynncraftClassArchetype> archetypes) {
        this.id = id;
        this.name = name;
        this.lore = lore;
        this.overallDifficulty = overallDifficulty;
        this.overallMax = overallMax;
        this.archetypes = archetypes;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLore() {
        return lore;
    }

    public int getOverallDifficulty() {
        return overallDifficulty;
    }

    public int getOverallMax() {
        return overallMax;
    }

    public HashMap<String, WynncraftClassArchetype> getArchetypes() {
        return archetypes;
    }

    @Override
    public String toString() {
        return "WynncraftClassInfo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", lore='" + lore + '\'' +
                ", overallDifficulty=" + overallDifficulty +
                ", overallMax=" + overallMax +
                ", archetypes=" + archetypes +
                '}';
    }
}
