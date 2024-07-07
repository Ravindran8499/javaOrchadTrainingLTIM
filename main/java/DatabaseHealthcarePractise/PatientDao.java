
package main.java.DatabaseHealthcarePractise;

import java.sql.*;
import java.util.ArrayList;

import javax.annotation.processing.Generated;

public class PatientDao {
    Connection con;
    PatientDao(){
        try {
            con = DatabaseConnection.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void createPatientData(Patient patient){
        String sql = "insert into patients(patientName , medicalHistory) values(?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql , Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, patient.getPatientName());
            ps.setString(2, patient.getMedicalHistory());

            ps.executeUpdate();

            ResultSet getGeneratedKeys = ps.getGeneratedKeys();
            if(getGeneratedKeys.next()){
                patient.setPatientId( getGeneratedKeys.getInt(1));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    // public List<Patien> getPatientsByList()throws RecordNotFoundException{
    //     return ArrayList<><>();
    // }
    
    public Patient getPatientData(int patientId) throws RecordNotFoundException{

        String sql = "select * from patients where patientId = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, patientId);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                Patient P = new Patient();
                P.setPatientId(rs.getInt("patientId"));
                P.setPatientName(rs.getString("patientName"));
                P.setMedicalHistory(rs.getString("medicalHistory"));
                return p;
            }else{
                throw new RecordNotFoundException("Rcord with + " patientId  + "is not found");
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    public Patient update
    
}

