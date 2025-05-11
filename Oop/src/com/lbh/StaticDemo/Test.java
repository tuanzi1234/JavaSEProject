package com.lbh.StaticDemo;

public class Test {

    public static void main(String[] args) {
        //认识static修饰符
        //1.类名.静态变量（推荐）
        Student.name = "张三";
        System.out.println(Student.name);

        //2.对象.静态变量（不推荐）
        Student student = new Student();
        student.name = "李四";

        System.out.println(student.name);

        Student student1 = new Student();
        student1.name = "王五";

        System.out.println(student.name);//王五
        System.out.println(student1.name);//二者输出均为王五，因为静态变量name是类变量，只以最后一个改动的名称为准

        //3.对象名.实例变量
        student.age  = 18;
        student1.age = 12;
        System.out.println(student.age);
        System.out.println(student1.age);//二者输出不同，因为age是实例变量，以对象调用为准
    }
}
