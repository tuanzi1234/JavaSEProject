package com.lbh.InnerClass2;



public class InnerClassDemo2 {
    public static void main(String[] args) {
        //理解静态内部类的使用
        //静态内部类创建对象的格式：
        // 外部类名称.内部类名称 静态对象名 = new 外部类名称.内部类名称();
        Outer.Inner inner = new Outer.Inner();
        inner.show();
        //1. 静态内部中可以直接方位外部类的静态成员
        //2. 静态内部类不能够直接访问外部类的实例成员
    }
}
