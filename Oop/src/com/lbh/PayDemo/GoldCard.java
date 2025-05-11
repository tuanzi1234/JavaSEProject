package com.lbh.PayDemo;

public class GoldCard extends Card {
    public GoldCard(String cardId, String name, String phone, double money) {
        super(cardId, name, phone, money);
    }

    //金卡优惠项目：打八折，消费过200，打印洗车票
    @Override
    public void spendMoney(double money) {
        if(this.getMoney() >= money) {
            System.out.println("当前金卡消费：" + money);
            System.out.println("优惠后的消费" + money * 0.8);
            this.setMoney(this.getMoney() - money * 0.8);
            System.out.println("当前余额：" + this.getMoney());
            if (money * 0.8 >= 200){
                washCar();
            }else {
                System.out.println("消费不足200，没有洗车服务");
            }
        }else{
            System.out.println("余额不足");
        }
    }
    //打印洗车票
    public void washCar() {
        System.out.println("洗车票");
    }
}
