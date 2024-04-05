package com.example.exception;

public class PhoneNumberNotNull extends RuntimeException{
    public PhoneNumberNotNull(String message) {
        super(message);
    }
}
