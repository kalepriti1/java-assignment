package com.example.service;

import com.example.entity.Department;
import com.example.entity.Employee;
import com.example.repositry.DepartmentRepositry;
import com.example.repositry.EmployeeRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    DepartmentRepositry departmentRepositry;
    @Autowired
    EmployeeRepositry employeeRepositry;
    @Override
    public Employee addEmployeee(Employee employee) {
        if (departmentRepositry.existsById(employee.getDepartment().getId())){

            Department department = departmentRepositry.findAllById(employee.getDepartment().getId());
            List<Employee> employees = department.getEmployees();
            employees.add(employee);
            department.setEmployees(employees);
            departmentRepositry.save(department);
        }
        return employeeRepositry.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepositry.findAll();
    }
}
