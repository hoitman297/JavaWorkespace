package com.kh.practice.thread;

public class MultiThreadTest {
	public static void main(String[] args) {
        // 1. 공유 자원(Data) 객체 생성
        // 이 하나의 객체를 Provider와 Customer가 같이 씀
        Data data = new Data(); 

        // 2. 스레드 객체 생성
        // 생성자에 Runnable 구현체(Provider, Customer)를 전달
        Thread putThread = new Thread(new Provider(data));
        Thread getThread = new Thread(new Customer(data));

        System.out.println("putThread 작동시"); 
        
        // 3. 스레드 시작 (run 메소드 호출)
        // start()를 호출해야 별도의 실행 흐름(스레드)이 생성됨
        putThread.start();
        getThread.start();
    }
}
