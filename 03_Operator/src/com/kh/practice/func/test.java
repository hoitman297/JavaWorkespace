package com.kh.practice.func;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class test extends JFrame{
	test(){
		setTitle("FlowLayout 연습"); //프레임 제목
		setDefaultCloseOperation(EXIT_ON_CLOSE); //종료
		
		Container c=getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
		
		JButton btn1=new JButton("add");
		JButton btn2=new JButton("sub");
		JButton btn3=new JButton("mul");
		JButton btn4=new JButton("div");
		JButton btn5=new JButton("calculate");
		
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		c.add(btn4);
		c.add(btn5);
		setSize(300, 300); //프레임 크기(가로, 세로)
		setVisible(true); //프레임 출력
	}
	public static void main(String[] args) {
		new test();
	}
}