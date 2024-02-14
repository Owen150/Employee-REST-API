package com.employee.EmployeeMS.service;

import com.employee.EmployeeMS.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImplementation implements EmployeeService{
    private static List<Employee> employeeList = new ArrayList<>();

    static {
        Employee e = new Employee();
        e.setName("Michael");
        e.setAge(27L);
        e.setEmail("mike@xyz");
        e.setLocation("Nairobi");
        e.setDepartment("IT");
        employeeList.add(e);

        Employee y = new Employee();
        y.setName("Owen");
        y.setAge(77L);
        y.setEmail("owen@xyz");
        y.setLocation("Kenya");
        y.setDepartment("IT");
        employeeList.add(y);
    }

    @Override
    public List<Employee> getEmployees() {
        return employeeList;
    }
}
