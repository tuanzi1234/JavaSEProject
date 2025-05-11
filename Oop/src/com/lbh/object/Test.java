package com.lbh.object;

public class Test {
    public static void main(String[] args) {
        //创建对象
        Person person = new Person();
        person.name = "张三";
        person.age = 18;
        person.sex = "男";
        person.height = 180;
        person.weight = 80.0;
        //访问对象
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.sex);
        System.out.println(person.height);
        System.out.println(person.weight);

        System.out.println("-----------");
        //创建对象2
        Person person2 = new Person();
        person2.name = "李四";
        person2.age = 20;
        person2.height = 170.0;
        person2.weight = 70.0;
        //访问对象
        System.out.println(person2.name);
        System.out.println(person2.age);
        System.out.println(person2.sex);
        System.out.println(person2.height);
    }
}
