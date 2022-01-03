package ru.mirea.task16.projectBank.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class WindowLogin extends JFrame {
    private JLabel info;
    private JButton enter;
    private JTextField login;
    private JPasswordField password;
    private JButton noAccount;

    private static JPanel jPanel = new JPanel();

    public WindowLogin() {
        super("Вход в личный кабинет | Pivovaroff");

        this.add(jPanel);

        jPanel.setLayout(new GridBagLayout());

        info = new JLabel("Введите ваш логин и пароль");
        enter = new JButton("Вход");
        login = new JTextField(16);
        password = new JPasswordField(16);
        noAccount = new JButton("Нет аккаунта?");
        password.setMinimumSize(new Dimension(100, 20));

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.weightx = 0;
        constraints.weighty = 0;
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.gridheight = 1;
        constraints.gridwidth = 4;
        constraints.insets.bottom = 50;
        jPanel.add(info, constraints);

        GridBagConstraints constraints1 = new GridBagConstraints();
        constraints1.weightx = 0;
        constraints1.weighty = 0;
        constraints1.gridx = 2;
        constraints1.gridy = 2;
        constraints1.gridheight = 1;
        constraints1.gridwidth = 3;
        constraints1.insets.bottom = 30;
        jPanel.add(login, constraints1);

        GridBagConstraints constraints5 = new GridBagConstraints();
        constraints5.weightx = 0;
        constraints5.weighty = 0;
        constraints5.gridx = 1;
        constraints5.gridy = 2;
        constraints5.gridheight = 1;
        constraints5.gridwidth = 1;
        constraints5.insets.bottom = 30;
        constraints5.insets.right = 5;
        jPanel.add(new JLabel("login:"), constraints5);

        GridBagConstraints constraints2 = new GridBagConstraints();
        constraints2.weightx = 0;
        constraints2.weighty = 0;
        constraints2.gridx = 2;
        constraints2.gridy = 4;
        constraints2.gridheight = 1;
        constraints2.gridwidth = 5;
        constraints2.insets.bottom = 30;
        jPanel.add(password, constraints2);

        GridBagConstraints constraints6 = new GridBagConstraints();
        constraints6.weightx = 0;
        constraints6.weighty = 0;
        constraints6.gridx = 1;
        constraints6.gridy = 4;
        constraints6.gridheight = 1;
        constraints6.gridwidth = 1;
        constraints6.insets.bottom = 30;
        constraints6.insets.right = 5;
        jPanel.add(new JLabel("password:"), constraints6);

        GridBagConstraints constraints3 = new GridBagConstraints();
        constraints3.weightx = 0;
        constraints3.weighty = 0;
        constraints3.gridx = 0;
        constraints3.gridy = 7;
        constraints3.gridheight = 1;
        constraints3.gridwidth = 2;
        constraints3.insets.bottom = 30;
        jPanel.add(enter, constraints3);

        GridBagConstraints constraints4 = new GridBagConstraints();
        constraints4.weightx = 0;
        constraints4.weighty = 0;
        constraints4.gridx = 3;
        constraints4.gridy = 7;
        constraints4.gridheight = 1;
        constraints4.gridwidth = 3;
        constraints4.insets.bottom = 30;
        jPanel.add(noAccount, constraints4);

        jPanel.revalidate();

        class pushEnterButton implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                String strLogin;
                String strPassword;

                strLogin = login.getText();
                strPassword = password.getText();

                System.out.println("Логин: " + strLogin + "\nПароль: " + strPassword);

                if (strLogin.equals("")) {
                    JOptionPane.showMessageDialog(jPanel, "Поле с логином должно быть обязательно заполнено.", "Внимание", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if (strPassword.equals("")) {
                    JOptionPane.showMessageDialog(jPanel, "Поле с паролем должно быть обязательно заполнено.", "Внимание", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                try {
                    if (UserInfo.existUser(strLogin, strPassword)) {
                        successfulEnter(strLogin, strPassword);
                    } else {
                        unsuccessfulEnter();
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        }

        class pushNoAccountButton implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                doHide();
                new WindowNewAccount();
            }
        }

        noAccount.addActionListener(new pushNoAccountButton());

        enter.addActionListener(new pushEnterButton());

        this.setSize(450, 450);
        this.setVisible(true);
    }

    private void doHide() {
        jPanel.removeAll();
        this.setVisible(false);
    }

    private void successfulEnter(String log, String password) throws SQLException, ClassNotFoundException {
        jPanel.removeAll();
        this.setVisible(false);
        new PersonalAccount(log, password);
    }

    private void unsuccessfulEnter() {
        JOptionPane.showMessageDialog(this, "Неверный логин или пароль, попробуйте ввести данные заново,\nесли у вас нет нашей карты, создайте аккаунт нажав на кнопку 'нет аккаукта'.", "Внимание", JOptionPane.ERROR_MESSAGE);
    }
}
