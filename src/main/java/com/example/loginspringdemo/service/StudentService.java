package com.example.loginspringdemo.service;

import com.example.loginspringdemo.javabean.Student;
import java.util.List;

public interface StudentService {

  Student getById(Integer studentId);

  String insertStudent(Student student);

  String insertList(List<Student> studentList);

  String deleteById(Integer studwntId);

  List<Student> select();
}
