package ru.mirea.task8.opt1;

import javax.swing.*;
import java.awt.*;
import ru.mirea.task7.opt2and3.*;
import ru.mirea.task7.opt2and3.Rectangle;

public class MyWindow extends JPanel {
    public void paintComponent(Graphics g) {
        this.setBackground(Color.WHITE);

        int rand;
        for (int i = 0; i < 20; i++) {
            rand = 3;
            while (rand > 2) {
                rand = (int)(Math.random() * 10);
            }

            if (rand == 0) {
                Circle circle = new Circle();

                rand = (int)(Math.random() * 100) + (int)(Math.random() * 100) + (int)(Math.random() * 10);
                circle.setRadius(rand);

                int clr = 6;
                while (clr > 5) {
                    clr = (int)(Math.random() * 10);
                }
                if (clr == 0) {
                    circle.setColor("black");
                    g.setColor(Color.BLACK);
                } else if (clr == 1) {
                    circle.setColor("red");
                    g.setColor(Color.RED);
                } else if (clr == 2) {
                    circle.setColor("blue");
                    g.setColor(Color.BLUE);
                } else if (clr == 3) {
                    circle.setColor("green");
                    g.setColor(Color.GREEN);
                } else if (clr == 4) {
                    circle.setColor("pink");
                    g.setColor(Color.PINK);
                }

                g.drawOval((int)(Math.random() * 1000) + (int)(Math.random() * 100) + (int)(Math.random() * 10),
                        (int)(Math.random() * 1000) + (int)(Math.random() * 100) + (int)(Math.random() * 10),
                        (int)circle.getRadius(), (int)circle.getRadius());
            } else if (rand == 1) {
                Rectangle rectangle = new Rectangle();

                rand = (int)(Math.random() * 100) + (int)(Math.random() * 100) + (int)(Math.random() * 10);
                rectangle.setLength(rand);
                rand = (int)(Math.random() * 100) + (int)(Math.random() * 100) + (int)(Math.random() * 10);
                rectangle.setWidth(rand);

                int clr = 6;
                while (clr > 5) {
                    clr = (int)(Math.random() * 10);
                }
                if (clr == 0) {
                    rectangle.setColor("black");
                    g.setColor(Color.BLACK);
                } else if (clr == 1) {
                    rectangle.setColor("red");
                    g.setColor(Color.RED);
                } else if (clr == 2) {
                    rectangle.setColor("blue");
                    g.setColor(Color.BLUE);
                } else if (clr == 3) {
                    rectangle.setColor("green");
                    g.setColor(Color.GREEN);
                } else if (clr == 4) {
                    rectangle.setColor("pink");
                    g.setColor(Color.PINK);
                }

                g.drawRect((int)(Math.random() * 1000) + (int)(Math.random() * 100) + (int)(Math.random() * 10),
                        (int)(Math.random() * 1000) + (int)(Math.random() * 100) + (int)(Math.random() * 10), (int)rectangle.getWidth(), (int)rectangle.getLength());
            } else {
                Square square = new Square();

                rand = (int)(Math.random() * 100) + (int)(Math.random() * 100) + (int)(Math.random() * 10);
                square.setSide(rand);

                int clr = 6;
                while (clr > 5) {
                    clr = (int)(Math.random() * 10);
                }
                if (clr == 0) {
                    square.setColor("black");
                    g.setColor(Color.BLACK);
                } else if (clr == 1) {
                    square.setColor("red");
                    g.setColor(Color.RED);
                } else if (clr == 2) {
                    square.setColor("blue");
                    g.setColor(Color.BLUE);
                } else if (clr == 3) {
                    square.setColor("green");
                    g.setColor(Color.GREEN);
                } else if (clr == 4) {
                    square.setColor("pink");
                    g.setColor(Color.PINK);
                }
                g.drawRect((int)(Math.random() * 1000) + (int)(Math.random() * 100) + (int)(Math.random() * 10),
                        (int)(Math.random() * 1000) + (int)(Math.random() * 100) + (int)(Math.random() * 10), (int)square.getWidth(), (int)square.getLength());
            }
        }
    }
}
