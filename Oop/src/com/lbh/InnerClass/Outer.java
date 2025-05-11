package com.lbh.InnerClass;

//  外部类
public class Outer {

    public static String name = "Outer";
    private int age = 10;
    public void show2() {
        System.out.println("show2()");
    }
    public static void show1() {
        System.out.println("show1()");
    }
    //  成员内部类: 无static修饰，属于外部类的对象持有
    public class Inner {
        private String name2;
        public void show() {
            System.out.println("show()");
            System.out.println(name);//成员内部类可以访问外部类的静态成员
            show1();
            System.out.println(age);//也可以访问外部类的实例成员
            show2();
            System.out.println(name2);
        }

        public String getName2() {
            return name2;
        }

        public void setName2(String name2) {
            this.name2 = name2;
        }
    }


}
