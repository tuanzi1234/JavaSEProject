package com.lbh.InterfaceDemo2;

public class Test {
    public static void main(String[] args) {
       // 完成算成绩小案例
        // 1.定义学生类，创建学生对象，封装。学生数据，才能交给别人处理
        // 2.准备学生数据
        Student[] students = new Student[10];
        students[0] = new Student("张三", 100, "男");
        students[1] = new Student("李四", 90, "男");
        students[2] = new Student("王五", 80, "男");
        students[3] = new Student("赵六", 70, "男");
        students[4] = new Student("钱七", 60, "男");
        students[5] = new Student("孙八", 50, "男");
        students[6] = new Student("周九", 40, "男");
        students[7] = new Student("吴九", 30, "男");
        students[8] = new Student("郑十", 20, "男");
        students[9] = new Student("王十一", 10, "男");
        // 3.提供两套方案，支持灵活切换（解耦合）：面向接口编程
        //  定义一个接口（规范思想）：必须完成打印全班学生信息，必须完成计算平均分
        // 定义一套实现类，实现接口：打印学生信息，实现打印平均成绩
        // 定义一套实现类，实现接口，打印学生信息（男女人数），实现打印平均成绩（去掉最高分，去掉最低分）
        //调用方法
        ClassDataInter classDataInter = new ClassDataInterImpl1(students);
        classDataInter.printAllStudentInfo();
        classDataInter.printAllStudentAverageScore();
        System.out.println("=================================");
        classDataInter = new ClassDataInterImpl2(students);
        classDataInter.printAllStudentInfo();
        classDataInter.printAllStudentAverageScore();
    }
}
