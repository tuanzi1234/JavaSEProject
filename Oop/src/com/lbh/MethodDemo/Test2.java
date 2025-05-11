package com.lbh.MethodDemo;

import com.lbh.InnerClass3.Student;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        // 完成数组的排序，理解匿名内部类的用法。
        // 准备一个学生类型数组，存放6个学生对象
        Student[] students = new Student[6];
        students[0] = new Student("张三", 20, 1.75, "男");
        students[1] = new Student("李四", 19, 1.68, "女");
        students[2] = new Student("王五", 18, 1.69, "男");
        students[3] = new Student("赵六", 17, 1.70, "女");
        students[4] = new Student("孙七", 16, 1.71, "男");
        students[5] = new Student("周八", 15, 1.72, "女");

        //按照身高排序
        Student student1  = new Student();
        //Arrays.sort(students, (o1, o2) -> student1.compareByHeight(o1,o2) );
        //上述实例方法，可以使用实例方法引用的方式简化
        //实例方法引用：对象名::实例方法名
        Arrays.sort(students,  student1::compareByHeight);

        //遍历学生对象输出
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            System.out.println(student);
        }
    }

}
