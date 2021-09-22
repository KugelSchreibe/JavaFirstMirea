package ru.mirea.task5.opt3;

public class Cupboard extends Furniture {
    private int shelp;
    private String color;

    public Cupboard(double price, String material, double dimensionsLength, double dimensionsWidth,
                    double dimensionsHeight, int shelp,String color) {
        super(price, material, dimensionsLength, dimensionsWidth, dimensionsHeight);
        this.color = color;
        this.shelp = shelp;
    }

    public int getShelp() {
        return shelp;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setShelp(int shelp) {
        this.shelp = shelp;
    }
}
