package ru.mirea.task7.opt2and3;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {
        super();
        this.width = 1;
        this.length = 1;
    }

    public Rectangle(double width, double length) {
        super();
        this.length = length;
        this.width = width;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "color='" + super.getColor() + '\'' +
                ", filled=" + super.isFilled() +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}
