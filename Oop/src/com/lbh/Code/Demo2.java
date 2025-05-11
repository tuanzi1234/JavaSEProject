package com.lbh.Code;

public class Demo2 {
    //实例代码块：无static修饰，属于对象，每次创建对象优先执行
    {
        System.out.println("实例代码块");
    }
    public static void main(String[] args) {
        System.out.println("main方法代码块");//若无对象，实例代码块不执行
        new Demo2();
        new Demo2();
        new Demo2();//new几次对象，实例代码块紧跟着执行几次
    }
}
