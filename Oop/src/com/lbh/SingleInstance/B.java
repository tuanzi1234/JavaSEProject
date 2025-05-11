package com.lbh.SingleInstance;

public class B {
    //懒汉式单例
    // 2.私有化静态变量
    private static B b;
    //1.私有化构造信息
    private B() {
    }
    //3.提供公共的静态方法，返回实例，需要创建对象时才开始创建对象
    public static B getInstance() {
        if (b == null) {
            //第一次拿对象时，创建对象
            b = new B();
        }
        return b;
    }
}
