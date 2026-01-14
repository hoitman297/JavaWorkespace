package com.kh.practice.thread;

import java.util.Random;

public class Provider implements Runnable {
	Data data;
	public Provider(Data data) {
		this.data = data;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			int num = (new Random().nextInt(100) + 1);
			data.setValue(num);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}
}
