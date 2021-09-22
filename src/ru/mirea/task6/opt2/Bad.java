package ru.mirea.task6.opt2;

public class Bad implements Priceable {
    private double price;
    private String material;

    public Bad(double price, String material) {
        this.price = price;
        this.material = material;
    };

    @Override
    public double getPrice() {
        return price;
    }

    public String getMaterial() {
        return material;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
