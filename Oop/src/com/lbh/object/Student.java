package com.lbh.object;

public class Student {
    String name;
    double chinese;
    double math;
    //处理总成绩
    //封装思想：将数据和对数据的处理放在同一个类中
    public void printScore() {
        System.out.println(name + "的语文成绩为：" + chinese
                                + "\n数学成绩为：" + math
                                + "\n总成绩为：" + (chinese + math)
                                + "\n平均成绩为：" + (chinese + math) / 2);
    }
}
