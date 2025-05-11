package com.lbh.StaticMethod;

public class Test2 {
    //静态变量
    public static int count = 0;
    //静态方法
    public static void printHelloWorld2() {
        System.out.println("HelloWorld");
    }

    //实例变量，属于对象持有
    private String name;
    //实例方法
    public void printName(){

    }

//        1.静态方法可直接访问静态成员，不能直接访问实例成员；
    public static void printHelloWorld(){
        System.out.println(count);
        printHelloWorld2();
        //System.out.println(name);报错，静态方法不能直接访问实例成员
        //printName();报错，静态方法不能直接访问实例成员
    }

//        2.实例方法既可以访问静态成员，也可以访问实例成员；
    public void printHelloWorld3(){
        System.out.println(count);
        printHelloWorld2();
        System.out.println(name);
        printName();
    }

//        3.静态方法不能使用this关键字，实例方法可以使用this关键字；
    public static void printHelloWorld4(){
        //System.out.println(this.count);//报错
    }
    public void printHelloWorld5(){
        System.out.println(this.count);
    }
}
