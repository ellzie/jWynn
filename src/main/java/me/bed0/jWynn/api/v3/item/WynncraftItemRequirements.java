package me.bed0.jWynn.api.v3.item;



public class WynncraftItemRequirements {
    public static class LevelRange{
        private final int min;
        private final int max;

        public LevelRange(int min, int max) {
            this.min = min;
            this.max = max;
        }

        public int getMin() {
            return min;
        }

        public int getMax() {
            return max;
        }
    }
    private int level;
    private LevelRange levelRange;
    private int strength;
    private int dexterity;
    private int intelligence;
    private int defence;
    private int agility;
    private String quest;
    private String class_requirement;
    private String[] skills;

    public WynncraftItemRequirements(int level, LevelRange levelRange, int strength, int dexterity, int intelligence, int defence, int agility, String quest, String class_requirement, String[] skills) {
        this.level = level;
        this.levelRange = levelRange;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.defence = defence;
        this.agility = agility;
        this.quest = quest;
        this.class_requirement = class_requirement;
        this.skills = skills;
    }

    public int getLevel() {
        return level;
    }

    public LevelRange getLevelRange() {
        return levelRange;
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getDefence() {
        return defence;
    }

    public int getAgility() {
        return agility;
    }

    public String getQuest() {
        return quest;
    }

    public String getClass_requirement() {
        return class_requirement;
    }

    public String[] getSkills() {
        return skills;
    }
}
