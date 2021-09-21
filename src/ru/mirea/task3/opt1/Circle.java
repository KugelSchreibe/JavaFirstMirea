package ru.mirea.task3.opt1;

public class Circle {
    private Circle() {};

    private double r, l, s;

    public Circle(double r) {
        this.r = r;
        l = 2 * 3.14 * r;
        s = 3.14 * java.lang.Math.pow(r, 2);
    }

    public double getS() {
        return s;
    }

    public double getL() {
        return l;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
        l = 2 * 3.14 * r;
        s = 3.14 * java.lang.Math.pow(r, 2);
    }
}
