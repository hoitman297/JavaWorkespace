package com.kh.chap04_sync.sync;

import java.util.Random;

public class ATM implements Runnable {
	private Account acc;

	public ATM(Account acc) {
		this.acc = acc;
	}

	public void run() {
		// 잔액이 0원보다 크면 무한반복.
		while (acc.getBalance() > 0) {
			int money = (new Random().nextInt(3) + 1) * 300;
			acc.withdraw(money);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + "종료");
	}
}
