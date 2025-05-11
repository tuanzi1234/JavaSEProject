package com.lbh.InterfaceDemo2;

public class ClassDataInterImpl1 implements ClassDataInter{
    private Student[] students;//记住全班的学生信息
    public ClassDataInterImpl1(Student[] students) {
        this.students = students;
    }

    @Override
    public void printAllStudentInfo() {
        //打印全班学生信息
        System.out.println("全班学生信息如下：");
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            System.out.println("姓名："+student.getName());
            System.out.println("性别："+student.getSex());
            System.out.println("成绩："+student.getScore());
            System.out.println();
        }
    }

    @Override
    public void printAllStudentAverageScore() {
        //打印全班学生平均成绩
        double sum = 0;
        System.out.println("全班学生平均成绩为：");
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            sum += student.getScore();
        }
        System.out.println(sum/students.length);
    }
}
