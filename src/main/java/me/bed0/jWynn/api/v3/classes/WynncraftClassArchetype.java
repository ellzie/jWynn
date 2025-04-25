package me.bed0.jWynn.api.v3.classes;

public class WynncraftClassArchetype {
    private String name;
    private int difficulty;
    private int max; // This field is returned but not documented in any way.
    private String icon; // This field is returned but not documented properly documented.
    private int damage;
    private int defence;
    private int range;
    private int speed;


    public WynncraftClassArchetype(String name, int difficulty, int max, String icon, int damage, int defence, int range, int speed) {
        this.name = name;
        this.difficulty = difficulty;
        this.max = max;
        this.icon = icon;
        this.damage = damage;
        this.defence = defence;
        this.range = range;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public int getMax() {
        return max;
    }

    public String getIcon() {
        return icon;
    }

    public int getDamage() {
        return damage;
    }

    public int getDefence() {
        return defence;
    }

    public int getRange() {
        return range;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "WynncraftClassArchetype{" +
                "name='" + name + '\'' +
                ", difficulty=" + difficulty +
                ", max=" + max +
                ", icon='" + icon + '\'' +
                ", damage=" + damage +
                ", defence=" + defence +
                ", range=" + range +
                ", speed=" + speed +
                '}';
    }
}
