package com.lbh.StaticDemo;

public class Test2 {
    public static void main(String[] args) {
        //  静态方法
        new User();
        new User();
        new User();
        System.out.println(User.count);
    }

}
