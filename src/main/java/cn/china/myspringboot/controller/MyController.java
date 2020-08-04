package cn.china.myspringboot.controller;

import cn.china.myspringboot.entity.Student;
import cn.china.myspringboot.serviceimpl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    StudentServiceImpl ssi;

    @RequestMapping("/my")
    public String hello(){
        return "hello,springboot";
    }

    @RequestMapping(value="/select1",produces = "application/json;charset=utf-8")
    public Student selectByName(@RequestParam String name){
        return ssi.selectByName(name);
    }


}
