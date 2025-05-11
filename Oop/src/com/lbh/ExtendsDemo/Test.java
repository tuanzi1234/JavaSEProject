package com.lbh.ExtendsDemo;

public class Test {

    public static void main(String[] args) {
        // 子类可以继承父类的非私有成员变量
        // 子类的对象是由子类和父类多张设计图共同创建的，因此子类对象是完整的
        Student student = new Student();
        student.setName("张三");
        student.setAge(18);
        student.setSex("男");
        student.setChinese(90);
        student.setMath(100);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getSex());
        System.out.println(student.getChinese());
        System.out.println(student.getMath());
    }
}
