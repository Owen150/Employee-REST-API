package com.employee.EmployeeMS.controller;


import com.employee.EmployeeMS.model.Employee;
import com.employee.EmployeeMS.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @Value("${app.name}")
    private String appName;

    @Value("${app.version}")
    private String appVersion;

    @GetMapping("/version")
    public String getAppDetails(){
        return appName+ " - "+appVersion;
    }
    
    //Get All Employees
    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return employeeService.getEmployees();
    }

    //Get Employee by ID
    @GetMapping("/employees/{id}")
    public String getEmployee(@PathVariable Long id){
        return "Fetching the employee details for the id "+id;
    }

    //Add Employee
    @PostMapping("/employees")
    public String saveEmployee(@RequestBody Employee employee){
        return "Saving employee details to the database "+employee;
    }

    //Update Employee by ID
    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee){
        System.out.println("Updating the employee data for the id "+id);
        return employee;
    }

    //Delete Employee by ID
    @DeleteMapping("/employees")
    public String deleteEmployee(@RequestParam Long id){
        return "Deleting employee details for the id "+id;
    }
}
