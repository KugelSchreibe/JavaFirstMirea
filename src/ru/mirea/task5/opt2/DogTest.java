package ru.mirea.task5.opt2;

import java.util.Scanner;

public class DogTest {
    static public void main(String[] argv) {
        String name;
        int age;
        Scanner in = new Scanner(System.in);

        System.out.print("Введите имя овчарки: ");
        name = in.nextLine();

        System.out.print("Введите возраст овчарки: ");
        age = in.nextInt();

        while (age < 1) {
            System.out.print("Введите возраст овчарки (>0): ");
            age = in.nextInt();
        }

        Shepherd FirstDog = new Shepherd(name, age);
        System.out.println("\n" + FirstDog.info() + "\nЛай звучит примерно как: " + FirstDog.voice());
        in.nextLine();

        System.out.print("\nВведите имя чихуауа: ");
        name = in.nextLine();

        System.out.print("Введите возраст чихуауа: ");
        age = in.nextInt();

        while (age < 1) {
            System.out.print("Введите возраст чихуауа (>0): ");
            age = in.nextInt();
        }

        Chihuaua SecondDog = new Chihuaua(name, age);
        System.out.println("\n" + FirstDog.info() + "\nЛай звучит примерно как: " + SecondDog.voice());
    }
}
