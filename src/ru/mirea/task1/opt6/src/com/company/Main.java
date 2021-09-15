package com.company;
import java.lang.*;
import java.util.Scanner;

public class Main {

    public static void sumArr() {
        System.out.println("Заполните массив чисел.");

        int[] arr = new int [10];
        int temp, sumFor = 0, sumWhile = 0, sumDoWhile = 0;
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введите элемент с индесом " + "[" + i + "]: ");
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            sumFor += arr[i];
        }

        System.out.println("\nСумма всех элементов через for: " + sumFor);

        int i = 0;

        while (i < 10) {
            sumWhile += arr[i++];
        }

        System.out.println("Сумма всех элементов через while: " + sumWhile);

        i = 0;

        do {
            sumDoWhile += arr[i];
        } while (++i < 10);

        System.out.println("Сумма всех элементов через do while: " + sumFor + "\n");

    }

    public static int factorial(int n) {
        int s = 1;

        while (n > 1) {
            s *= n--;
        }

        return s;
    }

	public static void main(String[] args) {
        sumArr();

        System.out.print("Введите число для подсчета факториала: ");
        Scanner in = new Scanner(System.in);

        int n = 0;
        n = in.nextInt();

        while (n < 1) {
            System.out.print("\nЧисло для факторила должно быть > 1, попробуйте ввести другое: ");
            n = in.nextInt();
        }

        System.out.println("\nФакториал числа " + n + " равен: " + factorial(n));
    }
}
