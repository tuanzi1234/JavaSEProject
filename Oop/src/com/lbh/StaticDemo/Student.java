package com.lbh.StaticDemo;

public class Student {
    // 静态变量：由static修饰，属于类，只加载一份，所有对象共享
    static String name;
    //  实例变量：无static修饰，属于对象，每个对象有自己一份
    int age;
}
