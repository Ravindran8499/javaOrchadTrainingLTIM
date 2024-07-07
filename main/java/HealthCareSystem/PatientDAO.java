package main.java.HealthCareSystem;

import java.sql.*;
public class PatientDAO {
     Connection con;

    public PatientDAO(){
        try{
            con = DatabaseConnection.getConnection();
        }catch(SQLException sqle){
            sqle.printStackTrace();
        }

        public 
    }
}
