package com.kh.execption.controller;

public class C_CustomExecption extends Exception{
	
	public void method1() {
		// TODO Auto-generated method stub
		
	}
	/*
	 	특정상황에서 발생하는 예외를 직접 만드는 방법
	 	1. 예외처리클래스 생성 후, Execption클래스를 상속
	 	2. super 키워드를 통해 부모생성자에 매개변수로 메세지를 전달
	 */
	public C_CustomExecption(String msg) {
		super(msg);
	}
}
