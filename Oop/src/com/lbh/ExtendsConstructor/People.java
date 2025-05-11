package com.lbh.ExtendsConstructor;

// 父类
// 继承作用：减少代码复用，提高代码的扩展性
public class People {
    private String name;
    private int age;
    private String sex;
    public People() {
    }

    public People(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
