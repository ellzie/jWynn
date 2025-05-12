package me.bed0.jWynn.api.v3.item.icon;

public class WynncraftIconString extends WynncraftIcon{
    private String value;
    private String format;

    public WynncraftIconString(String format, String value) {
        this.format = format;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "WynncraftIconString{" +
                "value='" + value + '\'' +
                ", format='" + format + '\'' +
                '}';
    }
}
