package com.kh.example.practice6.model.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {
	public static void main(String[] args) {
		Book bk = new Book();
		Book bk1 = new Book("안녕","하세요","헤헤");
		Book bk2 = new Book("안녕","하세요","헤헤",50 ,50.5);
		bk1.inform();
	}
}
