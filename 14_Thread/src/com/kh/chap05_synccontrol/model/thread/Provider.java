package com.kh.chap05_synccontrol.model.thread;

public class Provider implements Runnable{
	private Data data;
	
	public Provider(Data data) {
		this.data = data;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			data.setData();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
