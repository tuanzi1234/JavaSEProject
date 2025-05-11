package com.lbh.constructor;

public class Test {
    public static void main(String[] args) {
        // 认识构造器及其常见应用场景
        //创建对象时，会自动调用构造器，具体调用什么构造器根据括号里面的参数来决定
        Student s1 = new Student();
        Student s2 = new Student("张三", 18);

        // 构造器的应用场景：创建对象时，可以立即为对象的成员变量赋值
        Student s3 = new Student("张三", 18, 100);
        System.out.println(s3.name);
        System.out.println(s3.age);
        System.out.println(s3.score);
    }
}
