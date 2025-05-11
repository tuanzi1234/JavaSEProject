package com.lbh.InnerClass3;

import java.util.Arrays;
import java.util.Comparator;

public class Test4 {
    public static void main(String[] args) {
        // 完成数组的排序，理解匿名内部类的用法。
        // 准备一个学生类型数组，存放6个学生对象
        Student[] students = new Student[6];
        students[0] = new Student("张三", 20, 1.75, "男");
        students[1] = new Student("李四", 19, 1.68, "女");
        students[2] = new Student("王五", 18, 1.69, "男");
        students[3] = new Student("赵六", 17, 1.70, "女");
        students[4] = new Student("孙七", 16, 1.71, "男");
        students[5] = new Student("周八", 15, 1.72, "女");

        //使用sun公司写好的API直接对数组进行排序
        //public static void sort(T[] a, Comparator<T> c)
        //说明： 参数一：需要排序的数组
        //      参数二：需要给sort声明一个Comparator比较器对象（用于制定排序规则）
        //sort方法会调用匿名内部类的compare方法，对数组的学生对象进行两两比较，实现排序
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //指定排序规则：
                // 如果认为左边对象 大于 右边对象，那么返回正整数
                //如果认为左边对象 小于 右边对象，那么返回负整数
                // 如果认为左边对象 等于 右边对象，那么返回0
//                if (o1.getAge() > o2.getAge()){
//                    return 1;
//                } else if (o1.getAge() < o2.getAge()) {
//                    return -1;
//                }
//                return 0;
                //下面代码可以等效于上面的if分支
                return o1.getAge() - o2.getAge();//按照年龄升序
                //return o2.getAge() - o1.getAge();//按照年龄降序
            }
        });


        //遍历学生对象输出
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            System.out.println(student);
        }
    }
}
