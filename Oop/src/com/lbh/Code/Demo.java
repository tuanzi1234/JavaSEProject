package com.lbh.Code;

public class Demo {
    public static String name;
    public static void main(String[] args) {
        // 搞清楚代码块的基本作用
        System.out.println("main方法代码块");
    }
    // 静态代码块，由static修饰，属于类，与类一起优先加载，自动执行一次
    static {
        System.out.println("静态代码块");
        name = "张三";//完成对静态资源的初始化，适用于初始化数组，静态成员变量
    }
}
