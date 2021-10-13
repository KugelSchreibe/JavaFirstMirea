package ru.mirea.task8.opt3;

import javax.swing.*;
import java.util.ArrayList;

public class MyGif extends JPanel {
    static ArrayList<ImageIcon> Gif = new ArrayList<>();
    static JLabel Scr = new JLabel();

    public void gif() throws InterruptedException {
        while (true) {
            Scr.setIcon(Gif.get(0));
            Thread.sleep(200);
            Scr.setIcon(Gif.get(1));
            Thread.sleep(200);
            Scr.setIcon(Gif.get(2));
            Thread.sleep(200);
        }
    }

    public static void main(String [] argv) throws InterruptedException {
        Gif.add(new ImageIcon("/home/sergei/IdeaProjects/JavaFirstMirea/src/ru/mirea/task8/opt3/image_2021-10-12_22-36-57.png"));
        Gif.add(new ImageIcon("/home/sergei/IdeaProjects/JavaFirstMirea/src/ru/mirea/task8/opt3/image_2021-10-12_22-37-21.png"));
        Gif.add(new ImageIcon("/home/sergei/IdeaProjects/JavaFirstMirea/src/ru/mirea/task8/opt3/image_2021-10-12_22-37-40.png"));

        JFrame F = new JFrame();
        F.setSize(400, 470);

        MyGif MG = new MyGif();

        F.add(MG);
        F.add(Scr);
        F.setVisible(true);

        MG.gif();
    }
}
