package com.lbh.InterfaceDemo3;

public class Test {
    public static void main(String[] args) {
        // 了解JDK8后接口新增的三种方法，并理解
        A a = new AImpl();
        a.eat();
        A.play();
    }
}
//使用实现接口类的方法调用接口中的默认方法
class AImpl implements A {

}
