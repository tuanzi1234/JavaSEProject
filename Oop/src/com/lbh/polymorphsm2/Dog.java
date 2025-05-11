package com.lbh.polymorphsm2;

public class Dog extends Animal {
    String name = "旺财";
    @Override
    public void eat() {
        System.out.println("狗吃shit");
    }

    public void doThings(){
        System.out.println("尾巴上竖");
    }
}
