package ru.mirea.task12.opt3;

import ru.mirea.task12.opt2.Student2_0;

public class MergeSort {
    private static Student2_0[] merge(Student2_0[] arr1, Student2_0[] arr2) {
        Student2_0[] arrayC = new Student2_0[arr1.length + arr2.length];

        int positionA = 0, positionB = 0;


        for (int i = 0; i < arrayC.length; i++) {
            if (positionA == arr1.length){
                arrayC[i] = arr2[i - positionB];
                positionB++;
            } else if (positionB == arr2.length) {
                arrayC[i] = arr1[i - positionA];
                positionA++;
            } else if (arr1[i - positionA].getMark() < arr2[i - positionB].getMark()) {
                arrayC[i] = arr1[i - positionA];
                positionB++;
            } else {
                arrayC[i] = arr2[i - positionB];
                positionA++;
            }
        }
        return arrayC;
    }

    private static Student2_0 [] sortArray(Student2_0[] arrayA){
        if (arrayA == null) {
            return null;
        }

        if (arrayA.length < 2) {
            return arrayA;
        }

        Student2_0 [] arrayB = new Student2_0[arrayA.length / 2];
        System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length / 2);

        Student2_0 [] arrayC = new Student2_0[arrayA.length - arrayA.length / 2];
        System.arraycopy(arrayA, arrayA.length / 2, arrayC, 0, arrayA.length - arrayA.length / 2);

        arrayB = sortArray(arrayB);
        arrayC = sortArray(arrayC);

        return merge(arrayB, arrayC);
    }

    static public Student2_0[] sort(Student2_0[] arr1, Student2_0[] arr2) {
        Student2_0[] arr = new Student2_0[arr1.length + arr2.length];

        int j;
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }
        j = arr1.length;
        for (int i = 0; i < arr2.length; i++) {
            arr[j++] = arr2[i];
        }

        if (arr == null) {
            return null;
        }
        if (arr.length < 2) {
            return arr;
        }

        Student2_0[] arrayB = new Student2_0[arr.length / 2];
        System.arraycopy(arr, 0, arrayB, 0, arr.length / 2);

        Student2_0[] arrayC = new Student2_0[arr.length - arr.length / 2];

        System.arraycopy(arr, arr.length / 2, arrayC, 0, arr.length - arr.length / 2);


        arrayB = sortArray(arrayB);
        arrayC = sortArray(arrayC);

        return merge(arrayB, arrayC);
    }
}
