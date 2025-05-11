package com.lbh.StaticMethod;

public class Test {
    public static void main(String[] args) {
        // 认识static修饰和不用static修饰的区别
        //1.类名.静态方法名(推荐)
        Student.printHelloWorld();

        System.out.println("--------------");

        //2.对象名.静态方法名（不推荐）
        Student s = new Student();
        s.printHelloWorld();

        System.out.println("--------------");

        //3. 对象名.实例方法名（不推荐）
        //若使用Student.setScore(50);则报错
        s.setScore(50);
        s.printScore();


    }
}
