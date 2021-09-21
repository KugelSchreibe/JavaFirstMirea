package ru.mirea.task3.opt2;

import java.util.Scanner;

public class HumanTest {
    public static void main(String[] argv) {
        Scanner in = new Scanner(System.in);
        String colorHair, shapeHead;
        int strengthLL, strengthLR, strengthHL, strengthHR, sizeHL, sizeHR, sizeLL, sizeLR;

        System.out.println("Заполните данные для описания человека.");

        System.out.print("Цвет волос на голове: ");
        colorHair = in.nextLine();
        System.out.print("\nФорма головы: ");
        shapeHead = in.nextLine();

        System.out.print("\nРазвитость мускулатуры на левой руке (от 1 до 10): ");
        strengthHL = in.nextInt();

        while (strengthHL < 1 || strengthHL > 10) {
            System.out.print("\nПовторите ввод с учетом ограничения. Развитость мускулатуры на левой руке (от 1 до 10): ");
            strengthHL = in.nextInt();
        }

        System.out.print("\nОбхват бицепса левой руки (от 10 до 40): ");
        sizeHL = in.nextInt();

        while (sizeHL < 10 || sizeHL > 40) {
            System.out.print("\nПовторите ввод с учетом ограничения. Обхват бицепса левой руки (от 10 до 40):: ");
            sizeHL = in.nextInt();
        }

        System.out.print("\nРазвитость мускулатуры на правой руке (от 1 до 10): ");
        strengthHR = in.nextInt();

        while (strengthHR < 1 || strengthHR > 10) {
            System.out.print("\nПовторите ввод с учетом ограничения. Развитость мускулатуры на левой руке (от 1 до 10): ");
            strengthHR = in.nextInt();
        }

        System.out.print("\nОбхват бицепса правой руки (от 10 до 40): ");
        sizeHR = in.nextInt();

        while (sizeHR < 10 || sizeHR > 40) {
            System.out.print("\nПовторите ввод с учетом ограничения. Обхват бицепса правой руки (от 10 до 40):: ");
            sizeHR = in.nextInt();
        }

        // --

        System.out.print("\nРазвитость мускулатуры на левой ноге (от 1 до 10): ");
        strengthLL = in.nextInt();

        while (strengthLL < 1 || strengthLL > 10) {
            System.out.print("\nПовторите ввод с учетом ограничения. Развитость мускулатуры на левой ноге (от 1 до 10): ");
            strengthLL = in.nextInt();
        }

        System.out.print("\nОбхват квадрицепса левой ноги (от 15 до 65): ");
        sizeLL = in.nextInt();

        while (sizeLL < 15 || sizeLL > 65) {
            System.out.print("\nПовторите ввод с учетом ограничения. Обхват квадрицепса левой ноги (от 10 до 40):: ");
            sizeLL = in.nextInt();
        }

        System.out.print("\nРазвитость мускулатуры на правой ноге (от 1 до 10): ");
        strengthLR = in.nextInt();

        while (strengthLR < 1 || strengthLR > 10) {
            System.out.print("\nПовторите ввод с учетом ограничения. Развитость мускулатуры на правой ноге (от 1 до 10): ");
            strengthLR = in.nextInt();
        }

        System.out.print("\nОбхват  бхват квадрицепса правой ноги (от 15 до 65): ");
        sizeLR = in.nextInt();

        while (sizeLR < 15 || sizeLR > 65) {
            System.out.print("\nПовторите ввод с учетом ограничения. Обхват  бхват квадрицепса правой ноги (от 15 до 65): ");
            sizeLR = in.nextInt();
        }

        Human Man = new Human(colorHair, shapeHead, sizeHL, strengthHL, sizeHR, strengthHR, sizeLL, strengthLL, sizeLR, strengthLR);
        System.out.println(Man.toString());
    }
}
