package me.bed0.jWynn.api.v3.item.icon;

public class WynncraftIcon {
    private WynncraftIconValue value;
    private String format;

    public WynncraftIcon(String format, WynncraftIconValue value) {
        this.value = value;
        this.format = format;
    }

    public WynncraftIconValue getValue() {
        return value;
    }

    public String getFormat() {
        return format;
    }
}
