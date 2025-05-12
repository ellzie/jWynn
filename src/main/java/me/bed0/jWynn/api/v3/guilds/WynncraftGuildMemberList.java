package me.bed0.jWynn.api.v3.guilds;

import java.util.ArrayList;
import java.util.HashMap;

public class WynncraftGuildMemberList {
    private int total;
    private HashMap<String,WynncraftGuildMember> owner;
    private HashMap<String,WynncraftGuildMember> chief;
    private HashMap<String,WynncraftGuildMember> strategist;
    private HashMap<String,WynncraftGuildMember> captain;
    private HashMap<String,WynncraftGuildMember> recruiter;
    private HashMap<String,WynncraftGuildMember> recruit;


    public int getTotal() {
        return total;
    }
    // These gets arent really that interesting cause they are maps, maybe
    // TODO: consider making these lists where the key value is inserted into the object so its easier to use
    public HashMap<String, WynncraftGuildMember> getOwner() {
        return owner;
    }

    public HashMap<String, WynncraftGuildMember> getChief() {
        return chief;
    }

    public HashMap<String, WynncraftGuildMember> getStrategist() {
        return strategist;
    }

    public HashMap<String, WynncraftGuildMember> getCaptain() {
        return captain;
    }

    public HashMap<String, WynncraftGuildMember> getRecruiter() {
        return recruiter;
    }

    public HashMap<String, WynncraftGuildMember> getRecruit() {
        return recruit;
    }
    public ArrayList<WynncraftGuildMember> getAllMembersAsArrayList(){
        ArrayList<WynncraftGuildMember> members = new ArrayList<>(owner.values());
        members.addAll(chief.values());
        members.addAll(strategist.values());
        members.addAll(captain.values());
        members.addAll(recruiter.values());
        members.addAll(recruit.values());
        return members;
    }
}
