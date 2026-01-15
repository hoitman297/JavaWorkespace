package com.kh.practice.thread;

import java.util.Scanner;

public class Customer implements Runnable {
	Data data;
	public Customer(Data data) {
		this.data = data;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			int value = data.getValue();
			System.out.println("get value : " + value);
			System.out.println("값을 꺼냈습니다. value가 비었습니다.");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
