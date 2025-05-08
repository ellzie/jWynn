package me.bed0.jWynn.api.v3.guilds;

import java.util.Arrays;
import java.util.Date;

public class WynncraftTerritory {
    public class Coordinates {
        private int[] start;
        private int[] end;

        @Override
        public String toString() {
            return "Coordinates{" +
                    "start=" + Arrays.toString(start) +
                    ", end=" + Arrays.toString(end) +
                    '}';
        }
    }
    private WynncraftGuildListEntry guild;
    private Date acquired;
    private Coordinates location;

    public WynncraftTerritory(WynncraftGuildListEntry guild, Date acquired, Coordinates location) {
        this.guild = guild;
        this.acquired = acquired;
        this.location = location;
    }

    public WynncraftGuildListEntry getGuild() {
        return guild;
    }

    public Date getAcquired() {
        return acquired;
    }

    public Coordinates getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "WynncraftTerritory{" +
                "guild=" + guild +
                ", acquired='" + acquired + '\'' +
                ", location=" + location +
                '}';
    }
}
