package com.lbh.ExtendsSoverride;

public class Test {
    public static void main(String[] args) {
        // 认识方法重写
        Cat cat = new Cat();
        cat.cry();
    }

    //当一个类并没有嵌套在其他类中时，不需要加static修饰符
    static class Cat extends Animal {
        // 方法重写：方法名称、形参、修饰符都要和父类保持一致
        // 重写的规范：声明不变，重新实现
        @Override// Override注解，方法重写的校验注解，表示重写父类的方法，作用是在进行方法重写时，强行要求重写的方法和父类一致，否则报错
        public void cry() {
            System.out.println("喵喵喵");
        }
    }

    static class Animal {
        public void cry() {
            System.out.println("Animal cry~~~");
        }
    }
}

