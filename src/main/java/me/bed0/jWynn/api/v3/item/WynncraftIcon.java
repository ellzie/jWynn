package me.bed0.jWynn.api.v3.item;

public class WynncraftIcon {
    private String format;
    // TODO: refactor object to be more type safe (same solution as WynncraftStat)
    private Object value;

    public WynncraftIcon(String format, Object value) {
        this.format = format;
        this.value = value;
    }

    public String getFormat() {
        return format;
    }

    public Object getValue() {
        return value;
    }
}
