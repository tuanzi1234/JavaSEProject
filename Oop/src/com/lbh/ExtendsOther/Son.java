package com.lbh.ExtendsOther;

import com.lbh.Extends2Demo.Father;

public class Son extends Father {
    public void son() {
//       show();//报错，private修饰的方法只能在当前类中访问
//       show2();//报错，缺省的方法只能在当前类、同一个包的类中访问
       show3();
       show4();
    }
}
