package com.lbh.hello.demo;

public class WhileTest {
    public static void main(String[] args) {
        System.out.println("需要存" + whileTest1() + "年才能翻倍");
        System.out.println("折叠" + whileTest2() + "次可以达到珠穆朗玛峰的高度");

    }
    //银行存了1000元，年利率为1.7%，存了多少年可以翻倍
    public static int whileTest1() {
        int year = 0;
        double rate = 0.017;
        double money = 1000;
        while (money < 2000) {
            money = money * ( 1+ rate );
            year++;
        }
        return year;
    }
    //纸张为0.1mm，折叠多少次可以达到珠穆朗玛峰的高度8848m
    public static int whileTest2() {
        int count = 0;
        double paper = 0.0001;
        double height = 8848;
        while (paper < height) {
            paper *= 2;
            count++;
        }
        return count;
    }
}

