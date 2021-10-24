package ru.mirea.task12.opt2;

public class Test {
    public static void main(String[] args) {
        Student2_0[] IDNumber = new Student2_0[12];

        System.out.println("Неотсортирванный массив:\n");

        for (int i = 0; i < IDNumber.length; i++) {
            IDNumber[i] = new Student2_0();
            IDNumber[i].setMark((int)(Math.random() * 10));
            System.out.print(IDNumber[i].toString() + "\n");
        }

        SortingStudentsByGPA.quick_sort(IDNumber);

        System.out.println("\nОтсортирванный массив:\n");

        for (int i = 0; i < IDNumber.length; i++) {
            System.out.print(IDNumber[i].toString() + "\n");
        }
    }
}
