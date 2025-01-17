package ru.mirea.task25.opt1;

public class ShapeDecorator implements Shape{
    private Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
