package ru.mirea.task2.opt2;

import java.util.Scanner;

public class BallTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        double mass, price;

        System.out.print("Введите тип вашего мяча: ");
        name = in.nextLine();
        System.out.print("\nВведите массу вашего мяча: ");
        mass = in.nextDouble();
        while (mass <= 0) {
            System.out.print("\nВведите массу вашего мяча: (>0): ");
            mass = in.nextDouble();
        }
        System.out.print("\nВведите цену вашего мяча: ");
        price = in.nextDouble();
        while (price <= 0) {
            System.out.print("\nВведите цену вашего мяча (>0): ");
            price = in.nextDouble();
        }

        Ball MyBall = new Ball(name, mass, price);

        System.out.print(MyBall.toString());
    }
}
