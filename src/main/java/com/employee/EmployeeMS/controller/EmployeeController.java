package com.employee.EmployeeMS.controller;


import com.employee.EmployeeMS.model.Employee;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    @GetMapping("/employees")
    public String getEmployees(){
        return "Displaying the List of Employees";
    }

    @GetMapping("/employees/{id}")
    public String getEmployee(@PathVariable Long id){
        return "Fetching the employee details for the id "+id;
    }

    @PostMapping("/employees")
    public String saveEmployee(@RequestBody Employee employee){
        return "Saving employee details to the database "+employee;
    }

    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee){
        System.out.println("Updating the employee data for the id "+id);
        return employee;
    }

    @DeleteMapping("/employees")
    public String deleteEmployee(@RequestParam Long id){
        return "Deleting employee details for the id "+id;
    }
}
