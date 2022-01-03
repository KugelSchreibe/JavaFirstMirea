package ru.mirea.task25.opt1;

public class RedShapeDecorator extends ShapeDecorator{
    private Shape shape;
    private String red;

    public RedShapeDecorator(Shape shape) {
        super(shape);
        this.shape = shape;
    }

    public void setRed(String red) {
        this.red = red;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("+RedShapeDecorator " + red + " цвета");
    }
}
