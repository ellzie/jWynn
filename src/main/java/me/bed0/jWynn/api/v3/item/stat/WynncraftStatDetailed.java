package me.bed0.jWynn.api.v3.item.stat;

public class WynncraftStatDetailed extends WynncraftStat {
    private int min;
    private int max;
    private int raw;

    public WynncraftStatDetailed(int min, int max, int raw) {
        this.min = min;
        this.max = max;
        this.raw = raw;
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

    @Override
    public String toString() {
        return "WynncraftStatDetailed{" +
                "min=" + min +
                ", max=" + max +
                ", raw=" + raw +
                '}';
    }
}
