package com.lbh.AbstractDemo2;

public abstract class Animal {
    //1.模板方法设计模式
    public void write() {
        System.out.println("狼和狗都是动物");
        System.out.println("狼和狗都吃肉");
        //2.模板方法知道子类要写信息，但子类的信息不同，父类定义一个抽象方法
        //具体写什么，由子类去实现
        shout();
    }
    public abstract void shout();

}
