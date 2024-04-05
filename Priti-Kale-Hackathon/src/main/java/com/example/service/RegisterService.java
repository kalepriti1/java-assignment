package com.example.service;

import com.example.entity.Register;

import java.util.Optional;

public interface RegisterService {
    String registerUser(Register register);
    boolean validateUserDetails(Register register);

    Register findByEmailId(String emailId);
}
