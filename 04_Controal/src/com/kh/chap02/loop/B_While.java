package com.kh.chap02.loop;

public class B_While {
	/*
	   while 문
	   [표현법]
	   
	   [초기식]
	   while(조건식){
	   반복적으로 수행할 코드
	 	
	 */
	public void method1() {
		int i = 0; //초기식
		while (i < 5) { //조건식
			System.out.println("안녕");
			i++;
		}
	}

	public void method2() {
		//while 문으로 5회 반복하여 아래 코드 출력
		
		int i = 1;
		while (i < 6) {
			System.out.print(i++ + " ");
		}
	}
	
	public void method3() {
		int x = 1;
		int y = (int)(Math.random()*10+1);
		int sum = 0;
		while (x <= y) {
			sum += x;
			x++;
		}
		System.out.print(y+" 까지의 합입니다 : ");
		System.out.println(sum);
	}
	
	/*
	 	do-while
	 	[표현법]
	 	do {
	 			반복 실행할 코드(단, 최초1회는 반드시 수행)
	 	} while(조건식);
	 	do - while문은 별도의 조건검사 없이 최초 1회는 무조건 실행된다.
	 	
	 */
	
	public void method4() {
		do {
			System.out.println("단 1회");
		} while(false);
	}
	
	public void method5() {
		int i = 1;
		do {
				System.out.print(i++ + " ");
		}while(i <= 5);
	}
	
	
	

	
	public static void main(String[] args) {
		B_While bw = new B_While();
		bw.method5();
	}
}
