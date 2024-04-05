package com.example.exception;

public class NameNotValidException extends RuntimeException{
    public NameNotValidException(String message) {
        super(message);
    }
}
