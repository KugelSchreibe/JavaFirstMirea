package ru.mirea.task16.projectBank.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Locale;

public class WindowNewAccount extends Frame {
    private JLabel info;
    private JTextField fname, mname, lname, phoneNumber;
    private JButton createAccount, back;
    private JPasswordField passwordF, passwordS;

    public WindowNewAccount() {
        super("Регистрация | Pivovaroff Bank");
        this.setLayout(new GridBagLayout());

        info = new JLabel("Заполните формы для создания аккаунта");
        fname = new JTextField(20);
        mname = new JTextField(20);
        lname = new JTextField(20);
        passwordF = new JPasswordField(20);
        passwordS = new JPasswordField(20);
        phoneNumber = new JTextField(10);
        createAccount = new JButton("Зарегистрироваться");
        back = new JButton("Назад");

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets.bottom = 60;
        this.add(back, gbc);

        GridBagConstraints gbc1 = new GridBagConstraints();
        gbc1.gridx = 0;
        gbc1.gridy = 1;
        gbc1.gridwidth = 3;
        gbc1.gridheight = 1;
        gbc1.insets.bottom = 40;
        this.add(info, gbc1);

        GridBagConstraints gbc2 = new GridBagConstraints();
        gbc2.gridx = 0;
        gbc2.gridy = 2;
        gbc2.gridwidth = 1;
        gbc2.gridheight = 1;
        gbc2.anchor = GridBagConstraints.EAST;
        gbc2.insets.right = 10;
        gbc2.insets.bottom = 15;
        this.add(new JLabel("Фамилия"), gbc2);

        GridBagConstraints gbc3 = new GridBagConstraints();
        gbc3.gridx = 1;
        gbc3.gridy = 2;
        gbc3.gridwidth = 2;
        gbc3.gridheight = 1;
        gbc3.insets.bottom = 15;
        this.add(lname, gbc3);

        GridBagConstraints gbc4 = new GridBagConstraints();
        gbc4.gridx = 0;
        gbc4.gridy = 3;
        gbc4.gridwidth = 1;
        gbc4.gridheight = 1;
        gbc4.insets.right = 10;
        gbc4.insets.bottom = 15;
        gbc4.anchor = GridBagConstraints.EAST;
        this.add(new JLabel("Имя"), gbc4);

        GridBagConstraints gbc5 = new GridBagConstraints();
        gbc5.gridx = 1;
        gbc5.gridy = 3;
        gbc5.gridwidth = 2;
        gbc5.gridheight = 1;
        gbc5.insets.bottom = 15;
        this.add(fname, gbc5);

        GridBagConstraints gbc6 = new GridBagConstraints();
        gbc6.gridx = 0;
        gbc6.gridy = 4;
        gbc6.gridwidth = 1;
        gbc6.gridheight = 1;
        gbc6.insets.right = 10;
        gbc6.insets.bottom = 15;
        gbc6.anchor = GridBagConstraints.EAST;
        this.add(new JLabel("Отчество"), gbc6);

        GridBagConstraints gbc7 = new GridBagConstraints();
        gbc7.gridx = 1;
        gbc7.gridy = 4;
        gbc7.gridwidth = 2;
        gbc7.gridheight = 1;
        gbc7.insets.bottom = 15;
        this.add(mname, gbc7);

        GridBagConstraints gbc8 = new GridBagConstraints();
        gbc8.gridx = 0;
        gbc8.gridy = 5;
        gbc8.gridwidth = 1;
        gbc8.gridheight = 1;
        gbc8.insets.right = 10;
        gbc8.insets.bottom = 15;
        gbc8.anchor = GridBagConstraints.EAST;
        this.add(new JLabel("Телефон"), gbc8);

        GridBagConstraints gbc9 = new GridBagConstraints();
        gbc9.gridx = 1;
        gbc9.gridy = 5;
        gbc9.gridwidth = 2;
        gbc9.gridheight = 1;
        gbc9.insets.bottom = 15;
        gbc9.anchor = GridBagConstraints.WEST;
        this.add(phoneNumber, gbc9);

        GridBagConstraints gbc10 = new GridBagConstraints();
        gbc10.gridx = 0;
        gbc10.gridy = 6;
        gbc10.gridwidth = 1;
        gbc10.gridheight = 1;
        gbc10.insets.right = 10;
        gbc10.insets.bottom = 15;
        gbc10.anchor = GridBagConstraints.EAST;
        this.add(new JLabel("Пароль"), gbc10);

        GridBagConstraints gbc11 = new GridBagConstraints();
        gbc11.gridx = 1;
        gbc11.gridy = 6;
        gbc11.gridwidth = 2;
        gbc11.gridheight = 1;
        gbc11.insets.bottom = 15;
        gbc11.anchor = GridBagConstraints.WEST;
        this.add(passwordF, gbc11);

        GridBagConstraints gbc12 = new GridBagConstraints();
        gbc12.gridx = 0;
        gbc12.gridy = 7;
        gbc12.gridwidth = 1;
        gbc12.gridheight = 1;
        gbc12.insets.right = 10;
        gbc12.insets.bottom = 15;
        gbc12.anchor = GridBagConstraints.EAST;
        this.add(new JLabel("Повторите пароль"), gbc12);

        GridBagConstraints gbc13 = new GridBagConstraints();
        gbc13.gridx = 1;
        gbc13.gridy = 7;
        gbc13.gridwidth = 2;
        gbc13.gridheight = 1;
        gbc13.insets.bottom = 15;
        gbc13.anchor = GridBagConstraints.WEST;
        this.add(passwordS, gbc13);

        GridBagConstraints gbc14 = new GridBagConstraints();
        gbc14.gridx = 1;
        gbc14.gridy = 8;
        gbc14.gridwidth = 1;
        gbc14.gridheight = 1;
        gbc14.insets.top = 15;
        this.add(createAccount, gbc14);

        class backButton implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                doHide();
                new WindowLogin();
            }
        }

        class createAccountButton implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                if (checkForms()) {
                    try {
                        createNewAccount();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    } catch (ClassNotFoundException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }

        back.addActionListener(new backButton());
        createAccount.addActionListener(new createAccountButton());

        this.revalidate();
        this.setVisible(true);
        this.setSize(450, 450);
    }

    private void doHide() {
        this.removeAll();
        this.setVisible(false);
    }

    private boolean checkForms() {
        if (lname.getText().length() == 0 || fname.getText().length() == 0 || phoneNumber.getText().length() == 0
        || passwordS.getText().length() == 0 || passwordF.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Остались незаполненные поля", "Ошибка", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (!lname.getText().toLowerCase(Locale.ROOT).matches("[а-я]+")) {
            JOptionPane.showMessageDialog(this, "Фамилия содержит недопустимые символы", "Ошибка", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (!fname.getText().toLowerCase(Locale.ROOT).matches("[а-я]+")) {
            JOptionPane.showMessageDialog(this, "Имя содержит недопустимые символы", "Ошибка", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (!mname.getText().toLowerCase(Locale.ROOT).matches("[а-я]+")) {
            JOptionPane.showMessageDialog(this, "Отчество содержит недопустимые символы", "Ошибка", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (fname.getText().length() < 2) {
            JOptionPane.showMessageDialog(this, "Имя содержит менее двух букв", "Ошибка", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (lname.getText().length() < 2) {
            JOptionPane.showMessageDialog(this, "Фамилия содержит менее двух букв", "Ошибка", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (!phoneNumber.getText().toLowerCase(Locale.ROOT).matches("[0-9]+")) {
            JOptionPane.showMessageDialog(this, "Неверный формат номера телефона\n\n*нужный формат:9991234567", "Ошибка", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (phoneNumber.getText().length() != 10) {
            JOptionPane.showMessageDialog(this, "Неверный формат номера телефона\n\n*нужный формат:9991234567", "Ошибка", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (!passwordF.getText().equals(passwordS.getText())) {
            JOptionPane.showMessageDialog(this, "Пароли не совпадают", "Ошибка", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (passwordF.getText().length() < 8) {
            JOptionPane.showMessageDialog(this, "Пароль содержит менее 8 символов", "Ошибка", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }

    private void createNewAccount() throws SQLException, ClassNotFoundException {
        if (NewAccountAlgorithm.addClient(lname.getText(), fname.getText(), mname.getText(), phoneNumber.getText(), passwordS.getText())) {
            this.setVisible(false);
            JOptionPane.showMessageDialog(new WindowLogin(), "Вы успешно создали акаунт", "Отлично", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(this, "Такой логин уже занят", "Ошибка", JOptionPane.ERROR_MESSAGE);
    }
}
