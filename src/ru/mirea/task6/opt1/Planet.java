package ru.mirea.task6.opt1;

public class Planet implements Nameable {
    private String name;
    boolean hasWater;

    public Planet(String name, boolean hasWater) {
        this.name = name;
        this.hasWater = hasWater;
    }

    @Override
    public String getName() {
        return name;
    }

    public boolean water() {
        return hasWater;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWater(boolean water) {
        this.hasWater = water;
    }
}
