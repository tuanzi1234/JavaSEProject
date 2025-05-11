package com.lbh.polymorphsm1;

public class Dog extends Animal {
    String name = "旺财";
    @Override
    public void eat()
    {
        System.out.println("狗吃shit");
    }
}
