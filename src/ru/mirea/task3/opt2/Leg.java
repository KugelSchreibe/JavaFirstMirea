package ru.mirea.task3.opt2;

public class Leg {
    private Leg() {};

    private int strength;
    private int size;


    public Leg(int strength, int size) {
        this.size = size;
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public int getSize() {
        return size;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String toString() {
        return "strength: " + strength + "\nsize: " + size;
    }
}
