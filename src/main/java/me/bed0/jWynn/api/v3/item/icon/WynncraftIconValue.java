package me.bed0.jWynn.api.v3.item.icon;

public class WynncraftIconValue {
    private String strValue;
    private WynncraftAttribute attrValue;

    public WynncraftIconValue() {
        strValue = "";
        attrValue = new WynncraftAttribute();
    }

    public WynncraftIconValue(String strValue){
        this.strValue = strValue;
        this.attrValue = new WynncraftAttribute();
    }

    public WynncraftIconValue(WynncraftAttribute attrValue){
        this.strValue = "";
        this.attrValue = attrValue;
    }

    public WynncraftIconValue(String strValue, WynncraftAttribute attrValue) {
        this.strValue = strValue;
        this.attrValue = attrValue;
    }

}
