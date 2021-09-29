package ru.mirea.task8.opt1;

import javax.swing.*;
import java.awt.*;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

public class MyWindow extends JDialog {
    private JButton MyButton;

    public MyWindow(JFrame JF) {
        super(JF, "20 random shapes", true);

        MyButton = new JButton("Start");

        MyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                paint(new Graphics() {
                    @Override
                    public Graphics create() {
                        return null;
                    }

                    @Override
                    public void translate(int x, int y) {

                    }

                    @Override
                    public Color getColor() {
                        return null;
                    }

                    @Override
                    public void setColor(Color c) {

                    }

                    @Override
                    public void setPaintMode() {

                    }

                    @Override
                    public void setXORMode(Color c1) {

                    }

                    @Override
                    public Font getFont() {
                        return null;
                    }

                    @Override
                    public void setFont(Font font) {

                    }

                    @Override
                    public FontMetrics getFontMetrics(Font f) {
                        return null;
                    }

                    @Override
                    public Rectangle getClipBounds() {
                        return null;
                    }

                    @Override
                    public void clipRect(int x, int y, int width, int height) {

                    }

                    @Override
                    public void setClip(int x, int y, int width, int height) {

                    }

                    @Override
                    public Shape getClip() {
                        return null;
                    }

                    @Override
                    public void setClip(Shape clip) {

                    }

                    @Override
                    public void copyArea(int x, int y, int width, int height, int dx, int dy) {

                    }

                    @Override
                    public void drawLine(int x1, int y1, int x2, int y2) {

                    }

                    @Override
                    public void fillRect(int x, int y, int width, int height) {

                    }

                    @Override
                    public void clearRect(int x, int y, int width, int height) {

                    }

                    @Override
                    public void drawRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {

                    }

                    @Override
                    public void fillRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {

                    }

                    @Override
                    public void drawOval(int x, int y, int width, int height) {

                    }

                    @Override
                    public void fillOval(int x, int y, int width, int height) {

                    }

                    @Override
                    public void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle) {

                    }

                    @Override
                    public void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle) {

                    }

                    @Override
                    public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {

                    }

                    @Override
                    public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {

                    }

                    @Override
                    public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {

                    }

                    @Override
                    public void drawString(String str, int x, int y) {

                    }

                    @Override
                    public void drawString(AttributedCharacterIterator iterator, int x, int y) {

                    }

                    @Override
                    public boolean drawImage(Image img, int x, int y, ImageObserver observer) {
                        return false;
                    }

                    @Override
                    public boolean drawImage(Image img, int x, int y, int width, int height, ImageObserver observer) {
                        return false;
                    }

                    @Override
                    public boolean drawImage(Image img, int x, int y, Color bgcolor, ImageObserver observer) {
                        return false;
                    }

                    @Override
                    public boolean drawImage(Image img, int x, int y, int width, int height, Color bgcolor, ImageObserver observer) {
                        return false;
                    }

                    @Override
                    public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, ImageObserver observer) {
                        return false;
                    }

                    @Override
                    public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, Color bgcolor, ImageObserver observer) {
                        return false;
                    }

                    @Override
                    public void dispose() {

                    }
                });
            }
        });

        JPanel panel = new JPanel();
        panel.add(MyButton);
        add(panel, BorderLayout.SOUTH);

        setSize(1000, 1000);
    }

    public void paint(Graphics g){
        g.drawOval(40, 40, 60, 60); //FOR CIRCLE
        g.drawRect(80, 30, 200, 200); // FOR SQUARE
        g.drawRect(200, 100, 100, 200); // FOR RECT
    }
}
