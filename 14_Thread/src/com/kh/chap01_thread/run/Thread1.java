package com.kh.chap01_thread.run;

public class Thread1 extends Thread{
	public void run() {
		// 각 쓰레드가 실행할 작업을 기술한느 메서드
		for(int i =1; i<= 100; i++) {
			System.out.println("1번 스레드[" + i + "]");
		}
	
		//스레드를 통한 멀티스레드 프로그래밍
		// 스레드 생성방법 1. Thread클래스를 상속받아 생성
		Thread th1 = new Thread1();
		
		//스레드실행
		//th1.run();
		
		th1.start();//쓰레드 생성
		// 메인 쓰레드 생성 -> stack 메모리 할당 -> main() 메서드 실행
		//일반 쓰레드 생성 -> stack 메모리 할당 -> run() 메서드 실행
	
	}
	
	
}
