package main.java.DatabaseRecall;

import java.sql.*;

// import com.mysql.cj.jdbc.result.ResultSetInternalMethods;
// import com.mysql.cj.protocol.Resultset;

public class PatientDao {
    Connection con;
    PatientDao(){
        try{
             con  = DatabaseConnection.getDatabaseConnection(); 
        }catch(SQLException sqle){
            System.out.println(sqle);
        }
    }

    public void createPatientData(Patient patient) {
        String sql = "insert into patients(patientName , medicalHistory) values(?,?)";
        try{
            
            PreparedStatement ps = con.prepareStatement(sql , Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, patient.getPatientName());
            ps.setString(2, patient.getMedicalHistory());

            
            //Executing the Querry.!!!! and inserting the values..!!
            ps.executeUpdate();


            //Getting the patients id from table and providing it to patient object again...!!
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                //Get the topmost automatically generated keys
                patient.setPatientId(rs.getInt(1));
            }
        }catch(SQLException sqle){
            sqle.printStackTrace();
        }
    }



    public Patient getPatientData(int patientId) throws SQLException , RecordNotFoundException{
        String sql = "select * from patients where patientId = ?;";
        
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,patientId);
            ResultSet rs = ps.executeQuery();
            Patient p = new Patient();
            
            if(rs.next()){
                p.setPatientId(rs.getInt("patientId"));
                p.setPatientName(rs.getString("patientName"));
                p.setMedicalHistory(rs.getString("medicalHistory"));
            }else{
                throw new RecordNotFoundException("Patient with PatientID: " + patientId + " is dead..!!");
            }
            return p;
            
    }


    





    // TO DO-------------WILL DO
    // public Patient updatePatientData(String patientName , int patientId) throws RecordNotFoundException , SQLException{
    //     String sql = "update patients set patientName = ? where patientId = ?";
    //     PreparedStatement ps = con.prepareStatement(sql);
    //     ps.setString(1, patientName);
    //     ps.setInt(2, patientId);

    //     int ans = ps.executeUpdate();


    // }
}

