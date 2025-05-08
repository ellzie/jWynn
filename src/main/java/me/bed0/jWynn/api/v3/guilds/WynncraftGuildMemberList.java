package me.bed0.jWynn.api.v3.guilds;

import java.util.HashMap;

public class WynncraftGuildMemberList {
    private int total;
    private HashMap<String,WynncraftGuildMember> owner;
    private HashMap<String,WynncraftGuildMember> chief;
    private HashMap<String,WynncraftGuildMember> strategist;
    private HashMap<String,WynncraftGuildMember> captain;
    private HashMap<String,WynncraftGuildMember> recruiter;
    private HashMap<String,WynncraftGuildMember> recruit;

    @Override
    public String toString() {
        return "WynncraftGuildMemberList{" +
                "total=" + total +
                ", owner=" + owner +
                ", chief=" + chief +
                ", strategist=" + strategist +
                ", captain=" + captain +
                ", recruiter=" + recruiter +
                ", recruit=" + recruit +
                '}';
    }
}
