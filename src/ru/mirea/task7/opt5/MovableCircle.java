package ru.mirea.task7.opt5;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    @Override
    public void moveUP() {
        center.moveUP();
    }

    @Override
    public void moveDOWN() {
        center.moveDOWN();
    }

    @Override
    public void moveRIGHT() {
        center.moveRIGHT();
    }

    @Override
    public void moveLEFT() {
        center.moveLEFT();
    }
}
