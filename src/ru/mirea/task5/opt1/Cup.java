package ru.mirea.task5.opt1;

public class Cup extends Dish {
    private int volume;
    private boolean hasHandle;

    public Cup(String material, int mass, int price, int volume, boolean hasHandle) {
        super(material, mass, price);
        this.volume = volume;
        this.hasHandle = hasHandle;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setHasHandle(boolean hasHandle) {
        this.hasHandle = hasHandle;
    }

    public void printInfo() {
        info();
        System.out.println("Объем - " + volume);
        System.out.println("Наличие руки - " + hasHandle);
    }
}
