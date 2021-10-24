package ru.mirea.task13.opt1;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();

        System.out.println("Ввод 10 элементов в ArrayList");

        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("\nArrayList[" + i + "] = ");
            myArrayList.add(in.nextInt());
        }
        System.out.print('\n');

        System.out.print("\nВведите индекс для вывода значения: ");
        System.out.println("\n value = " + myArrayList.get(in.nextInt()));

    }
}
