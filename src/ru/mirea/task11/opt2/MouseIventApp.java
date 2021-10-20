package ru.mirea.task11.opt2;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseIventApp extends JFrame{
    private MyBackGround Border;

    public MouseIventApp() {
        super("My app");
        this.setSize(800, 800);
        this.setResizable(false);
        Border = new MyBackGround();
        this.add(Border);

        addMouseMotionListener(new MyMouseListener());
    }

    public class MyMouseListener implements MouseMotionListener  {

        @Override
        public void mouseDragged(MouseEvent e) {
            return;
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            message(e.getX(), e.getY());
        }
    }

    private void message(int x, int y) {
        if (java.lang.Math.pow(this.getWidth() / 2 - x, 2) + java.lang.Math.pow(this.getHeight() / 2 - y, 2) <= 400) {
            JOptionPane.showMessageDialog(this, "Добро пожаловать в Центр!");
        } else {
            if (-y > x - 800 && -y > -x) {
                JOptionPane.showMessageDialog(this, "Добро пожаловать на Север!");
            } else if (-y > -x && -y < x - 800) {
                JOptionPane.showMessageDialog(this, "Добро пожаловать на Восток!!");
            } else if (-y < x - 800 && -y < -x) {
                JOptionPane.showMessageDialog(this, "Добро пожаловать на Юг!");
            } else if (-y > x - 800 && -y < -x) {
                JOptionPane.showMessageDialog(this, "Добро пожаловать на Запад!");
            }
        }
    }
}
