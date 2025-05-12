package me.bed0.jWynn.api.v3.item;

public class WynncraftDropLocation {
    private int[] coordinates;
    private String name;
    private String type;

    public WynncraftDropLocation(int[] coordinates, String name, String type) {
        this.coordinates = coordinates;
        this.name = name;
        this.type = type;
    }

    public int[] getCoordinates() {
        return coordinates;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
