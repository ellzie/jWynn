package me.bed0.jWynn.api.v3.item.stat;

public class WynncraftStatRaw extends WynncraftStat {
    private int rawIdentification;

    public WynncraftStatRaw(int rawIdentification) {
        this.rawIdentification = rawIdentification;
    }

    public int getRawIdentification() {
        return rawIdentification;
    }

    @Override
    public String toString() {
        return "WynncraftStatRaw{" +
                "rawIdentification=" + rawIdentification +
                '}';
    }
}
