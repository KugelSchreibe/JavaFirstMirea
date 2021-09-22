package ru.mirea.task5.opt2;

public class Shepherd extends Dog{
    public Shepherd(String name, int age) {
        super("Shepherd", name, 80, age);
    }

    @Override
    public String voice() {
        return "Ruff-ruff";
    }
}
