package cn.china.myspringboot.mapper;

import cn.china.myspringboot.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface StudentMapper {
    int insert(Student student);

    Student selectByName(String name);

    //只在mapper中的方法参数前加@Param
    Student selectByNameAndAge(@Param("name") String name, @Param("age") Integer age);

    Student selectByNameAndGender(Map map);

    int insertList(List list);
}
