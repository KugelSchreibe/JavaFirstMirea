package ru.mirea.task5.opt1;

import java.util.Locale;
import java.util.Scanner;

public class TestDish {
    public static void main(String[] args) {
        String material;
        int volume;
        int mass;
        int price;
        String tmp;
        boolean bool;

        Scanner in = new Scanner(System.in);

        System.out.print("Введите материал чашки: ");
        material = in.next();

        System.out.print("Введите объем чашки: ");
        volume = in.nextInt();

        while (volume <= 0) {
            System.out.print("Объем не может быть <0, введите положительное значени: ");
            volume = in.nextInt();
        }

        System.out.print("Введите цену чашки: ");
        price = in.nextInt();

        while (price <= 0) {
            System.out.print("Цена не может быть <0, введите положительное значени: ");
            price = in.nextInt();
        }

        System.out.print("Введите массу чашки: ");
        mass = in.nextInt();

        while (mass <= 0) {
            System.out.print("Масса не может быть <0, введите положительное значени: ");
            mass = in.nextInt();
        }

        System.out.print("Есть ли ручка у чашки (Y/N): ");
        tmp = in.nextLine();
        tmp = tmp.toLowerCase(Locale.ROOT);

        while (true) {
            if (tmp.length() == 1 && (tmp.equals("y") || tmp.equals("n"))) {
                break;
            }
            System.out.print("Вы ввели слишком много символов, введите 'Y' если есть ручка, 'N' - иначе: ");
            tmp = in.nextLine();
            tmp = tmp.toLowerCase(Locale.ROOT);
        }

        if (tmp.equals("y")) {
            bool = true;
        } else {
            bool = false;
        }

        Cup MyCup = new Cup(material, mass, price, volume, bool);

        System.out.println("\nИнформация о вашей чашке: ");
        MyCup.printInfo();


        System.out.print("\nВведите материал тарелки: ");
        material = in.next();

        System.out.print("Введите диаметр тарелки: ");
        volume = in.nextInt();

        while (volume <= 0) {
            System.out.print("Диаметр не может быть <0, введите положительное значени: ");
            volume = in.nextInt();
        }

        System.out.print("Введите цену тарелки: ");
        price = in.nextInt();

        while (price <= 0) {
            System.out.print("Цена не может быть <0, введите положительное значени: ");
            price = in.nextInt();
        }

        System.out.print("Введите массу тарелки: ");
        mass = in.nextInt();

        while (mass <= 0) {
            System.out.print("Масса не может быть <0, введите положительное значени: ");
            mass = in.nextInt();
        }

        System.out.print("Глубокая ли тарелка (Y/N): ");
        tmp = in.nextLine();
        tmp = tmp.toLowerCase(Locale.ROOT);

        while (true) {
            if (tmp.length() == 1 && (tmp.equals("y") || tmp.equals("n"))) {
                break;
            }
            System.out.print("Вы ввели слишком много символов, введите 'Y' если глубокая, 'N' - иначе: ");
            tmp = in.nextLine();
            tmp = tmp.toLowerCase(Locale.ROOT);
        }

        if (tmp.equals("y")) {
            bool = true;
        } else {
            bool = false;
        }

        Plate MyPlate = new Plate(material, mass, price, bool, volume);

        System.out.println("Информация о вашей тарелке: ");
        MyPlate.printInfo();
    }
}
