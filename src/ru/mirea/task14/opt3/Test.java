package ru.mirea.task14.opt3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Игра пьяница\nВведите номера пяти карт сверху вниз у первого игрока:");

        int[] arr1 = new int[5];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Введите [" + (i+1) + "] карту: ");
            arr1[i] = in.nextInt();
        }

        System.out.println("Введите номера пяти карт сверху вниз у второго игрока:");

        int[] arr2 = new int[5];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Введите [" + (i+1) + "] карту: ");
            arr2[i] = in.nextInt();
        }

        GameByDequeue game = new GameByDequeue(arr1, arr2);

        System.out.println(game.result());

    }
}
