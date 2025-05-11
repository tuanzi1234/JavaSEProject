package com.lbh.InnerClass3;

public class Student {
    // 学生姓名 年龄 身高 性别
    private String name;
    private int age;
    private double height;
    private String sex;

    public Student(String name) {
    }

    public static int compareByAge(Student o1,Student o2){
        return o1.getAge() - o2.getAge();
    }

    public int compareByHeight(Student o1,Student o2){
        return Double.compare(o1.getHeight(),o2.getHeight());
    }

    public Student() {
    }

    public Student(String name, int age, double height, String sex) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.sex = sex;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", sex='" + sex + '\'' +
                '}';
    }
}
