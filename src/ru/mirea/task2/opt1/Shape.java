package ru.mirea.task2.opt1;

public class Shape {
    private Shape() {};

    double S;
    double P;
    String name;

    Shape(double S, double P, String name) {
        this.S = S;
        this.P = P;
        this.name = name;
    }

    public double getP() {
        return P;
    }

    public double getS() {
        return S;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setP(double p) {
        P = p;
    }

    public void setS(double s) {
        S = s;
    }

    public String toString() {
        return "Object <Shape>: {\nname: " + name + "\nP: " + P + "\nS: " + S + " };\n";
    }
}
