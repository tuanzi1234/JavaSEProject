package com.lbh.PayDemo;

public class SilverCard extends Card {
    public SilverCard(String cardId, String name, String phone, double money) {
        super(cardId, name, phone, money);
    }

    //银卡优惠项目：打九折
    public void spendMoney(double money) {
        if(this.getMoney() >= money) {
            System.out.println("当前银卡消费：" + money);
            System.out.println("优惠后的消费" + money * 0.9);
            this.setMoney(this.getMoney() - money * 0.9);
            System.out.println("当前余额：" + this.getMoney());
        }else{
            System.out.println("余额不足");
        }
    }
}
