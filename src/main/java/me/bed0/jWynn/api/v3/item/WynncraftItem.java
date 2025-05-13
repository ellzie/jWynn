package me.bed0.jWynn.api.v3.item;

import com.google.gson.annotations.SerializedName;
import me.bed0.jWynn.api.v3.item.icon.WynncraftIcon;
import me.bed0.jWynn.api.v3.item.stat.WynncraftStat;

import java.util.Arrays;
import java.util.HashMap;

public class WynncraftItem {
    private String internalName;
    private String type;

    @SerializedName(value = "weaponType", alternate = {"armourType", "accessoryType","tomeType", "charmType", "toolType", "ingredientType", "materialType"})
    private String subtype;

    private WynncraftIcon icon;
    private boolean identifier;
    private boolean allow_craftsman;

    private String armourMaterial;
    private String attackSpeed;
    private int averageDps;
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

    public WynncraftItem(String internalName, String type, String subtype, WynncraftIcon icon, boolean identifier, boolean allow_craftsman, String armourMaterial, String attackSpeed, int averageDPS, int gatheringSpeed, String tier, String rarity, WynncraftConsumableIDs consumableOnlyIDs, WynncraftIngredientIDs itemOnlyIDs, HashMap<String, String> majorIds, String[] craftable, int powderSlots, String lore, String dropRestriction, boolean raidReward, WynncraftDropLocation dropMeta, HashMap<String, WynncraftStat> base, WynncraftItemRequirements requirements, HashMap<String, WynncraftStat> identifications) {
        this.internalName = internalName;
        this.type = type;
        this.subtype = subtype;
        this.icon = icon;
        this.identifier = identifier;
        this.allow_craftsman = allow_craftsman;
        this.armourMaterial = armourMaterial;
        this.attackSpeed = attackSpeed;
        this.averageDps = averageDPS;
        this.gatheringSpeed = gatheringSpeed;
        this.tier = tier;
        this.rarity = rarity;
        this.consumableOnlyIDs = consumableOnlyIDs;
        this.itemOnlyIDs = itemOnlyIDs;
        this.majorIds = majorIds;
        this.craftable = craftable;
        this.powderSlots = powderSlots;
        this.lore = lore;
        this.dropRestriction = dropRestriction;
        this.raidReward = raidReward;
        this.dropMeta = dropMeta;
        this.base = base;
        this.requirements = requirements;
        this.identifications = identifications;
    }

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
                ", averageDPS=" + averageDps +
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
