package me.bed0.jWynn.api.v3.guilds;

public class WynncraftGuildListEntry {
    private String name;
    private String prefix;
    private String uuid;

    public WynncraftGuildListEntry(String name, String prefix, String uuid) {
        this.name = name;
        this.prefix = prefix;
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getUuid() {
        return uuid;
    }

    @Override
    public String toString() {
        return "WynncraftGuildListEntry{" +
                "name='" + name + '\'' +
                ", prefix='" + prefix + '\'' +
                ", uuid='" + uuid + '\'' +
                '}';
    }
}
