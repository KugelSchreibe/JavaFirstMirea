package ru.mirea.task16.projectBank.client;

import java.sql.SQLException;

public class UserInfo {
    private boolean premiumCard;
    private int moneyCommonCard;
    private int moneyPremiumCard;
    private String fname;
    private String lname;
    private String mname;
    private String numPrem;
    private String numComm;

    static boolean existUser(String login, String password) throws SQLException, ClassNotFoundException {
        if (Server.isAccountWithThatLogin(login) && Server.correctPassword(login, password)) {
            return true;
        }

        return false;
    }

    public UserInfo(String login, String password) throws SQLException, ClassNotFoundException {
        fname = Server.getfname(login);
        mname = Server.getmname(login);
        lname = Server.getlname(login);
        premiumCard = Server.isPremiumCard(login);
        numComm = Server.getNumComm(login);
        moneyCommonCard = Server.getMoneyComm(login);

        if (premiumCard) {
            numPrem = Server.getNumPrem(login);
            moneyPremiumCard = Server.getMoneyPrem(login);
        }
    }

    public int getMoneyCommonCard() {
        return moneyCommonCard;
    }

    public int getMoneyPremiumCard() {
        return moneyPremiumCard;
    }

    public boolean isPremiumCard() {
        return premiumCard;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getMname() {
        return mname;
    }

    public String getComNum() {
        return numComm;
    }

    public String getPremNum() {
        return numPrem;
    }
}
