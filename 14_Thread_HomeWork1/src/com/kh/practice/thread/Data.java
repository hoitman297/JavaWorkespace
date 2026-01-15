package com.kh.practice.thread;

public class Data {
	private int value;
	boolean isEmpty = true;

	public Data() {

	}

	public void setValue(int value) {
		synchronized (this) {
			if (!isEmpty) {

				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}
		isEmpty = false;
		

		System.out.println("값이 입력되었습니다.");
		System.out.println("put value : " + value);
		this.value = value;
		notify();
	}

	public int getValue() {
		synchronized (this) {
			if (isEmpty) {
				try {
					throw new EmptyException("현재 입력된 값이 없습니다. 기다리십시오..");
				} catch (EmptyException e) {
					String errMessage = e.getMessage();
					System.out.println(errMessage);
					try {
						wait();
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
				}

			}
		}
		isEmpty = true;
		notify();
		return value;
	}
}
