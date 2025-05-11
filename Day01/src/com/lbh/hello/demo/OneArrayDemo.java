package com.lbh.hello.demo;

public class OneArrayDemo {
    //开发一个随机点名demo
    public static void main(String[] args) {
        callName();
    }
    public static void callName() {
        //1.设计点名程序，假设一个班有十五个学生，随机生成15个学生的一维数组
        //静态初始化数组，数组元素已经明确
        String[] names = { "王伟", "李芳", "张娜", "刘强", "陈洋",
                "杨敏", "黄丽", "赵勇", "周静", "吴杰",
                "王志强", "李美丽", "张建国", "刘秀英", "陈桂英"};
        //静态初始化数组的其他写法
        //String[] names = new String[]{"王伟", "李芳", "张娜", "刘强", "陈洋",
        //        "杨敏", "黄丽", "赵勇", "周静", "吴杰",
        //        "王志强", "李美丽", "张建国", "刘秀英", "陈桂英"};

        //2.随机获取一个索引值
        //索引：在定义数组后，数组中的数据会有一个编号，从0开始排列
        //数组中的第一个元素的索引值为0，第二个元素的索引值为1，以此类推
        //索引值的范围：0~数组长度-1
        //Math.random()方法可以生成一个0~1之间的随机小数
        //Math.random() * 数组长度可以生成一个0~数组长度之间的随机数
        int index = (int) (Math.random() * names.length);
        //3.根据索引值获取对应的学生姓名
        String name = names[index];
        //4.输出结果
        System.out.println("被点到的学生姓名为：" + name);
    }
}

