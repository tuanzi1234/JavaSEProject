package com.lbh.hello.demo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {
        //完成一个简易的计算器
        //接收用户的输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        double num1 = sc.nextDouble();
        System.out.println("请输入第二个数字：");
        double num2 = sc.nextDouble();
        System.out.println("请输入运算符(+ - * /)：");
        String operator = sc.next();
        //调用方法
        double result = calculator(num1, num2, operator);
        //输出结果
        System.out.println("结果为：" + result);

    }
    //完成一个简易的计算器
    public static double calculator(double num1, double num2, String operator) {
        BigDecimal result = new BigDecimal("0");
        BigDecimal b1 = new BigDecimal(Double.toString(num1));
        BigDecimal b2 = new BigDecimal(Double.toString(num2));
        switch (operator) {
            case "+":
                result = b1.add(b2);
                break;
            case "-":
                result = b1.subtract(b2);
                break;
            case "*":
                result = b1.multiply(b2);
                break;
            case "/":
                result = b1.divide(b2, 2, RoundingMode.HALF_UP);
                break;
            default:
                System.out.println("输入有误，请重新输入！");
                break;
        }
        return result.doubleValue();
    }
}
