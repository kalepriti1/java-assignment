package com.example.controller;

import com.example.entity.Register;
import com.example.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping()
public class RegisterController {
    @Autowired
    RegisterService registerService;
    @GetMapping("/{emialId}")
    public ResponseEntity<Register> findtheAccoutByEmailId(@PathVariable String emailId){
        return new ResponseEntity<>(registerService.findByEmailId(emailId), HttpStatus.OK);
    }
    @PostMapping("/register")
    public  ResponseEntity<String> registerAccount(@RequestBody Register register){
        return new ResponseEntity<>(registerService.registerUser(register),HttpStatus.OK);
    }

}
