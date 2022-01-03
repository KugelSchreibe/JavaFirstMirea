package ru.mirea.task19.opt1;

import java.util.Locale;
import java.util.Scanner;

public class MyClass {
    private String str;
    public void test() throws MyException {
        System.out.println("Введите 'да' если хотите кинуть исключение");
        Scanner in = new Scanner(System.in);
        str = in.nextLine();

        if (str.toLowerCase(Locale.ROOT).equals("да")) {
            throw new MyException("Сработало пользовательское исключение");
        }
    }
}
