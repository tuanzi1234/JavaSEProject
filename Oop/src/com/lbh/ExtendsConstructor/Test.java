package com.lbh.ExtendsConstructor;



public class Test {
    // 目标：认识子类构造器，再看应用场景
    public static void main(String[] args) {
        // 1、子类构造器可以调用父类构造器
        //执行过程：子类构造器必须先调用父类无参构造器，再调用子类无参构造器
        Son son = new Son();
    }
}
class Father {
    public Father()
    {
        System.out.println("父类无参构造器");
    }
}

class Son extends Father {
    public Son()
    {
        // 2、子类构造器可以调用父类构造器
        System.out.println("子类无参构造器");
    }
}