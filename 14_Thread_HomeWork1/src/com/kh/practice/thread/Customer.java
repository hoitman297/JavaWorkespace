package com.kh.practice.thread;

public class Customer implements Runnable {
<<<<<<< HEAD
	private Data data; // 공유 객체를 저장할 참조 변수

    // 생성자: 공유할 Data 객체를 주입받음
    public Customer(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        // 10번 반복하며 데이터를 읽어옴
        for (int i = 0; i < 10; i++) {
            // 공유 객체에서 값을 꺼냄 (여기서 동기화 및 대기 로직 수행)
            // 반환값은 내부에서 출력되므로 따로 변수에 담아 출력할 필요 없음
            data.getValue(); 
            
            try {
                // 스레드를 0.1초(100ms)간 잠재움
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
=======
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
>>>>>>> branch 'main' of https://github.com/hoitman297/JavaWorkespace.git
}
