package me.bed0.jWynn.api.v3.guilds;

public class WynncraftGuildSeasonRank {
    private int rating;
    private int finalTerritories;

    public WynncraftGuildSeasonRank(int rating, int finalTerritories) {
        this.rating = rating;
        this.finalTerritories = finalTerritories;
    }

    public int getRating() {
        return rating;
    }

    public int getFinalTerritories() {
        return finalTerritories;
    }

    @Override
    public String toString() {
        return "WynncraftGuildSeasonRank{" +
                "rating=" + rating +
                ", finalTerritories=" + finalTerritories +
                '}';
    }
}
