package ru.mirea.task16.projectBank.client;

import java.sql.SQLException;

public class TransferAlgorithm {
    public static boolean trueEnteredDate(String phoneOrCard, boolean fromCommon, boolean byCard, String login, int sumOfMoney) throws SQLException, ClassNotFoundException {
        if ((!byCard && Server.isAccountWithThatLogin(phoneOrCard) || (byCard && !Server.getLogByNumCard(phoneOrCard).equals("")))) {
            return true;
        }
        return false;
    }

    public static boolean translate(String phoneOrCard, boolean fromCommon, boolean byCard, String log, int sumOfMoney) throws SQLException, ClassNotFoundException {
        String personLog;

        if (byCard) {
            personLog = Server.getLogByNumCard(phoneOrCard);

            if (Server.getNumComm(personLog).equals(phoneOrCard)) {
                int currentSum = Server.getMoneyComm(personLog);
                Server.setNewSumOfMoneyCommonCard(personLog, currentSum + sumOfMoney);

                if (fromCommon) {
                    currentSum = Server.getMoneyComm(log);
                    Server.setNewSumOfMoneyCommonCard(log, currentSum - sumOfMoney);
                } else {
                    currentSum = Server.getMoneyPrem(log);
                    Server.setNewSumOfMoneyPremiumCard(log, currentSum - sumOfMoney);
                }

                return true;
            } else if (Server.isPremiumCard(personLog)) {
                if (Server.getNumPrem(personLog).equals(phoneOrCard)) {
                    int currentSum = Server.getMoneyPrem(personLog);
                    Server.setNewSumOfMoneyPremiumCard(personLog, currentSum + sumOfMoney);

                    if (fromCommon) {
                        currentSum = Server.getMoneyComm(log);
                        Server.setNewSumOfMoneyCommonCard(log, currentSum - sumOfMoney);
                    } else {
                        currentSum = Server.getMoneyPrem(log);
                        Server.setNewSumOfMoneyPremiumCard(log, currentSum - sumOfMoney);
                    }
                }

                return true;
            }
        } else {
            personLog = phoneOrCard;

            int currentSum = Server.getMoneyComm(personLog);
            Server.setNewSumOfMoneyCommonCard(personLog, currentSum + sumOfMoney);

            if (fromCommon) {
                currentSum = Server.getMoneyComm(log);
                Server.setNewSumOfMoneyCommonCard(log, currentSum - sumOfMoney);
            } else {
                currentSum = Server.getMoneyPrem(log);
                Server.setNewSumOfMoneyPremiumCard(log, currentSum - sumOfMoney);
            }

            return true;
        }

        return false;
    }
}
