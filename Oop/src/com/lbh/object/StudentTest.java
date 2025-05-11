package com.lbh.object;

public class StudentTest {
    public static void main(String[] args) {
        //获取学生数据，操作学生数据
        Student student1 = new Student();
        student1.name = "张三";
        student1.chinese = 90;
        student1.math = 80;
        student1.printScore();

    }
}
