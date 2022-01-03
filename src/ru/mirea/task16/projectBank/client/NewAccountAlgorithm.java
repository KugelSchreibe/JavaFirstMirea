package ru.mirea.task16.projectBank.client;

import java.sql.SQLException;

class NewAccountAlgorithm {
    public static boolean addClient(String lname, String fname, String mname, String phone, String password) throws SQLException, ClassNotFoundException {
        if (!Server.isAccountWithThatLogin(phone)) {
            Server.createNewClient(lname, fname, mname, phone, password);
            return true;
        }

        return false;
    }
}
