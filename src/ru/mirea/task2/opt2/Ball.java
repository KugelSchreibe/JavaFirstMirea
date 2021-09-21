package ru.mirea.task2.opt2;

public class Ball {
    private Ball() {};

    private double mass, price;
    private String type;

    public Ball(String type, double mass, double price) {
        this.mass = mass;
        this.type = type;
        this.price = price;
    }

    public double getMass() {
        return mass;
    }

    public String getType() {
        return type;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return  "Object <Ball>: {\ntype: " + type + "\nmass: " + mass + "\nprice: " + price + " };\n";
    }
}
