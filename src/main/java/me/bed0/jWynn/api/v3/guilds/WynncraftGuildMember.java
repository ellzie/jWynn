package me.bed0.jWynn.api.v3.guilds;

import java.util.Date;

public class WynncraftGuildMember {
    private String username;
    private String uuid;
    private boolean online;
    private String server;
    private long contributed;
    private int contributionRank;
    private Date joined;

    public WynncraftGuildMember(String username, String uuid, boolean online, String server, long contributed, int contributionRank, Date joined) {
        this.username = username;
        this.uuid = uuid;
        this.online = online;
        this.server = server;
        this.contributed = contributed;
        this.contributionRank = contributionRank;
        this.joined = joined;
    }

    public String getUsername() {
        return username;
    }

    public String getUuid() {
        return uuid;
    }

    public boolean isOnline() {
        return online;
    }

    public String getServer() {
        return server;
    }

    public long getContributed() {
        return contributed;
    }

    public int getContributionRank() {
        return contributionRank;
    }

    public Date getJoined() {
        return joined;
    }

    @Override
    public String toString() {
        return "WynncraftGuildMember{" +
                "username='" + username + '\'' +
                ", uuid='" + uuid + '\'' +
                ", online=" + online +
                ", server='" + server + '\'' +
                ", contributed=" + contributed +
                ", contributionRank=" + contributionRank +
                ", joined='" + joined + '\'' +
                '}';
    }
}
