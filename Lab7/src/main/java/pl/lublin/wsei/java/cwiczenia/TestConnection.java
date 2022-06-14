package pl.lublin.wsei.java.cwiczenia;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.Properties;


public class TestConnection {
    public static void main(String[] args) throws  ClassNotFoundException, SQLException{

        String serverName = "localhost";
        String database = "mydb";
        Number portNumber = 3306;
        Connection conn = null;
        Properties connectionProp = new Properties();
        connectionProp.put("user","root");
        connectionProp.put("password",""); //WPISZ HASŁO
        connectionProp.put("serverTimezone","Europe/Warsaw");

        conn = DriverManager.getConnection("jdbc:mysql://" + serverName + "/" + database, connectionProp);
        System.out.println("Connected to database. ");




    }

}

