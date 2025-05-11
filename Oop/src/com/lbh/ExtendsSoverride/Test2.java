package com.lbh.ExtendsSoverride;

public class Test2 {
    public static void main(String[] args) {
        //方法重写的应用场景：子类重写Object的toString方法，返回对象内容；
        Student student = new Student( "张三", 18, "男" );
        System.out.println( student );
        //直接输出对象时，默认调用的是Object的toString方法，返回对象的地址
        //输出对象的地址无意义，所以重写toString方法，返回对象的内容

    }
}
class Student {
    private String name;
    private int age;
    private String sex;

    public Student() {

    }
    public Student(String name, int age, String sex) {
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}