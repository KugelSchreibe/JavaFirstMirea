package ru.mirea.task4.opt2;
import java.util.Scanner;

public class TestBall {
    public static void main(String[] argv) {
        double x, y;
        Scanner in = new Scanner(System.in);

        System.out.print("Введите x координату мяча: ");
        x = in.nextDouble();

        System.out.print("Введите y координату мяча: ");
        y = in.nextDouble();

        Ball MyBall = new Ball(x, y);
        System.out.println("\n" + MyBall.toString());
    }
}
