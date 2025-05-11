package com.lbh.InnerClass3;

public class Test {
    public static void main(String[] args) {
        // 认识匿名内部类
        //匿名内部类有名字：外部类$编号.class
        //匿名内部类本质上是一个子类，同时会立即构建一个子类对象
        Animal animal = new Animal() {
            @Override
            public void eat() {
                System.out.println("猫吃鱼");
            }
        };
        animal.eat();
    }
}
