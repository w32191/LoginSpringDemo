package com.example.loginspringdemo.controller;

import com.example.loginspringdemo.javabean.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @Autowired
  private Printer printer;

  @RequestMapping("/test")
  public String test() {
    printer.print("Hello World");
    return "World";
  }

}