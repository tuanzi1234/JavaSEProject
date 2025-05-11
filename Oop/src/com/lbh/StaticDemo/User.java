package com.lbh.StaticDemo;

public class User {

    public static int count = 0;
    public User(){
        //User.count++;
        //二者等价，同一个类中访问静态变量，可省略类名
        count++;
    }
}
