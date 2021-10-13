package ru.mirea.task8.opt1;

import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] argv) {
        JFrame frame = new JFrame("20 случайных фигур");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyWindow MW = new MyWindow();
        MW.setBackground(Color.WHITE);
        frame.add(MW);
        frame.setSize(1000, 1000);
        frame.setVisible(true);
    }
}
