package com.kh.chap01_thread.run;

public class Thread2 implements Runnable	{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 100; i++) {
			System.out.println("2번 스레드 [" + i + "]");
		}
	}

}
