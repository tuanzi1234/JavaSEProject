package com.lbh.InterfaceDemo3;

public interface A {
    //1. 默认方法（普通实例方法）：加default关键字修饰
    //默认会使用public修饰
    //使用实现接口类的方法调用接口中的默认方法
    default void eat(){
        System.out.println("A eat");
        show();
    }
    //2.私有方法（JDK9后支持）
    //私有的实例方法，使用接口中的其他实例方法调用
    private void show(){
        System.out.println("A show");
    }
    //3. 静态方法
    //默认用public修饰
    //使用当前接口名来调用
    static void play(){
        System.out.println("A play");
    }
}
