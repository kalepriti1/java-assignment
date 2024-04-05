package com.example.controller;

import com.example.entity.Department;
import com.example.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/dept")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @PostMapping("/add")
    public ResponseEntity<Department> addDepartament(@RequestBody Department department){
        return new ResponseEntity<>(departmentService.addDepartemnt(department), HttpStatus.OK);
    }
    @GetMapping("/welcome")
    public String welcome(){
        return "Dept Welcome";
    }
    @GetMapping("/demo")
    public String demo(){
        return null;
    }

}
