package pl.lublin.wsei.java.cwiczenia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestSelect {
    public static void main(String[] args) throws SQLException {
        MyDB myDB = new MyDB("localhost", "mydb", 3306);
        Connection connection = myDB.getConnection();
        if(connection!=null){
         /*   Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM mydb.coffee_houses");
            System.out.printf("%10s%20s%7s%7s%7s\n","STORE_ID","CITY","COFFE","MERCH","TOTAL");
            while(resultSet.next()){
                System.out.printf("%10d%20s%7d%7d%7d\n", resultSet.getInt(1), resultSet.getString("CITY")
                        ,resultSet.getInt(3),resultSet.getInt(4),resultSet.getInt(5));


            }

        } myDB.closeConnetion();
        }*/
        Statement statement = connection.createStatement();
        Number dostawa = 100;
        statement.executeUpdate("UPDATE coffee_houses SET COFFEE=COFFEE + " + dostawa + " WHERE CITY = 'SF' ");
        ResultSet resultSet = statement.executeQuery("SELECT * FROM mydb.coffee_houses");
        System.out.printf("%10s%20s%7s%7s%7s\n","STORE_ID","CITY","COFFE","MERCH","TOTAL");
        while(resultSet.next()){
            System.out.printf("%10d%20s%7d%7d%7d\n", resultSet.getInt(1), resultSet.getString("CITY"),
                    resultSet.getInt(3),resultSet.getInt(4),resultSet.getInt(5));


    }
}myDB.closeConnetion();
    }
    }