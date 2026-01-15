package com.kh.practice.thread;

public class Data {
<<<<<<< HEAD
	private int value; // 공유 데이터 값
    private boolean isEmpty = true; // 데이터 상태 플래그 (true: 비어있음/쓰기 가능, false: 차있음/읽기 가능)

    public Data() {
        // 기본 생성자
    }

    /**
     * 값을 저장하는 메소드 (Provider가 호출)
     * synchronized: 여러 스레드가 동시에 접근하지 못하도록 잠금(Lock)을 걺
     */
    public synchronized void setValue(int value) {
        // 1. 값이 이미 들어있다면(비어있지 않다면), 덮어쓰지 않고 기다려야 함
        while (!isEmpty) {
            try {
                // 현재 스레드(Provider)를 일시 정지 상태(Waiting)로 만듦
                // 다른 스레드가 notify() 할 때까지 대기
                wait(); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // 2. 값이 비어있으므로 데이터를 입력
        this.value = value;
        this.isEmpty = false; // 이제 값이 찼으므로 상태 변경 (읽기 가능 상태)
        
        System.out.println("값이 입력되었습니다.");
        System.out.println("put value : " + value);
        
        // 3. 기다리고 있는 다른 스레드(Customer)를 깨움
        notifyAll(); 
    }

    /**
     * 값을 꺼내는 메소드 (Customer가 호출)
     * synchronized: 동기화 처리
     */
    public synchronized int getValue() {
        // 1. 값이 비어있다면, 꺼낼 것이 없으므로 기다려야 함
        while (isEmpty) {
            try {
                // 문제 요구사항: 값이 없는데 꺼내려 할 때 예외 메시지 출력
                // 예외를 throw 하지 않고 메시지만 출력하는 구조임
                System.out.println(new EmptyException("현재 입력된 값이 없습니다. 기다리십시오...").getMessage());
                
                // 현재 스레드(Customer)를 일시 정지 상태로 만듦
                wait(); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // 2. 값이 있으므로 데이터를 꺼냄 (읽기)
        int returnValue = this.value;
        this.isEmpty = true; // 값을 꺼냈으므로 상태 변경 (비어있음/쓰기 가능 상태)
        
        System.out.println("get value : " + returnValue);
        System.out.println("값을 꺼냈습니다. value 가 비었습니다.");
        
        // 3. 기다리고 있는 다른 스레드(Provider)를 깨움
        notifyAll(); 
        
        return returnValue;
    }
=======
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
>>>>>>> branch 'main' of https://github.com/hoitman297/JavaWorkespace.git
}
