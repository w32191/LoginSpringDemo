package com.example.loginspringdemo.dao;

import com.example.loginspringdemo.javabean.Student;
import java.util.List;

public interface StudentDao {

  Student getById(Integer studentId);

  String insertStudent(Student student);

  String insertList(List<Student> studentList);

  String deleteById(Integer studentId);

  List<Student> select();

}
