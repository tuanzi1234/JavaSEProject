package com.lbh.hello.demo;

import java.util.Scanner;

public class HealthTest {
    public static void main(String[] args) {
        System.out.println("计算用户的BMI指数");
        //用户身体健康信息
        Scanner sc = new Scanner(System.in);
        //先让用户输入和BMI、BMR的相关信息
        System.out.println("请输入您的身高(m)：");
        double height = sc.nextDouble();
        System.out.println("请输入您的体重(kg)：");
        double weight = sc.nextDouble();

        //接收BMI的值
        double BMI = getBMI(height, weight);
        System.out.println("您的BMI为：" + BMI);
        //最后根据用户的BMI和BMR判断用户是否健康
    }
    //然后根据用户输入的信息计算出用户的BMI
    public static double getBMI(double height, double weight) {
        return weight / (height * height);
    }
}
