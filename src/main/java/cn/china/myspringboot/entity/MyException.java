package cn.china.myspringboot.entity;

//自定义异常
public class MyException extends Exception {
    private String msg;
    public MyException(){

    }
    public MyException(String msg){
        //继承的父类是明确的类,构造方法要super
        super(msg);
        this.msg = msg;
    }
}
