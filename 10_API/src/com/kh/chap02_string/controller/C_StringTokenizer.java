package com.kh.chap02_string.controller;

import java.util.Arrays;
import java.util.StringTokenizer;

public class C_StringTokenizer {
	public void method() {
		String str = "Java, Oracle, JDBC, HTML, Spring";
		
		//구분자를 제시해서 문자열을 구분자 기준으로 분리 시키는 방법
		// 방법1. 문자열.split(구분자) : String[]
		// - 분리된 문자열들을 String[]에 담아서 관리해주는 메서드
		
		String arr[] = str.split(","); //[Javam Oracle, Jdbc, html, spring]
		
		System.out.println(Arrays.toString(arr));
		
		/*
		 	방법2. 분리된 각각의 문자열들을 토큰으로 취급하여 관리하는 방법
		 	StringTokenizer stn = new StringTokenizer(문자열, 구분자);
		 */
		StringTokenizer stn = new StringTokenizer(str, ", "); //토큰 제작
		
		System.out.println(stn.countTokens()); //토큰 개수
		System.out.println(stn.nextToken()); //토큰 출력 1
		System.out.println(stn.nextToken()); //토큰 출력 2
		System.out.println(stn.nextToken()); //토큰 출력 3
		System.out.println(stn.nextToken()); //토큰 출력 4
		System.out.println(stn.nextToken()); //토큰 출력 5
//		System.out.println(stn.nextToken()); 이 친구는 에러   why?? 토근을 5개만 만들었기 때문!!
		//NoSuchElementException (오류)
		// 현재 남아있는 토근의 갯수 범위를 벗어나면 에러 발생.
		// stn.countTokens() > 0  을 쉽게 할려면 stn.hasMoreTokens()
		while(stn.hasMoreTokens()) { //stn에 토큰이 1개이상 있는 경우 true/false
			System.out.println(stn.nextToken());
		}
	}
	public static void main(String[] args) {
		C_StringTokenizer cs = new C_StringTokenizer();
		cs.method();
	}
}
