package ru.mirea.task26.opt1;

import java.util.ArrayList;
import java.util.Scanner;

public class TheInternetShop {
    private ArrayList<String> Goods;

    public TheInternetShop() {
        Goods = new ArrayList<>();
        Goods.add("1. Шкаф\t 5000р");
        Goods.add("2. Стол\t 3499р");
        Goods.add("3. Стул\t 2799р");
        Goods.add("4. Кровать\t 7900р");

        for (int i = 0; i < Goods.size(); i ++) {
            System.out.println(Goods.get(i));
        }

        System.out.println("\nВыберите индекс товара для покупки: ");

        int value, id;
        Scanner in = new Scanner(System.in);

        id = in.nextInt();

        while (id < 1 || id > 4) {
            System.out.println("Некорректный индекс товара, попробуйте еще раз. Выберите индекс товара для покупки: ");
            id = in.nextInt();
        }

        System.out.println("Выберите способ оплаты:\n1 - Кредитная карта\n2 - Электронный кошелек");
        value = in.nextInt();

        while (value < 1 || value > 2) {
            System.out.println("Некорректный выбор способа оплаты, попробуйте еще раз. Выберите способ оплаты:\n1 - Кредитная карта\n2 - Электронный кошелек");
            value = in.nextInt();
        }

        Pay typePayment;
        if (value == 1) {
            typePayment = new PayByCreditCard();
        } else {
            typePayment = new PayByElectronMoney();
        }

        typePayment.pay();
    }
}
