package ru.mirea.task5.opt3;

public abstract class Furniture {
    private double price;
    private String material;
    private double dimensionsLength, dimensionsWidth, dimensionsHeight;

    public Furniture(double price, String material, double dimensionsLength, double dimensionsWidth, double dimensionsHeight) {
        this.price = price;
        this.material = material;
        this.dimensionsHeight = dimensionsHeight;
        this.dimensionsLength = dimensionsLength;
        this.dimensionsWidth = dimensionsWidth;
    };

    public double getPrice() {
        return price;
    }

    public double getDimensionsHeight() {
        return dimensionsHeight;
    }

    public double getDimensionsLength() {
        return dimensionsLength;
    }

    public double getDimensionsWidth() {
        return dimensionsWidth;
    }

    public String getMaterial() {
        return material;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDimensionsHeight(double dimensionsHeight) {
        this.dimensionsHeight = dimensionsHeight;
    }

    public void setDimensionsLength(double dimensionsLength) {
        this.dimensionsLength = dimensionsLength;
    }

    public void setDimensionsWidth(double dimensionsWidth) {
        this.dimensionsWidth = dimensionsWidth;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
