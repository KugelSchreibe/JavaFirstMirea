package ru.mirea.task11.opt3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyMenu extends JFrame {
    private JTextArea TextArea;
    private JComboBox ColorMenu;
    private JComboBox FontMenu;
    private JComponent[] cells;
    private String color[] = {
            "Black",
            "Red",
            "Blue"
    };
    private String font[] = {
            "Italic",
            "Bold",
            "New Roman"
    };

    public MyMenu() {
        super("Мое меню");
        setLayout(new GridLayout(3,1));
        cells = new JComponent[3];

        TextArea = new JTextArea();
        ColorMenu = new JComboBox(color);
        FontMenu = new JComboBox(font);

        cells[0] = ColorMenu;
        cells[1] = FontMenu;
        cells[2] = TextArea;

        this.add(cells[0]);
        this.add(cells[1]);
        this.add(cells[2]);

        this.setSize(600, 600);

        ColorMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox Box = (JComboBox)e.getSource();
                String item = (String)Box.getSelectedItem();
                if (item.equals(color[0])) {
                    TextArea.setForeground(Color.BLACK);
                    System.out.println("Выбран item: " + item);
                } else if (item.equals(color[1])) {
                    TextArea.setForeground(Color.RED);
                    System.out.println("Выбран item: " + item);
                } else if (item.equals(color[2])) {
                    TextArea.setForeground(Color.BLUE);
                    System.out.println("Выбран item: " + item);
                }
            }
        });

        FontMenu.addActionListener(new ActionListener() {
            private Font boldFont = new Font("serif", Font.BOLD, 14);
            private Font italicFont = new Font("serif", Font.ITALIC, 14);
            private Font romanFont = new Font("serif", Font.PLAIN, 14);

            @Override
            public void actionPerformed(ActionEvent e) {
                TextArea.setEnabled(true);
                JComboBox Box = (JComboBox)e.getSource();
                String item = (String)Box.getSelectedItem();
                System.out.println("Выбран item: " + item);
                if (item.equals(font[0])) {
                    TextArea.setFont(italicFont);
                } else if (item.equals(font[1])) {
                    TextArea.setFont(boldFont);
                } else if (item.equals(font[2])){
                    TextArea.setFont(romanFont);
                }
            }
        });
    }

}
