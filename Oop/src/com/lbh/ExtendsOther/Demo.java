package com.lbh.ExtendsOther;

import com.lbh.Extends2Demo.Father;

public class Demo {
    public static void main(String[] args) {
        Father f = new Father();
//        f.show();//报错，private修饰的方法只能在当前类中访问
//        f.show2();//报错，缺省的方法只能在当前类、同一个包的类中访问
//        f.show3();//报错，protected修饰的方法只能在当前类、同一个包的类、子孙类中访问
        f.show4();
    }
}
