package ru.mirea.task6.opt1;

public class Car implements Nameable {
    private int MAX_SPEED;
    private String name;

    public Car(String name, int MAX_SPEED) {
        this.MAX_SPEED = MAX_SPEED;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMAX_SPEED(int MAX_SPEED) {
        this.MAX_SPEED = MAX_SPEED;
    }

    public int getMAX_SPEED() {
        return MAX_SPEED;
    }
}
