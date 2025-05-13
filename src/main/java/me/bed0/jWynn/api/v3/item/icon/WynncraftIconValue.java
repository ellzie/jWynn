package me.bed0.jWynn.api.v3.item.icon;

public class WynncraftIconValue {
    private String raw;
    private WynncraftAttribute attribute;

    public WynncraftIconValue(String strValue){
        this.raw = strValue;
        this.attribute = null;
    }

    public WynncraftIconValue(WynncraftAttribute attrValue){
        this.raw = null;
        this.attribute = attrValue;
    }


    public boolean isRaw(){
        return this.raw != null;
    }
    public boolean isAttribute(){
        return this.attribute != null;
    }

    public String getRaw() {
        return raw;
    }

    public WynncraftAttribute getAttribute() {
        return attribute;
    }
}
