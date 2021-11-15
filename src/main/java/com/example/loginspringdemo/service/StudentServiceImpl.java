package com.example.loginspringdemo.service;

import com.example.loginspringdemo.dao.StudentDao;
import com.example.loginspringdemo.dao.StudentDaoImpl;
import com.example.loginspringdemo.javabean.Student;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentServiceImpl implements StudentService {

  @Autowired
  private StudentDao studentDao;


  @Override
  public Student getById(Integer studentId) {

    return studentDao.getById(studentId);
  }

  @Override
  public String insertStudent(Student student) {
    return studentDao.insertStudent(student);
  }

  @Override
  public String insertList(List<Student> studentList) {
    return studentDao.insertList(studentList);
  }

  @Override
  public String deleteById(Integer studentId) {
    return studentDao.deleteById(studentId);
  }

  @Override
  public List<Student> select() {
    return studentDao.select();
  }


}
