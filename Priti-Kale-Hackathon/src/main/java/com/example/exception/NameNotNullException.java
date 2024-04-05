package com.example.exception;

public class NameNotNullException extends RuntimeException{
    public NameNotNullException(String message) {
        super(message);
    }
}
