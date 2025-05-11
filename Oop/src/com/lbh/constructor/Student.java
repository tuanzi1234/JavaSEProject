package com.lbh.constructor;

public class Student {
    String name;
    int age;
    int score;
    //1.无参构造器
    //构造器：特殊的方法，不写返回值，方法名必须与类名相同
    public Student() {
        System.out.println("-----无参构造器执行了----");

    }
    //2.有参构造器
    public Student(String name, int age) {
        System.out.println("-----有参构造器执行了----");
    }
    public Student(String n, int a, int s) {
        name = n;
        age = a;
        score = s;
    }
}
