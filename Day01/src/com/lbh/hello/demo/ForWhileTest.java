package com.lbh.hello.demo;

public class ForWhileTest {
    public static void main(String[] args) {
        forTest1();
        System.out.println("------------------------------");
        forTest2();
    }

    //打印四列五行星星
    public static void forTest1() {
        //打印五行
        for (int i = 1; i <= 5; i++) {
            //打印四列
            for (int j = 1; j <= 4; j++) {
                System.out.print("*");//不换行打印
            }
            System.out.println();//换行打印
        }
    }
    //定义方法,打印99乘法表
    public static void forTest2() {
        //打印行
        //i=1~9
        for (int i = 1; i <= 9; i++) {
            //定义循环打印列
            //j=1~i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "x" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
