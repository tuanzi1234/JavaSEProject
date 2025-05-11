package com.lbh.hello;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("---------------");
        printfHelloWorld();
        System.out.println("---------------");
        printfSum(10,20);
        System.out.println("---------------");
        printfSum("Hello World!", 2);
        System.out.println("---------------");
        printfSum(1);
        System.out.println("---------------");
        printfSum();
        System.out.println("---------------");
        Test();
        SwitchTest();
    }
    //打印三行hello world
    public static void printfHelloWorld() {
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
    }

    //求任意整数和
    public static void printfSum(int a, int b) {

        System.out.println(a + b);
    }

    public static void printfSum(String str, int c) {
        System.out.println(str + c);
    }

    public static void printfSum(int a) {
        a++;
        ++a;
        System.out.println(a);

    }
    public static void printfSum() {
        int a = 1;
        int b = a++;
        int c = ++a;
        System.out.println("a的值为：" + a);
        System.out.println("b的值为：" + b);
        System.out.println("c的值为：" + c);
    }
    public static void Test() {
        int a = 10;
        int b = 20;
        //System.out.println(a > 100 & ++b > 15);//此时布尔值为false，b会自增，为21
        //System.out.println(a > 100 && ++b > 15);//此时布尔值为true，b不会自增，为20
        //System.out.println(a > 100 | ++b > 150);//此时布尔值为false，b会自增，为21
        System.out.println(a > 0 || ++b > 15);//此时布尔值为true，b不会自增，为20
        System.out.println(b);
    }
    public static void SwitchTest() {
        //用户输入性别
        System.out.println("请输入性别：");
        Scanner sc = new Scanner(System.in);
        String sex = sc.next();
        switch (sex) {
            case "男":
                System.out.println("你是一个男性");
                break;
            case "女":
                System.out.println("你是一个女性");
                break;
            default:
                System.out.println("你是人吗？你就摁回车？");
        }

    }
}
