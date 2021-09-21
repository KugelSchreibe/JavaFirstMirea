package ru.mirea.task2.opt3;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        int pageQuantity;
        double price;

        System.out.print("Введите название книги: ");
        name = in.nextLine();
        System.out.print("\nВведите количество страниц в книге: ");
        pageQuantity = in.nextInt();
        while (pageQuantity <= 0) {
            System.out.print("\nВведите количество страниц в книге: (>0): ");
            pageQuantity = in.nextInt();
        }
        System.out.print("\nВведите цену книги: ");
        price = in.nextDouble();
        while (price <= 0) {
            System.out.print("\nВведите цену книги (>0): ");
            price = in.nextDouble();
        }

        Book MyBook = new Book(name, price, pageQuantity);

        System.out.print(MyBook.toString());
    }
}
