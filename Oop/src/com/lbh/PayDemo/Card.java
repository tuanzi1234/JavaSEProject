package com.lbh.PayDemo;

public class Card {
    private String cardId;
    private String name;
    private String phone;
    private double money;

    //存金额的方法
    public void saveMoney(double money){
        this.money += money;
    }
    //取金额的方法
    public void spendMoney(double money) {
        this.money -= money;
    }



    public Card() {
    }

    public Card(String cardId, String name, String phone, double money) {
        this.cardId = cardId;
        this.name = name;
        this.phone = phone;
        this.money = money;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardId='" + cardId + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", money=" + money +
                '}';
    }

}
