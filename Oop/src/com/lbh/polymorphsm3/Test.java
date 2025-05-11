package com.lbh.polymorphsm3;

public class Test {
    public static void main(String[] args) {
        //认识多态的作用
        //1、多态好处1：右边的对象时解耦合的
        Animal animal = new Dog();
        animal.eat();
        System.out.println("----------------");

        //animal.doThings();//报错，多态下不能调用子类特有方法
        //强制类型转换
        Dog dog2 = (Dog)animal;
        dog2.tail();
        System.out.println("----------------");

        //只需更换右边对象即可，无需继续修改下面的父类方法
        Animal animal1 = new Wolf();
        animal1.eat();

        //多态好处2：父类类型的变量做参数，可以接收一个子类对象
        Wolf wolf = new Wolf();
        eat(wolf);

        Dog dog = new Dog();
        eat(dog);
        System.out.println("----------------");
        //类型转换异常：有继承关系就能强制转换，编译阶段不报错
        //运行时出现类型转换异常：ClassCastException
        //Wolf wolf1 = (Wolf)animal;
        //强行转换前，使用instanceof判断当前对象的真实类型，再进行强转。
        if(animal instanceof Wolf){
            Wolf wolf1 = (Wolf)animal;
            wolf1.cry();
        }else if(animal instanceof Dog){
            Dog dog1 = (Dog)animal;
            dog1.tail();
        }
    }
    public static void eat(Animal animal){
        System.out.println("---------");
        animal.eat();
    }
}
