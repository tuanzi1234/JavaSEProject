package com.lbh.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //掌握ArrayList的使用
        //创建ArrayList对象
        ArrayList<String> list = new ArrayList<String>();//使用String限制集合中元素的类型
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        System.out.println(list);//打印所有数据
        System.out.println(list.get(0));//打印指定数据
        System.out.println(list.size());//打印集合长度
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //删除数据
        list.remove(0);//删除指定索引的数据
        System.out.println(list);
        list.remove("王五");//删除指定数据
        System.out.println(list);
        //改数据
        list.set(0,"张三");//将指定索引的数据改为指定数据
        System.out.println(list);
    }
}
