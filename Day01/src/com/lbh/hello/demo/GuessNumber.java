package com.lbh.hello.demo;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class GuessNumber {
    //完成猜数字小游戏
    public static void main(String[] args) {
        guessNumber();
    }

    private static void guessNumber() {
        //生成一个1-100之间的随机数
        //Math.random()生成一个[0,1)之间的随机数
        //Math.random() * 100生成一个[0,100)之间的随机数
        //(int) (Math.random() * 100) + 1生成一个[1,100]之间的随机数
        int number = (int) (Math.random() * 100) + 1;
        //第二种生成随机数的方法
        //Random random = new Random();
        //int number = random.nextInt(100) + 1;

        // 新增计数器
        int count = 0;
        //接收用户输入的数字
        Scanner sc = new Scanner(System.in);
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        AtomicBoolean inputFlag = new AtomicBoolean(false);
        System.out.println("呐~呐~那边的杂鱼先生，我在1-100之间想了一个数字，你来猜一下吧！如果猜对了，我什么都会听你的哦~");
        while (true) {
            System.out.println("快点猜啊：");
            inputFlag.set(false);
            // 启动定时提醒任务
            ScheduledFuture<?> reminder = scheduler.scheduleAtFixedRate(() -> {
                if (!inputFlag.get()) {
                    System.out.println("杂鱼先生发什么呆呀~为什么不猜数字啊？难道你是害怕了吗，猜呀~菜呀~快猜呀~，快把你的败北宣言说出来~");
                }
            }, 5, 5, TimeUnit.SECONDS);// 每5秒提醒一次
            try {
                int guessNumber = sc.nextInt();//接收用户输入的数字
                inputFlag.set(true);// 标记用户已经输入了数字
                reminder.cancel(true);// 取消定时提醒任务

                count++;  // 计数器加1
                //判断用户输入的数字是否正确
                if (guessNumber == number) {
                    System.out.println("欸？欸？（流汗）（发抖）（惊慌失措） 呜啊~~~~~~~（大哭地逃离）");
                    break;
                } else if (count > 8) {
                    System.out.println("杂鱼先生真笨呢~正确答案是~" + number);
                    break;
                } else if (guessNumber > number) {
                    System.out.println("残念~~，猜的太大了，那边的杂鱼先生，请教教我是怎么猜的吧？");
                    System.out.println("或啦~~，干吧内~~，干吧内~~");
                } else {
                    System.out.println("スカ~~，猜的这么小，那边的小蛆虫先生，还要猜几次才能猜中啊，杂鱼~ 杂鱼~");
                    System.out.println("或啦~~，干吧内~~，干吧内~~");
                }
            } catch (InputMismatchException e) {
                System.out.println("杂鱼先生真是笨呢~ 难道是猜不出来已经胡言乱语了？");
                sc.nextLine();  // 清除无效输入
                inputFlag.set(true);
                reminder.cancel(true);
                continue;  // 跳过本次循环
            }
        }
        //循环结束后关闭进程
        System.exit(0);
    }
}
