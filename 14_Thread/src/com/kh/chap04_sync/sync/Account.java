package com.kh.chap04_sync.sync;

public class Account {
    private int balance = 10000; // 테스트를 위해 잔액을 1000으로 증액

    public int getBalance() {
        return balance;
        
        /*
         	출금메서드
         	
         	동기화 처리 방법
         	1. synchronized 메서드 만들기.
         		- 메서드 전체에 대해 락을 걸고, 메서드 종료시 락이 풀린다.
         	2. synchronzied block 사용하기. (사용하기)
         		- 동기화가 필요한 일부 내용에만 락을 건다.
         		- 동기화 블럭이 끝나는 순간 락이 풀린다.
         		- 임계 영역이 아닌 지역까지는 모든스레드가 접근 가능하기 때문에, 메서드 전체를 임계 영역으로 저장하는 것보다
         			효율이 좋다.
         */
    }
    
    // synchronized를 추가하여 한 번에 한 스레드만 접근 가능하게 수정
    public /* synchronized*/ void withdraw(int money) {
        String name = Thread.currentThread().getName();
        
        synchronized(this) {
        	   if(money <= balance) {
                   System.out.println(name + "가 출금 시도: " + money + "원 (현재 잔액: " + balance + ")");
                   try {
                       // 동기화 확인을 위한 지연 시간
                       Thread.sleep(500); 
                   } catch (InterruptedException e) {}
                   
                   balance -= money;
                   System.out.printf("[%s] %d원 출금 완료 >>> 남은 잔액 : %d원\n", name, money, balance);
               } else {
                   System.out.printf("[%s] %d원 출금 시도 실패 (잔액 부족)\n", name, money);
               }
        }
    }
}