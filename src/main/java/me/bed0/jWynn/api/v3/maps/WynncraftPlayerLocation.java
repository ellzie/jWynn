package me.bed0.jWynn.api.v3.maps;

public class WynncraftPlayerLocation {
    // I highly considered packing the first 7 responses here into a WynncraftPlayerDetails list but i decided against it
    private String uuid;
    private String name;
    private String nickname;
    private String server;
    private int x;
    private int y;
    private int z;
    private WynncraftPlayerDetails[] friends;
    private WynncraftPlayerDetails[] party;
    private WynncraftPlayerDetails[] guild;

    public WynncraftPlayerLocation(String uuid, String name, String nickname, String server, int x, int y, int z,
                                   WynncraftPlayerDetails[] friends, WynncraftPlayerDetails[] party,
                                   WynncraftPlayerDetails[] guild) {
        this.uuid = uuid;
        this.name = name;
        this.nickname = nickname;
        this.server = server;
        this.x = x;
        this.y = y;
        this.z = z;
        this.friends = friends;
        this.party = party;
        this.guild = guild;
    }

    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public String getServer() {
        return server;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public WynncraftPlayerDetails[] getFriends() {
        return friends;
    }

    public WynncraftPlayerDetails[] getParty() {
        return party;
    }

    public WynncraftPlayerDetails[] getGuild() {
        return guild;
    }
}

