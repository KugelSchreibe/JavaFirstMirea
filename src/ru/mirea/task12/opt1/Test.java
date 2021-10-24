package ru.mirea.task12.opt1;


public class Test {
    public static void main(String[] args) {
        Student[] IDNumber = new Student[12];

        System.out.println("Неотсортирванный массив:\n");

        for (int i = 0; i < IDNumber.length; i++) {
            IDNumber[i] = new Student();
            IDNumber[i].setId((int)(Math.random() * 10));
            System.out.print(IDNumber[i].toString() + "\n");
        }

        MySort.sort(IDNumber);

        System.out.println("\nОтсортирванный массив:\n");

        for (int i = 0; i < IDNumber.length; i++) {
            System.out.print(IDNumber[i].toString() + "\n");
        }
    }
}
