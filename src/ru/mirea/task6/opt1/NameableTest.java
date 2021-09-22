package ru.mirea.task6.opt1;

import java.util.Locale;
import java.util.Scanner;

public class NameableTest {
    public static void main(String[] argv) {
        Scanner in = new Scanner(System.in);
        String name, tmp;
        boolean water;
        int speed;

        System.out.print("Как назовете вашу планету: ");
        name = in.nextLine();

        System.out.print("Есть ли на ней вода (Y/N): ");
        tmp = in.nextLine();
        tmp = tmp.toLowerCase(Locale.ROOT);

        while (true) {
            if (tmp.length() == 1 && (tmp.equals("y") || tmp.equals("n"))) {
                break;
            }
            System.out.print("Некорректный ввод. Есть ли на ней вода (Y/N): ");
            tmp = in.nextLine();
            tmp = tmp.toLowerCase(Locale.ROOT);
        }

        if (tmp.equals("y")) {
            water = true;
        } else {
            water = false;
        }

        Planet MyPlanet = new Planet(name, water);

        System.out.print("\nИнформация о вашей планете:\nname: " +  MyPlanet.getName() + "\nwater: " + MyPlanet.hasWater);





        System.out.print("\n\nКак назовете вашу машину: ");
        name = in.nextLine();

        System.out.print("Какая максимальная скорость: ");
        speed = in.nextInt();

        while (speed <= 0) {
            System.out.print("Какая максимальная скорость (>0): ");
            speed = in.nextInt();
        }

        Car MyCar = new Car(name, speed);

        System.out.print("\nИнформация о вашей Машине:\nname: " +  MyCar.getName() + "\nmax speed: " + MyCar.getMAX_SPEED());

    }
}
