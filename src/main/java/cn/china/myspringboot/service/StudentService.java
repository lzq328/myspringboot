package cn.china.myspringboot.service;

import cn.china.myspringboot.entity.Student;

import java.util.List;
import java.util.Map;

public interface StudentService {
    int insert(Student student);

    Student selectByName(String name);

    Student selectByNameAndAge(String name, Integer age);

    Student selectByNameAndGender(Map map);

    int insertList(List list);
}
