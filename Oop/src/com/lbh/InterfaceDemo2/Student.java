package com.lbh.InterfaceDemo2;

public class Student {
    private String name;
    private double score;
    private String sex;

    public Student() {
    }

    public Student(String name, double score, String sex) {
        this.name = name;
        this.score = score;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
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
                ", score=" + score +
                ", sex='" + sex + '\'' +
                '}';
    }
}
