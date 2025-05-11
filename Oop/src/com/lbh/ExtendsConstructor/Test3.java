package com.lbh.ExtendsConstructor;

public class Test3 {
    //this调用兄弟构造器
    //创建对象，存储学生数据
    public static void main(String[] args) {
        Student student = new Student("张三", 18, "男");
        System.out.println(student);
        Student student2 = new Student("李四", 19, "男", "北大");
        System.out.println(student2);
    }
}
