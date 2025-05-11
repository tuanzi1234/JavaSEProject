package com.lbh.AbstractDemo;

public class Test {
    public static void main(String[] args) {
      //认识抽象类的使用场景
        Animal animal = new Dog();
        animal.shout();
        animal = new Cat();
        animal.shout();
    }
}
