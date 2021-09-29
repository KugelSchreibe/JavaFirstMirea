package ru.mirea.task7.opt6;
import ru.mirea.task7.opt5.*;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft, bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    @Override
    public void moveUP() {
        topLeft.moveUP();
        bottomRight.moveUP();
    }

    @Override
    public void moveDOWN() {
        topLeft.moveDOWN();
        bottomRight.moveDOWN();
    }

    @Override
    public void moveLEFT() {
        topLeft.moveLEFT();
        bottomRight.moveLEFT();
    }

    @Override
    public void moveRIGHT() {
        topLeft.moveRIGHT();
        bottomRight.moveRIGHT();

    }
}
