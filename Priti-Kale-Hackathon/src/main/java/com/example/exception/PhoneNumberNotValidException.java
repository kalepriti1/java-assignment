package com.example.exception;

public class PhoneNumberNotValidException extends RuntimeException {
    public PhoneNumberNotValidException(String message) {
        super(message);
    }
}
