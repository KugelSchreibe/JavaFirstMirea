package ru.mirea.task19;

import ru.mirea.task19.opt1.MyClass;
import ru.mirea.task19.opt1.MyException;

public class Test {
    public static void main(String[] args) {
        MyClass MC = new MyClass();

        try {
            MC.test();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
