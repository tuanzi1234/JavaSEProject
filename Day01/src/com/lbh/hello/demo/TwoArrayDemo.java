package com.lbh.hello.demo;

import java.sql.SQLOutput;

public class TwoArrayDemo {
    public static void main(String[] args) {
    //二维数组的定义
        twoArray();
    }
    private static void twoArray(){
        //初始化二维数组存储学生姓名。因为座位不规则，手动定义
        String[][] classroom = new String[][]{
                {"张三","李四","王五","赵六"},
                {"田七","宋八","周九","吴十"},
                {"郑十一","蒋十三","韩十四"},
                {"刘十五","陈十六","杨十七","张十八"},
                {"吴十九","郑二十","冯二十一","蒋二十二","杨二十六"},
                {"韩二十三","刘二十四","陈二十五"},
                {"张二十七","吴二十八","郑二十九","冯三十"}
        };
        //访问二维数组: 数组名[行索引]
        String[] names = classroom[0];
        //遍历二维数组中的一维数组
        for (int i = 0; i < names.length; i++) {
            //遍历二维数组中的一维数组中的元素
            System.out.println(names[i]);
        }
        System.out.println("-------------------");
        //第二种访问：数组名[行索引][列索引]
        System.out.println(classroom[1][1]);

        System.out.println("-------------------");
        //长度访问：数组名.length
        System.out.println(classroom.length);
        System.out.println(classroom[3].length);

        System.out.println("------------------------");
        //遍历整个二维数组
        for (int i = 0; i < classroom.length; i++){
            String[] names1 = classroom[i];
            for (int j = 0; j < names1.length; j++) {
                System.out.print(names1[j] + "\t");
            }
            System.out.println();
        }
        System.out.println("------------------------");
        //另一种遍历方法
        for (int i = 0; i < classroom.length; i++){
            for (int j = 0; j < classroom[i].length; j++) {
                System.out.print(classroom[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
