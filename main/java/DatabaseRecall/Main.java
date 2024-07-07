package main.java.DatabaseRecall;

import java.sql.SQLException;

import com.mysql.cj.jdbc.exceptions.SQLError;

public class Main {
    public static void main(String[] args) {
        PatientDao patientDao = new PatientDao();

        Patient patient = new Patient();
        patient.setPatientName("Zain");
        patient.setMedicalHistory("love failure..!");
        patientDao.createPatientData(patient);
        
        try{
            Patient patientById =  patientDao.getPatientData(3);
            
             System.out.println();
             System.out.println("**************Patient Details***********");
             System.out.println(patientById.getPatientId());
             System.out.println(patientById.getPatientName());
             System.out.println(patientById.getMedicalHistory());
             System.out.println();

        }catch(RecordNotFoundException rnfe){
            System.out.println(rnfe);
        }catch(SQLException sqle){
            System.out.println(sqle);

        }
    }
    
}
