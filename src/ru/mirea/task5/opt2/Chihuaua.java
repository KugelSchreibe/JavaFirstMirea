package ru.mirea.task5.opt2;

public class Chihuaua extends Dog {
    public Chihuaua(String name, int age) {
        super("Chihuaua", name, 3, age);
    }

    @Override
    public String voice() {
        return "taf-taf";
    }
}
