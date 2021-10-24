package ru.mirea.task14.opt5;

import javax.print.attribute.standard.JobKOctets;
import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private JLabel gameInfo;
    private GridLayout allLayout;
    private JPanel[][] cells;
    private Button startGame;
    private JCheckBox[] choosingCard;
    private JLabel[] infoNumberCard;
    private JLabel[] cards;

    public MainWindow() {
        super("Игра Пьяница");

        allLayout = new GridLayout(12, 4);
        this.setLayout(allLayout);

        cells = new JPanel[12][4]; // row 12; coll 4

        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[0].length; j++) {
                cells[i][j] = new JPanel();
                this.add(cells[i][j]);
            }
        }

        choosingCard = new JCheckBox[10];
        infoNumberCard = new JLabel[10];
        cards = new JLabel[10];

        for (int i = 1, j = 0; i < 10; i++, j++) {
            choosingCard[j] = new JCheckBox();
            infoNumberCard[j] = new JLabel();
            cards[j] = new JLabel("K" + j);
            cells[i][1].add(choosingCard[j]);
            cells[i][2].add(infoNumberCard[j]);
            cells[i][3].add(cards[j]);
        }

        startGame = new Button("Start");
        gameInfo = new JLabel("Вы играете в пьяницу, выберите свои 5 карт (сверху вниз относительно вашей колоды");

        cells[0][0].add(gameInfo);
        cells[0][2].add(gameInfo);
        cells[11][1].add(startGame);

        setSize(800, 800);
    }


}
