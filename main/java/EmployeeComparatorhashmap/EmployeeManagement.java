package main.java.EmployeeComparatorhashmap;
import java.io.*;
import java.util.*;
public class EmployeeManagement {
    private Map<Integer, Employee> employeeMap;

    public EmployeeManagement() {
        employeeMap = new HashMap<Integer,Employee>();
    }

    public void addEmployee(Employee employee) {
         employeeMap.put(employee.getEmpID(),employee);
        //  System.out.println(employeeMap);
    }

    public Employee getEmployee(int employeeID) {
        return employeeMap.get(employeeID);
    }

    public List<Employee> getAllEmployeesSortedByName() {
        System.out.println("***********By Name********");
         List<Employee> list = new ArrayList<>(employeeMap.values());
         Collections.sort(list);
         return list;
    }

    // public boolean removeEmployee(int employeeID) {
    //     return employeeMap.remove(employeeID) != null;
    // }
    public List<Employee> getAllEmployeesSortedById() {
        //Comparator
        System.out.println("***********By Id********");
        List<Employee> list = new ArrayList<>(employeeMap.values());
        Employee e = new Employee();
        list.sort(e);
        return list;
    } 
}
