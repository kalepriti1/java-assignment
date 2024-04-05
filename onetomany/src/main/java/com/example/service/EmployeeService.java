package com.example.service;

import com.example.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee addEmployeee(Employee employee);
    List<Employee> getAllEmployee();
}
