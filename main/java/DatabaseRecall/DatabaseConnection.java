package main.java.DatabaseRecall;

import java.sql.*;
public class DatabaseConnection {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/practiselabday6";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static Connection getDatabaseConnection() throws SQLException{

        Connection con = DriverManager.getConnection( JDBC_URL, USERNAME , PASSWORD);
        return con;

    }
    
}
