package com.lbh.ExtendsConstructor;

public class Test2 {
    public static void main(String[] args) {
        //子类构造器调用父类构造器的应用场景
        Teacher teacher = new Teacher( "李老师", 18, "男", "Java");
        System.out.println( teacher.getName());
        System.out.println( teacher.getAge());
        System.out.println( teacher.getSex());
        System.out.println( teacher.getSkill());

    }
}
