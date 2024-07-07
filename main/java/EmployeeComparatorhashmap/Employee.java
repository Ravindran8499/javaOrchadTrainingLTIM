package main.java.EmployeeComparatorhashmap;
import java.io.*;
import java.util.*;
import java.lang.*;


public class Employee implements Comparable<Employee>,Comparator<Employee> {
    private int empID;
    private String empName;
    private String empAddress;

    public Employee(){
       
    }

    public int getEmpID() {
        return empID;
    }
    public void setEmpID(int empID) {
        this.empID = empID;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public String getEmpAddress() {
        return empAddress;
    }
    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    @Override
    public int compareTo(Employee e){
        return this.empName.compareTo(e.empName);
    }
    @Override
    public int compare(Employee e1,Employee e2){
        return Integer.compare(e1.empID,e2.empID);
    }
}
