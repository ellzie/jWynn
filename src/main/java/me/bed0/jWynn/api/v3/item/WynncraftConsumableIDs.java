package me.bed0.jWynn.api.v3.item;

public class WynncraftConsumableIDs {
    private int duration;
    private int charges;

    public WynncraftConsumableIDs(int duration, int charges) {
        this.duration = duration;
        this.charges = charges;
    }

    public int getDuration() {
        return duration;
    }

    public int getCharges() {
        return charges;
    }
}
