package com.kh;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.*; //ActionListener接口所在包
import java.text.SimpleDateFormat;
import java.util.Date;

public class Login  {
    public static void main(String[] args) {
        //JFrame 为一个窗口，构造方法的参数为窗口标题
        JFrame mainFrame = new MyFrame();


        mainFrame.setLayout(new java.awt.FlowLayout());
       


        //当关闭窗口时，退出整个程序
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //设置窗口大小s
        //mainFrame.setSize(400,300);

        //显示窗口
        //mainFrame.setVisible(true);



    }
}