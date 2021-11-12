package com.example.loginspringdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @RequestMapping("/test01")
  public String test01() {
    System.out.println("test01 method");
    return "hello test01";
  }

  @RequestMapping("/test02")
  public String test02() {
    System.out.println("test02 method");
    return "hello test02";
  }
}
