package me.bed0.jWynn.api.v3.classes;

public class WynncraftClass {
    private String name;
    private int overallDifficulty;

    public WynncraftClass(String name, int overallDifficulty) {
        this.name = name;
        this.overallDifficulty = overallDifficulty;
    }

    public String getName() {
        return name;
    }

    public int getOverallDifficulty() {
        return overallDifficulty;
    }

    @Override
    public String toString() {
        return "WynncraftClass{" +
                "name='" + name + '\'' +
                ", overallDifficulty=" + overallDifficulty +
                '}';
    }
}
