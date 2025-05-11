package com.lbh.hello.demo;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
    //动态初始化数组
        test1();
    }
    //录入8名学生成绩，并计算平均值，最高分，最低分
    public static void test1() {
       //1、动态初始化数组，记录8名学生成绩
        //数组类型[] 数组名 = new 数组类型[数组长度];
        double[] scores = new double[8];
        //2、录入成绩
        //键盘输入8个成绩，存入数组
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i + 1) + "位学生的成绩：");
            scores[i] = sc.nextDouble();
        }
        //3、遍历数组，统计总分，计算平均值，找出最大值，最小值
        double sum = scores[0];
        double max = scores[0];
        double min = scores[0];
        //在数组长度 ≥1 时，第二个元素（i=1）开始遍历，初始化值已包含第一个元素，因此从第二个元素开始遍历可以避免重复计算第一个元素的值。
        for (int i = 1; i < scores.length; i++) {
            sum += scores[i];
            if (scores[i] > max) {
                max = scores[i];
            }
            if (scores[i] < min) {
                min = scores[i];
            }
        }
        double avg = sum / scores.length;
        System.out.println("8名学生的平均分为：" + avg);
        System.out.println("8名学生中的最高分是：" + max);
        System.out.println("8名学生中的最低分为：" + min);
    }
}
