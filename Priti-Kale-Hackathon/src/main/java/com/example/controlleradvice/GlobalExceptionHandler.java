package com.example.controlleradvice;

import com.example.exception.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(AccountAlreadyExistsException.class)
    public ResponseEntity<ErrorInfo> handleAccountAlreadyExistsException(AccountAlreadyExistsException e){
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setHttpStatus(HttpStatus.BAD_REQUEST);
        errorInfo.setErrorMessage(e.getMessage());
        errorInfo.setLocalDateTime(LocalDateTime.now());
        return new ResponseEntity<>(errorInfo, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(EmailNotValidException.class)
    public ResponseEntity<ErrorInfo> handleEmailNotNullException(EmailNotValidException e){
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setHttpStatus(HttpStatus.BAD_REQUEST);
        errorInfo.setErrorMessage(e.getMessage());
        errorInfo.setLocalDateTime(LocalDateTime.now());
        return new ResponseEntity<>(errorInfo, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(NameNotNullException.class)
    public ResponseEntity<ErrorInfo> handleNameNotNullException(NameNotNullException e){
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setHttpStatus(HttpStatus.BAD_REQUEST);
        errorInfo.setErrorMessage(e.getMessage());
        errorInfo.setLocalDateTime(LocalDateTime.now());
        return new ResponseEntity<>(errorInfo, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(PasswordNotNullException.class)
    public ResponseEntity<ErrorInfo> handlePasswordNotNullException(PasswordNotNullException e){
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setHttpStatus(HttpStatus.BAD_REQUEST);
        errorInfo.setErrorMessage(e.getMessage());
        errorInfo.setLocalDateTime(LocalDateTime.now());
        return new ResponseEntity<>(errorInfo, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(PasswordNotValidException.class)
    public ResponseEntity<ErrorInfo> handlePasswordNotValidException(PasswordNotValidException e){
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setHttpStatus(HttpStatus.BAD_REQUEST);
        errorInfo.setErrorMessage(e.getMessage());
        errorInfo.setLocalDateTime(LocalDateTime.now());
        return new ResponseEntity<>(errorInfo, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(PhoneNumberNotValidException.class)
    public ResponseEntity<ErrorInfo> handlePhoneNumberNotValid(PhoneNumberNotValidException e){
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setHttpStatus(HttpStatus.BAD_REQUEST);
        errorInfo.setErrorMessage(e.getMessage());
        errorInfo.setLocalDateTime(LocalDateTime.now());
        return new ResponseEntity<>(errorInfo, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(PhoneNumberNotNull.class)
    public ResponseEntity<ErrorInfo> handlePhoneNumberNullException(PhoneNumberNotNull e){
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setHttpStatus(HttpStatus.BAD_REQUEST);
        errorInfo.setErrorMessage(e.getMessage());
        errorInfo.setLocalDateTime(LocalDateTime.now());
        return new ResponseEntity<>(errorInfo, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(NameNotValidException.class)
    public ResponseEntity<ErrorInfo> handleNameNOTValid(NameNotValidException e){
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setHttpStatus(HttpStatus.BAD_REQUEST);
        errorInfo.setErrorMessage(e.getMessage());
        errorInfo.setLocalDateTime(LocalDateTime.now());
        return new ResponseEntity<>(errorInfo, HttpStatus.BAD_REQUEST);
    }

}
