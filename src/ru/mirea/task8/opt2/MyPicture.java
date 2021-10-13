package ru.mirea.task8.opt2;

import javax.swing.*;
import java.awt.*;

public class MyPicture extends JPanel {
    static Image img = new ImageIcon("/home/sergei/IdeaProjects/JavaFirstMirea/src/ru/mirea/task8/opt2/kaktus_sukkulent_koliuchki_134097_1920x1080.jpg").getImage();

    public void paintComponent (Graphics g) {
        g.drawImage(img, 0, 0, null);
    }

    public static void main(String [] argv) {
        JFrame F = new JFrame();
        F.setSize(1980, 1920);
        F.add(new MyPicture());
        F.setVisible(true);
    }
}
