package com.kh.chap02.object.run;

import com.kh.chap02.object.ve.Phone;

public class Run {
	public static void main(String[] args) {
		int arr [] = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		//basic loop
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//	향상된/개선된 반복문 advanced loop / foreach
		/*
		 	for each문
		 	- 배열 또는 컬렉션과 함께 사용되는 반복문으로, 배열 또는 컬렉션의
		 	0번 인덱스부터, 마지막 인데스까지 순차적으로 접근할 때 사용.
		 	
		 	초기식 조건식 증감식 X
		 	반복 횟수는 배열의 크기.
		 	[표현법]
		 	for(순차적으로 접근한 값을 담을 변수 : 배열명){
		 		//반복적으로 실행할 내용
		 	}
		 */
		
		int arr2[] = {10,20,30};
		for(int a : arr2) {
			System.out.println(a);
		}
		
		Phone phones[] = new Phone[3];
		phones[0] = new Phone("갤럭시", "삼성", "갤럭시22", 134000);
		phones[1] = new Phone("아이폰", "애플", "11미니", 1461000);
		phones[2] = new Phone("갤럭시", "삼성", "Z폴드2", 2346000);
		
		int count = 0;
		for(Phone a : phones) {
			count += a.getPrice();
		}
		System.out.println(count);
	}
}
