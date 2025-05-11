package com.lbh.AbstractDemo2;

import com.lbh.AbstractDemo.Cat;

public class Test {
    public static void main(String[] args) {
        // 理解抽象类的使用场景，模板方法设计模式
        // 写一个关于狼和狗的介绍
        //     第一段说狼和狗都是动物
        //     第二段说呜呜叫，狗汪汪叫
        //     第三段说狼和狗都是吃肉的
        Dog dog = new Dog();
        dog.write();
        System.out.println("------------------");
        Wolf wolf = new Wolf();
        wolf.write();
    }
}
