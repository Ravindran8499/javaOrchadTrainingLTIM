import java.io.*;
import java.sql.*;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.lang.*;

class Employee{
     String name;
     int age;
     double salary;


    public Employee(String name ,int age ,double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}

class Lambda{
    public static void main(String[] args) {

        List<Employee> listOfEmployees = new ArrayList<>();
        Employee Ravi = new Employee("Ravi", 20, 40000);
        Employee Roghan = new Employee("Roghan", 28, 35000);
        Employee Dhoni = new Employee("Dhoni", 48, 92000);
        Employee Rahul = new Employee("Rahul", 23, 46000);
        Employee Sachin = new Employee("Sachin", 24, 65000);
        Employee Gagan = new Employee("Gagan", 20, 10000);

        listOfEmployees.add(Ravi);
        listOfEmployees.add(Roghan);
        listOfEmployees.add(Dhoni);
        listOfEmployees.add(Rahul);
        listOfEmployees.add(Sachin);
        listOfEmployees.add(Gagan);


        System.out.println("**************************************");
        //Filtering using java stream
        List<Employee> filteredList = listOfEmployees.stream().filter((p->p.salary > 40000))
                                        .collect(Collectors.toList());
        filteredList.forEach(p->System.out.println(p.name +  " " + p.age + " "  + p.salary));

        System.out.println("**************************************");
        List<Double> updatedSalaryList =  listOfEmployees.stream().map(p->p.salary + 5000).collect(Collectors.toList());
        updatedSalaryList.forEach(n->System.out.println(n));
        listOfEmployees.forEach(p->System.out.println(p.name +  " " + p.age + " "  + p.salary));
        
    }
}
