package com.lbh.hello.demo;

import java.util.Scanner;

public class ForTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = sc.nextInt();
        System.out.println("for循环的结果为：" + forTest1(n));
        System.out.println("---------------------------------------");
        System.out.println("for循环的结果为：" + forTest2(n));

    }
    //求1+2+3+...+n的整数和
    public static int forTest1(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    //求1+3+5+...+n的奇数和
    public static int forTest2(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }

}
