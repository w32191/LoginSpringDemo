package com.example.loginspringdemo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class MyInterceptor implements HandlerInterceptor {


  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
      throws Exception {
    System.out.println("MyInterceptor preHandle");
    return false;
  }
}
