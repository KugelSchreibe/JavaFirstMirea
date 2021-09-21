package ru.mirea.task1.opt6;
import java.lang.*;
import java.util.Arrays;
import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        System.out.println("Первый метод через rand()");

        for (int i = 0; i < 10; i++) {
            arr[i] = (int)(Math.random() * 10);
        }

        Arrays.sort(arr);

        System.out.print("Отсортрованный массив: ");
        for (int a: arr) {
            System.out.print(a + " ");
        }


        System.out.println("Второй метод через class Rand");

        Random RandObj = new Random();

        for (int i = 0; i < 10; i++) {
            arr[i] = RandObj.nextInt();
        }

        System.out.print("Отсортрованный массив: ");
        for (int a: arr) {
            System.out.print(a + " ");
        }
    }
}
