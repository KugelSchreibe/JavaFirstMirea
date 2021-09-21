package ru.mirea.task2.opt1;
import java.util.Scanner;

public class ShapeTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        double P, S;

        System.out.print("Введите имя вашей фигуры: ");
        name = in.nextLine();
        System.out.print("\nВведите периметр вашей фигуры: ");
        P = in.nextDouble();
        while (P <= 0) {
            System.out.print("\nВведите периметр вашей фигуры (>0): ");
            P = in.nextDouble();
        }
        System.out.print("\nВведите площадь вашей фигуры: ");
        S = in.nextDouble();
        while (S <= 0) {
            System.out.print("\nВведите площадь вашей фигуры (>0): ");
            S = in.nextDouble();
        }

        Shape MyShape = new Shape(S, P, name);

        System.out.print(MyShape.toString());
    }
}
