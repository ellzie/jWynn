package me.bed0.jWynn.api.v3.item.icon;

public class WynncraftIconAttribute extends WynncraftIcon{
    private WynncraftAttribute value;
    private String format;

    public WynncraftIconAttribute(String format, WynncraftAttribute value) {
        this.format = format;
        this.value = value;
    }

    public WynncraftAttribute getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "WynncraftIconAttribute{" +
                "value=" + value +
                ", format='" + format + '\'' +
                '}';
    }
}
