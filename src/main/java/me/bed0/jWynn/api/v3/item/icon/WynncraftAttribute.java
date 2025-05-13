package me.bed0.jWynn.api.v3.item.icon;

public class WynncraftAttribute {
    private String id;
    private String name;
    private String customModelData;

    public WynncraftAttribute() {
        this.id = "";
        this.name = "";
        this.customModelData = "";
    }

    public WynncraftAttribute(String id, String name, String customModelData) {
        this.id = id;
        this.name = name;
        this.customModelData = customModelData;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCustomModelData() {
        return customModelData;
    }

    @Override
    public String toString() {
        return "WynncraftAttribute{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", customModelData='" + customModelData + '\'' +
                '}';
    }
}
