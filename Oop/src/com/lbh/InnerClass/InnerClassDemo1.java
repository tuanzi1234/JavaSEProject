package com.lbh.InnerClass;

public class InnerClassDemo1 {
    public static void main(String[] args) {
       //认识内部类
        //成员内部类创建对象的格式：
        // 外部类名称.内部类名称 对象名 = new 外部类名称.new 内部类名称();
        Outer.Inner inner = new Outer().new Inner();
        inner.setName2("张三");
        inner.show();
        //成员内部类访问外部类成员的特点:
        //1.成员内部类可以访问外部类的静态成员, 也可以访问外部类的实例成员
        //2.成员内部类的实例方法中，可以直接拿到当前寄生的外部类对象：外部类名称.this
        System.out.println("================================");
        People.Heart heart = new People().new Heart();
        heart.beat();
    }

}
class People{
    private int HeartBeat = 100;
    public class Heart{
        private int heartRate = 60;
        public void beat(){
            int heartRate = 80;
            //输出80
            System.out.println(heartRate);
            //输出60
            System.out.println(this.heartRate);
            //输出100
            System.out.println(People.this.HeartBeat);
        }
    }
}
