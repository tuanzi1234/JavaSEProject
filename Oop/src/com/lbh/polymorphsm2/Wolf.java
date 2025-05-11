package com.lbh.polymorphsm2;

public class Wolf extends Animal {
    String name = "狼";

    @Override
    public void eat(){
        System.out.println("狼吃肉");
    }

    public void tail(){
        System.out.println("尾巴下摆");
    }
}
