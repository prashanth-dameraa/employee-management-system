package com.company.ems;

import com.company.ems.model.Employee;
import com.company.ems.service.EmployeeService;
import java.util.List;

public class Main {

    public static void main(String[] args) {
       Employee employee1 = new Employee(1L, "John Doe", 50000.0, "Software Engineer", "IT", "2023-01-15", "john.doe@company.com", "123-456-7890", true);
       Employee employee2 = new Employee(2L, "Jane Smith", 60000.0, "Project Manager", "IT", "2022-05-10", "jane.smith@company.com", "098-765-4321", true);
       Employee employee3 = new Employee(3L, "Alice Johnson", 55000.0, "Business Analyst", "IT", "2021-09-20", "alice.johnson@company.com", null, null);
       Employee employee4 = new Employee(3L, "Alice Johnson", 55000.0, "Business Analyst", "IT", "2021-09-20", "alice.johnson@company.com", null, null);
       EmployeeService employeeService = new EmployeeService();
       boolean isAdded1 = employeeService.addEmployee(employee1);
       if(isAdded1){
            System.out.println("Employee added successfully: " + employee1.getId());
       } else {
            System.out.println("Employee already exists or invalid data: " + employee1.getId());
       }
       boolean isAdded2 = employeeService.addEmployee(employee2);
       if(isAdded2){
            System.out.println("Employee added successfully: " + employee2.getId());
       } else {
            System.out.println("Employee already exists or invalid data: " + employee2.getId());
       }
       boolean isAdded3 = employeeService.addEmployee(employee3);
       if(isAdded3){
            System.out.println("Employee added successfully: " + employee3.getId());
       } else {
            System.out.println("Employee already exists or invalid data: " + employee3.getId());
       }
       boolean isAdded4 = employeeService.addEmployee(employee4);
       if(isAdded4){
            System.out.println("Employee added successfully: " + employee4.getId());
       } else {
            System.out.println("Employee already exists or invalid data: " + employee4.getId());
       }
       List<Employee> employees = employeeService.getAllEmployees();
       Employee searchedEmployee  = employeeService.getEmployeeById(2L);
       if(searchedEmployee != null){
            System.out.println("Employee found: " + searchedEmployee);
       } else {
            System.out.println("Employee not found.");
       }
       for(Employee employee : employees){
            System.out.println("Employee: " + employee);
       }
       Employee updatedEmployee = new Employee(2L, "Jane Smith Kumar", 65000.0, "Senior Product Manager", "IT", "2022-05-10", "jane.smith.updated@company.com", "098-765-4321", true);
       System.out.println("Before Employee updated: " + updatedEmployee);
       updatedEmployee = employeeService.updateEmployee(updatedEmployee);
       if(updatedEmployee != null){
            System.out.println("After Employee updated: " + updatedEmployee);
       } else {
            System.out.println("Failed to update employee.");
       }
       Employee deletedEmployee =  employeeService.deleteEmployee(1L);
       if(deletedEmployee != null){
            System.out.println("Deleted Employee" );
       } else {
            System.out.println("Failed to delete employee.");
       }
    }
}