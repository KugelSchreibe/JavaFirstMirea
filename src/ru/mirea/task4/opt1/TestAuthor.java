package ru.mirea.task4.opt1;

import java.util.Locale;
import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] argv) {
        String name, email, gender = " ";
        Scanner in = new Scanner(System.in);

        System.out.print("Введите имя автора: ");
        name = in.nextLine();

        System.out.print("Введите email автора: ");
        email = in.nextLine();

        System.out.print("Введите пол автора (м / ж): ");
        email = in.nextLine();

        email = email.toLowerCase(Locale.ROOT);

        while (true) {
            if (email.length() == 1 && (email.equals("м") || email.equals("ж"))) {
                break;
            }
            System.out.print("Некорректный ввод. Введите пол автора (м / ж): ");
            email = in.nextLine();

            email = email.toLowerCase(Locale.ROOT);
        }



        Author MyAthor = new Author(name, email, gender.charAt(0));
        System.out.println("\n" + MyAthor.toString());
    }
}
