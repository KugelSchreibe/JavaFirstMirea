package ru.mirea.task2.opt4;
import java.util.Scanner;

public class DogTest {
    public static void main(String[] argv) {
        Scanner in = new Scanner(System.in);
        String name;
        int age;

        System.out.print("Введите имя собаки: ");
        name = in.nextLine();

        System.out.print("Введите возраст собаки: ");
        age = in.nextInt();

        Dog MyDog = new Dog(name, age);
        System.out.print(MyDog.toString() + "Human age for the Dog: " + MyDog.getHumanAge());
    }
}
