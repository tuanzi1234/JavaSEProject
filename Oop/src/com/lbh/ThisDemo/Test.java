package com.lbh.ThisDemo;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "李宝辉";
        student.print();
        System.out.println(student);

        System.out.println("=============");

        Student student1 = new Student();
        student1.print();
        System.out.println(student1);

        System.out.println("=============");

        Student student2 = new Student();
        student2.name = "张三";
        student2.print1("李四");
    }
}
