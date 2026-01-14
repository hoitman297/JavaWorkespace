package com.kh.practice.thread;

import java.util.Scanner;

public class Customer implements Runnable {
	Data data;
	public Customer(Data data) {
		
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			if(data.getValue() == 0) {
				System.out.println("value가 비었습니다.");
			} else {
				System.out.println(data.getValue());
			}
		}
	}
}
