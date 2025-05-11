package com.lbh.ExtendsFeature;


public class Test2 {
    // 了解继承就近原则的特点
    public static void main(String[] args) {
        Son son = new Son();
        son.show();
    }
    //当类嵌套在另一个类中时，要加static修饰
    static class Father {
        String name = "FatherName";
        public void show1() {
            System.out.println("爸爸的方法");
        }
    }
    //当类嵌套在另一个类中时，要加static修饰
    static class Son extends Father {
        String name = "SonName";

        public void show1() {
            System.out.println("儿子方法");
        }
        public void show() {
            String name = "showName";
            System.out.println(name);// 打印“showName”,就近原则要求现在方法内部找到name变量，若找不到，则继续往外找
            System.out.println(this.name);// 打印“SonName”,当局部变量与外成员变量重名时，this.name表示成员变量
            System.out.println(super.name);// 打印“FatherName”,若子成员变量和父类中的成员变量重名，则可以使用super.name表示父类成员变量
            show1();// 打印“儿子方法”,就近原则要求现在方法内部找到show1方法，若找不到，则继续往外找
            super.show1();// 打印“爸爸的方法”,若子成员方法与父类中的成员方法重名，则可以使用super.show1()表示父类成员方法
        }
    }
}
