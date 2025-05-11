package com.lbh.polymorphsm3;

public class Dog extends Animal {
    String name = "旺财";
    @Override
    public void eat() {
        System.out.println("狗吃shit");
    }

    public void tail(){
        System.out.println("尾巴上竖");
    }
}
