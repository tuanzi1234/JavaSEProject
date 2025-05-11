package com.lbh.polymorphsm1;

public class Wolf extends Animal {
    String name = "狼";

    @Override
    public void eat(){
        System.out.println("狼吃肉");
    }
}
