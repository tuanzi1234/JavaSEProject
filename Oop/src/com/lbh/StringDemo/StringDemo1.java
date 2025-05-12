package com.lbh.StringDemo;

public class StringDemo1 {
    public static void main(String[] args) {
        //认识创建字符串对象，封装要处理的字符串数据，用String的方法处理字符串
        // 1.方式一：直接使用""创建字符串对象，封装字符串数据
        String str1 = "HelloWorld";
        System.out.println(str1);
        System.out.println(str1.length());
        System.out.println("======================");
        // 2.方式二：使用new关键字创建字符串对象，封装字符串数据
        String str = new String();//不推荐
        System.out.println(str);//""空字符串
        System.out.println(str.length());
        String str2 = new String("HelloWorld");//不推荐
        System.out.println(str2);
        System.out.println(str2.length());
        System.out.println("======================");
        //只有""给出的字符串对象放在字符串常量池，相同内容只放一个
        String str3 = "HelloWorld";
        String str4 = "HelloWorld";
        System.out.println(str3 == str4);
        String str5 = new String("HelloWorld");
        String str6 = new String("HelloWorld");
        System.out.println(str5 == str6);
        //字符串比较应当使用equals方法，不要使用==，==默认比较两个字符的地址
        System.out.println(str5.equals(str6));
    }
}
