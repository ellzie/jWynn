package me.bed0.jWynn.api.v3.search;

import me.bed0.jWynn.api.v3.guilds.WynncraftGuildListEntry;
import me.bed0.jWynn.api.v3.item.WynncraftItem;

import java.util.HashMap;

public class WynncraftGlobalSearch {
    private String query;
    private HashMap<String, String> players;
    private HashMap<String, WynncraftGuildListEntry> guilds;
    private HashMap<String, WynncraftGuildListEntry> guildsPrefix;
    private HashMap<String, LocationCoordinates> territories;
    private HashMap<String, LocationCoordinates> discoveries;
    private HashMap<String, WynncraftItem> items;


    public static class LocationCoordinates {
        public int[] start;
        public int[] end;

        public LocationCoordinates(int[] start, int[] end) {
            this.start = start;
            this.end = end;
        }

        public int[] getStart() {
            return start;
        }

        public int[] getEnd() {
            return end;
        }
    }
}
