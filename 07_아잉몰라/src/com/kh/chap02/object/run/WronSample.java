package com.kh.chap02.object.run;

import java.util.Iterator;

import com.kh.chap02.object.ve.Phone;

public class WronSample {
	public static void main(String[] args) {
		Phone arr[] = new Phone[3];
		
		//잘못된 점
		//1. i의 범위가 잘못 되었다.
		//2. arr 배열에 객체가 초기화되지 않음.
		//   - 변수가 null을 가지고 있는 상태에서, 주소값이 있을때만 수행가능한 어떤 행위를 수행하는 경우 NPE가 발생
		for (int i = 0; i <= arr.length; i++) {
			System.out.println(arr[i].getName());
		}
	}
}
