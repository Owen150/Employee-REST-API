package com.employee.EmployeeMS.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Employee {
    private String name;
    private Long age;
    private String location;
    private String email;
    private String department;
}
