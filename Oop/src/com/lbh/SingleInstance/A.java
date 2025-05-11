package com.lbh.SingleInstance;

public class A {
    //设计单例设计模式:饿汉式
    //2.创建一个静态的成员变量，用于保存本类的唯一对象
    //public static final A a = new A();//防止a的值被修改，使用final修饰符
    //或者私有化成员变量，
    private static A a = new A();


    // 1.构造方法私有化:确保单例类对外不创建太多对象
    private A() {
    }
    //当私有化成员变量后，创建一个静态方法，返回本类的唯一对象
    public static A getInstance() {
        return a;
    }
}
