package me.bed0.jWynn.api.v3.item;

import me.bed0.jWynn.api.v3.item.icon.WynncraftIcon;
import me.bed0.jWynn.api.v3.item.stat.WynncraftStat;

import java.util.Arrays;
import java.util.HashMap;

public class WynncraftItem {
    private String internalName;
    private String type;
    private String subtype;
    private WynncraftIcon icon;
    private boolean identifier;
    private boolean allow_craftsman;

    private String armourMaterial;
    private String attackSpeed;
    private int averageDPS;
    private int gatheringSpeed;
    private String tier;
    private String rarity;
    private WynncraftConsumableIDs consumableOnlyIDs;
    private WynncraftIngredientIDs itemOnlyIDs;
    private HashMap<String, String> majorIds; // Lots of new Major IDs since the enum was made
    private String[] craftable;
    private int powderSlots;
    private String lore;
    private String dropRestriction;
    private boolean raidReward;
    private WynncraftDropLocation dropMeta;
    private HashMap<String, WynncraftStat> base;
    private WynncraftItemRequirements requirements;
    private HashMap<String, WynncraftStat> identifications;

    @Override
    public String toString() {
        return "WynncraftItem{" +
                "internalName='" + internalName + '\'' +
                ", type='" + type + '\'' +
                ", subtype='" + subtype + '\'' +
                ", icon=" + icon +
                ", identifier=" + identifier +
                ", allow_craftsman=" + allow_craftsman +
                ", armourMaterial='" + armourMaterial + '\'' +
                ", attackSpeed='" + attackSpeed + '\'' +
                ", averageDPS=" + averageDPS +
                ", gatheringSpeed=" + gatheringSpeed +
                ", tier='" + tier + '\'' +
                ", rarity='" + rarity + '\'' +
                ", consumableOnlyIDs=" + consumableOnlyIDs +
                ", itemOnlyIDs=" + itemOnlyIDs +
                ", majorIds=" + majorIds +
                ", craftable=" + Arrays.toString(craftable) +
                ", powderSlots=" + powderSlots +
                ", lore='" + lore + '\'' +
                ", dropRestriction='" + dropRestriction + '\'' +
                ", raidReward=" + raidReward +
                ", dropMeta=" + dropMeta +
                ", base=" + base +
                ", requirements=" + requirements +
                ", identifications=" + identifications +
                '}';
    }
}
