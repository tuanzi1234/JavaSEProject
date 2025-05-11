package com.lbh.Extends2Demo;

public class Father {
    // 1. private：只能在当前类中访问
    private void show() {
        System.out.println("父类中的show方法");
    }

    // 2. default：只能在当前类、同一个包的类中访问
    void show2() {
        System.out.println("父类中的show2方法");
    }

    // 3. protected：只能在当前类、同一个包的类、子类中访问
    protected void show3() {
        System.out.println("父类中的show3方法");
    }

    // 4. public：在任何类中访问
    public void show4() {
        System.out.println("父类中的show4方法");
    }

    public static void main(String[] args) {
        Father f = new Father();
        f.show();
        f.show2();
        f.show3();
        f.show4();
    }

}
