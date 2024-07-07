package main.java.EmployeeComparatorhashmap;

import java.io.*;
import java.util.*;



public class Main {
    public static void main(String[] args) {
        EmployeeManagement emp = new EmployeeManagement();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<num;i++){
            Employee e = new Employee();
            e.setEmpID(sc.nextInt());
            e.setEmpName(sc.next());
            e.setEmpAddress(sc.next());
            emp.addEmployee(e);
        }
        // Employee e1 = emp.getEmployee(1);
        // System.out.println("-----------------------");
        // System.out.println(e1.getEmpID());
        // System.out.println(e1.getEmpName());
        // System.out.println(e1.getEmpAddress());
        // System.out.println("---------------------------");
        List<Employee> list = emp.getAllEmployeesSortedByName();
        for(Employee emp_1:list){
            System.out.println(emp_1.getEmpID());
            System.out.println(emp_1.getEmpName());
            System.out.println(emp_1.getEmpAddress());
        }
        
        List<Employee> list2 = emp.getAllEmployeesSortedById();
        
        for(Employee emp_2:list2){
            System.out.println(emp_2.getEmpID());
            System.out.println(emp_2.getEmpName());
            System.out.println(emp_2.getEmpAddress());
        }
        // // boolean isRemoved = emp.removeEmployee(2);
        // if(isRemoved){
        //     System.out.println("Removed Successfully !");
        // }
    }
}