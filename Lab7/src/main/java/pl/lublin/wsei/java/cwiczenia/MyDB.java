package pl.lublin.wsei.java.cwiczenia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MyDB {
    public MyDB(String serverName, String database, Number portNumber) {
        this.serverName = serverName;
        this.database = database;
        this.portNumber = portNumber;
    }

    private String serverName = "localhost";

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public Number getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(Number portNumber) {
        this.portNumber = portNumber;
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    private String database = "mydb";
    private Number portNumber = 3306;
    private String user = "root";
private String password = ""; //WPISZ HASŁO
    private Connection conn = null;

    private void connection(){
        Properties connectionProps = new Properties();
        connectionProps.put("user",user);
        connectionProps.put("password",password);
        connectionProps.put("serverTimezone","Europe/Warsaw");
        String jdbc="jdbc:mysql://" + getServerName() + ":" + getPortNumber()+"/"+ getDatabase();
        try {
            conn= DriverManager.getConnection(jdbc,connectionProps);
        } catch (SQLException e) {
            System.out.println("Błąd połączenia do bazy" + jdbc);
            System.out.println("Komunikat błędu :" + e.getMessage());
            conn=null;
        }
        System.out.println("Connected to database");

    }
    public Connection getConnection(){
        if(conn == null)
            connection();
        return conn;
    }
    public void closeConnetion(){
        if(conn!=null){
            try {
                conn.close();
                System.out.println("Połączenie zakończone");
            } catch (SQLException e) {
                System.out.println("Błąd przy zamykaniu połączenia" + e.getMessage());
            }

        }
        conn=null;
    }
}
