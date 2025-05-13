package me.bed0.jWynn.api.v3.item.stat;


public class WynncraftStat{
    private int min;
    private int max;
    private int raw;
    private String source;

    public WynncraftStat(int min, int max, int raw, String source) {
        this.min = min;
        this.max = max;
        this.raw = raw;
        this.source = source;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int getRaw() {
        return raw;
    }

    public String getSource() {
        return source;
    }
}

