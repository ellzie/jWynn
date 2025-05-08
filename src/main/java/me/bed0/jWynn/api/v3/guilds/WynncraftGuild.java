package me.bed0.jWynn.api.v3.guilds;

import java.util.Date;
import java.util.HashMap;

public class WynncraftGuild {
    private String uuid;
    private String name;
    private String prefix;
    private int level;
    private int xpPercent;
    private int territories;
    private int wars;
    private Date created;
    private WynncraftGuildMemberList members;
    private int online;
    private WynncraftGuildBanner banner;
    private HashMap<String, WynncraftGuildSeasonRank> seasonRanks;

    public WynncraftGuild(String uuid, String name, String prefix, int level, int xpPercent, int territories, int wars,
                          Date created, WynncraftGuildMemberList members, int online, WynncraftGuildBanner banner,
                          HashMap<String, WynncraftGuildSeasonRank> seasonRanks) {
        this.uuid = uuid;
        this.name = name;
        this.prefix = prefix;
        this.level = level;
        this.xpPercent = xpPercent;
        this.territories = territories;
        this.wars = wars;
        this.created = created;
        this.members = members;
        this.online = online;
        this.banner = banner;
        this.seasonRanks = seasonRanks;
    }

    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getPrefix() {
        return prefix;
    }

    public int getLevel() {
        return level;
    }

    public int getXpPercent() {
        return xpPercent;
    }

    public int getTerritories() {
        return territories;
    }

    public int getWars() {
        return wars;
    }

    public Date getCreated() {
        return created;
    }

    public WynncraftGuildMemberList getMembers() {
        return members;
    }

    public int getOnline() {
        return online;
    }

    public WynncraftGuildBanner getBanner() {
        return banner;
    }

    public HashMap<String, WynncraftGuildSeasonRank> getSeasonRanks() {
        return seasonRanks;
    }

    @Override
    public String toString() {
        return "WynncraftGuild{" +
                "uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                ", prefix='" + prefix + '\'' +
                ", level=" + level +
                ", xpPercent=" + xpPercent +
                ", territories=" + territories +
                ", wars=" + wars +
                ", created='" + created + '\'' +
                ", members=" + members +
                ", online=" + online +
                ", banner=" + banner +
                ", seasonRanks=" + seasonRanks +
                '}';
    }
}
