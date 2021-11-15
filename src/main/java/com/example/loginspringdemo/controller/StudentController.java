package com.example.loginspringdemo.controller;

import com.example.loginspringdemo.javabean.Student;
import com.example.loginspringdemo.service.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

  @Autowired
  private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
  @Autowired
  private StudentService studentService;

  //insert Student Data
  @PostMapping("/students")
  public String insert(@RequestBody Student student) {

    return studentService.insertStudent(student);
  }

  //整批data insert
  @PostMapping("/students/batch")
  public String insertList(@RequestBody List<Student> studentList) {

    return studentService.insertList(studentList);
  }

  //delete
  @DeleteMapping("/students/{studentId}")
  public String delete(@PathVariable Integer studentId) {
    return studentService.deleteById(studentId);
  }

  //select
  @GetMapping("/students/select")
  public List<Student> select() {
    return studentService.select();
  }

  //用ID查student
  @GetMapping("/students/{studentId}")
  public Student selectStudent(@PathVariable Integer studentId) {
    return studentService.getById(studentId);
  }
}
