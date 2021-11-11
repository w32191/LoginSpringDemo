package com.example.loginspringdemo.controller;

import com.example.loginspringdemo.javabean.Student;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {


  //@RequestMapping(value = "/create", method = RequestMethod.POST)
  @PostMapping("/student")
  public String createStudent(@RequestBody @Valid Student student) {

    return "執行ＳＱＬ insert into";
  }

  @GetMapping("/student/{studentId}")
  public String readStudent(@PathVariable Integer studentId) {

    return "SQL Select from ";
  }

  @PutMapping("/student/{studentId}")
  public String updateStudent(@PathVariable Integer studentId,
      @RequestBody Student student) {

    return "SQL update";
  }

  @DeleteMapping("/student/{studentId}")
  public String deleteStudent(@PathVariable Integer studentId) {

    return "SQL delete";
  }
}
