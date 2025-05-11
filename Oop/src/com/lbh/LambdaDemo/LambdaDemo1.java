package com.lbh.LambdaDemo;

public class LambdaDemo1 {
    public static void main(String[] args) {
        //目标: 认识Lambda表达式: 搞清楚其基本作用
        //Lambda不能简化全部的匿名内部类，只能简化函数时接口的匿名内部类
        Animal animal = new Animal() {
            @Override
            public void eat() {
                System.out.println("猫吃鱼");
            }
        };
        animal.eat();
    }
}
abstract class Animal{
    public abstract void eat();
}
