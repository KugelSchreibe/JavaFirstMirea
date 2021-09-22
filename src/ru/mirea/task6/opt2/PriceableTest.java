package ru.mirea.task6.opt2;

import java.util.Scanner;

public class PriceableTest {
    public static void main(String[] argv) {
        double price, mass;
        String material1, material2;
        Scanner in = new Scanner(System.in);

        System.out.println("Укажте материал кровати: ");
        material1 = in.nextLine();

        System.out.println("Укажте цену кровати: ");
        price = in.nextDouble();

        Bad MyBad = new Bad(price, material1);
        System.out.println("Цена вашей кровати: " + MyBad.getPrice());

        System.out.println("\nУкажте материал чашки: ");
        in.nextLine();
        material2 = in.nextLine();

        System.out.println("Укажте цену чашки: ");
        price = in.nextDouble();

        Cup MyCup = new Cup(material2, price);
        System.out.println("Цена вашей чашки: " + MyCup.getPrice());
    }
}
