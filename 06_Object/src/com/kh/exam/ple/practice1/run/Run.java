package com.kh.exam.ple.practice1.run;

import java.util.Scanner;

import com.kh.chap03_class.model.vo.Person;

public class Run {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Person p = new Person();
		String str;
		str = sc.next();
		sc.nextLine();
		p.changeName(str);
		p.printName();
	}
}
