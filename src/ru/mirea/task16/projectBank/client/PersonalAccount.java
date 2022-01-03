package ru.mirea.task16.projectBank.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class PersonalAccount extends JFrame {
    private UserInfo User;
    private JLabel FIO;
    private JLabel Cards;
    private JLabel UsersAction;
    private JButton Transfer;
    private JButton NewCard;
    private JButton infoBank;
    private Date date;
    private String login, password;

    public PersonalAccount(String login, String password) throws SQLException, ClassNotFoundException {
        super("Личный кабинет | Pivovaroff Bank");

        setLayout(new GridBagLayout());
        this.login = login;
        this.password = password;

        User = new UserInfo(login, password);

        FIO = new JLabel(User.getFname().charAt(0) + ". " +  User.getMname().charAt(0) + ". " + User.getLname());
        Cards = new JLabel("Ваши карты: ");
        UsersAction = new JLabel("Доступные операции:");
        Transfer = new JButton("Перевод");
        NewCard = new JButton("Выпустить Premium Card");
        infoBank = new JButton("О банке Pivovaroff");
        date = new Date(0);
        SimpleDateFormat formater = new SimpleDateFormat("MM-dd HH:mm");
        Date date = new Date();

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.weightx = 0;
        gbc.weighty = 0;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        gbc.gridwidth = 0;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets.bottom = 60;
        this.add(new JLabel(formater.format(date)), gbc);

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.weightx = 0;
        constraints.weighty = 0;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridheight = 1;
        constraints.gridwidth = 7;
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets.bottom = 60;
        this.add(FIO, constraints);

        GridBagConstraints constraints2 = new GridBagConstraints();
        constraints2.weightx = 0;
        constraints2.weighty = 0;
        constraints2.gridx = 1;
        constraints2.gridy = 1;
        constraints2.gridheight = 1;
        constraints2.gridwidth = 2;
        constraints2.anchor = GridBagConstraints.WEST;
        constraints2.insets.bottom = 60;
        this.add(Cards, constraints2);

        GridBagConstraints constraints3 = new GridBagConstraints();
        constraints3.weightx = 0;
        constraints3.weighty = 0;
        constraints3.gridx = 5;
        constraints3.gridy = 1;
        constraints3.gridheight = 1;
        constraints3.gridwidth = 2;
        constraints3.anchor = GridBagConstraints.WEST;
        constraints3.insets.bottom = 60;
        this.add(UsersAction, constraints3);

        GridBagConstraints constraints9 = new GridBagConstraints();
        constraints9.weightx = 0;
        constraints9.weighty = 0;
        constraints9.gridx = 0;
        constraints9.gridy = 2;
        constraints9.gridheight = 1;
        constraints9.gridwidth = 2;
        constraints9.anchor = GridBagConstraints.WEST;
        constraints9.insets.bottom = 20;
        this.add(new JLabel("Номер вашей Common Card: "), constraints9);

        GridBagConstraints constraints10 = new GridBagConstraints();
        constraints10.weightx = 0;
        constraints10.weighty = 0;
        constraints10.gridx = 0;
        constraints10.gridy = 3;
        constraints10.gridheight = 1;
        constraints10.gridwidth = 2;
        constraints10.anchor = GridBagConstraints.WEST;
        constraints10.insets.bottom = 20;
        this.add(new JLabel(User.getComNum()), constraints10);

        GridBagConstraints constraints11 = new GridBagConstraints();
        constraints11.weightx = 0;
        constraints11.weighty = 0;
        constraints11.gridx = 0;
        constraints11.gridy = 4;
        constraints11.gridheight = 1;
        constraints11.gridwidth = 2;
        constraints11.insets.bottom = 40;
        constraints11.anchor = GridBagConstraints.WEST;
        this.add(new JLabel("На счету: " + String.valueOf(User.getMoneyCommonCard()) + " руб."), constraints11);

        if (User.isPremiumCard()) {
            GridBagConstraints constraints6 = new GridBagConstraints();
            constraints6.weightx = 0;
            constraints6.weighty = 0;
            constraints6.gridx = 0;
            constraints6.gridy = 5;
            constraints6.gridheight = 1;
            constraints6.gridwidth = 2;
            constraints6.anchor = GridBagConstraints.WEST;
            constraints6.insets.bottom = 20;
            this.add(new JLabel("Номер вашей Premium Card: "), constraints6);

            GridBagConstraints constraints7 = new GridBagConstraints();
            constraints7.weightx = 0;
            constraints7.weighty = 0;
            constraints7.gridx = 0;
            constraints7.gridy = 6;
            constraints7.gridheight = 1;
            constraints7.gridwidth = 2;
            constraints7.insets.bottom = 20;
            constraints7.anchor = GridBagConstraints.WEST;
            this.add(new JLabel(User.getPremNum()), constraints7);

            GridBagConstraints constraints8 = new GridBagConstraints();
            constraints8.weightx = 0;
            constraints8.weighty = 0;
            constraints8.gridx = 0;
            constraints8.gridy = 7;
            constraints8.gridheight = 1;
            constraints8.gridwidth = 2;
            constraints8.insets.bottom = 40;
            constraints8.anchor = GridBagConstraints.WEST;
            this.add(new JLabel(String.valueOf("На счету: " + User.getMoneyPremiumCard()) + " руб."), constraints8);
        }

        GridBagConstraints constraints12 = new GridBagConstraints();
        constraints12.weightx = 0;
        constraints12.weighty = 0;
        constraints12.gridx = 5;
        constraints12.gridy = 2;
        constraints12.gridheight = 1;
        constraints12.gridwidth = 2;
        constraints12.insets.bottom = 20;
        //constraints12.insets.left = 100;
        constraints12.anchor = GridBagConstraints.WEST;
        this.add(Transfer, constraints12);

        GridBagConstraints constraints13 = new GridBagConstraints();
        constraints13.weightx = 0;
        constraints13.weighty = 0;
        constraints13.gridx = 5;
        constraints13.gridy = 3;
        constraints13.gridheight = 1;
        constraints13.gridwidth = 2;
        constraints13.insets.bottom = 20;
        constraints13.anchor = GridBagConstraints.WEST;
        this.add(infoBank, constraints13);

        if (!User.isPremiumCard()) {
            GridBagConstraints constraints14 = new GridBagConstraints();
            constraints14.weightx = 0;
            constraints14.weighty = 0;
            constraints14.gridx = 5;
            constraints14.gridy = 4;
            constraints14.gridheight = 1;
            constraints14.gridwidth = 2;
            constraints14.insets.bottom = 40;
            constraints14.anchor = GridBagConstraints.WEST;
            this.add(NewCard, constraints14);
        }

        class pushTransferButton implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                doHide();
                try {
                    createTransferWindow();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        }

        Transfer.addActionListener(new pushTransferButton());

        class pushInfoBankButton implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                openInfoBank();
            }
        }

        class pushNewCardButton implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                new WindowMakePremCard(login, password);
                doHide();
            }
        }

        NewCard.addActionListener(new pushNewCardButton());
        infoBank.addActionListener(new pushInfoBankButton());

        this.revalidate();
        this.setVisible(true);
        this.setSize(600, 550);
    }

    private void createTransferWindow() throws SQLException, ClassNotFoundException {
        new WindowTransfer(login, password);
    }

    private void doHide() {
        this.setVisible(false);
    }

    private void openInfoBank() {
        JOptionPane.showMessageDialog(this, "Банк находится в разработке, благодарим\nза использование нашего продукта", "Информация о банке", JOptionPane.INFORMATION_MESSAGE);
    }
}
