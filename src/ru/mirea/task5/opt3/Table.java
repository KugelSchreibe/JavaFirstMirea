package ru.mirea.task5.opt3;

public class Table extends Furniture{
    private boolean folding;

    public Table() {
        super(1000, "wood", 1, 1, 1);
        this.folding = false;
    }

    public Table(Table T) {
        super(T.getPrice(), T.getMaterial(), T.getDimensionsLength(), T.getDimensionsWidth(),
                T.getDimensionsHeight());
        this.folding = T.isFolding();
    }

    public Table(double price, String material, double dimensionsLength, double dimensionsWidth, double dimensionsHeight,
                boolean folding) {
        super(price, material, dimensionsLength, dimensionsWidth, dimensionsHeight);
        this.folding = folding;
    }

    public boolean isFolding() {
        return folding;
    }

    public void setFolding(boolean folding) {
        this.folding = folding;
    }
}
