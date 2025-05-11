package com.lbh.ExtendsConstructor;

public class Teacher extends People {
    private String skill;
    public Teacher() {

    }

    public Teacher(String name, int age, String sex, String skill) {
        //子类构造器调用父类构造器的应用场景
        //可以把子类继承自父类的数据也完成初始化赋值
        super( "李老师", 18, "男" );
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
