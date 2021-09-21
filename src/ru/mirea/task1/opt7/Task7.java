package ru.mirea.task1.opt7;
import java.util.Scanner;

public class Task7 {
    static private long func(int n) {
        long k = 1;
        while (n > 1) {
            k *= n--;
        }
        return k;
    }

    static public void main(String[] args) {
        System.out.println("Введите число для вычисления его факториала:");

        Scanner in = new Scanner(System.in);
        int n;

        n = in.nextInt();

        System.out.println("Результат: " + func(n));
    }
}
