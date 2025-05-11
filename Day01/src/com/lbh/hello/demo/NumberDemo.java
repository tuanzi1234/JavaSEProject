package com.lbh.hello.demo;

import java.util.Scanner;

public class NumberDemo {
    //实现输入两个数，查询两个数之间的素数
    public static void main(String[] args) {
        //定义一个变量，用来接收用户输入的两个数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数：");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        isPrime(num1, num2);
    }
    //接收输入的两个数，并判断两个数之间是否存在素数，有就输出具体的数字，没有就提示“不存在素数”
    public static void isPrime(int num1, int num2) {
        boolean flag = false;
        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (checkPrime(i)) {
                System.out.println(i);
                flag = true;
                count++;
            }
        }
        System.out.println("素数个数为" + count);
        if (!flag) {
            System.out.println(start + "和" + end + "之间不存在素数");
        }
    }
    //判断一个数是否为素数
    public static boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {//若 num 有因数，必存在一个因数 ≤ 其平方根。
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
