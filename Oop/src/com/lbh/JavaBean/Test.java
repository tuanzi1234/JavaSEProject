package com.lbh.JavaBean;

public class Test {
    //实体类的应用
    public static void main(String[] args) {
        //实体类的作用：创建它的对象，存取数据（封装数据）
        //使用无参数构造方法创建对象
        Student student = new Student();
        student.setName("张三");
        student.setAge(18);
        student.setChinese(100);
        student.setMath(100);

        //使用有参数构造方法创建对象
        Student student1 = new Student("李四", 18, 80, 80);

        //实体类在开发中的应用场景
        //创建学生的操作对象，专门负责对学生对象进行业务处理
        StudentService studentService = new StudentService(student);//更换括号里的对象，可以实现对任意对象的业务处理
        studentService.printTotalScore();
        studentService.printAverageScore();

    }
}
