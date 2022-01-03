package ru.mirea.task22.opt1;

public enum typeChair {
    VictorianChair("Викторианский стул"),
    MultiFuncChair("Мультифункциональный стул"),
    MagicChair("Магический стул");

    private String name;

    typeChair(String str) {
        this.name = str;
    }
}
