package com.lbh.InnerClass2;

// 外部类
public class Outer {
    public static String name = "Outer";
    public void show1() {
        System.out.println("show1()");
    }
    // 静态内部类：属于外部类本身持有
    public static class Inner {
        public void show() {
            System.out.println("show()");
            System.out.println(name);//静态内部中可以直接方位外部类的静态成员
            //show1();//报错，静态内部类不能访问外部类的实例成员
        }
    }
}
