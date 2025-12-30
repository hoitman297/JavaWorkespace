package com.kh.chap06.method.model.vo;

public class MethodTest1 {
		/*
		 [포현법]
		 접근제한자 예약어 자료형 메서드명({매개변수}){
		 
		 	return 반환할 값; (생략가능)
		 }
		 
		 1. 매개변수 없고, 반환할 값도 없는 메서드
		 */
	public void method1() {
		System.out.println("매개변수 x, 반환값 x");
		
		return; // void가 아닌 자료형은 리턴 값 필요
	}
	
	//2. 매개변수X, 반환형O
	public int method2(){
		System.out.println("매개변수 x, 변환값 o");
		int random = (int)(Math.random()*100+1);
		return random;
	}
	
	//3. 매개변수O, 변환형X
	public void method3(int x, int y){
		int min = 0;
		int max = 0;
		if(x>y) {
			max = x;
			min = y;
		}else {
			min = x;
			max = y;
		}
		
		System.out.println("min ==== " + min);
		System.out.println("min ==== " + max);
	}
	
	//4. 매개변수O, 반환형 O
	public int multiply(int a, int b) {
		return a + b;
	}

}
