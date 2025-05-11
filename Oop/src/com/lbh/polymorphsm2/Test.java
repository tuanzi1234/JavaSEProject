package com.lbh.polymorphsm2;

public class Test {
    public static void main(String[] args) {
        //认识多态的作用
        //1、多态好处1：右边的对象时解耦合的
        Animal animal = new Dog();
        animal.eat();
        //animal.doThings();//报错，多态下不能调用子类特有方法
        //只需更换右边对象即可，无需继续修改下面的父类方法
        Animal animal1 = new Wolf();
        animal1.eat();
        //多态好处2：父类类型的变量做参数，可以接收一个子类对象
        Wolf  wolf = new Wolf();
        eat(wolf);

        Dog dog = new Dog();
        eat(dog);
    }
    public static void eat(Animal animal){
        System.out.println("---------");
        animal.eat();
    }
}
