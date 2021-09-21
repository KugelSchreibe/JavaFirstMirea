package ru.mirea.task3.opt1;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] argv) {
        Scanner in = new Scanner(System.in);
        double r;

        System.out.print("Введите радмус окружности: ");
        r = in.nextDouble();

        Circle MyCircle = new Circle(r);
        System.out.println("Ваша окружность:\nr = " + MyCircle.getR() + "\nl = " + MyCircle.getL() + "\nS = " + MyCircle.getS());
    }
}
