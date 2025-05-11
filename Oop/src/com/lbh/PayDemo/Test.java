package com.lbh.PayDemo;

import java.util.Scanner;

public class Test {
    //加油站卡片支付小程序
    //1.创建卡片类，以便继续创建金卡，银卡对象，封装车主数据
    //2.创建父类Card，定义金卡银卡的属性方法
    //3.创建子类GoldCard，继承父类Card，定义特权方法,金卡重写消费方法，八折优惠，打印洗车票
    //4.创建子类SilverCard，继承父类Card，定义特权方法,银卡重写消费方法，九折优惠

    public static void main(String[] args) {
        //5.创建金卡(余额5000以上)、银卡对象（余额2000以上），处理金卡、银卡的业务逻辑
        GoldCard goldCard = new GoldCard("皖A21231", "李宝华", "13812345678", 10000);
        pay(goldCard);
        SilverCard silverCard = new SilverCard("皖A21232", "李宝华", "13812345678", 3000);
        pay(silverCard);

    }
    //创建方法，处理支付业务逻辑
    public static void pay(Card card) {
        //输入金额
        System.out.println("请输入金额：");
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextDouble();
        card.spendMoney(money);
    }
}
