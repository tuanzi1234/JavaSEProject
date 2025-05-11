package com.lbh.hello.demo;

public class ValidCodeDemo {
    public static void main(String[] args) {
        //开发随机生成验证码的demo
        //1.调用getCode方法，传入参数4和6，生成4位验证码和6位验证码
        System.out.println(getCode(4));
        System.out.println(getCode(6));
    }
    //2.定义方法，生成验证码
    public static String getCode(int n) {
        //3.定义字符串变量code，用来保存生成的验证码
        String code ="";
        //4.定义for循环，循环n次，每次生成一个随机字符
        for (int i = 0; i < n; i++) {
            //5.随机生成包含数字和大小写字母的验证码
            int type = (int)(Math.random() * 3);//随机生成0,1,2，代表三种验证码（数字、大写字母、小写字母）
            switch (type) {
                case 0:
                    //随机生成0~9的数字
                    code += (int)(Math.random() * 10);
                    break;
                case 1:
                    //随机生成A~Z的大写字母
                    char ch = (char)(Math.random() * 26 + 65);
                    code += ch;
                    break;
                case 2:
                    //随机生成a~z的小写字母
                    char ch1 = (char)(Math.random() * 26 + 97);
                    code += ch1;
                    break;
            }

        }
        return code;
    }

}
