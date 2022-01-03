package ru.mirea.task23.opt1;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Создадаим 5 объектов Car со следующими параметрами (модель, цена, оценка на сайте, б/у):\n" +
                "1 - BMW, 1500$, 6, used\n" +
                "2 - Lada, 800$, 3, used\n" +
                "3 - BMW, 1500$, 6, used\n" +
                "4 - Lada, 850$, 4, new\n" +
                "5 - BMW, 1250$, 6, new\n\n");

        ArrayList<Car> Cars = new ArrayList<>();

        Cars.add(new Car("BMW", 1500, 6, true));
        Cars.add(new Car("Lada", 800, 3, true));
        Cars.add(new Car("BMW", 1500, 6, true));
        Cars.add(new Car("Lada", 850, 4, false));
        Cars.add(new Car("BMW", 1250, 6, false));

        Scanner in = new Scanner(System.in);
        int num1, num2;

        while (true) {
            System.out.println("Введите номера машины, чтобы сравнить их, или 0, чтобы выйти");
            System.out.println("Введите номер первой машины:");
            num1 = in.nextInt();

            if (num1 == 0) {
                break;
            }

            System.out.println("Введите номер второй машины:");
            num2 = in.nextInt();

            if (Cars.get(num1 - 1).hashCode() == Cars.get(num2 - 1).hashCode()) {
                System.out.println("Машины одинаковые");
            } else {
                System.out.println("Машины разные");
            }
        }
    }
}
