package com.lbh.MethodDemo;


import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        // 了解特定类型方法的引用
        // 有一个字符串数组，存了一些人的英文名，请按照首字母升序排列
        String[] names = {"Tom", "Jerry", "Mike", "angle", "lili", "Mary", "Lucy"};
        //把这个数组进行排序：Arrays.sort(names, Comparator);
        //Arrays.sort(names);//默认按照字母的ASCII码升序排列
        //忽略大小写（需要自己制定规则）
//        Arrays.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareToIgnoreCase(o2);//Java提供了compareToIgnoreCase方法来忽略大小写
//            }
//        });
        //上述方法可按照Lambda的规则简化为：
        //Arrays.sort(names, (o1, o2) -> o1.compareToIgnoreCase(o2) );
        //根据特定方法引用规则，该方法还可简化成：类型名称::方法名
        Arrays.sort(names, (String :: compareToIgnoreCase));
        System.out.println(Arrays.toString(names));
    }
}
