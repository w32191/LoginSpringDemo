package com.example.loginspringdemo.dao;

import com.example.loginspringdemo.javabean.Student;
import com.example.loginspringdemo.javabean.StudentRowMapper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class StudentDaoImpl implements StudentDao {

  @Autowired
  private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

  @Override
  public Student getById(Integer studentId) {

    String sql = "SELECT id, name FROM student WHERE id = :studentId";
    Map<String, Object> map = new HashMap<>();

    map.put("studentId", studentId);

    //.query 固定返回一個list
    List<Student> list = namedParameterJdbcTemplate.query(sql, map, new StudentRowMapper());

    if (list.size() > 0) {
      return list.get(0);
    } else {
      return null;
    }


  }

  @Override
  public String insertStudent(Student student) {
    String Sql_Insert = "insert into student(name ) values(:studentName)";
    //冒號studentId >> sql動態變數

    Map<String, Object> map = new HashMap<>();
    map.put("studentName", student.getName());
    //接收前端request body參數

    namedParameterJdbcTemplate.update(Sql_Insert, new MapSqlParameterSource(map));

    return "已完成新增：" + student.getName();
  }

  @Override
  public String insertList(List<Student> studentList) {
    String Sql = "insert into student(name) value (:studentName)";
    MapSqlParameterSource[] parameterSources = new MapSqlParameterSource[studentList.size()];

    for (int i = 0; i < studentList.size(); i++) {
      Student student = studentList.get(i);
      parameterSources[i] = new MapSqlParameterSource();
      parameterSources[i].addValue("studentName", student.getName());
    }

    namedParameterJdbcTemplate.batchUpdate(Sql, parameterSources);

    return "已完成整批新增";

  }

  @Override
  public String deleteById(Integer studentId) {
    String Sql_delete = "DELETE FROM student WHERE id = :studentId";
    Map<String, Object> map = new HashMap<>();
    map.put("studentId", studentId);

    namedParameterJdbcTemplate.update(Sql_delete, map);

    return studentId + " delete completed";
  }

  @Override
  public List<Student> select() {
    String sql = "SELECT id, name FROM student";
    Map<String, Object> map = new HashMap<>();

    List<Student> list = namedParameterJdbcTemplate.query(sql, map, new StudentRowMapper());

    return list;
  }


}
