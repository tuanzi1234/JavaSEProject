package com.lbh.JavaBean;

public class Student {
    //实体类要求：
    //1.属性私有化
    private String name;
    private int age;
    private int chinese;
    private int math;

    //4.但如果要提供了有参构造器，那么一定要提供无参构造器
    public Student() {
    }

    //3.提供有参构造器（可选）
    public Student(String name, int age, int chinese, int math) {
        this.name = name;
        this.age = age;
        this.chinese = chinese;
        this.math = math;
    }


    //2.提供getter和setter方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }
}
