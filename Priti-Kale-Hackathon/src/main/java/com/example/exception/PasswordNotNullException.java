package com.example.exception;

public class PasswordNotNullException extends RuntimeException{
    public PasswordNotNullException(String message) {
        super(message);
    }
}
