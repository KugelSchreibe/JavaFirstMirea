package ru.mirea.task6.opt2;

public class Cup implements Priceable{
    private String material;
    private double price;

    public Cup(String material, double price) {
        this.material = material;
        this. price = price;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public double getPrice() {
        return price;
    }

    protected void info() {
        System.out.println("Материал - " + material);
        System.out.println("Цена - " + price);
    }

    private Cup() {};
}