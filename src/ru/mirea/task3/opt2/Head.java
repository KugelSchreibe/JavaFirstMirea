package ru.mirea.task3.opt2;

public class Head {
    private Head() {};
    private String colorHair;
    private String shapeHead;

    public Head(String colorHair, String shapeHead) {
        this.colorHair = colorHair;
        this.shapeHead = shapeHead;
    }

    public String getColorHair() {
        return colorHair;
    }

    public String getShapeHead() {
        return shapeHead;
    }

    public void setColorHair(String colorHair) {
        this.colorHair = colorHair;
    }

    public void setShapeHead(String shapeHead) {
        this.shapeHead = shapeHead;
    }

    public String toString() {
        return "color hair: " + colorHair + "\n" + "head shape: " + shapeHead;
    }
}
