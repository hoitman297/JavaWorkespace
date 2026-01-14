package com.kh.chap04_sync.sync;

public class Run {
    public static void main(String[] args) {
        Account acc = new Account();
        
        // ATM이 Runnable을 구현했으므로 아래 코드가 정상 작동함
        Thread atm1 = new Thread(new ATM(acc), "ATM 1");
        Thread atm2 = new Thread(new ATM(acc), "ATM 2");
        
        atm1.start();
        atm2.start();
    }
}