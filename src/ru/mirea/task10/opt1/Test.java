package ru.mirea.task10.opt1;

import java.util.Scanner;

public class Test {
    public static void func2() {
        Scanner in = new Scanner(System.in);
        int n;

        System.out.println("Введите натуральное число (от 1): ");
        n = in.nextInt();

        while (n < 1) {
            System.out.println("Некорректный ввод. Введите натуральное число (от 1): ");
            n = in.nextInt();
        }

        System.out.print("\n");
        for (int i = 1; i < n + 1; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
    };

    public static void func3() {
        Scanner in = new Scanner(System.in);
        int A, B;

        System.out.println("Введите число A: ");
        A = in.nextInt();
        System.out.println("Введите число B: ");
        B = in.nextInt();

        System.out.print("\n");
        if (A < B) {
            for (int i = A; i < B+1; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = B; i > A - 1; i--) {
                System.out.print(i + " ");
            }
        }
        System.out.print("\n");
    };

    public static void func4() {
        Scanner in = new Scanner(System.in);
        int k, d;

        System.out.println("Введите натуральное число k: ");
        k = in.nextInt();
        System.out.println("Введите число d: ");
        d = in.nextInt();

        while (k < 1) {
            System.out.println("Некорректный ввод. Введите натуральное число k (k > 0): ");
            k = in.nextInt();
        }

        while (d < 1) {
            System.out.println("Некорректный ввод. Введите натуральное число d (d > 0): ");
            d = in.nextInt();
        }

        int count = 0;
        int temp;
        int num;
        for (int i = (int)java.lang.Math.pow(10, k - 1); i < java.lang.Math.pow(10, k); i++) {
            temp = 0;
            num = i;
            while (num != 0) {
                temp += num % 10;
                num /= 10;
            }

            if (temp == d) {
                count++;
            }
        }

        System.out.println("Существует " + count + " " + k + "-значных чисел, сумма чисел которых равна " + d);
    };

    public static int rec(int N) {
        if (N > 9) {
            return N % 10 + rec(N/10);
        }
        return N;
    }

    public static void func5() {
        Scanner in = new Scanner(System.in);
        int N;

        System.out.println("Введите число N: ");
        N = in.nextInt();
        while (N < 1) {
            System.out.println("Некорректный ввод. Введите натуральное число N (N > 0): ");
            N = in.nextInt();
        }

        System.out.println("Сумма цифр числа " + N + " равна " + rec(N));
    };


    public static void main(String[] argv) {
        Scanner in = new Scanner(System.in);
        int n;

        while (true) {
            System.out.println("\nВыберите номер задания (2 - 5) или 0 чтобы выйти: ");
            n = in.nextInt();

            if (n == 0) {
                return;
            }

            while (n < 2 && n > 6) {
                System.out.println("Некорректный ввод. Выберите номер задания (2 - 5): ");
                n = in.nextInt();
            }

            if (n == 2) {
                func2();
            } else if (n == 3) {
                func3();
            } else if (n == 4) {
                func4();
            } else if (n == 5) {
                func5();
            }
        }
    }
}
