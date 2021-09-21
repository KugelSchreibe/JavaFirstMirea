package ru.mirea.task2.opt3;

public class Book {
    private Book() {};

    private String name;
    private double price;
    private int pageQuantity;

    public Book(String name, double price, int pageQuantity) {
        this.name = name;
        this.pageQuantity = pageQuantity;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getPageQuantity() {
        return pageQuantity;
    }

    public void setPageQuantity(int pageQuantity) {
        this.pageQuantity = pageQuantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return  "Object <Book>: {\ntype: " + name + "\npages: " + pageQuantity + "\nprice: " + price + " };\n";
    }
}
