package com.lbh.StringDemo;

public class StringDemo2 {
    public static void main(String[] args) {
        //生成验证码
        System.out.println(getCode(4));
    }
   //生成验证码的方法
    public static String getCode(int n) {
        //1.生成随机数(要求包含大小写字母加数字)
        //定义一个字符串记住所有的字母数字，然后遍历，随机生成
        String str = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //用code字符串保存生成的验证码
        String code = "";
        //用for循环n次，每次生成一个随机字符
        for (int i = 0; i < n; i++) {
            //随机一个索引，用索引获取字符
            int index = (int)(Math.random() * str.length());
            //根据索引获取到的字符，拼接成字符串
            code += str.charAt(index);
        }
        return code;
    }

}
