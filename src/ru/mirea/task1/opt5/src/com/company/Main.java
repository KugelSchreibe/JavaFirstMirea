package com.company;
import java.lang.*;

public class Main {

    public static void harmonic() {
        System.out.println("Первые 10 чисел гармонического ряда");
        for (int i = 0; i<10; i++) {
            System.out.println(1/(double)(i + 1) + " ");
        }
    }

	public static void main(String[] args) {
       harmonic();
    }
}
