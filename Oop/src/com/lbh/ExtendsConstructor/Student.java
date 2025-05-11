package com.lbh.ExtendsConstructor;

public class Student {
    private String name;
    private int age;
    private String sex;
    private String school;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", school='" + school + '\'' +
                '}';
    }
    //this调用兄弟构造器
    public Student(String name, int age, String sex) {
        //this() super()必须写在构造器第一行，且二者不能同时出现
        this(name, age, sex, "清华");
    }

    public Student(String name, int age, String sex, String school) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.school = school;
    }

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
