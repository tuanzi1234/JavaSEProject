package com.lbh.ThisDemo;

public class Student {
    String name;
    public void print() {
        //this是一个变量，表示当前对象
        //哪个对象调用方法，this就代表哪个对象
        System.out.println(this);
        System.out.println(this.name);
    }
    public void print1(String name){
        //若对象的成员变量和形参变量重名，会因为就近原则导致冲突，使用this.name表示成员变量可解决问题
        System.out.println(name + "喜欢" + name);
        System.out.println(this.name + "喜欢" + name);
    }
}
