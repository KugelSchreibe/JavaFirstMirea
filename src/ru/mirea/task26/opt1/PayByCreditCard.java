package ru.mirea.task26.opt1;

import java.util.Locale;
import java.util.Scanner;

public class PayByCreditCard implements Pay {
    private String numOfCard;

    @Override
    public void pay() {
        Scanner in = new Scanner(System.in);
        String str;

        System.out.println("Введите номер вашей карты: ");
        str = in.nextLine();

        while (str.length() != 16 && str.toLowerCase(Locale.ROOT).matches("[0-9]+")) {
            System.out.println("Неверный формат номера карты или запрещенные символы, попробуйте еще раз. Введите номер вашей карты: ");
            str = in.nextLine();
        }

        System.out.println("Оплата прошла успешно!");
    }
}
