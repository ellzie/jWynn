package me.bed0.jWynn.api.common;

public enum Identifier {
    UUID,
    USERNAME;

    public String toString(){
        return this.name().toLowerCase();
    }
}
