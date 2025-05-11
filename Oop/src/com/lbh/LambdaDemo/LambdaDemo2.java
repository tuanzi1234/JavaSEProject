package com.lbh.LambdaDemo;

import com.lbh.InnerClass3.Student;

import javax.swing.*;

import java.util.Arrays;

public class LambdaDemo2 {
        // Lambda表达式简化实际的实例
    public static void main(String[] args) {
        test1();
        System.out.println("========================");
        test2();
    }
    public static void test1(){
        // 完成数组的排序，理解匿名内部类的用法。
        // 准备一个学生类型数组，存放6个学生对象
        Student[] students = new Student[6];
        students[0] = new Student("张三", 20, 1.75, "男");
        students[1] = new Student("李四", 19, 1.68, "女");
        students[2] = new Student("王五", 18, 1.69, "男");
        students[3] = new Student("赵六", 17, 1.70, "女");
        students[4] = new Student("孙七", 16, 1.71, "男");
        students[5] = new Student("周八", 15, 1.72, "女");

//        Arrays.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge() - o2.getAge();//按照年龄升序
//            }
//        });
        //上述将年龄升序排序的例子中，即可使用Lambda表达式简化
//        Arrays.sort(students, (Student o1, Student o2) -> {
//            return o1.getAge() - o2.getAge(); //按照年龄升序
//        });
//        参数类型全部省略不写。
//        Arrays.sort(students, ( o1,  o2) -> {
//            return o1.getAge() - o2.getAge(); //按照年龄升序
//        });
//        若Lambda表达式中只有一行代码，大括号可不写，同时省略分号";"，如果是return语句，则"return"也省略。
        Arrays.sort(students, ( o1,  o2) -> o1.getAge() - o2.getAge() );
        //遍历学生对象输出
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            System.out.println(student);
        }
    }
    public static void test2(){
        // 内部类的使用场景
        // 需求：创建一个登录窗口，窗口上写一个登录按钮
        JFrame win = new JFrame("登录窗口");
        win.setSize(300, 300);
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        win.add(panel);
        JButton btn = new JButton("登录");
        panel.add(btn);
        //java要求需要给按钮添加一个监听器对象，监听点击事件，这样可以对用户的操作做出反应
//        btn.addActionListener(new LoginListener());//使用自定义的LoginListener监听器类处理按钮点击的逻辑
        //方法二：使用匿名内部类实现ActionListener接口
        //开发中我们不需要主动去写匿名内部类，而是在使用别人的功能时，别人可以让我们写一个匿名内部类时，我们才写。
//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("用户点击了登录按钮");
//            }
//        });
        //由上述年龄排序例子即可类推，该按钮点击事件也可使用Lambda表达式简化
        //btn.addActionListener((ActionEvent e) -> {  System.out.println("用户点击了登录按钮"); });
        //若只有一个参数，则参数类型省略的同时"()"也可以省略；若多个参数则无法省略。
//        btn.addActionListener( e -> {  System.out.println("用户点击了登录按钮"); });
        // 若Lambda表达式中只有一行代码，大括号可不写，同时省略分号";"，如果是return语句，则"return"也省略。
        btn.addActionListener( e ->   System.out.println("用户点击了登录按钮") );
        win.setVisible(true);
    }
}
