package com.lbh.InterfaceDemo4;

public class Test {
    // 理解接口的几条注意事项
// 3.一个类继承了父类，又同时实现了接口，如果父类中和接口中有同名默认方法，实现类会优先使用父类
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.show();//使用的是父类Animal的show方法
        dog.go();//此时使用的是接口A2的show方法
    }
}
// 1.接口与接口可以多继承，一个接口可以同时继承多个接口[重点]
// 类与类：单继承，一个类只能继承一个父类
// 类与接口：多继承，一个类可以同时实现多个接口
// 接口与接口：多继承，一个接口可以同时继承多个接口
interface A {
    void eat();
}
interface B {
    void show();
}
interface C extends A,B {
    void play();
}
class D implements C {
    @Override
    public void play() {
    }
    @Override
    public void eat() {
    }
    @Override
    public void show() {
    }
}
// 2.一个接口可以继承多个接口，如果多个接口中存在方法签名冲突，此时不支持多继承，不支持多实现
interface A1{
    void eat1();
}
interface B1{
    // String eat1();//签名冲突,报错
    void eat1();
}
interface C1 extends A1,B1{

}
// 3.一个类继承了父类，又同时实现了接口，如果父类中和接口中有同名默认方法，实现类会优先使用父类
interface A2{
    default void show(){
        System.out.println("A2 show");
    }
}
class Animal{
    public void show(){
        System.out.println("Animal show");
    }
}
class Dog extends Animal implements A2{
    //若要强行使用A2接口的方法，则需要在写一个方法来中转
    public void go(){
        A2.super.show();
    }
}
// 4.一个类实现了多个接口，如果多个接口中存在同名的默认方法，可以不冲突，这个类重写该方法即可
interface A3{
    default void show(){
        System.out.println("A3 show");
    }
}
interface B3{
    default void show(){
        System.out.println("B3 show");
    }
}
class C3 implements A3,B3{
    @Override
    public void show() {
        A3.super.show();//若不重写方法，则报错，若需要使用接口的方法，则需要重写方法，并在方法中使用super关键字
        B3.super.show();
    }
}