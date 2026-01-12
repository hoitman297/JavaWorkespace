package com.kh.practice3.controller;

import com.kh.practice3.model.vo.*;

public class AnimalManger {
	public static void main(String[] args) {
		// Animal 타입의 객체배열 크기 5로 생성 
		Animal [] arr = new Animal[5];//[null,null...]
		arr[0] = new Dog("꽃분이","말티즈",3);
		arr[1] = new Dog("찐빵이","닥스훈트",5);
		arr[2] = new Cat("네로","코숏","부천","검은색");
		arr[3] = new Cat("코코","브숏","목동","회색");
		arr[4] = new Dog("콩순이","푸들",5);
		
		for(Animal ani : arr) {
			ani.speak();
		}
		// 반복문을 통해서 해당 배열의 0번 인덱스부터 마지막 인덱스까지의  
		// 객체의 speak() 메소드 호출
	}
}









