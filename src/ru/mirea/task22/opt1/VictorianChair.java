package ru.mirea.task22.opt1;

public class VictorianChair implements Chair {
    private String name;

    public VictorianChair(String str) {
        this.name = str;
    }

    @Override
    public void Sit() {
        System.out.println("Вы сидите на стуле типа " + this.name);
    }
}
