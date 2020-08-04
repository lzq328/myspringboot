package cn.china.myspringboot.serviceimpl;

import cn.china.myspringboot.entity.Student;
import cn.china.myspringboot.mapper.StudentMapper;
import cn.china.myspringboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper sm;

    @Override
    public int insert(Student student) {
        return sm.insert(student);
    }

    @Override
    public Student selectByName(String name) {
        return sm.selectByName(name);
    }

    @Override
    public Student selectByNameAndAge(String name, Integer age) {
        return sm.selectByNameAndAge(name, age);
    }

    @Override
    public Student selectByNameAndGender(Map map) {
        return sm.selectByNameAndGender(map);
    }

    @Override
    public int insertList(List list) {
        return sm.insertList(list);
    }
}
