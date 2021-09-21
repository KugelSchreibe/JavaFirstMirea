package ru.mirea.task3.opt3;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name, author, date;
        int pageQuantity;
        double price;
        boolean trueDate = false;

        System.out.print("Введите название книги: ");
        name = in.nextLine();
        System.out.print("Введите автора книги: ");
        author = in.nextLine();
        System.out.print("Введите дату написания книги (27.02.1985): ");
        date = in.nextLine();
        System.out.print("Введите количество страниц в книге: ");
        pageQuantity = in.nextInt();
        while (pageQuantity <= 0) {
            System.out.print("\nВведите количество страниц в книге: (>0): ");
            pageQuantity = in.nextInt();
        }
        System.out.print("Введите цену книги: ");
        price = in.nextDouble();
        while (price <= 0) {
            System.out.print("Введите цену книги (>0): ");
            price = in.nextDouble();
        }

        Book MyBook = new Book(name, author, date, price, pageQuantity);

        System.out.print(MyBook.toString());
    }
}
