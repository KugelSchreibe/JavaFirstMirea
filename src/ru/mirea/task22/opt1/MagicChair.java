package ru.mirea.task22.opt1;

public class MagicChair implements Chair{
    private String name;

    public MagicChair(String str) {
        this.name = str;
    }

    @Override
    public void Sit() {
        System.out.println("Вы сидите на стуле типа " + this.name);
    }
}
