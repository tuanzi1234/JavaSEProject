package com.lbh.capsulation;

public class Student {
    //封装的要求：合理隐藏，合理暴露
    //1.隐藏的方法：使用private（私有）修饰成员变量，禁止外部访问，只能在本类中访问
    private String name;
    private int age;
    private double chinese;
    private double math;

    //2.暴露的方法(合理暴露)：使用public（公共）修饰的getter/setter方法暴露
    public void setName(String name) {//为名字设置值
        this.name = name;
    }

    public String getName() {//获取名字
        return name;
    }


    public void setAge(int age) {
        //为年龄设置值
        if (age < 0 || age > 120) {
            System.out.println("年龄不合法");
        }else{
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void printScore() {
        System.out.println(name + "的语文成绩为：" + chinese
                + "\n数学成绩为：" + math
                + "\n总成绩为：" + (chinese + math)
                + "\n平均成绩为：" + (chinese + math) / 2);
    }

}
