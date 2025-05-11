package com.lbh.FinalDemo;

public class Test {
    //3.final修饰静态成员变量
    //final修饰的静态变量，这个变量为常量，可以记住一个固定值，且不能被修改
    //常量的书写规范：全部大写，多个单词之间用下划线链接
    public static final double PI = 3.14;
    //3.final修饰实例变量（无意义）
    public final int age = 10;
    public static void main(String[] args) {
        //认识Final关键字
        //3.final修饰的变量，有且仅能被赋值一次
        /*
        变量的种类：
        1.成员变量：成员变量，在类中声明，在类外初始化，在类外使用
                静态成员变量：static修饰的成员变量
                实例成员变量：非static修饰的成员变量
        2.局部变量：局部变量，在方法中声明，在方法中初始化，在方法中使用
         */
        final int num = 10;
        //num = 20;//报错，
        pay(10);

        final int[] array = {1, 2, 3};
        //array = new int[]{11,22,33};//报错，final修饰的数组，不能被重新赋值
        array[0] = 11;//但是，final修饰的数组中的元素，可以修改
    }
    public static void pay( final double a) {
        //a = 20;//3.报错，final修饰的变量，有且仅能被赋值一次
        System.out.println(a);

    }

}


//1.报错，因为final修饰的类不能被继承
final class A{
}
//class B extends A{
//}

//2.报错，final修饰的方法不能被修改
class C{
    public final void method(){
        System.out.println("C.method");
    }
}
class D extends C{
    //@Override
    //public void method(){
    //    System.out.println("D.method");
    //}
}
