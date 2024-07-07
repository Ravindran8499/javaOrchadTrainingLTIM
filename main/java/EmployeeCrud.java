package src.main.java;

import java.io.*;
import java.sql.*;
import java.util.*;

public class EmployeeCrud {
    Scanner sc = new Scanner(System.in);

    EmployeeBean  e = new EmployeeBean();
    void getDataFromUser(){
        System.out.println("Name: ");
        e.setName(sc.next());
        System.out.println("Dept: ");
        e.setDept(sc.next());
        System.out.println("Salary: ");
        e.setSalary(sc.nextInt());
        System.out.println("Email id:");
        e.setEmail(sc.next());
        System.out.println("Phone Number: ");
        e.setPhoneNo(sc.next());
     }

    void insertData(){
        try{
            // selecting the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practiselabday5","root","root");
            PreparedStatement ps = con.prepareStatement("insert into employee (name , dept , salary , emailid ,phoneno) values(?,?,?,?,?); ");
            
            ps.setString(1, e.getName());
            ps.setString(2, e.getDept());
            ps.setInt(3, e.getSalary());
            ps.setString(4, e.getEmail());
            ps.setString(5 , e.getPhoneNo());

            int res = ps.executeUpdate();

            if(res>0){
                System.out.println("Inserted Successfully.!!!");
            }else{
                System.out.println("Error..!!");
            }
        }catch(ClassNotFoundException e){
            System.out.println(e);

        }catch(SQLException sqle){
            System.out.println(sqle);
        }

     }
    void retriveData(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practiselabday5","root","root");
            PreparedStatement ps = con.prepareStatement("select * from employee;");

            ResultSet resultSet = ps.executeQuery();

            while(resultSet.next()){
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getString("dept"));
                System.out.println(resultSet.getInt("salary"));
                System.out.println(resultSet.getString("emailid"));
                System.out.println(resultSet.getString("phoneno"));
                System.out.println();
                System.out.println("***********************");
                
            }

        }catch(ClassNotFoundException e){
            System.out.println(e);

        }catch(SQLException sqle){
            System.out.println(sqle);
        }

    }


    public static void main(String[] args) {
        EmployeeCrud ec = new EmployeeCrud();
        // ec.getDataFromUser();
        // ec.insertData();
        ec.retriveData();
    }
}
