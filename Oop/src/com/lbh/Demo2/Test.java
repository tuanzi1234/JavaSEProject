package com.lbh.Demo2;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //目标：面向对象实现家居控制系统
        //角色：设备（吊灯、电视机、洗衣机......）
        //具备功能：开、关
        //控制系统，控制设备的开和关
        //1.定义设备类,代表家里的设备
        //2.准备设备对象，放到数组中，代表家电设备
        JD[] jds = new JD[4];
        jds[0] = new TV("电视机",true);
        jds[1] = new WashMachine("洗衣机",false);
        jds[2] = new Lamp("吊灯",false);
        jds[3] = new Air("空调",true);
        //3.接口控制设备开关
        //4.创建控制开关的类，控制设备开关
        Control control = Control.getControl();
        //5.控制电视机
        //control.press(jds[0]);
        //6.控制台操作 a.展示全部设备当前的情况，b.让用户选择操作
        //打印所有色被开关的现状
        while (true) {
            Control.printAllStatus(jds);
            //7.让用户选择操作
            System.out.println("请选择要控制的设备:");
            Scanner scanner = new Scanner(System.in);
            int index = scanner.nextInt();
            switch (index) {
                case 1:
                    control.press(jds[0]);
                    break;
                case 2:
                    control.press(jds[1]);
                    break;
                case 3:
                    control.press(jds[2]);
                    break;
                case 4:
                    control.press(jds[3]);
                    break;
                case 0:
                    System.out.println("退出");
                    return;
                default:
                    System.out.println("输入错误");
                    break;
            }
        }
    }
}
