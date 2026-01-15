package com.kh.practice.thread;

import java.util.Random;

public class Provider implements Runnable {
	private Data data; // 공유 객체를 저장할 참조 변수

    // 생성자: 공유할 Data 객체를 주입받음
    public Provider(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        // 10번 반복하며 데이터를 생성
        for (int i = 0; i < 10; i++) {
            // 1 ~ 100 사이의 난수 생성
            int num = new Random().nextInt(100) + 1;
            
            // 공유 객체에 값을 저장 (여기서 동기화 처리됨)
            data.setValue(num); 
            
            try {
                // 스레드를 0.1초(100ms)간 잠재움 (실행 속도 조절)
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}