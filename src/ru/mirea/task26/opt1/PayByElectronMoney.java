package ru.mirea.task26.opt1;

import java.util.Locale;
import java.util.Scanner;

public class PayByElectronMoney implements Pay {
    private String numOfPhone;

    @Override
    public void pay() {
        Scanner in = new Scanner(System.in);
        String str;

        System.out.println("Введите номер телефона, к которому превязан интернет кошелек: ");
        str = in.nextLine();

        while (str.length() != 10 && str.toLowerCase(Locale.ROOT).matches("[0-9]+")) {
            System.out.println("Неверный формат номера телефона или запрещенные символы, попробуйте еще раз. Введите номер телефона, к которому превязан интернет кошелек: ");
            str = in.nextLine();
        }

        System.out.println("Оплата прошла успешно!");
    }
}
