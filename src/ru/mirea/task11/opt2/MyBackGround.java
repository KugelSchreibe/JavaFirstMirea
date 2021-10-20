package ru.mirea.task11.opt2;

import javax.swing.*;
import java.awt.*;

public class MyBackGround extends JPanel {
    public void paintComponent(Graphics g) {
        g.setColor(Color.PINK);
        g.drawOval(this.getWidth() / 2 - 20, this.getHeight() / 2 - 20, 40, 40);
        g.setColor(Color.PINK);
        g.drawLine(0, 0, this.getWidth() , 0);
        g.setColor(Color.PINK);
        g.drawLine(0, 0, this.getWidth() / 2, this.getHeight() / 2);
        g.setColor(Color.PINK);
        g.drawLine(this.getWidth(), 0, this.getWidth() / 2, this.getHeight() / 2);
        g.setColor(Color.PINK);
        g.drawLine(this.getWidth(), this.getHeight(), this.getWidth() / 2, this.getHeight() / 2);
        g.setColor(Color.PINK);
        g.drawLine(0, getHeight(), this.getWidth() / 2, this.getHeight() / 2);
    }
}
