package com.lbh.InnerClass3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test3 {

    public static void main(String[] args) {
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
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("用户点击了登录按钮");
            }
        });
        win.setVisible(true);
    }
}
//方法一：创建一个监听器实现类，实现监听器接口
class LoginListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("用户点击了登录按钮");
    }
}
