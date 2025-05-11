package com.lbh.capsulation;

public class Test {
    //封装思想
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("张三");
        student.setAge(18);
        System.out.println(student.getName());
        System.out.println(student.getAge());
    }
}
