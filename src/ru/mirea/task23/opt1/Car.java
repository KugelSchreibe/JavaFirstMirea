package ru.mirea.task23.opt1;

import java.util.Objects;

public class Car {
    private int price;
    private int evaluationOnTheSite; // от 1 до 10
    private String model;
    private boolean used; // true -> * 29 else * 31
    private Car() {};

    public Car(String model, int price, int evaluationOnTheSite, boolean used) {
        this.model = model;
        this.evaluationOnTheSite = evaluationOnTheSite;
        this.price = price;
        this.used = used;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Car car = (Car) o;

        if ( price == car.price && evaluationOnTheSite == car.evaluationOnTheSite && used == car.used && ((Car) o).model.equals(this.model)) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int code = 0;

        if (this == null) {
            code = 0;
        } else {
            code += model.hashCode();
        }

        code = code * 31 + price;
        code = code * 31 + evaluationOnTheSite;

        if (used) {
            code *= 29;
        } else {
            code *= 31;
        }

        return code;
    }

    public void setEvaluationOnTheSite(int evaluationOnTheSite) {
        this.evaluationOnTheSite = evaluationOnTheSite;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public int getEvaluationOnTheSite() {
        return evaluationOnTheSite;
    }

    public boolean isUsed() {
        return used;
    }

    public int getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }
}
