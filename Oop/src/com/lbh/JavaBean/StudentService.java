package com.lbh.JavaBean;

public class StudentService {
    //service用来处理业务逻辑
    //拿到需要处理的学生对象
    private Student student;
    public StudentService(Student student) {
        this.student = student;
    }
    public void printTotalScore() {
        System.out.println(student.getName() + "的总成绩为：" + (student.getChinese() + student.getMath()));
    }

    public void printAverageScore() {
        System.out.println(student.getName() + "的平均成绩为：" + (student.getChinese() + student.getMath()) / 2);
    }


}
