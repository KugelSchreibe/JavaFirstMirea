package ru.mirea.task16.projectBank.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class WindowMakePremCard extends JFrame {
    private JLabel info;
    private JCheckBox agreeBox;
    private JButton back, agreeButton;
    private String login, password;

    public WindowMakePremCard(String login, String password) {
        super("Выпуск Premium карты | Pivovaroff");

        this.login = login;
        this.password = password;

        setLayout(new GridBagLayout());

        info = new JLabel("Вы согласны оформить Premium карту,\n" +
                "стоимостью 500 руб.?");
        back = new JButton("Назад");
        agreeBox = new JCheckBox("Я согласен оформить карту");
        agreeButton = new JButton("Выпустить карту");

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets.bottom = 60;
        gbc.insets.top = 5;
        gbc.insets.left = 5;
        this.add(back, gbc);

        GridBagConstraints gbc1 = new GridBagConstraints();
        gbc1.gridx = 0;
        gbc1.gridy = 1;
        gbc1.gridwidth = 3;
        gbc1.gridheight = 1;
        gbc1.insets.bottom = 20;
        this.add(info, gbc1);

        GridBagConstraints gbc2 = new GridBagConstraints();
        gbc2.gridx = 0;
        gbc2.gridy = 2;
        gbc2.gridwidth = 3;
        gbc2.gridheight = 1;
        gbc2.insets.bottom = 30;
        this.add(agreeBox, gbc2);

        GridBagConstraints gbc3 = new GridBagConstraints();
        gbc3.gridx = 0;
        gbc3.gridy = 3;
        gbc3.gridwidth = 3;
        gbc3.gridheight = 1;
        gbc3.insets.bottom = 30;
        this.add(agreeButton, gbc3);

        class pushBackButton implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new PersonalAccount(login, password);
                } catch (SQLException | ClassNotFoundException ex) {
                    ex.printStackTrace();
                }
                doHide();
            }
        }

        class pushAgreeButton implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (checkAgreeButton()) {
                        doHide();
                        new PersonalAccount(login, password);
                    }
                } catch (SQLException | ClassNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        }

        agreeButton.addActionListener(new pushAgreeButton());
        back.addActionListener(new pushBackButton());

        this.revalidate();
        this.setVisible(true);
        this.setSize(500, 350);
    }

    private void doHide() {
        this.setVisible(false);
    }

    private boolean checkAgreeButton() throws SQLException, ClassNotFoundException {
        if (!agreeBox.isSelected()) {
            JOptionPane.showMessageDialog(this, "Вы не подтвердили выпуск карты", "Ошибка", JOptionPane.WARNING_MESSAGE);
            return false;
        } else {
            if (Server.getMoneyComm(login) >= 500) {
                if (Server.addPremiumCard(login)) {
                    JOptionPane.showMessageDialog(this, "Premium карта выпущена", "Успешно", JOptionPane.INFORMATION_MESSAGE);
                    return true;
                } else {
                    JOptionPane.showMessageDialog(this, "Неполадки с сервером", "Ошибка", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            } else {
                JOptionPane.showMessageDialog(this, "Недостаточно средств", "Ошибка", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
    }
}
