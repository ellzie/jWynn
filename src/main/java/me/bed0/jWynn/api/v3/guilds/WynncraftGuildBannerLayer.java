package me.bed0.jWynn.api.v3.guilds;

public class WynncraftGuildBannerLayer {
    private String colour;
    private String pattern;

    public WynncraftGuildBannerLayer(String colour, String pattern) {
        this.colour = colour;
        this.pattern = pattern;
    }

    public String getColour() {
        return colour;
    }

    public String getPattern() {
        return pattern;
    }

    @Override
    public String toString() {
        return "WynncraftGuildBannerLayer{" +
                "colour='" + colour + '\'' +
                ", pattern='" + pattern + '\'' +
                '}';
    }
}
