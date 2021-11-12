package com.example.loginspringdemo.javabean;

import java.sql.ResultSet;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//@ControllerAdvice
public class MyExceptionHandler {

//  @ExceptionHandler(RuntimeException.class)
//  public ResponseEntity<String> handle(RuntimeException runtimeException) {
//
//    return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE)
//        .body("RuntimeException:" + runtimeException.getMessage());
//  }

//  @ExceptionHandler(IllegalArgumentException.class)
//  public ResponseEntity<String> handle02(IllegalArgumentException exception) {
//    return ResponseEntity.status(HttpStatus.BAD_REQUEST)
//        .body("IllegalArgumentException:" + exception.getMessage());
//  }

}
