package com.lbh.InterfaceDemo;



public class Test {
    // 认识接口，搞清楚接口的特点和使用
    public static void main(String[] args) {
        System.out.println(A.NUM2);
        C c = new C();
        c.eat();
        c.play();
        c.show();
    }

}
// C被成为实现类，同时实现多个接口。
// 实现类实现多个接口，必须重写完全部接口的全部抽象方法，否则这个类必须被定义成抽象类
class C implements A,B{
    @Override
    public void eat() {
        System.out.println("吃");
    }
    @Override
    public void show() {
        System.out.println("show");
    }
    @Override
    public void play() {
        System.out.println("play");
    }
}
