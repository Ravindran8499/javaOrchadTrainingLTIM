package main.java.HealthCareSystem;

import java.net.ConnectException;
import java.sql.*;

public class DatabaseConnection {
    public static final String JDBC_URL = "jdbc:mysql://localhost/3308/practiselabday6";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "root";



    public static Connection getConnection() throws SQLException{

        Connection con = DriverManager.getConnection(JDBC_URL , USERNAME , PASSWORD);

        return con;
    }
}
