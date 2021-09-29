package ru.mirea.task7.opt5;

public class MovablePoint implements Movable {
    protected int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.xSpeed = xSpeed;
        this.y = y;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public void moveUP() {
        y++;
    }

    @Override
    public void moveDOWN() {
        y--;
    }

    @Override
    public void moveRIGHT() {
        x++;
    }

    @Override
    public void moveLEFT() {
        x--;
    }
}
