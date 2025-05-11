package com.lbh.StaticMethod;

public class Student {
    private double  score;

    //静态方法,有static修饰，属于类持有
    public static void printHelloWorld() {
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
    }

    //实例方法，无static修饰，属于对象持有
    public void printScore() {
        System.out.println(score >  60 ? "通过" : "未通过");
    }
    public double setScore(double score){
        this.score = score;
        return score;
    }

}
