package me.bed0.jWynn.api.v3.item;

public class WynncraftIngredientIDs {
    private int left;
    private int right;
    private int above;
    private int under;
    private int touching;
    private int not_touching;

    public WynncraftIngredientIDs(int left, int right, int above, int under, int touching, int not_touching) {
        this.left = left;
        this.right = right;
        this.above = above;
        this.under = under;
        this.touching = touching;
        this.not_touching = not_touching;
    }

    public int getLeft() {
        return left;
    }

    public int getRight() {
        return right;
    }

    public int getAbove() {
        return above;
    }

    public int getUnder() {
        return under;
    }

    public int getTouching() {
        return touching;
    }

    public int getNot_touching() {
        return not_touching;
    }
}
