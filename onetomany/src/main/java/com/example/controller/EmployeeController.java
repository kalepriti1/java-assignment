package com.example.controller;


import com.example.entity.Employee;
import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/add")
    public ResponseEntity<Employee> addDepartament(@RequestBody Employee employee){
        return new ResponseEntity<>(employeeService.addEmployeee(employee), HttpStatus.OK);
    }
    @GetMapping("/welcome")
    public String welcome(){
        return "Emp Welcome";
    }
    @GetMapping("/demo")
    public String demo(){
        return null;
    }
}
