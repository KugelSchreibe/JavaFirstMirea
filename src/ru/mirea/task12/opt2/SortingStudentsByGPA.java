package ru.mirea.task12.opt2;

public class SortingStudentsByGPA implements Comparator{

    @Override
    public void sort(Student2_0[] arr, int low, int high) {
        if (arr.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        Student2_0 opora = arr[middle];

        int i = low, j = high;
        while (i <= j) {
            while (arr[i].getMark() > opora.getMark()) {
                i++;
            }

            while (arr[j].getMark() < opora.getMark()) {
                j--;
            }

            if (i <= j) {
                Student2_0 temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            sort(arr, low, j);

        if (high > i)
            sort(arr, i, high);
    }

    static public void quick_sort(Student2_0[] arr) {
        (new SortingStudentsByGPA()).sort(arr, 0, arr.length - 1);
    }
}
