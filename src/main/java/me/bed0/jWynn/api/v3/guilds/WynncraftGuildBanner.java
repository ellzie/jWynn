package me.bed0.jWynn.api.v3.guilds;

import java.util.Arrays;

public class WynncraftGuildBanner {
    private String base;
    private int tier;
    private String structure;
    private WynncraftGuildBannerLayer[] layers;

    public WynncraftGuildBanner(String base, int tier, String structure, WynncraftGuildBannerLayer[] layers) {
        this.base = base;
        this.tier = tier;
        this.structure = structure;
        this.layers = layers;
    }

    public String getBase() {
        return base;
    }

    public int getTier() {
        return tier;
    }

    public String getStructure() {
        return structure;
    }

    public WynncraftGuildBannerLayer[] getLayers() {
        return layers;
    }

    @Override
    public String toString() {
        return "WynncraftGuildBanner{" +
                "base='" + base + '\'' +
                ", tier=" + tier +
                ", structure='" + structure + '\'' +
                ", layers=" + Arrays.toString(layers) +
                '}';
    }
}
