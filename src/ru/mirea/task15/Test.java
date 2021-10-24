package ru.mirea.task15;

import java.io.*;
import java.util.Scanner;

public class Test {
    private static  File file = new File("info.txt");

    private static void writeInfo() throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(file);

        System.out.println("\nВведите текст для записи в файл:");
        pw.println((new Scanner(System.in)).nextLine());
        System.out.println("\n");

        pw.close();
    }

    private static void readFile() throws FileNotFoundException {
        System.out.println("\n");
        System.out.println("Содержимое файла:");
        Scanner in = new Scanner(file);
        while (in.hasNextLine()) {
            System.out.println(in.nextLine());
        }
        System.out.println("\n");

    }

    private static void changeInfo() throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(file);

        System.out.println("Введите текст для замены информации в файле:");
        pw.println((new Scanner(System.in)).nextLine());

        pw.close();
    }

    private static void writeApp() throws IOException {
        FileWriter pw = new FileWriter(file, true);
        BufferedWriter BF = new BufferedWriter(pw);

        System.out.println("\nВведите текст для записи в конец файла:");
        BF.write((new Scanner(System.in)).nextLine());
        System.out.println("\n");

        BF.close();
        pw.close();
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int input = 0;

        while (input != 5) {
            System.out.println("""
                Введите операцию:
                1 - Записать в файл информацию
                2 - Вывести содержимое файла
                3 - Перезаписать информацию в файл
                4 - Дописать в конец файла информацию
                5 - Выход""");

            input = in.nextInt();

            if (input == 1) {
                writeInfo();
            } else if (input == 2) {
                readFile();
            } else if (input == 3) {
                changeInfo();
            } else if (input == 4) {
                writeApp();
            } else if (input == 5) {
                break;
            }
        }
    }
}
