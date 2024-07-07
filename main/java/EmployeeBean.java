package src.main.java;
import java.io.*;
import java.util.*;


class EmployeeBean{
    private String name;
    private String dept;
    private int salary;
    private String emailid;
    private String phoneno;
    
    public String getName(){
        return name;
    }
    public String getDept(){
        return dept;
    }
    public int getSalary(){
        return salary;
    }
    public String getPhoneNo(){
        return phoneno;
    }
    public String getEmail(){
        return emailid;
    }


    public void setName(String name){
        this.name = name;
    }
    public void setDept(String dept){
        this.dept = dept;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public void setPhoneNo(String phoneno){
        this.phoneno = phoneno;
    }
    public void setEmail(String emailid){
        this.emailid = emailid;
    }

}