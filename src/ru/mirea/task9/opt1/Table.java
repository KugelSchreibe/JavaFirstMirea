package ru.mirea.task9.opt1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Table extends JFrame {
    private JButton RealMadridButton;
    private JButton ACMilanButton;
    private JLabel Result;
    private JLabel LastScore;
    private JLabel Winner;
    private JPanel[][] allCell;
    private int MadridPoint;
    private int ACMilanPoint;

    public Table() {
        super("Championship");
        RealMadridButton = new JButton("Real Madrid");
        ACMilanButton = new JButton("AC Milan");

        Result = new JLabel("Result: 0 X 0");
        LastScore = new JLabel("Last Scorer: N/A");
        Winner = new JLabel("Winner: Draw");

        this.setSize(600, 600);

        setLayout(new GridLayout(3, 3));

        allCell = new JPanel[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                allCell[i][j] = new JPanel();
                this.add(allCell[i][j]);
            }
        }

        allCell[0][1].add(Result);
        allCell[1][0].add(RealMadridButton);
        allCell[1][1].add(LastScore);
        allCell[1][2].add(ACMilanButton);
        allCell[2][1].add(Winner);

        MadridPoint = ACMilanPoint = 0;

        RealMadridButton.addActionListener(new RealMadridButtonListener());
        ACMilanButton.addActionListener(new ACMilanButtonListener());
    }

    public class RealMadridButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            MadridPoint++;
            Result.setText("Result: " + MadridPoint + " X " + ACMilanPoint);
            LastScore.setText("Last Scorer: " + "Real Madrid");
            newWinner();
        }
    }

    public class ACMilanButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            ACMilanPoint++;
            Result.setText("Result: " + MadridPoint + " X " + ACMilanPoint);
            LastScore.setText("Last Scorer: " + "AC Milan");
            newWinner();
        }
    }

    private void newWinner() {
        if (MadridPoint > ACMilanPoint) {
            Winner.setText("Winner: Real Madrid");
        } else if (MadridPoint < ACMilanPoint) {
            Winner.setText("Winner: AC Milan");
        } else {
            Winner.setText("Winner: DRAW");
        }
    }
}