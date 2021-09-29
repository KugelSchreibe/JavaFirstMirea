package ru.mirea.task5.opt3;

import java.util.Scanner;

public class FurnitureShopTest {
    public static void main(String[] argv) {
        Scanner in = new Scanner(System.in);
        FurnitureShop FShop = new FurnitureShop();
        String tmp;
        int count;

        System.out.print("Введите колиство шкафов в магазине: ");
        count = in.nextInt();

        while (count-- > 0) {
            FShop.pushBackCupboard();
        }

        System.out.print("Введите колиство столов в магазине: ");
        count = in.nextInt();

        while (count-- > 0) {
            FShop.pushBackTable();
        }

        System.out.println("\n" + FShop.info());
    }
}
