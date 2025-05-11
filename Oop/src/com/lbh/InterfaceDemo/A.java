package com.lbh.InterfaceDemo;

public interface A {
    // JDK8前，接口只能定义常量和抽象方法
    // 1.常量，接口中定义的常量默认是public static final修饰的
    //public static final int NUM = 10;
    int NUM2 = 20;
    // 2.抽象方法，接口中定义的方法默认是public abstract修饰的
    //public abstract void eat();
    void eat();
    void show();
}
