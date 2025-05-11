package com.lbh.LambdaDemo;

public class LambdaDemo1 {
    public static void main(String[] args) {
        //目标: 认识Lambda表达式: 搞清楚其基本作用
        //Lambda不能简化全部的匿名内部类，只能简化函数式接口的匿名内部类
        //因此，以下内部类不能使用Lambda函数式来简化
        Animal animal = new Animal() {
            @Override
            public void eat() {
                System.out.println("猫吃鱼");
            }
        };
        animal.eat();
        System.out.println("========================");
//        Swim s = new Swim() {
//            @Override
//            public void swimming() {
//                System.out.println("狗刨");
//            }
//        };
        //上述函数即可用Lambda函数式简化：
        Swim s = () -> {System.out.println("狗刨");};
        s.swimming();
    }
}
abstract class Animal{
    public abstract void eat();
}
//函数式接口: 只有一个抽象方法的接口
@FunctionalInterface //用于声明函数式接口的注释
interface Swim{
    void swimming();
}
