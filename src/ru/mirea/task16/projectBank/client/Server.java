package ru.mirea.task16.projectBank.client;

import java.sql.*;

public class Server {
    private static final String url = "jdbc:mysql://localhost:3306/Bank";
    private static final String user = "sergei";
    private static final String pass = "Sergei_27";
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;

    public Server() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        try {
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Есть соединение с бд!");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        con.close();
        stmt.close();
    }

    public static boolean isAccountWithThatLogin(String login) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url, user, pass);
        System.out.println("Есть соединение с бд!");

        String query = String.format("SELECT COUNT(*) FROM Clients WHERE login = '%s';", login);

        stmt = con.createStatement();
        rs = stmt.executeQuery(query);

        rs.next();

        if (rs.getInt(1) == 0) {
            con.close();
            stmt.close();
            rs.close();

            return false;
        }

        con.close();
        stmt.close();
        rs.close();

        return true;
    }

    public static boolean createNewClient(String lname, String fname, String mname, String login, String password) throws SQLException, ClassNotFoundException {
        if (!isAccountWithThatLogin(login)) {
            String num = "";

            while (true) {
                num = "";
                for (int i = 0; i < 16; i++) {
                    num += String.valueOf((int)(Math.random() * 10));
                }
                System.out.println("номер карты: " + num);
                if (Server.getLogByNumCard(num).equals("")) {
                    break;
                }
            }

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Есть соединение с бд!");

            String query = String.format("INSERT INTO Clients (login, password, lname, fname, mname, isPrem, " +
                    "numComm, moneyComm) VALUES ('%s', '%s', '%s', '%s', '%s', false, '%s', %d);", login, password, lname, fname, mname, num, 1000);

            stmt = con.createStatement();
            stmt.executeUpdate(query);

            con.close();
            stmt.close();
            rs.close();

            return true;
        }
        return false;
    }

    public static boolean setNewSumOfMoneyCommonCard(String login, int newSumOfMoney) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url, user, pass);
        System.out.println("Есть соединение с бд!");

        String query = String.format("UPDATE Clients SET moneyComm = %d WHERE login = '%s';", newSumOfMoney, login);

        stmt = con.createStatement(); ///////////
        stmt.executeUpdate(query);

        con.close();
        stmt.close();

        return true;
    }

    public static boolean setNewSumOfMoneyPremiumCard(String login, int newSumOfMoney) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url, user, pass);
        System.out.println("Есть соединение с бд!");

        String query = String.format("UPDATE Clients SET moneyPrem = %d WHERE login = '%s';", newSumOfMoney, login);

        stmt = con.createStatement(); ///////////////
        stmt.executeUpdate(query);

        con.close();
        stmt.close();

        return true;
    }

    public static boolean isPremiumCard(String login) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url, user, pass);
        System.out.println("Есть соединение с бд!");

        String query = String.format("SELECT isPrem FROM Clients WHERE login = '%s';", login);

        stmt = con.createStatement();
        rs = stmt.executeQuery(query);

        rs.next();
        boolean bool = rs.getBoolean(1);

        con.close();
        stmt.close();
        rs.close();

        return bool;
    }

    public static boolean addPremiumCard(String login) throws ClassNotFoundException, SQLException {
        String num = "";

        while (true) {
            num = "";
            for (int i = 0; i < 16; i++) {
                num += String.valueOf((int)(Math.random() * 10));
            }
            System.out.println("номер карты: " + num);
            if (Server.getLogByNumCard(num).equals("")) {
                break;
            }
        }

        setNumPrem(login, num);

        System.out.println("номер карты: " + num);

        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url, user, pass);
        System.out.println("Есть соединение с бд!");

        String query = String.format("UPDATE Clients SET isPrem = true WHERE login = '%s';", login);


        stmt = con.createStatement();/////////////
        stmt.executeUpdate(query);

        con.close();
        stmt.close();

        setNewSumOfMoneyPremiumCard(login, 0);

        int sum = getMoneyComm(login);
        setNewSumOfMoneyCommonCard(login, sum - 500);

        return true;
    }

    public static boolean setNumPrem(String login, String num) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url, user, pass);
        System.out.println("Есть соединение с бд!");

        String query = String.format("UPDATE Clients SET numPrem = '%s' WHERE login = '%s';", num, login);

        stmt = con.createStatement();/////////////
        stmt.executeUpdate(query);

        con.close();
        stmt.close();

        setNewSumOfMoneyPremiumCard(login, 0);

        return true;
    }

    public static boolean correctPassword(String login ,String password) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url, user, pass);
        System.out.println("Есть соединение с бд!");

        String query = String.format("SELECT password FROM Clients WHERE login = '%s';", login);

        stmt = con.createStatement();
        rs = stmt.executeQuery(query);

        rs.next();
        String result = rs.getString(1);

        con.close();
        stmt.close();
        rs.close();

        if (result.equals(password)) {
            return true;
        }

        return false;
    }

    public static String getfname(String login) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url, user, pass);
        System.out.println("Есть соединение с бд!");

        String query = String.format("SELECT fname FROM Clients WHERE login = '%s';", login);

        stmt = con.createStatement();
        rs = stmt.executeQuery(query);

        rs.next();
        String result = rs.getString(1);

        con.close();
        stmt.close();
        rs.close();

        return result;
    }

    public static String getmname(String login) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url, user, pass);
        System.out.println("Есть соединение с бд!");

        String query = String.format("SELECT mname FROM Clients WHERE login = '%s';", login);

        stmt = con.createStatement();
        rs = stmt.executeQuery(query);

        rs.next();
        String result = rs.getString(1);

        con.close();
        stmt.close();
        rs.close();

        return result;
    }

    public static String getlname(String login) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url, user, pass);
        System.out.println("Есть соединение с бд!");

        String query = String.format("SELECT lname FROM Clients WHERE login = '%s';", login);

        stmt = con.createStatement();
        rs = stmt.executeQuery(query);

        rs.next();
        String result = rs.getString(1);

        con.close();
        stmt.close();
        rs.close();

        return result;
    }

    public static String getNumPrem(String login) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url, user, pass);
        System.out.println("Есть соединение с бд!");

        String query = String.format("SELECT numPrem FROM Clients WHERE login = '%s';", login);


        stmt = con.createStatement();
        rs = stmt.executeQuery(query);

        rs.next();
        String result = rs.getString(1);

        con.close();
        stmt.close();
        rs.close();

        return result;
    }

    public static int getMoneyPrem(String login) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url, user, pass);
        System.out.println("Есть соединение с бд!");

        String query = String.format("SELECT moneyPrem FROM Clients WHERE login = '%s';", login);


        stmt = con.createStatement();
        rs = stmt.executeQuery(query);

        rs.next();
        int result = rs.getInt(1);

        con.close();
        stmt.close();
        rs.close();

        return result;
    }

    public static String getNumComm(String login) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url, user, pass);
        System.out.println("Есть соединение с бд!");

        String query = String.format("SELECT numComm FROM Clients WHERE login = '%s';", login);


        stmt = con.createStatement();
        rs = stmt.executeQuery(query);

        rs.next();
        String result = rs.getString(1);

        con.close();
        stmt.close();
        rs.close();

        return result;
    }

    public static int getMoneyComm(String login) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url, user, pass);
        System.out.println("Есть соединение с бд!");

        String query = String.format("SELECT moneyComm FROM Clients WHERE login = '%s';", login);

        stmt = con.createStatement();
        rs = stmt.executeQuery(query);

        rs.next();
        int result = rs.getInt(1);

        con.close();
        stmt.close();
        rs.close();

        return result;
    }

    public static String getLogByNumCard(String numCard) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url, user, pass);
        System.out.println("Есть соединение с бд!");

        String query = String.format("SELECT login FROM Clients WHERE numPrem = '%s' || numComm = '%s';", numCard, numCard);

        stmt = con.createStatement();
        rs = stmt.executeQuery(query);

        boolean bool = rs.next();

        String result = "";

        if (bool) {
            result = rs.getString(1);
        }

        con.close();
        stmt.close();
        rs.close();

        return result;
    }
}
