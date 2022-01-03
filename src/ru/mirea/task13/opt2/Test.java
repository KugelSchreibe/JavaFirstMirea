package ru.mirea.task13.opt2;

import java.util.LinkedList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> myArrayList = new LinkedList<Integer>();

        System.out.println("Ввод 10 элементов в Likkenlis");

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
