package com.example.loginspringdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @RequestMapping("/test01")
  public String test01() {

    throw new RuntimeException("test01 Error");

  }

  @RequestMapping("/test02")
  public String test02() {
    throw new IllegalArgumentException("test02 Error");
  }

}
