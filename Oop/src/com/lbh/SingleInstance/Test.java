package com.lbh.SingleInstance;

public class Test {
    public static void main(String[] args) {
      //设计单例类
        A a1 = A.getInstance();
        A a2 = A.getInstance();
        System.out.println(a1 == a2);//true，说明a和b是同一个对象
        System.out.println("------------------------------");
        B b1 = B.getInstance();
        B b2 = B.getInstance();
        System.out.println(b1 == b2);//true，说明a和b是同一个对象
    }
}
