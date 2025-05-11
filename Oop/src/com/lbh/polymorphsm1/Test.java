package com.lbh.polymorphsm1;

public class Test {
    public static void main(String[] args) {
        //认识多态
        //1、对象多态,行为多态
        Animal animal = new Dog();
        animal.eat();//对于方法：编译看左，运行看右
        System.out.println(animal.name);//对于成员变量：编译看左，运行看左
        Animal animal1 = new Wolf();
        animal1.eat();//对于方法：编译看左，运行看右
        System.out.println(animal1.name);//对于成员变量：编译看左，运行看左

    }
}
