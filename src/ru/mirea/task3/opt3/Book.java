package ru.mirea.task3.opt3;

public class Book {
    private Book() {};

    private String name, author, date;
    private double price;
    private int pageQuantity;


    public Book(String name, String author, String date, double price, int pageQuantity) {
        this.name = name;
        this.pageQuantity = pageQuantity;
        this.price = price;
        this.author = author;
        this.date = date;
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

    public String getAuthor() {
        return author;
    }

    public String getDate() {
        return date;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String toString() {
        return  "Object <Book>: {\ntitle: " + name + "\nauthor: " + author + "\ndate: " + date + "\npages: " + pageQuantity + "\nprice: " + price + " };\n";
    }
}
