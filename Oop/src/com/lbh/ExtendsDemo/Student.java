package com.lbh.ExtendsDemo;
// 子类
public class Student extends People {//儿子在前，父亲在后
    private double chinese;
    private double math;

    public double getChinese() {
        return chinese;
    }

    public void setChinese(double chinese) {
        this.chinese = chinese;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }
}
