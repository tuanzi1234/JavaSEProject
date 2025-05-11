package com.lbh.polymorphsm3;

public class Wolf extends Animal {
    String name = "狼";

    @Override
    public void eat(){
        System.out.println("狼吃肉");
    }

    public void cry(){
        System.out.println("呜呜叫");
    }
}
