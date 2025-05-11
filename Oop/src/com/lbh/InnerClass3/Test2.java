package com.lbh.InnerClass3;

public class Test2 {
    public static void main(String[] args) {
        // 内部类的使用形式：可以作为对象参数传输给方法使用。
        // 老师和学生都参加游泳比赛
        Swim s = new Swim() {
            @Override
            public void swim() {
                System.out.println("学生参加游泳比赛");
            }
        };
        joinSwim(s);
        System.out.println("==============================");
        joinSwim(new Swim() {
            @Override
            public void swim() {
                System.out.println("老师参加游泳比赛");
            }
        });//可以不创建对象，直接创建匿名内部类写进方法中。老师游泳和学生游泳等效
    }
    //设计方法，让老师与学生都参加游泳比赛
    public static void joinSwim(Swim s) {
        System.out.println("开始");
        s.swim();
        System.out.println("结束");
    }
}
interface Swim {
    void swim();
}