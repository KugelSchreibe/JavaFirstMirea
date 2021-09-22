package ru.mirea.task5.opt1;

public class Plate extends Dish {
    private boolean isSoup;
    private int diameter;

    Plate(String material, int mass, int price, boolean isSoup, int diameter) {
        super(material, mass, price);
        this.isSoup = isSoup;
        this.diameter = diameter;
    }

    public void setIsSoup(boolean soup) {
        isSoup = soup;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public boolean isSoup() {
        return isSoup;
    }

    public void printInfo() {
        info();
        System.out.println("Диаметр дна - " + diameter);
        System.out.println("Глубокая ли - " + isSoup);
    }
}
