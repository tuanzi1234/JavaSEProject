package com.lbh.hello.demo;

public class CardDemo {
    public static void main(String[] args) {
    //完成存储54张扑克牌，并洗牌的操作
        card();
    }
    //定义方法，存储54张扑克牌
    public static void card() {
        //1、定义一个数组，用来存储54张扑克牌
        String[] cards = new String[54];
        //2、定义一个数组，用来存储54张扑克牌的花色
        String[] colors = {"♠", "♥", "♣", "♦"};
        //3、定义一个数组，用来存储54张扑克牌的数字
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        //4、遍历点数
        int index = 0;//初始化索引，用来存储扑克牌的索引位置
        for (int i = 0; i < numbers.length; i++) {
            //5、遍历花色
            for (int j = 0; j < colors.length; j++) {
                //6、将花色和点数拼接成一张扑克牌
                cards[index++] = colors[j] + numbers[i];
            }
        }
        //7、将大小王存入数组
        cards[index++] = "SmallJoker";
        cards[index] = "BigJoker";
        //8、遍历数组，打印54张扑克牌
        System.out.println("新牌为：");
        for (int i = 0; i < cards.length; i++) {
            System.out.print(cards[i] + "\t");
        }
        System.out.println();
        //9、洗牌：打乱54张扑克牌
        for (int i = 0; i < cards.length; i++) {
            //随机生成一个索引，用来交换数组中的元素
            int index1 = (int)(Math.random() * cards.length);
            //随机生成另一个索引，用来交换数组中的元素
            int index2 = (int)(Math.random() * cards.length);
            //交换数组中的元素
            //交换的方法：
            //1、定义一个临时变量，用来存储数组中的元素
            String temp = cards[index1];
            //2、将index2中的元素赋值给index1
            cards[index1] = cards[index2];
            //3、将temp中的元素赋值给index2，完成交换
            cards[index2] = temp;
        }
        //打印洗牌后的54张扑克牌
        System.out.println("洗牌后的牌为：");
        for (int i = 0; i < cards.length; i++) {
            System.out.print(cards[i] + "\t");
        }
    }
}
