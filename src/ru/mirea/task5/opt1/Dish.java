package ru.mirea.task5.opt1;

public abstract class Dish {
    private String material;
    private int mass;
    private int price;

    public Dish(String material, int mass, int price) {
        this.material = material;
        this.mass = mass;
        this. price = price;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public int getMass() {
        return mass;
    }

    public int getPrice() {
        return price;
    }

    protected void info() {
        System.out.println("Материал - " + material);
        System.out.println("Масса - " + mass);
        System.out.println("Цена - " + price);
    }

    private Dish() {};
}
