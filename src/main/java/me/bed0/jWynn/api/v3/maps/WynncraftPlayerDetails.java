package me.bed0.jWynn.api.v3.maps;

public class WynncraftPlayerDetails {
    private String uuid;
    private String name;
    private String nickname;
    private String server;
    private int x;
    private int y;
    private int z;

    public WynncraftPlayerDetails(String uuid, String name, String nickname, String server, int x, int y, int z) {
        this.uuid = uuid;
        this.name = name;
        this.nickname = nickname;
        this.server = server;
        this.x = x;
        this.y = y;
        this.z = z;
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
}
