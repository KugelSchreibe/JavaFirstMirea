package ru.mirea.task2.opt5;
import java.util.ArrayList;
import java.util.Scanner;
import ru.mirea.task2.opt4.Dog;

public class TestDog {
    public static void main(String[] argv) {
        Scanner in = new Scanner(System.in);
        String name;
        int age, SIZE;

        System.out.print("Сколько собак будет в массиве: ");
        SIZE = in.nextInt();

        in.nextLine();

        while (SIZE < 1) {
            System.out.print("Сколько собак будет в массиве (>0) : ");
            SIZE = in.nextInt();
            in.nextLine();
        }

        ArrayList<Dog> AD = new ArrayList<Dog>();

        while (SIZE-- > 0) {
            System.out.print("Введите имя собаки: ");
            name = in.nextLine();

            System.out.print("Введите возраст собаки: ");
            age = in.nextInt();
            in.nextLine();

            while (age < 1) {
                System.out.print("Введите возраст собаки (>0) : ");
                age = in.nextInt();
                in.nextLine();
            }

            AD.add(new Dog(name, age));
        }

        System.out.println("\nВсе собаки: \n");
        for (int i = 0; i < AD.size(); i++) {
            System.out.println(AD.get(i).toString());
        }
    }
}
