package cn.china.myspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import javax.sql.DataSource;

//位于cn.china.myspringboot包下面的启动类,会自动扫描cn.china.myspringboot包下的所有注解
//@ComponentScan("controller")当把controller包不放在cn.china.myspringboot包下时,使用此注解来扫描controller包下面的注解
//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)//没有设置数据库时,设置这个,不自动寻找数据库
@SpringBootApplication()
@MapperScan("cn.china.myspringboot.mapper")
public class MyspringbootApplication {

    public static void main(String[] args) {

        SpringApplication.run(MyspringbootApplication.class, args);
    }

}
