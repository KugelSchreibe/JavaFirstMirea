package ru.mirea.task16.projectBank.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Locale;

public class WindowTransfer extends Frame {
    private JRadioButton fRButton, sRButton, premRButton, commRButton;
    private ButtonGroup RadioGroup2, RadioGroup1;
    private String login, password;
    private boolean byCard;
    private boolean fromCommon;
    private JLabel choiceCard, info;
    private JButton back, doTransfer;
    private JTextField form, money;

    public WindowTransfer(String login, String password) throws SQLException, ClassNotFoundException {
        super("Перевод | Pivovaroff Bank");

        this.login = login;
        this.password = password;
        choiceCard = new JLabel("Выберите карту для перевода");
        back = new JButton("Назад");
        info = new JLabel("Введите номер телефона получателя");
        doTransfer = new JButton("Перевести");
        RadioGroup2 = new ButtonGroup();
        RadioGroup1 = new ButtonGroup();
        commRButton = new JRadioButton("Common Card", true);
        premRButton = new JRadioButton("Premium Card", false);
        form = new JTextField(16);
        money = new JTextField(16);
        this.fromCommon = true;
        this.byCard = false;

        fRButton = new JRadioButton("Перевод по номеру телефона", true);
        sRButton = new JRadioButton("Перевод по номеру карты", false);
        RadioGroup2.add(commRButton);
        RadioGroup2.add(premRButton);
        RadioGroup1.add(fRButton);
        RadioGroup1.add(sRButton);

        this.setLayout(new GridBagLayout());

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

        GridBagConstraints gbc4 = new GridBagConstraints();
        gbc4.gridx = 0;
        gbc4.gridy = 1;
        gbc4.gridwidth = 3;
        gbc4.gridheight = 1;
        gbc4.insets.bottom = 20;
        this.add(new JLabel("Выберите способ перевода"), gbc4);

        GridBagConstraints gbc5 = new GridBagConstraints();
        gbc5.gridx = 1;
        gbc5.gridy = 2;
        gbc5.gridwidth = 2;
        gbc5.gridheight = 1;
        gbc5.anchor = GridBagConstraints.WEST;
        gbc5.insets.bottom = 10;
        this.add(fRButton, gbc5);

        GridBagConstraints gbc6 = new GridBagConstraints();
        gbc6.gridx = 1;
        gbc6.gridy = 3;
        gbc6.gridwidth = 2;
        gbc6.gridheight = 1;
        gbc6.anchor = GridBagConstraints.WEST;
        gbc6.insets.bottom = 20;
        this.add(sRButton, gbc6);

        GridBagConstraints gbc7 = new GridBagConstraints();
        gbc7.gridx = 0;
        gbc7.gridy = 4;
        gbc7.gridwidth = 3;
        gbc7.gridheight = 1;
        gbc7.insets.bottom = 10;
        this.add(info, gbc7);

        GridBagConstraints gbc8 = new GridBagConstraints();
        gbc8.gridx = 0;
        gbc8.gridy = 5;
        gbc8.gridwidth = 3;
        gbc8.gridheight = 1;
        gbc8.insets.bottom = 20;
        //gbc8.anchor = GridBagConstraints.WEST;
        this.add(form, gbc8);

        if (Server.isPremiumCard(login)) {
            GridBagConstraints gbc9 = new GridBagConstraints();
            gbc9.gridx = 0;
            gbc9.gridy = 6;
            gbc9.gridwidth = 3;
            gbc9.gridheight = 1;
            gbc9.insets.bottom = 10;
            this.add(new JLabel("Выберите с какой карты выполнить перевод"), gbc9);

            GridBagConstraints gbc10 = new GridBagConstraints();
            gbc10.gridx = 1;
            gbc10.gridy = 7;
            gbc10.gridwidth = 2;
            gbc10.gridheight = 1;
            gbc10.anchor = GridBagConstraints.WEST;
            gbc10.insets.bottom = 10;
            this.add(commRButton, gbc10);

            GridBagConstraints gbc11 = new GridBagConstraints();
            gbc11.gridx = 1;
            gbc11.gridy = 8;
            gbc11.gridwidth = 2;
            gbc11.gridheight = 1;
            gbc11.insets.bottom = 20;
            gbc11.anchor = GridBagConstraints.WEST;
            this.add(premRButton, gbc11);
        } else {
            commRButton.setSelected(true);
        }

        GridBagConstraints gbc12 = new GridBagConstraints();
        gbc12.gridx = 0;
        gbc12.gridy = 9;
        gbc12.gridwidth = 3;
        gbc12.gridheight = 1;
        gbc12.insets.bottom = 10;
        this.add(new JLabel("Введите сумму перевода"), gbc12);

        GridBagConstraints gbc13 = new GridBagConstraints();
        gbc13.gridx = 0;
        gbc13.gridy = 10;
        gbc13.gridwidth = 3;
        gbc13.gridheight = 1;
        gbc13.insets.bottom = 30;
        this.add(money, gbc13);

        GridBagConstraints gbc14 = new GridBagConstraints();
        gbc14.gridx = 0;
        gbc14.gridy = 11;
        gbc14.gridwidth = 3;
        gbc14.gridheight = 1;
        //gbc8.anchor = GridBagConstraints.WEST;
        this.add(doTransfer, gbc14);

        class transferByNumOfCard implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Выбрана кнопка перевода по номеру карты");
                byCard = true;
                try {
                    choiceCard();
                } catch (SQLException | ClassNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        }

        class pushBackButton implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    goBack();
                } catch (SQLException | ClassNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        }

        class transferByNumOfPhone implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Выбрана кнопка перевода по номеру телефона");
                byCard = false;
                choicePhone();
            }
        }

        class transferFromComm implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                fromCommon = true;
            }
        }

        class transferFromPrem implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                fromCommon = false;
            }
        }

        class pushTransfer implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    goTransfer();
                } catch (SQLException | ClassNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        }

        fRButton.addActionListener(new transferByNumOfPhone());
        sRButton.addActionListener(new transferByNumOfCard());

        premRButton.addActionListener(new transferFromPrem());
        commRButton.addActionListener(new transferFromComm());

        back.addActionListener(new pushBackButton());
        doTransfer.addActionListener(new pushTransfer());

        this.revalidate();
        this.setVisible(true);
        this.setSize(550, 600);
    }

    private void choicePhone() {
        info.setText("Выберите номер телефона получателя");
    }

    private void choiceCard() throws SQLException, ClassNotFoundException {
        info.setText("Выберите номер карты получателя");
    }

    private void goBack() throws SQLException, ClassNotFoundException {
        this.removeAll();
        this.setVisible(false);
        new PersonalAccount(login, password);
    }

    private boolean checkEnteredData() throws SQLException, ClassNotFoundException {
        if (byCard) {
            if (!form.getText().toLowerCase(Locale.ROOT).matches("[0-9]+")) {
                JOptionPane.showMessageDialog(this, "Запрещенные символы в поле\nввода номера карты", "Ошибка", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            if (form.getText().length() > 16) {
                JOptionPane.showMessageDialog(this, "Слишком длинный номер карты", "Ошибка", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            if (form.getText().length() < 16) {
                JOptionPane.showMessageDialog(this, "Слишком короткий номер карты", "Ошибка", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } else {
            if (!form.getText().toLowerCase(Locale.ROOT).matches("[0-9]+")) {
                JOptionPane.showMessageDialog(this, "Запрещенные символы в поле\nввода номера телефона", "Ошибка", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            if (form.getText().length() > 10) {
                JOptionPane.showMessageDialog(this, "Слишком длинный номер телефона", "Ошибка", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            if (form.getText().length() < 10) {
                JOptionPane.showMessageDialog(this, "Слишком короткий номер телефона", "Ошибка", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }

        if (!money.getText().toLowerCase(Locale.ROOT).matches("[0-9]+")) {
            JOptionPane.showMessageDialog(this, "Запрещенные символы в поле\nввода суммы перевода", "Ошибка", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (Integer.parseInt(money.getText()) == 0) {
            JOptionPane.showMessageDialog(this, "Сумма перевода должна быть больше нуля", "Ошибка", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (fromCommon) {
            if (Server.getMoneyComm(login) - Integer.parseInt(money.getText()) < 0) {
                JOptionPane.showMessageDialog(this, "Недостаточно средств", "Ошибка", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }

        if (!fromCommon) {
            if (Server.getMoneyPrem(login) - Integer.parseInt(money.getText()) < 0) {
                JOptionPane.showMessageDialog(this, "Недостаточно средств", "Ошибка", JOptionPane.ERROR_MESSAGE);
                return false;

            }
        }

        return true;
    }

    private void goTransfer() throws SQLException, ClassNotFoundException {
        if (checkEnteredData()) {
            if (!TransferAlgorithm.trueEnteredDate(form.getText(), fromCommon, byCard, login, Integer.parseInt(money.getText()))) {
                JOptionPane.showMessageDialog(this, "Проверьте корректность данных получателя", "Ошибка", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (TransferAlgorithm.translate(form.getText(), fromCommon, byCard, login, Integer.parseInt(money.getText()))) {
                JOptionPane.showMessageDialog(this, "Перевод прошел успешно!", "Выполнено", JOptionPane.INFORMATION_MESSAGE);
                form.setText("");
                money.setText("");
                commRButton.setSelected(true);
                fRButton.setSelected(true);
                return;
            }
            JOptionPane.showMessageDialog(this, "Проверьте корректность данных получателя", "Ошибка", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }
}
