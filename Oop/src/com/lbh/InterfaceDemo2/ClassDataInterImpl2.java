package com.lbh.InterfaceDemo2;

public class ClassDataInterImpl2 implements ClassDataInter{
    private Student[] students;//记住全班的学生信息
    public ClassDataInterImpl2(Student[] students) {
        this.students = students;
    }
//    实现接口，打印学生信息（男女人数），实现打印平均成绩（去掉最高分，去掉最低分）
    @Override
    public void printAllStudentInfo() {
        System.out.println("全班学生信息为：");
        int num = 0;
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            System.out.println("姓名："+student.getName());
            System.out.println("性别："+student.getSex());
            System.out.println("成绩："+student.getScore());
            System.out.println();
            if (student.getSex().equals("男")){
                num++;
            }
        }
        System.out.println("男学生人数为："+num);
        System.out.println("女学生人数为："+(students.length-num));
    }

    @Override
    public void printAllStudentAverageScore() {
        System.out.println("全班学生平均成绩为：");
        double sum = 0;
        double max = students[0].getScore();
        double min = students[0].getScore();
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            if (student.getScore()>max){
                max = student.getScore();
            }
            if (student.getScore()<min){
                min = student.getScore();
            }
            sum += student.getScore();
        }
        System.out.println((sum - max - min) /(students.length-2));

    }
}
