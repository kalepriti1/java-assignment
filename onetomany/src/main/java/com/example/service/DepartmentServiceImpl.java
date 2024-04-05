package com.example.service;


import com.example.entity.Department;
import com.example.entity.Employee;
import com.example.repositry.DepartmentRepositry;
import com.example.repositry.EmployeeRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    DepartmentRepositry departmentRepositry;
    @Autowired
    EmployeeRepositry employeeRepositry;

    @Override
    public Department addDepartemnt(Department department) {
        Department department1 = departmentRepositry.save(department);
        List<Employee> employees = department1.getEmployees();
        for(Employee employee : employees){
            employee.setDepartment(department1);
            employeeRepositry.save(employee);
        }
        return department;
    }

    @Override
    public List<Department> getAllEmployee() {
        return departmentRepositry.findAll();
    }
}
